package ejercicios.ejerciciosPOO.carreraCaballos;

import curso.java.inicio.interfaces.IUpdatetable;

public class Caballo implements IUpdatetable{
	private int dorsal;
	private String nombre;
	private int velocidad;
	private int experiencia;
	private int edad;
	private int metrosRecorridos;
	
	//constructor
	public Caballo(int dorsal, String nombre, int velocidad, int experiencia, int edad) {
		super();
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.edad = edad;
		this.metrosRecorridos = 0;
	}
	
	//metodos
	
	public int correr() {
		int nAleatorio = (int) (Math.random()+1)*10;
		int mAvanzados = (this.velocidad+this.experiencia-this.edad + nAleatorio);
		metrosRecorridos+= mAvanzados;
		System.out.println("Caballo "+ this.nombre+ " avanza "+mAvanzados + "metros");
		return metrosRecorridos;
		
	}
	//getters setters
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getMetrosRecorridos() {
		return metrosRecorridos;
	}
	public void setMetrosRecorridos(int metrosRecorridos) {
		this.metrosRecorridos = metrosRecorridos;
	}

	
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		System.out.println("INSERT INTO TABLE TB_CABALLO");
	}

	@Override
	public void update(long id) {
		// TODO Auto-generated method stub
		System.out.println("UPDATE TABLE TB_CABALLO");
	}
	
	
}
