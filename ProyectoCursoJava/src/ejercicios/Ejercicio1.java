package ejercicios;

import java.util.Iterator;

//importar una clase, todas las clases que no esten eln el paquete java.lang hay que importarlas    cntrl shift o

import java.util.Scanner;

import curso.java.funciones.Utils;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//clase para introducir datos
		Scanner teclado = new Scanner(System.in);
		
		//pintar menu para elegir
		//mientras la condicion no sea 5 mostrar el menu
		int opcion = 0;
		do {
			Utils.pintarMenu();
			
			System.out.println("Selecciona una opcion de estas");
			
			//opcion elegida
			opcion = Integer.parseInt(Utils.pideValor());
			System.out.println("Opcion seleccionada "+ opcion);
			
			//ejecutar la opcion
			switch (opcion) {
				case 1: System.out.println("opcion 1"); pintarCuadrado(); break;
				
				case 2: System.out.println("opcion 2"); validarEmail(); break;
					
				case 3: System.out.println("opcion 3"); serieFibonacci(); break;
					
				case 4: System.out.println("opcion 4"); insertarNombres(); break;
					
				case 5: System.out.println("Adios"); break;
				
				default: System.out.println("opcion incorrecta");
			}
			
		}while(opcion != 5);
		
		
		/*  probar
		 * for(; ; ){
		 * 	System.out.println("coco");
		 * }
		 * */
		System.out.println("termina");
		
		/*testeo fibonacci recur
		
		int numFibo = 8;
		
		for ( int i = 0; i < numFibo; i++) {
			int numero = fiboRecursiva(i);
			System.out.println(numero + " ,");
		}*/
	}
	
	//metodos del ejercicio
	
	 //1. Pintar cuadrado
	/**
		*comentario java doc, al pasar el reton sobre la llamada a la fun se muestra la descipcion puesta en el comentario
	*/
 	static void pintarCuadrado() {
		
		//pedir el tamaño				
		int tamano = Integer.parseInt( Utils.pideValor("introduce el tamaño del cuadrado") );
				
		System.out.println("Ha elegido "+ tamano);
		
		//falta comprobar el dato ingresado     ---- evitar que metan string
		while (tamano < 1 || tamano > 100 ||  (((Object)tamano).getClass().getSimpleName() != "String")) {
			System.out.println( "tamaño no valido, ingresa un Nº de 1 a 100");
			tamano = Integer.parseInt( Utils.pideValor("introduce el tamaño del cuadrado") );
		}
				
		//tantas vueltas como tamaño ( alto )
		for( int fila = tamano; fila > 0 ; fila--) {
			//si es la primera linea, completa y si es la ultima tambien
			if( fila == tamano || fila == 1) {
				//ancho por el num
				for(int col = 0; col < tamano; col++) {
						System.out.print("*");
				}
			}
			//las demas
			else {
				for(int col = 0; col < tamano; col++) {
					//al pintar el ancho solo el primero y ultimo
					if(  col == 0  || col == tamano-1 ) { System.out.print("*"); }
					else { System.out.print("."); }
				}
			}
			//saltar linea
			System.out.println("");
		}
	}
 	
 	//2. Validar email
 	static void validarEmail() {
 				//con funciones de la clase string
 				System.out.println("Ingresa tu correo para validarlo");
 				Scanner teclado = new Scanner(System.in);
 				String correo = teclado.next();
 				//para complicarlo usar luego next() string pattern  probar a usar nextLine()
 				String mensajeError = "";

 				//validacion 1 no puede contener espacios en blanco
 				correo = correo.trim();
 				if(correo.contains(" ")) { mensajeError += " el correo no puede tener espacios en blanco "; }
 				
 				//correo.toCharArray()
 				//validacion 2 no puede contener mas de 1 @
 				if( correo.contains("@") ){
 					int longitud = correo.length();
 					for(int caracter = 0; caracter < longitud; caracter++) {
 						//String.valueOf(correo.charAt(caracter)).cibtains("@");
 						//para validar que no hay mas de 1 @ podria hacerse comparando lo que nos devuelve indexOf() y lastIndexOf() si nos da lo mismo solo hay 1 si no hay varias
 						if(correo.indexOf("@") == -1 ||  correo.indexOf("@") != correo.lastIndexOf("@")) { mensajeError += " tiene que haber 1 @ "; }
 					}
 				}
 				//validacion 3 controlar que despues de arrooba tiene punto
 				if( correo.substring( correo.indexOf("@") ).contains(".") ) {
 					//si tiene un punto
 					//desde el punto hasta el final del correo, sin contar con este
 					String terminacion = correo.substring( correo.lastIndexOf(".")+1 );
 					
 					// Validación 4: Después del último punto, tiene que haber entre 2 y 6 caracteres.
 					if(terminacion.length() < 2 || terminacion.length() > 6) { mensajeError += " despues del punto tiene que haber de 2 a 6 caracteres "; }
 					
 				}else { mensajeError += " despues de la @ tiene que haber algun punto "; }
 				
 				//comparar strings
 				if(mensajeError.equals("")) {
 					System.out.println("El email "+ correo + " es correcto");	
 				}else {
 					System.out.println("El email "+ correo + " es incorrecto "+ mensajeError);
 				}
 	
 	}
 	//3. Serie Fibonacci
 	static void serieFibonacci() {
 		System.out.println("Cuantos elementos de la serie fibonacci quieres mostrar");
 		
 		Scanner teclado = new Scanner(System.in);
		int totalN = teclado.nextInt();
		int n1 = 0;
		int n2 = 1;
		int acumulador;
		
		for(int cont = 0; cont < totalN; cont++) {
			acumulador = n1 + n2;
			n2 = n1;
			n1 = acumulador;
			System.out.println(acumulador);
		}	
 	}
 	
 	static int fiboRecursiva( int numero) {
 		if(numero == 0 || numero == 1) {
 			return numero;
 		}else {
 			//ha de sumar los 2 valores anteriores y se va llamando a si misma
 			return fiboRecursiva(numero-1) + fiboRecursiva(numero-2);
 		}
 	}
 	
 	
 	//4. Insertar Nombres
 	static void insertarNombres(){
 		
		int nAlumnos =Integer.parseInt(Utils.pideValor("Cuantos alumnos hay"));
		
		String [] alumnos = new String[nAlumnos];  // le asignamos un tamaño al array, este tamaño no se puede modificar a futuro, 
		/*
		 * String [] alumnos = new String[5];  si reasignamos la vaiable con otra longitud la variable apunta al nuevo array
		 * alumnos = new String[10];
		 * */
		
		//si el nAlumnos es 3, preguntar nombres y guardar en array, luego mostrarlos al terminar de guardar
		if(nAlumnos == 3) {
			for(int cont = 0; cont < alumnos.length; cont++) {
				alumnos[cont]= Utils.pideValor( "Dame el nombre del alumno " +(cont+1));
			}//for each
			for( String alumno : alumnos ) {
				System.out.println("Nombre "+ alumno);
			}
		}
 	}
	
	void main(String args) {
		
	}

}
