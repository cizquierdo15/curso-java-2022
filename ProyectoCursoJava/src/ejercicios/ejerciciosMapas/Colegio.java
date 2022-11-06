package ejercicios.ejerciciosMapas;

public class Colegio {
	private String nombre;
	private String direccion;
	
	
	public Colegio(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
