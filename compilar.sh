#!/bin/bash

# Crear el directorio bin si no existe
mkdir -p bin

# Compilar los archivos de código fuente
javac -classpath ./bin:./lib/* \
-encoding UTF-8 \
-d bin \
-sourcepath ./src \
./src/bicola/*.java \
./src/ComprobarSecuencias/*.java \
./src/datosRepetidos/*.java \
./src/elementosDiferentes/*.java \
./src/eliminarElementosRepetidos/*.java \
./src/ExpresionesPostfijas/*.java \
./src/invertirElementos/*.java \
./src/listaEnlazada/*.java \
./src/tipoColaMixto/*.java \
./src/tipoPila/*.java

# Compilar los archivos de código fuente de las pruebas
javac -classpath ./bin:./lib/* \
-encoding UTF-8 \
-d bin \
-sourcepath ./tst \
./tst/datosRepetidos/*.java \
./tst/elementosDiferentes/*.java \
./tst/eliminarElementosRepetidos/*.java \
./tst/listaEnlazada/*.java

# Pausar la consola para poder ver los resultados.
read -p "Presione cualquier tecla para continuar..."