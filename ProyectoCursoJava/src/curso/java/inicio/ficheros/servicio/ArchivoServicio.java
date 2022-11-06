package curso.java.inicio.ficheros.servicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArchivoServicio {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))){

            buffer.append("Hola que tal amigos!\n")
                    .append("Todo bien? yo escribiendo en un archivo...\n")
                    .append("Hasta luego Lucas!\n");
            // buffer.close();
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))){  //con false en vez de concatenar los sustituye
        	//si es un directorio listame todos los archivos y directorios que tenga
        	if (archivo.isDirectory()) {
				String [] ficheros = archivo.list(); //array con el nombre de los archivos
				for (String fichero : ficheros) {
					System.out.println(fichero);
					//para comprobar si es un fichero o un directorio
					File file = new File(nombre,fichero); // crear el archivo
					if (file.isDirectory()) {
						System.out.print(" es un directorio");
					}
					else {
						System.out.print(" es un fichero");
					}
				}
			}
        	
            buffer.println("Hola que tal amigos!");
            buffer.println("Todo bien? yo acá escribiendo un archivo...");
            buffer.printf("Hasta luego %s!", "Lucas");
            // buffer.close();
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){ //se crea uno obj para recoger la info del fichero, se lee con buffered reader
        	//linea a linea se lee el contenido del fichero
            String linea;
            while ( (linea = reader.readLine()) != null){ // mientras la linea no esta vacia,  distinto a espacio
                sb.append(linea).append("\n"); //se va añadiendo la info al string builder
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString(); //se convierte a String
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner s = new Scanner(archivo)){

            s.useDelimiter("\n");
            while (s.hasNext()){
                sb.append(s.next()).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    
    public List <String> leerArchivo3(String nombre){
        List <String> datos = new ArrayList <String>();
        File archivo = new File(nombre);
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){ //se crea uno obj para recoger la info del fichero, se lee con buffered reader
        	//linea a linea se lee el contenido del fichero
            String linea;
            while ( (linea = reader.readLine()) != null){ // mientras la linea no esta vacia,  distinto a espacio
                //retornar lista de strings
                datos.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return datos;
    }
}
