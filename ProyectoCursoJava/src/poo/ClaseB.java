package poo;

public class ClaseB {
	//variable de instancia
	private String cadena1;
	private int numero3;
	
	public ClaseB(String cadena1, int numero3) {
		super();
		this.cadena1 = cadena1;
		this.numero3 = numero3;
	}
	
	
	//la clase A necesita un obj de la clase B
	
	public String getCadena1() {
		return cadena1;
	}

	public void setCadena1(String cadena1) {
		this.cadena1 = cadena1;
	}

	public int getNumero3() {
		return numero3;
	}

	public void setNumero3(int numero3) {
		this.numero3 = numero3;
	}

	
	
}
