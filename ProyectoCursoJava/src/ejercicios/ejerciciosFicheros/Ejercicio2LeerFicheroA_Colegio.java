package ejercicios.ejerciciosFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;


import ejercicios.ejerciciosColecciones.Asignatura;
import ejercicios.ejerciciosColecciones.Estudiante;

public class Ejercicio2LeerFicheroA_Colegio {
	public static void main(String[] args) {
		
		try {
					String nombreArchivo = "./recursos/alumnos.txt";
					Map<String, List<Estudiante>> mapa = null;
					try {
						mapa = leerArchivoEjercicio2(nombreArchivo);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Set<Entry<String,List<Estudiante>>> entryMapa = mapa.entrySet();
					
					int maximoAlumnos=0;
					String colegioMasAlumnos= "";
					
					for (Entry<String, List<Estudiante>> entry : entryMapa) {
						String colegio = entry.getKey();
						System.out.println("Colegio: "+ colegio);
						List<Estudiante> alumnos = entry.getValue();
						int numAlumnos = alumnos.size();
						
						if (numAlumnos>maximoAlumnos) {
							maximoAlumnos= numAlumnos;
							colegioMasAlumnos=colegio;
						}
						
						//Recorremos los alumnos					
						//for(Alumno alumno: alumnos) {
							//System.out.println("\t"+alumno);
						//}
					}
					System.out.println("EL colegio con mas alumnos es "+ colegioMasAlumnos + " con "+ maximoAlumnos);
					
		} catch (Exception e) {
					System.out.println(e.getMessage());
		}
	}
	//cambio a statico para no tener que usar objs
	public static Map<String,List<Estudiante>> leerArchivoEjercicio2(String nombre){
	    File archivo = new File(nombre);
	    Scanner scan;
	    //Creo el mapa donde almacenaré el nombre del colegio con los alumnos
	    Map<String,List<Estudiante>> mapaColegioAlumnos = new HashMap<String,List<Estudiante>>();
		try {
			scan = new Scanner(archivo);
		
		    scan.useDelimiter("\n");
	
		  
		    while (scan.hasNext()){
		    	String linea = scan.next();
		    	String[] datos = linea.strip().split("\\|");
		    	
		    	//Creacion de objetos
		    	//Recogemos información
		    	String colegio = datos[0];
		    	String nombreAlumno=datos[1];
		    	String apellidoAlumno=datos[2];
		    	String dniAlumno=datos[3];
		    	String [] parteAsignaturas = datos[3].split("\\;");
				String asignaturasAlumno = datos[4];
		    		
		    	Set <Asignatura> asigAl = new HashSet <Asignatura>();
		    	String [] asignaturas = asignaturasAlumno.split(";");
				//añadir asignaturas al set
				for (String a : parteAsignaturas) {
					
					Asignatura asignatura = new Asignatura(a,5);
					asigAl.add(asignatura);
				}
		    	//Por cada línea genero un objeto
		    	Estudiante alumno = new Estudiante(nombreAlumno, apellidoAlumno, dniAlumno, asigAl);
		        
		        //Miramos si el colegio esta en el mapa
		    	if (mapaColegioAlumnos.containsKey(colegio)) {
		    		List<Estudiante> listaAlumnos = mapaColegioAlumnos.get(colegio);
		    		listaAlumnos.add(alumno);
		    		
		    	}else {//El colegio no está en el mapa, se añade nuevo
		    		List<Estudiante> listaAlumnos = new ArrayList<Estudiante>();
		    		listaAlumnos .add(alumno);
		    		mapaColegioAlumnos.put(colegio, listaAlumnos);
		    		//mapaColegioAlumnos.put(colegio, Arrays.asList(alumno));
		    	}    
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	    //Ejecución Varargs
	    //test("Azul","Rojo","Blanco","verde");
		
		return mapaColegioAlumnos;
	}
}


/*
	leer fichero alumnos-colegio.txt
		utilizar estructura para guardar los datos (map?)
	colegio que mas alumnos tiene
	

*/