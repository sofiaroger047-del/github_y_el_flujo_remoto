#!/bin/bash

# -- Configuración ---
# URL de la última version - Actualizar si es necesario
URL="https://download.jetbrains.com/idea/idea-2026.1.tar.gz"
INSTALL_DIR="/opt/idea"
APP_NAME="Intellij IDEA Community"

# -- Actualizar repositorios ---
echo "Actualizando repositorios de paquetes..."
if ! sudo apt update; then
    echo "ADVERTENCIA: No se pudo actualizar los repositorios. Continuando de todas formas..."
    echo "Algunas instalaciones podrían fallar. Verifica tu conexión a internet."
fi

# -- Verificación e Instalación de OpenJDK 21 LTS ---
echo "Verificando OpenJDK 21 LTS..."
if dpkg -l | grep -q openjdk-21-jdk; then
    echo "OpenJDK 21 ya está instalado. Saltando instalación."
else
    echo "OpenJDK 21 no encontrado. Instalando..."
    sudo apt install -y openjdk-21-jdk
fi

# -- Verificación e Instalación de Kotlin ---
echo "Verificando Kotlin..."
if dpkg -l | grep -q "^ii.*kotlin" || command -v kotlin &> /dev/null; then
    echo "Kotlin ya está instalado. Saltando instalación."
else
    echo "Kotlin no encontrado. Intentando instalar con apt..."
    if sudo apt install -y kotlin; then
        echo "Kotlin instalado correctamente con apt."
    else
        echo "No se pudo instalar Kotlin con apt. Intentando con snap..."
        if sudo snap install kotlin --classic; then
            echo "Kotlin instalado correctamente con snap."
        else
            echo "ADVERTENCIA: No se pudo instalar Kotlin. Continuando de todas formas..."
        fi
    fi
fi

# -- Proceso de Instalación ---
if [ -f "idea.tar.gz" ]; then
    echo "El archivo idea.tar.gz ya existe. Saltando descarga."
else
    echo "Descargando Intellij IDEA Community..."
    wget -O idea.tar.gz "$URL"
fi

echo "Extrayendo archivos"
tar -xzf idea.tar.gz

EXTRACTED_DIR=$(tar -tf "idea.tar.gz" | head -1 | cut -f1 -d"/")
if [ -d "$INSTALL_DIR" ]; then
  echo "Actualizando Instalación existente en $INSTALL_DIR..."
  sudo rm -rf "$INSTALL_DIR"
fi

sudo mv "$EXTRACTED_DIR" "$INSTALL_DIR"

# -- Creando comando IDEA ---
echo "Creando comando 'idea' en /usr/local/bin..."
sudo ln -sf "$INSTALL_DIR/bin/idea" /usr/local/bin/idea


# -- Crear acceso directo al menú ---
ICON_PATH="$INSTALL_DIR/bin/idea.png"
DESKTOP_FILE="$HOME/.local/share/applications/intellij-idea.desktop"

echo "[Desktop Entry]
Version=1.0
Type=Application
Name=$APP_NAME
Icon=$ICON_PATH
Exec=\"$INSTALL_DIR/bin/idea\" $f
Comment=Desarrollo Java/Kotlin
CategoriesDevelopment;IDE;
Terminal=false
StartupWMClass=jetbrains-idea" > "$DESKTOP_FILE"

# -- Finalizar ---
echo "Instalación completada!!!"
echo "Pueden iniciar Intellij IDEA escribiendo 'idea' en la Terminal o buscando en el menú."
