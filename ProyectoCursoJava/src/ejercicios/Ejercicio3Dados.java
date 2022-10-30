package ejercicios;

import java.util.Arrays;
import java.util.Random;

import curso.java.funciones.Utils;

public class Ejercicio3Dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ej1Dado();
		
		ej2Dados();	
	}
	  /* Ejercicio 
     * pedir al u que intro duza n de tiradas que se va a lanzar el dado,  el dado es de 6 caras
     * ir mostrando los resultados
     * 	lanzar x vece e ir guardando los resultados ( array)
     * al terminar, decir el n mas alto , n mas bajo , media , 
     * 
     * ***************************************
     * */
	static void ej1Dado () {
    	System.out.println( "Ejercicio 1 tiradas de dado");
    	int nTiradas = Integer.parseInt(Utils.pideValor("Introduce el num de tiradas deseado "));
    	int carasDAdo = 6;
    	int cont = 0;
    	int nMasAlto = 0;
    	int nMasBajo = carasDAdo; //n mas alto
    	int media = 0;
    	int [] tiradas = new int[nTiradas];
    	
    	while( cont != nTiradas) {
    		System.out.println("tirada nº ---> "+ (cont +1) );
    		int numASacar = Utils.tiradaDado(6);
    		tiradas[cont] = numASacar;
    		//ver n Mas alto
    		nMasAlto = Math.max(numASacar, nMasAlto);  //devuelve el mas alto de los dos
    		 //ver n mas bajo    
    		nMasBajo = Math.min(numASacar, nMasBajo);
    		//crear total
    		media += numASacar;
    		cont ++;
    	}
    	System.out.println("**********\n TIRADAS TERMINADAS\n->>>REsultados");
    	System.out.println(  Arrays.toString(tiradas) +  " Tiradas ");  //para cmostrar el array
    	System.out.println("El Nº mas alto es "+ nMasAlto);
    	System.out.println("El Nº mas bajo es "+ nMasBajo);
    	System.out.println("La media de las tiradas es es "+ (media / nTiradas));
    }
	
	 /* Jugar con dos dados
         * tirar 5 veces los dos dados, se suma el resultado de los 2
         * saber en que tirada se ha obtenido el n mas alto y cuales son los valores que lo han generado, (ir guardando la tirada mas alta)
         * */
	static void ej2Dados () {
		System.out.println("Ejercicio 2 Con doble dado");
		
		int nTiradas = 5;
		int nDados = 2;
		int nCaras = 6;
		int [][] tiradas = new int[nTiradas] [nDados];
		
		int sumaTirada = 0;
		int tiradaMasAlta = 0;
		
		//int [][][]  =  new int [2][1][1];  //valores  num pos
		int posMasAlto = 0;
		
		int []tiradasDado1 = new int[nTiradas];
		int []tiradasDado2 = new int[nTiradas];
		
		for (int i = 0; i < nTiradas; i++) {
			System.out.println("tiradas nº ---> "+ (i +1) );
			int resulDado1 = Utils.tiradaDado(nCaras);
			int resulDado2 = Utils.tiradaDado(nCaras);
					
			tiradasDado1[i] = resulDado1;
			tiradasDado2[i] = resulDado2;
			
			//ver tirada mas alta
			if (tiradaMasAlta < ( resulDado1+ resulDado2 )) {
				tiradaMasAlta = resulDado1+ resulDado2;
				posMasAlto = i+1;
			}		
		}
		System.out.println("\n Resultados ---> " );
		System.out.println(Arrays.toString(tiradasDado1));
		System.out.println(Arrays.toString(tiradasDado1));
		System.out.println("La tirada mas alta ha sido "+ posMasAlto);
		System.out.println("La suma mas alta ha sido "+ tiradaMasAlta);	
	}
}
