package curso.java.inicio.ficheros;

import curso.java.inicio.ficheros.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        //String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";  ruta absoluta
    	String nombreArchivo = "./recursos/java.txt";		 // ruta relativa desde el directorio del proyecto
        ArchivoServicio servicio = new ArchivoServicio();

        System.out.println(servicio.leerArchivo(nombreArchivo));
    }
}
