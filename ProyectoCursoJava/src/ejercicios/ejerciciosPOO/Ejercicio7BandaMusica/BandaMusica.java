package ejercicios.ejerciciosPOO.Ejercicio7BandaMusica;

public class BandaMusica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(guitar);
		
		BandaMusica bandi = new BandaMusica();
	}
	
	public void crearBanda() {
		//el obj es un obj Guitarra,  la variable gNormal, que hace referencia al obj es de tipo Instrumento, solo se podria usar metodos de instrumentos
		//pero usaria los de Guitarra
		Instrumento gNormal = new Guitarra("Guitarra1", "Española", "alambra", 60, 5, "madera");
		GuitarraElectrica guitar = new GuitarraElectrica("Ge-1", "Electrica", "FEnder",500, 7, "caoba", 120);
		
		//hacer un cast (transformar)
		Guitarra gN2 = (Guitarra) gNormal;
		//otra forma   en esta si se cambia el nombre de la clase , el if fallaria
		if (gN2.getClass().getName().equals("Guitarra")) {
			System.out.println("guitarra real");
		}
		//para evitar problemas con los cast, compara el obj con el tipo de dato     
		if(gN2 instanceof Guitarra) {
			System.out.println("es una guitarra de verdad");
		}
	}
}
