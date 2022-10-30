package ejercicios.ejerciciosPOO.carreraCaballos;

public class Carrera {
	
	private String nombre;
	private int distancia;
	private int nParticipantes;
	//
	//private Caballo [] caballos;  ..... ponerlos en el constructor tmbn
	Caballo ganador;
	
	//constructor
	public Carrera(String nombre, int distancia, int nParticipantes) {
		super();
		this.nombre = nombre;
		this.distancia = distancia;
		this.nParticipantes = nParticipantes;
		this.ganador = new Caballo(1,"decidiendo",1,1,1);
	}
	
	//metodos
	public Caballo iniciarCarrera( Caballo [] participantes) {
 
		//mientras que se este decidiendo
		while (ganador.getNombre().equals("decidiendo")) {
			for (Caballo caballo : participantes) {
				caballo.correr();
				if(caballo.getMetrosRecorridos() > this.distancia) {
					ganador = caballo;
					break;
				}
			}
		}//devuelve el caballo
		return ganador;
	}
	
	//getters setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getnParticipantes() {
		return nParticipantes;
	}

	public void setnParticipantes(int nParticipantes) {
		this.nParticipantes = nParticipantes;
	}
	
	
	
}
