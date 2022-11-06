package ejercicios.ejerciciosMapas;

import java.util.HashSet;
import java.util.Set;

import ejercicios.ejerciciosColecciones.Asignatura;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	private Colegio colegio;
	private Set <Asignatura> asignaturas;
	
	
	
	public Alumno(String nombre, String apellidos, String dni, Colegio colegio) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.colegio = colegio;
		//crear asignaturas
		this.asignaturas = new HashSet <Asignatura>();
		Asignatura a1 = new Asignatura("Historia", 7);
		Asignatura a2 = new Asignatura("Musica", 5);
		Asignatura a3 = new Asignatura("Fisica", 3);
		asignaturas.add(a1);
		asignaturas.add(a2);
		asignaturas.add(a3);
	}
	
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
	
	public Colegio getColegio() {
		return colegio;
	}
	public void setColegio(Colegio colegio) {
		this.colegio = colegio;
	}
	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	
	
}
