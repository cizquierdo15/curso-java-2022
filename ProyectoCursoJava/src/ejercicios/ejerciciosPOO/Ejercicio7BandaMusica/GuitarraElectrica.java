package ejercicios.ejerciciosPOO.Ejercicio7BandaMusica;

public class GuitarraElectrica extends Guitarra{
	private int potencia;
	
	//constructor
	public GuitarraElectrica(String nombre, String tipo, String marca, int precio, int nDecuerdas, String material,
			int potencia) {
		super(nombre, tipo, marca, precio, nDecuerdas, material);
		this.potencia = potencia;
	}
	
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		super.tocar();
		System.out.println(  "  electrica con la potencia "+ this.potencia);
	}

	//getter setter
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "GuitarraElectrica [potencia=" + potencia  + super.toString() + "]";
	}
	
}
