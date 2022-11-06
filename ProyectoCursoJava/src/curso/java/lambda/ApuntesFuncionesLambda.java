package curso.java.lambda;

import curso.java.lambda.aritmeticaA.Calculadora;
import curso.java.lambda.aritmeticaA.InterfazOperacionesAritmetica;

public class ApuntesFuncionesLambda {

	public static void main(String[] args) {
		// Configurar  la interfaz			//parametros a recibir por parte de operar ->  aaccion
		InterfazOperacionesAritmetica suma = (a,b) -> a+b;  //en vez de hacer la clase Sumar
		//seria lo mismo que esto
		InterfazOperacionesAritmetica suma2 = Double::sum;  //:: añade 2 nums (a+b) sum los suma
		System.out.println(suma.operacion(8,8)); //la usamos
		
		
		Calculadora cal = new Calculadora();
		System.out.println(cal.computar(10, 20, suma));
		System.out.println(cal.computar(10, 20, (a,b) -> a*b)); //mandandole directo una nueva funcionalidad
		System.out.println(cal.computarConBiFunction(10, 20, (a,b) -> a/b));
	}
	
	

}
/*
 * funciones landa, programacion funcional
		se necesitan interfaces funcionales
			Interrfaces que solo tienen un metodo abstracto
			se usa una anotacion, para asegurar que la interfaz es una I funcional, @FuncionalInterface,, parecido a @Override con lo de asegurarse de sobrescribir los metodos de la interfaz
		
		->
	
	//Solo tiene un metetodo abstracto, ya que es una FI
	    double operacion(double a, double b);
	    //podria tener otros metodos void  o alguna var
	    String COLOR = "Tojo";
 * 
 * 
 * 	La idea es no crear tantas clases
 * 
 * 
 * // Configurar  la interfaz			//parametros a recibir por parte de operar ->  aaccion
		InterfazOperacionesAritmetica suma = (a,b) -> a+b;  //en vez de hacer la clase Sumar
		System.out.println(suma.operacion(8,8)); //la usamos
		
		!!!Si fuera una accion de varias lineas seria
 * 			InterfazOperacionesAritmetica suma = (a,b) -> {
 * 				//codigo
 * 			}
 * 
 */