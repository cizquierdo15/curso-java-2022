package curso.java.inicio;

import java.util.Random;

import curso.java.funciones.Utils;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        
        //Math.random()*(max-min)+min luego transformar a entero

        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;

        System.out.println("random = " + random);
        
        random = Math.floor(random); //redondea el valor hacia abajo
        System.out.println("random = " + random);
        
        // Math.ceil(random)  hacia arriba
        System.out.println("colores = " + colores[(int) random]);
        
        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(25-15+1);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
        
        
        //ejemplo de dado de 6 caras
        Utils.tiradaDado(6);
        
        Random dandomObj = new Random(); //obj ran
        //num de 0 a 11   de  querer una granja seria nexInt()
        int random2 = randomObj.nextInt(11);
        System.out.println("random obj "+ random2);
        
              
    }
    
    
    
}
