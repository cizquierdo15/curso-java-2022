package curso.java.inicio.ficheros;

import curso.java.inicio.ficheros.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
    	//Ruta relativa a la carpeta del proyecto
        String nombreArchivo = "./recursos/java2.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo2(nombreArchivo);
    }
}
