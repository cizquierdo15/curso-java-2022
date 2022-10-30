package ejercicios.ejerciciosPOO.carreraCaballos;

public class Apuesta {
	private int caballoElegido;
	private int cantidad;
	
	//constructor
	public Apuesta(int caballoElegido, int cantidad) {
		super();
		this.caballoElegido = caballoElegido;
		this.cantidad = cantidad;
	}

	public int getCaballoElegido() {
		return caballoElegido;
	}

	public void setCaballoElegido(int caballoElegido) {
		this.caballoElegido = caballoElegido;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
