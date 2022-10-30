package ejercicios.ejerciciosPOO.Ejercicio7BandaMusica;

public class Piano extends Instrumento {
	private int nOctabas;
	private int nPedales;
	
	
	public Piano(String nombre, String tipo, String marca, int precio, int nOctabas, int nPedales) {
		super(nombre, tipo, marca, precio);
		this.nOctabas = nOctabas;
		this.nPedales = nPedales;
	}


	public int getnOctabas() {
		return nOctabas;
	}


	public void setnOctabas(int nOctabas) {
		this.nOctabas = nOctabas;
	}


	public int getnPedales() {
		return nPedales;
	}


	public void setnPedales(int nPedales) {
		this.nPedales = nPedales;
	}


	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		System.out.println("INSERT INTO TABLE TB_PIANO");
	}


	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		
	}
	
	
}
