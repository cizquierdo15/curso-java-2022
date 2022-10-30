package ejercicios.ejerciciosPOO.maniquis;
/**
 * Clase que representa un objeto boton
 * @author Zurdo
 *
 */

public class Boton {
	private String color;
	private String forma;
	
	//constructor
	public Boton(String color, String forma) {
		super();
		this.color = color;
		this.forma = forma;
	}
	//gettters y Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	
	
	
}
