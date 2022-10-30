package curso.java.inicio.herencia;

public class Estudiante extends ClasePadre{
	
	private String asignaturaFavorita;
	
	// el constructor,  
	public Estudiante(String nombre, int edad, boolean mayorEdad) {
		super(nombre, edad, mayorEdad); //crea las variables del padre
		System.out.println("Constructor del estudiante");
	}

	public Estudiante(String nombre, int edad, boolean mayorEdad, String asignaturaFavorita) {
		super(nombre, edad, mayorEdad); //crea las variables del padre
		this.asignaturaFavorita =  asignaturaFavorita;
		System.out.println("Constructor del estudiante con asignatura");
	}

	public String getAsignaturaFavorita() {
		return asignaturaFavorita;
	}

	public void setAsignaturaFavorita(String asignaturaFavorita) {
		this.asignaturaFavorita = asignaturaFavorita;
	}

	@Override
	public void metodo1() {
		// TODO Auto-generated method stub
		super.metodo1();//desde aqui llama al metodo 1 de la clase padre, por lo que haria lo del padre y lo suyo
		System.out.println("metodo 1 clase estudiante");
	}
	
	
	//metodo
	
	/*
	@Override
	public void metodo1() {
		System.out.println("metodo 1 clase estudiante");
		System.out.println(getNombre());  // llama al metodo publico del padre
	}*/
}
