package curso.java.funciones;

import java.util.Scanner;

public class Utils {
	
	
	/** 
	 * Funcon para solictar un valor por consola
	 * @param texto
	 * @return
	 */
	//que devuelva string y luego ya convertimos a lo que necesitemos
	public static String pideValor(String texto) {
		String reply = "";
		System.out.println(texto);
 		Scanner teclado = new Scanner(System.in);
		reply = teclado.nextLine();  //next a secas coge las palabra separadas por espacio, nextLine coge la frase entera
		//teclado.close();
		
		return reply;
	}
	
	//sobrecarga de funciones, sin no metemos valor mete el por defecto     dependiendo los parametros llamara a una u otra
	/**
	 * Funcion que pide un valor con el texto por de fecto introduce una opcion
	 * @return String con el valor introducido
	 */
	public static String pideValor() {
		return pideValor("Introduce una opcion");
	}
	//pintar menu por defecto el de cuadrado,,,,,,pintar menu elegido , con un array de strings
	
	
	public static void pintarMenu() {
		System.out.println("1. Pintar cuadrado");
		System.out.println("2. Validar email");
		System.out.println("3. Serie Fibonacci");
		System.out.println("4. Insertar Nombres");
		// \n salto de linea \ t tabulacion \n 5. Salir --> \"Adios"
		System.out.println("5. Salir --> \"Adios");
	}
	/**
	 * Funcion para pintar el menu que se le pasa por parametro
	 * @param menu (menu a pintar
	 */
	public static void pintarMenu(String menu) {
		System.out.println(menu);
	}
	/**
	 * Funvion para pintar el menu a partir de lso elementos de un array
	 * @param valores Array con distintas opciones del menu
	 */
	public static void pintarMenu(String [] valores) {
		for(String opcion : valores) {
			System.out.println(opcion);
		}
	}
	
	/**
	 * Funcion para simular una tirada de un dado de X caras
	 * @param numCaras
	 * @return devuelve un entero del aleatorio generado (a la alza)
	 */
	 public static int tiradaDado(int numCaras) {
	    	double r = Math.random();
	    	int tirada =(int)(Math.ceil( numCaras * r ));
	    	System.out.println("Ha salido "+tirada);
	    	return tirada;
	  }
}
