package curso.java.inicio.interfaces;

import ejercicios.ejerciciosPOO.Ejercicio7BandaMusica.Instrumento;

public class ClaseInterfaces extends Instrumento implements Transporte, ILogistica{

	public ClaseInterfaces(String nombre, String tipo, String marca, int precio) {
		super(nombre, tipo, marca, precio);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//han de implementar y sobreescribir los metodos, abstractos del padre y la interfaz
	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		int nuevoN =  NUM + 6;  // utilizamos la var de la interfaz
	}
	
	
	@Override
	public void transportar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void almacenar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		
	}

	
	
}
