:: Documentar los archivos de código fuente de las pruebas
javadoc -author -version -private ^
-encoding UTF-8 -charset UTF-8 ^
-sourcepath .\src -d doc -classpath .\lib\*;.\bin ^
-docencoding UTF-8 ^
-link https://docs.oracle.com/en/java/javase/20/docs/api/ ^
-subpackages bicola ComprobarSecuencias datosRepetidos elementosDiferentes eliminarElementosRepetidos ExpresionesPostfijas invertirElementos listaEnlazada tipoColaMixto tipoPila

:: Documentar los archivos de código fuente de las pruebas
javadoc -author -version -private ^
-encoding UTF-8 -charset UTF-8 ^
-sourcepath .\tst -d docTst -classpath .\lib\*;.\bin ^
-docencoding UTF-8 ^
-link https://docs.oracle.com/en/java/javase/20/docs/api/ ^
-subpackages datosRepetidos elementosDiferentes eliminarElementosRepetidos listaEnlazada

:: Pausar la consola para poder ver los resultados.
pause