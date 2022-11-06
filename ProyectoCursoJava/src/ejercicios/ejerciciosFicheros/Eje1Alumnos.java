package ejercicios.ejerciciosFicheros;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.basic.BasicLabelUI;

import curso.java.inicio.ficheros.servicio.ArchivoServicio;
import ejercicios.ejerciciosColecciones.Asignatura;
import ejercicios.ejerciciosColecciones.Estudiante;
import ejercicios.ejerciciosMapas.Alumno;


public class Eje1Alumnos {

	public static void main(String[] args) {
		//crear lista vacia
		List <Estudiante> lAlumnos = new ArrayList <Estudiante>();
		int numAlumnos;
		String nombreArchivo = "./recursos/alumnos.txt";
		ArchivoServicio servicio = new ArchivoServicio();
		String [] partes;
		//contenido del archivo
		// System.out.println(servicio.leerArchivo(nombreArchivo));
		List <String> datosFichero = servicio.leerArchivo3(nombreArchivo);
		for (String dato : datosFichero) {
			
			//separar los datos
			partes = dato.split("\\|"); // para separar por | usar \\|
			
			//crear el set de asignaturas
			Set <Asignatura> asig = new HashSet <Asignatura>();
			
			String [] parteAsignaturas = partes[3].split("\\;");
			//añadir asignaturas al set
			for (String a : parteAsignaturas) {
				
				Asignatura asignatura = new Asignatura(a,5);
				asig.add(asignatura);
			}
			//crear obj estudiante con los datos
			Estudiante al = new Estudiante(partes[0], partes[1], partes[2], asig);
			//añadirlo a la lista
			lAlumnos.add(al);
		}
		if (lAlumnos.size() > 0) {
			for (Estudiante alum : lAlumnos) {
				System.out.println(alum.getNombre()+ " app "+ alum.getApellidos() + " dni "+ alum.getDni()+ "asig ");
			}
			numAlumnos = lAlumnos.size();
			System.out.println("El total de alumnos es "+ numAlumnos);
		}
		
		
		
	}
	
	//Ejemplo lectura de archivos profe,,,, metodo de una Clase llamada LecturaFicheros
	public String leerArchivoP(String nombre) {
		StringBuilder sb = new StringBuilder();
		File archivo = new File(nombre);
		//crear lista vacia
		List <Estudiante> lAlumnos = new ArrayList <Estudiante>();
		try (Scanner s = new Scanner(archivo)) {	
			s.useDelimiter("\n");//fija un patron limite para el scanner, va cogiendo linea a linea del fichero
			while (s.hasNext()) {//mientras el scaner tenga una linea del archivo para leer
				sb.append(s.next()).append("\n"); //añade una fila y un intro al StringBuffer
				
				//coger la linea que se esta leyendo
				String linea = s.next();
				String [] parteDatos = linea.strip().split("\\|"); //quitar espacios en blanco y cortar por los pipes
				
				//campos del Obj
				String nombreAl = parteDatos[0];
				String apeAl = parteDatos[1];
				String dniAl = parteDatos[2];
				Set <Asignatura> asigAl = new HashSet <Asignatura>();
				String [] parteAsignaturas = parteDatos[3].split("\\;");
				//añadir asignaturas al set
				for (String a : parteAsignaturas) {
					
					Asignatura asignatura = new Asignatura(a,5);
					asigAl.add(asignatura);
				}
				
				//String [] parteAsignaturas = partes[3].split("\\;");
				//crear Obj Alumno
				Estudiante al = new Estudiante(nombreAl, apeAl, dniAl, asigAl);
				//ir añadiendo alumnos a la lista
				lAlumnos.add(al);
			}
		} catch (IOException e) {//el fichero puede no existir
			e.getMessage();
		}
		return sb.toString();		
	}
	/*
	 * Leer fichero alumnos txt
	 * 	cada dato guardarlo como 1 obj Alumno
	 * 	crear una lista de alumnos
	 * 
	 * 	decir cuantos alumnos hay en el fichero
	 * 
	 * 
	 */

}
