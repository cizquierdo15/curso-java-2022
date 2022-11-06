package curso.java.lambda.aritmeticaA;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Calculadora {

    public double computar(double a, double b, InterfazOperacionesAritmetica lambda){
        return lambda.operacion(a, b);
    }
    								//BiFunction que datos que vas a meter y salir pirmerTipoDato que recibe SegundoTiipo dato, tipo del Return
    public double computarConBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda){
        return lambda.apply(a, b);
    }
    
    
    // BiPredicate<T, U>  devuelve T o F depende si coinciden entre si los parametros que meten
}
