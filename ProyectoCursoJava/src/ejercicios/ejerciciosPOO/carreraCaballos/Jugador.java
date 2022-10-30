package ejercicios.ejerciciosPOO.carreraCaballos;

import curso.java.funciones.Utils;

public class Jugador {
	private String nombre;
	private int saldo;
	private Apuesta apuesta;
	
	//constructor
	public Jugador(String nombre, int saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;	
	}
	
	//metodos
	
	public void apostar() {
		System.out.println("Tienes "+this.getSaldo());
		//cuanto
		//comprobar que la cantidad es mayor a 0 y menor al saldo que tiene
		int cantidad = Integer.parseInt(Utils.pideValor("Cuando deseas apostar " + this.nombre)); 
		
		//a quien
		//comprobar dorsal tm
		int elegido = Integer.parseInt(Utils.pideValor("A que caballo, introduce el dorsal"));
		this.apuesta = new Apuesta(elegido, cantidad);
	}
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Apuesta getApuesta() {
		return apuesta;
	}	
	
}
