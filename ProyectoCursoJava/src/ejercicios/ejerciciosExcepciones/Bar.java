package ejercicios.ejerciciosExcepciones;

public class Bar {
	private String nombre;
	private Cliente cliente1;
	private CoffeCup cafelito;
	
	
	public Bar(Cliente cliente1, String nombre) {
		super();
		this.cliente1 = cliente1;
		this.nombre = nombre;
		this.cafelito = new CoffeCup( (int) (Math.random()*100)+1 );
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente juanelo = new Cliente("Juanelo");
		Bar barLosAngeles = new Bar(juanelo, "Los Angeles");
		
		System.out.println("****Bar****");
		System.out.println(barLosAngeles.getCafelito().getTemperatura() + " temp cafe");
		try {
			barLosAngeles.getCliente1().tomarCafe( barLosAngeles.getCafelito() );
		} 
		catch (TooHotTemperatureException th) {
			System.out.println(th.getMessage());
		}
		catch (TooColdTemperatureException tc) {
			System.out.println(tc.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error "+e.getMessage());
		}finally {
			System.out.println("---termino---");
		}
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Cliente getCliente1() {
		return cliente1;
	}


	public void setCliente1(Cliente cliente1) {
		this.cliente1 = cliente1;
	}


	public CoffeCup getCafelito() {
		return cafelito;
	}


	public void setCafelito(CoffeCup cafelito) {
		this.cafelito = cafelito;
	}
	
}
