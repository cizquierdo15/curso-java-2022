package ejercicios.ejerciciosPOO.Ejercicio7BandaMusica;

import curso.java.funciones.Utils;
import curso.java.inicio.interfaces.IInsertable;

public abstract class Instrumento implements IInsertable{ //como es abstracta , el guardar de la BD se hara en cada instrumento de una forma
	private String nombre;
	private String tipo;
	private String marca;
	private int precio;
	private boolean afinado;
	
	//constructor
	public Instrumento(String nombre, String tipo, String marca, int precio) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.marca = marca;
		this.precio = precio;
	}
	
	//metodos
	public void afinar() {
		int tirada = Utils.tiradaDado(10);
		if(tirada > 8) {
			System.out.println( "instrumento " + this.nombre + " NO afinado bien");
			this.afinado = false;
		}else {
			System.out.println( "instrumento " + this.nombre + " esta afinado bien");
			this.afinado = true;
		}
		
	}
	
	public void tocar() {
		//operador ternarios en el sys , si esta afinado saca correctamente si no mal
		System.out.println( "instrumento " + this.nombre + ( isAfinado()?" correctamente" : " mal" ) );	
	}
	
	
	//getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isAfinado() {
		return afinado;
	}

	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}

	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + ", marca=" + marca + ", precio=" + precio
				+ ", afinado=" + afinado + "]";
	}
	
	public abstract  void limpiar();
}
