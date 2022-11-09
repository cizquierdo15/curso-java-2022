package curso.java.lambda;


import java.text.SimpleDateFormat;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import curso.java.lambda.aritmeticaA.Usuario;



public class ApuntesConsumer {

	public static void main(String[] args) {
		//acepta cualquier tipo de dato, en este caso una fecha, para darle formato
		Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        //crea la fechs y lo ejecuta
        consumidor.accept(new Date());
        
        
        //esta interfaz acepta 2 tipos de datos, en este caso <String, Integer> ,, saca por consola una cadena
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + ", tiene " + edad + " años!");

        consumidorBi.accept("pepe", 20);
        
        //cada texto lo imprime
        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola mundo lambda");

        List<String> nombres = Arrays.asList("andres", "pepe", "luz", "paco");
        nombres.forEach(consumidor2); //va cogiendo los elementos y ejecuta ( muestra),,,, acepta elementos que implementen Consumer

       /* Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario usuario = creaUsuario.get();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "Andrés");
        System.out.println("Nombre usuario: " + usuario.getNombre());

        Supplier<String> proveedor = () -> "Hola mundo lambda supplier";

        System.out.println(proveedor.get());*/

	}

}
