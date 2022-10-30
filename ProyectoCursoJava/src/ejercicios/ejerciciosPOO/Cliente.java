package ejercicios.ejerciciosPOO;

public class Cliente {
	//Variables de clase
	static String saludo; // todos los objs de esta clase compartirian esta variable
	
	//Variables de instancia
	private String nombre;
	private String apellidos;
	private String dni;
	private double importeCompra;
	
	//constructor
	public Cliente(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	//Funciones
	//Actualiza  importeCompra
	void comprar( double importe) {
		this.importeCompra += importe;
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public double getImporteCompra() {
		return importeCompra;
	}
	
}
