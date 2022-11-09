package curso.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import curso.java.lambda.aritmeticaA.Usuario;


public class ApuntesStream {

	public static void main(String[] args) {
		
		//como flujo de datos, 
		
		List<String> lista = new ArrayList<>();
		lista.add("Pepito");
		lista.add("Paco");
		lista.add("Patata");
		//por cada dato se pinta
		lista.stream().forEach(System.out::println);
		lista.stream().forEach(texto -> System.out.println(texto));
		
		//va mirando los usuarios que se llaman pepe de el chorro de datos
		 Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena","Pepe Garcia", "Pato Guzman", "Pato Guzman")
	                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))//separa el nombre y app de los datos
	                .filter(usuario -> usuario.getNombre().equals("Pepe"))
	                .peek(System.out::println);

	        nombres.forEach(System.out::println);
	}

}
