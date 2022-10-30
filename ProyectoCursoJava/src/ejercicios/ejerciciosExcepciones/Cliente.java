package ejercicios.ejerciciosExcepciones;

public class Cliente {
	private String nombre;
	
	public Cliente(String string) {
		this.nombre = string;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	//para que el del bar se entere de la excepcion, se mete en el metodo el throws
	public void tomarCafe(CoffeCup cafe) throws TemperatureException {
		if(cafe.getTemperatura() > 80) {
			//lanzar toohot
			System.out.println("Caliente");
			throw new TooHotTemperatureException("Me quemo la lengua");
		}else if(cafe.getTemperatura() < 20) {
			//lanzar toocold
			System.out.println("frio");
			throw new TooColdTemperatureException("To frio, estas que me lo tomo");	
		}else {System.out.println("Me tomo el cafelito");}
	}
}

//cliente toma taza de cafe, el cliente se ha quemado, el cliente se ha dejado el cafe 