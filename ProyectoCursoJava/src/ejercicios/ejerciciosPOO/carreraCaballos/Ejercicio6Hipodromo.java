package ejercicios.ejerciciosPOO.carreraCaballos;

import curso.java.funciones.Utils;

public class Ejercicio6Hipodromo {
	private Carrera carrera;
	private Jugador[] jugadores;
	private Caballo [] caballos;
	public static void main(String[] args) {
		
		Ejercicio6Hipodromo hipo1 = new Ejercicio6Hipodromo();
		System.out.println("**Bien venidos al Hipodromo***");
		//se abre el hipodromo
		hipo1.abrirHipodromo();
			
		// TODO Auto-generated method stub
		//Ejercicio 6
		/* 
		 * simular una carrera de 3 caballos
		 * clase Caballo 
		 * 		-- dorsal  nombre   velocidad(de 1 a 10)   experiencia(de 1 a 10)  edad (1-20)  <- atributos   ||||  
		 * 		 correr()  . devuelve los metreos avanzados, Han de correr 100 metros   dependiendo de V + Ex  - edad  + nAleatorio     ----- Ponerlos a correr HASTA que alguno llegue a 100m
		 * 	     cada vez que correr, ha de devolver cuanto avanza y mostrarlo por consola
		 * 		gana quien llega mas lejos de los 100 m, ej uno llega a 110
		 * 
		 *  
		 *  clase Carrera
		 *  	nombre de la carrera     distancia     Caballos que participan <--- atrib
		 *  	iniciarCarrera()    todos los caballos empiezan a correr()  ----  devuelve el caballo ganador
		 *  
		 *  
		 *  clase Jugador
		 *  	nombre    saldo   Apuesta <-- atrib
		 *  	apostar()  ¿Cuanto quieres apostar     -> 100    , sobre que caballo ,,, decir dorsales de los caballos disponible 
		 *  	
		 *  clase Apuesta
		 *  	caballoelegido   cantidad	
		 *  
		 *  	
		 *  clase Hipodromo
		 *  	-main()   2 jugador 3 caballos   ---- por cada jugador, llamar a metrodo apostar(cantidad,caballo)
		 *  	cuando ya apuestan todos iniciarCarrera()  
		 *  		jugador que acierte caballo ganador apuesta*5, los que fallan se resta de su saldo																								
		 * 											
		 * 
		 * 
		 * 
		 */
	}
	
	private Jugador [] crearJugadores() {
		jugadores = new Jugador [2];
		jugadores[0] = new Jugador("Lorenzo", 300);
		jugadores[1] = new Jugador("Amancio", 999);
		return jugadores;
	}

	private Caballo [] crearCaballos() {
		caballos = new Caballo [3];
		caballos[0] = new Caballo(2, "Perdigon", 5, 6, 3);
		caballos[1] = new Caballo(15, "Alunizaje", 5, 8, 1);
		caballos[2] =  new Caballo(10, "Zebra", 2, 3, 7);
		
		return caballos;
	}
	
	/**
	 * Crea la carrera, con los caballos y jugadores, se hacen las apuestas , la inicia , resultados de las apuestas y ganador
	 */
	private void abrirHipodromo() {
		this.carrera = new Carrera("Carrerita", 100, 3);
		System.out.println("Nombre de la carrera "+this.carrera.getNombre());
		//se crean los caballos
		this.caballos = crearCaballos();
		//se crean los jugadores
		this.jugadores = crearJugadores();
		//apostar por cada jugador
		realizarApuestas(jugadores);
		System.out.println("EMPIEZA LA CARRERA!");
		//iniciar la carrera
		Caballo ganadorCarrera = this.carrera.iniciarCarrera(this.caballos);
		System.out.println("Resultados de las apuestas <-- "); 
		//comprobar las apuestas
		comprobarApuestas(ganadorCarrera);
		
		System.out.println("El ganador es!!! ");
		System.out.println(ganadorCarrera.getNombre()); 
		
	}
	
	
	private void realizarApuestas(Jugador [] jugadores) {
		for (Jugador jugador : jugadores) {
			//mostrar los dorsales de cada caballo al que vaya a apostar
			for (Caballo caballo : caballos) {
				System.out.println("El cb "+ caballo.getNombre()+ " tiene el dorsal "+ caballo.getDorsal());
			}
			jugador.apostar();
		}
	}
	
	private void comprobarApuestas(Caballo ganadorCarrera) {
		for (Jugador jugador : jugadores) {
			int dineroAnterior = jugador.getSaldo();
			if(jugador.getApuesta().getCaballoElegido() == ganadorCarrera.getDorsal()) {
				
				jugador.setSaldo(dineroAnterior + (jugador.getApuesta().getCantidad() * 5) );
			}else {
				jugador.setSaldo(dineroAnterior - (jugador.getApuesta().getCantidad()) );
			}
			System.out.println(jugador.getNombre()+" te quedan " +jugador.getSaldo());
		}
	}
}
