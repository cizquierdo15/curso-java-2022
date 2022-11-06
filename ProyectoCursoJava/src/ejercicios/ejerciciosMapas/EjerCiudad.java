package ejercicios.ejerciciosMapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import curso.java.funciones.Utils;

public class EjerCiudad {
	
	private Map <Colegio, List <Alumno>> mapaColes;
	
	public static void main(String[] args) {
		EjerCiudad leon = new EjerCiudad();
		//forma 1
			leon.crearAlumnos();
			leon.motrarDatosAlumnos();
			
			//pedir dni y ver cole de alumno
			String dato = Utils.pideValor("Dime dni");
			String datoEjemplo = "0291155W";
			leon.buscarAlumno(datoEjemplo);
		// forma 2
			Map <String, List <Alumno>> alumnos = new HashMap <String, List<Alumno>>();
	}
	
	private void crearAlumnos() {
		Colegio c1 = new Colegio ("Costa","Puerta de Toledo");
		Colegio c2 = new Colegio ("Breton","Alejandro Dumas");
		
		//alumnos
		Alumno a1 = new Alumno("Jose", "molero", "0291155W", c1);
		Alumno a2 = new Alumno("Ana", "perez", "0692155T", c1);
		Alumno a3 = new Alumno("Sara", "garcia", "0999155Y", c1);
		List <Alumno> alumnosC1 = new ArrayList <Alumno>();
		alumnosC1.add(a1);
		alumnosC1.add(a2);
		alumnosC1.add(a3);
		
		Alumno a4 = new Alumno("Mikel", "loro", "0291155Z", c2);
		Alumno a5 = new Alumno("Leire", "oz", "0692155T", c2);
		Alumno a6 = new Alumno("Lola", "pain", "0999155Y", c2);
		List <Alumno> alumnosC2 = new ArrayList <Alumno>();
		alumnosC2.add(a4);
		alumnosC2.add(a5);
		alumnosC2.add(a6);
		
		//añadir a ciudad
		this.mapaColes = new HashMap<Colegio , List <Alumno> >();
		this.mapaColes.put(c1, alumnosC1);
		this.mapaColes.put(c2, alumnosC2);
	}
	
	private void motrarDatosAlumnos() {
		//recorrer las claves del mapa para sacar datos del cole y alumnos
				for (Colegio cole : this.mapaColes.keySet()) {
					System.out.println(cole.getNombre() + " Nombre de cole dir: " + cole.getDireccion());//datos cole
					//recoger valor asociado a la clave
					List <Alumno> alumnos = this.mapaColes.get(cole); // trae la lista de alumnos
					for (Alumno alumno : alumnos) {
						System.out.println(alumno.getNombre()+" "+ alumno.getApellidos()+" -Nombre ");
					}
				}
				
		//acceder a la info del mapa recogiendo clave y valor de forma directa
				Set<Entry <Colegio, List <Alumno>>> coleEntry = this.mapaColes.entrySet();
				//para recorrerlo
				for ( Entry<Colegio, List<Alumno>> cole : coleEntry) {//podemos acceder a la k y v directamente
					Colegio coleK = cole.getKey();
					System.out.println("Cole "+ coleK.getNombre());
					List <Alumno> alumnos = cole.getValue();
					for (Alumno a : alumnos) {
						System.out.println(a.getNombre()+ "Nombre a");
					}
				}
	}
	
	private void buscarAlumno(String dato) {
		for (Colegio cole : this.mapaColes.keySet()) {
			List <Alumno> alumnos = this.mapaColes.get(cole);
			for (Alumno alu : alumnos) {
				if(alu.getDni().equals(dato)) {
					System.out.println("esta en "+ cole.getNombre());
				}
			}
		}
	}
	private void buscarAlumno2(Map <String, List <Alumno>> alumnos, String dni) {
		//Alumno alu = alumnos.get(dni);
		
	}

}
/*
 * Ejercicio Mapas
	 * 
	 *  2 ciudades con 2 colegios: profesores y alumnos    . todo guardado en 1 obj   <- loco
	 *  		
	 *  		Ejemplo loco
	 *  		colegiosCiudad  = Map <String "nombreCiduad", Map <"idColegio", List >PersonalColegio> >> 
	 *  			
	 *  		Map<idColegio, List<Personas>> colegioMadrid = colegiosciudad.get("ciudad");
	 *  		colegioMadrid.keySet()
	 *
	 *  2 Colegios con 3 Alumnos
	 *  
	 *  Map < Colegio, List <Alumnos> >  mapaColes
	 *  
	 *  Pintar por cada colegio nombre, dir y los alumnos que tiene
	 *  
	 *  Pedir dni y indicar en que colegio se escuentra el alumno
	 *  
	 * 	Alumno   nombre ape  dno asig colegio
	 * 	Colegios nombre dir
 * 
 * 
 * */
