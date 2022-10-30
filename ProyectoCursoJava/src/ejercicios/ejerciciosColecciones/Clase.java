package ejercicios.ejerciciosColecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.text.Utilities;

import curso.java.funciones.Utils;

public class Clase {
	public static void main(String [] args) {
		Clase claseA = new Clase();
		ArrayList <Estudiante> estudiantesClase = claseA.crearEstudiantes();
		
		claseA.mostrarInfoEstudiantes(estudiantesClase);
		claseA.mostrarEConMates(estudiantesClase);
		claseA.mostrarAprobados(estudiantesClase);
		claseA.borrarSuspensosLengua(estudiantesClase);
		
	}
	
	//falta crear funciones para no repetir codigo
	public ArrayList <Estudiante> crearEstudiantes() {
		System.out.println("Datos E1");
		//asignaturas estudiante1
		Set <Asignatura> se1 = new HashSet<Asignatura>();
		String [] nM = pideNotasA("Matematicas");
		String [] nL = pideNotasA("Lengua");
		String [] nB = pideNotasA("Biologia");
		
		se1.add(new Asignatura(nM[0], Integer.parseInt( nM[1] )));
		se1.add(new Asignatura(nL[0], Integer.parseInt( nL[1] )));
		se1.add(new Asignatura(nB[0], Integer.parseInt( nB[1] )));

		Estudiante e1 = new Estudiante("Jose", "Garrido", "01923441V",se1);
		
		//asignaturas estudiante2
		System.out.println("Datos E2");
		Set <Asignatura> se2 = new HashSet<Asignatura>();
		 nM = pideNotasA("Matematicas");
		 nL = pideNotasA("Lengua");
		 nB = pideNotasA("Biologia");
		
		se2.add(new Asignatura(nM[0], Integer.parseInt( nM[1] )));
		se2.add(new Asignatura(nL[0], Integer.parseInt( nL[1] )));
		se2.add(new Asignatura(nB[0], Integer.parseInt( nB[1] )));

		Estudiante e2 = new Estudiante("Ana", "Perez", "01923441V",se2);
		
		//asignaturas estudiante3
		System.out.println("Datos E3");
		Set <Asignatura> se3 = new HashSet<Asignatura>();
		 nL = pideNotasA("Lengua");
		 nB = pideNotasA("Biologia");
		
		se3.add(new Asignatura(nL[0], Integer.parseInt( nL[1] )));
		se3.add(new Asignatura(nB[0], Integer.parseInt( nB[1] )));

		Estudiante e3 = new Estudiante("Pepe", "Rois", "01923441V",se3);
		
		//crar array list y añadir estudiantes
		ArrayList <Estudiante> estudiantes = new ArrayList<Estudiante>();
		estudiantes.add(e1);
		estudiantes.add(e2);
		estudiantes.add(e3);
		
		return estudiantes;
	}
	
	//crear funcion pide asignatura y nota, devuelva 1 array con 2 valores 1 nombre 2 nota
	public String [] pideNotasA( String asignatura) {
		String nota = (Utils.pideValor("Nota de "+ asignatura));
		String [] datos = {asignatura,nota};
		return datos;
	}
	
	//muestra la info de el arrayList de estudiantes
	public void mostrarInfoEstudiantes(ArrayList<Estudiante> estudiantes) {
		System.out.println("Datos de los estudiantes");
		for (Estudiante estudiante : estudiantes) {
			//nombre y app
			System.out.println("Estudiante: "+ estudiante.getNombre()+ " , "+ estudiante.getApellidos());
			//mostrar asignaturas,,  
			for (Asignatura asignaturas : estudiante.getAsignaturas()) {
				System.out.print("  A: "+ asignaturas.getNombre() + " Nota " + asignaturas.getNota()+ " -" );
			}	
			System.out.println("...");
		}
	}
	
	//mostrar nombre y app de Alumnos que tiene matematicas
	public void mostrarEConMates(ArrayList<Estudiante> estudiantes) {
		System.out.println("Estudiantes con Mates");
		for (Estudiante estudiante : estudiantes) {
			//ver asignaturas,,  
			for (Asignatura asignaturas : estudiante.getAsignaturas()) {
				//si de las asignaturas que tiene una es mates
				if (asignaturas.getNombre().equals("Matematicas")) {
					System.out.println("Estudiante: "+ estudiante.getNombre()+ " , "+ estudiante.getApellidos());
					System.out.println("...");
				}
			}	
		}
	}
	
	
	//muestra los Alumnos que han aprobado y su nota media
	public void mostrarAprobados(ArrayList<Estudiante> estudiantes) {
		System.out.println("Estudiantes aprobados");
		int notaMedia = 0;
		int nAsignaturas; 
		for (Estudiante estudiante : estudiantes) {
			//ver asignaturas,,  
			nAsignaturas = estudiante.getAsignaturas().size();
			for (Asignatura asignaturas : estudiante.getAsignaturas()) {
				//coger la nota de cada asignatura y irla sumando
				notaMedia += asignaturas.getNota();
			}	
			//hacer la media y si aprueba se muestra
			notaMedia = notaMedia / nAsignaturas;
			if (notaMedia >= 5) {
				System.out.println("Estudiante: "+ estudiante.getNombre()+ " , " + " Aprobado con " + notaMedia);
			}
			notaMedia = 0;
		}
	}
	
	//borrar estidantes que han suspendido lengua
	public void borrarSuspensosLengua(ArrayList<Estudiante> estudiantes) {
		int cont = 0;
		for (Estudiante estudiante : estudiantes) {
			//ver asignaturas, si ha suspendido lengua eliminarlo del arraylist
			for (Asignatura asignatura : estudiante.getAsignaturas()) {
				if (asignatura.getNota() < 5 && asignatura.getNombre().equals("Lengua")) {
					estudiantes.remove(cont);
				}
			}
			cont++;
		}
	}
	
	/*
	 * Crear 5 estudiante, meterlos en una coleccion,
	 * Nostrar info de todos los estudiantes
	 * 				N  A  -- Matematicas-3Fisica-4-Biologia-2Lengua-4
	 * 
	 * Mostrar unicamente los n y a de los Alumnos que hayan cursado matematicas
	 * 
	 * Mostrar unicamente los Alumnos que hayan aprobado el curso, notamedia de asignaturas >= 5  y su notamedia
	 * 
	 * Eliminar todos los estdiantes que hayan suspendido lengua
	 * 
	 * */
}
