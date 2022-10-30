package ejercicios.ejerciciosPOO.maniquis;

public class Camisa {
	private String color;
	private String talla;
	private double precio;
	private Boton [] botones;
	
	
	//Constructores
	public Camisa(String color, String talla, int precio, Boton[] botones) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.botones = botones;
	}

	//sin botones
	public Camisa(String color, String talla, int precio ) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}
	
	// Getters y Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Boton[] getBotones() {
		return botones;
	}

	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}

	

}
