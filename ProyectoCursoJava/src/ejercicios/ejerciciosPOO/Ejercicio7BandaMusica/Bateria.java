package ejercicios.ejerciciosPOO.Ejercicio7BandaMusica;

public class Bateria extends Instrumento{
	private int nDeTimbales;
	private int nDePlatos;
	
	
	public Bateria(String nombre, String tipo, String marca, int precio, int nDeTimbales, int nDePlatos) {
		super(nombre, tipo, marca, precio);
		this.nDeTimbales = nDeTimbales;
		this.nDePlatos = nDePlatos;
	}

	//metodos
	public void aporrear() {
		
	}
	
	//getters
	public int getnDeTimbales() {
		return nDeTimbales;
	}


	public void setnDeTimbales(int nDeTimbales) {
		this.nDeTimbales = nDeTimbales;
	}


	public int getnDePlatos() {
		return nDePlatos;
	}


	public void setnDePlatos(int nDePlatos) {
		this.nDePlatos = nDePlatos;
	}

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		System.out.println("INSERT INTO TABLE TB_BATERIA");
	}
	
	
}
