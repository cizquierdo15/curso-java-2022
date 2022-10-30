package curso.java.inicio.herencia;

public class ClasePadre {
	private String nombre;
	private int edad;
	private boolean mayorEdad;
	
	
	public ClasePadre(String nombre, int edad, boolean mayorEdad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.mayorEdad = mayorEdad;
		System.out.println("Constructor del padre");
	}

	public void metodo1() {
		System.out.println("metodo 1 clase padre");
	}
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isMayorEdad() {
		return mayorEdad;
	}


	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}
	
	
}
