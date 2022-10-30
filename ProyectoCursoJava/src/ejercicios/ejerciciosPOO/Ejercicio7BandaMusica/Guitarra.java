package ejercicios.ejerciciosPOO.Ejercicio7BandaMusica;

public class Guitarra extends Instrumento{
	
	private int nDeCuerdas;
	private String material;
	
	//constructor
	public Guitarra(String nombre, String tipo, String marca, int precio ,int nDecuerdas, String material) {
		super(nombre, tipo, marca, precio);
		// TODO Auto-generated constructor stub
		this.nDeCuerdas = nDecuerdas;
		this.material = material;
	}
	//metodos
	//sobrescrito
	@Override
	public void tocar() {
		System.out.println( "Se esta tocando la guitarrra " + ( isAfinado()?" correctamente" : " mal" ) );	
	}
	
	
	//getters y setters
	public int getnDeCuerdas() {
		return nDeCuerdas;
	}

	

	public void setnDeCuerdas(int nDeCuerdas) {
		this.nDeCuerdas = nDeCuerdas;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	//todos los datos del padre mas los datos de instrumentos
	@Override
	public String toString() {
		return "Guitarra [nDeCuerdas=" + nDeCuerdas + ", material=" + material + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		System.out.println("INSERT INTO TABLE TB_GUITARRA");
	}
	
	
	
}
