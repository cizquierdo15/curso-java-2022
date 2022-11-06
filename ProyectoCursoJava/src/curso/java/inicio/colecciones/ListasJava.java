package curso.java.inicio.colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import ejercicios.ejerciciosPOO.maniquis.Boton;

public class ListasJava {
	public static void main(String [] args) {
		/*
		 * Coleccionss
		 * 
		 * 	se pueden ir añadiendo elementos, no tienen tamaño fijo   --- dicnamicas
		 * 	dependiendo del tipo hay unas ventajas u otras
		 * 	tipos:
		 * 	son como sacos en los que metes info,
		 * 		listas / list  todos los obj
		 * 		set		listas sin objetos repetidos
		 * 		vector  
		 * 		stack   pilas  el primero que coges es el de arriba
		 * 		queue	cola	el primero que coges es el primero que entra
		 * 
		 * 
		 * 	todas ellas son interfaces,    padre Iterable  el resto heredan  todas las colecciones se pueden recorrer con un foreach
		 * 									luego esta Collection  (hija de Iterable) contiene metodos
		 * 										hijas de Collection son List  ,  Set  
		 * 											de List estan la clases desde ellas generamos los objetos  ArrayList  (metodo add() de una determinada forma)
		 * 																  									   LinkedList ( sobrescribe tmbn el metodo add() )
		 * 																 									   Vector
		 * 																											Stack
		 * 											de Set  hereda HashSet
		 * 														   LinkedHashSet
		 * 														   SortedSet  (ordenado)
		 * 
		 * 	Veremos Map tmb ( clave y valor)
		 * 		Puede haber Maps con valores que sean listas y los valores de la lista sean mapas con valores strings
		 * 
		 *   
		 * */
		//Listas
			//hay que usar una clase que implemente la interfaz
			ArrayList lista1 = new ArrayList();     
			//para añadir info	,, puede ser de distinto tipo 
				lista1.add("CacaHuete");
				lista1.add(222);
				lista1.add(new Boton("Azul", "redondo"));
			ArrayList<String> lConTipo = new ArrayList<String>(); // con los diamantes le podemos decir que tipo de objetos querriamos meter, se le dice genericos
			// en esta lista solo deberiamos guardar strings
			lConTipo.add("Tomate");
			//lConTipo.add(2); tira fallo
			lConTipo.add("Lechuga");
			lConTipo.add(0,"Pan");
			
			//recorrer,   arraylist mantiene el orden en el que insertamos la info, a no se que se le indique la posicion donde meter
			for (String texto : lConTipo) {
				//System.out.println(texto);
			}
			// n de elementos con lista.size()
			// ver si esta vacio  lista.isEmpty()
			// ver si tiene un ele  .contains()   se le puede pasar la referencia de un obj
			//  devolver el obj en una pos   .get(0)
			// sustituir un valor .set(0,"hey")
			// borrar .remove(0)  por posicion  o por valor .remove("x");
			
			
			Set <String> testSet = new HashSet<String>();
			
			testSet.add("abrigo");
			
			testSet.add("bufanda");
			
			//System.out.println(testSet.contains("bufanda"));  ---> saca true
			testSet.remove("abrigo");
			for (String texto : testSet) {
				//System.out.println(texto);
			}
			/*
			 * Sets
			 * 	no guarda la informacion de manera ordenada, osea segun lo mentemos, el le cambia el orden internamente
			 * añadir  .add()  / no se puede indicar la posicion   ,,, devuelve un boolean de si lo inserta o no
			 * tamaño  .size()
			 * ver si esta vacio .isEmpty()
			 * borrar .remove(x);
			 * tiene uno en concreto .contains("x")
			 * 
			 * */
			
	
	}
}
