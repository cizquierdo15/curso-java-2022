package curso.java.inicio.mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ejercicios.ejerciciosColecciones.Estudiante;
 

public class ApuntesMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Estudiante> mapa1 = new HashMap<String,Estudiante>(); //le indicamos el tipo de dato que guarda , clave valor
		Estudiante estudiante1 = new Estudiante("alvaro", "gomez", "09922551H", null);
		mapa1.put(estudiante1.getDni(), estudiante1); //clave el dni del estudiante valor el obj
		
		Estudiante estudiante2 = new Estudiante("nombre2", "molo", "11222771W", null);
		mapa1.put(estudiante2.getDni(), estudiante2);
		//put devuelve el valor que tenia asociado a la anterior etiqueta, saca la info anterior y guarda en el map la nueva, al asignar una veriable del dato que guarda podemos almacenar el anterior
		Estudiante test = mapa1.put(estudiante1.getDni(),estudiante2); //por si queremos hacer algo con el valor antiguo
		
		
		
		List <Estudiante> estudiantes = new ArrayList<Estudiante>(); //para encontrar 1 en concreto tendriamos que recorrerlo con un fore, y un if par encontrar el que queremos
		estudiantes.add(estudiante1);
		estudiantes.add(estudiante2);
		
		
		//con un map, para buscarlo
		Estudiante elegido = mapa1.get("09922551H");  // nos devolveria el estudiante con esa clave
		System.out.println(elegido.getNombre());
		
		mapa1.containsKey("09922551H"); // si tiene la clave x , true o false
		
		//recorrer los valores del mapa, values retorna una coleccion de los valores
		for(Estudiante e :mapa1.values()) {
			System.out.println(e.getNombre());
		}
		
		
		//Map <String,List <Persona> > personalHospital = new HashMap <String, List <Persona> >;  mapa con dnis y lista de persona que curran en el hospi
		
		for (String clave : mapa1.keySet()) { //para ir cogiendo las claves
			System.out.println(clave);
			mapa1.get(clave); //para ir sacando el obj
			//o coger los nombres System.out.println( mapa1.get(clave).getNombre() ); 
		}
		
		
		//recuperar clave y valor  entrySet()
		Set <Entry <String, Estudiante>> entrySet = mapa1.entrySet();
		
		for (Entry <String, Estudiante> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getNombre());
		}
	
	}
	/*
	 * Interfaz Map       
	 * 			tienen clave valor    las claves no pueden ser repetidas, si metes un valor y luego otro valor con esa clave, pisa el anterior
	 * 			añadir informacion al mapa   con put(clave,valor)  recuperar con get(una clave);
	 * 			comprobar si el mapa tiene x clave containsKey("x"); 
	 * 			devolver un set con las claves  mapa.keySet()
	 * 			para coger todos los valores del mapa mapa.values()   devuelve una coleccion del valor
	 * 			para coger ambos, claves y valores  entrySet()   para luego recorrerlo con un fore y coger las claves y values  
	 * 
	 * 
	 * 
	 * 
	 * 
	 *  
	 *  	
	 */

}
