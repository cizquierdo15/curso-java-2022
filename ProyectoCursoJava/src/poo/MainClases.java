package poo;

public class MainClases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//crear obj de la clase ClaseA
		ClaseA ca = new ClaseA("Pepon");
		
		System.out.println(ca.getNumero1());
		System.out.println(ca.getNombre());
		
		ClaseA ca1 = new ClaseA("raul");
		ca1.setNombre("RAul");
		
		//se crean 2 objetos,,,, hay 2 new
		ClaseA ca2 = ca;
		
		ca1.setNombre("Rosa");
		
		//cojemos el valor que tiene nombre en el segundo obj y se le pone en el atributo del primero
		ca.setNombre(ca2.getNombre());
		
		
		ClaseA ca3 = new ClaseA(2,5,"juan");
		
		
		
		
		
		System.out.println(ca.getNombre());*/
		
		
		ClaseA ca = new ClaseA("Eva");
		
		ClaseA ca1 = new ClaseA("Raul");
		
		ClaseA ca2 = null;
		
		ca2 = ca1;
		
		ClaseB cb = new ClaseB("Buen dia", 10);
		//con nombre y obj de la clase B
		ClaseA ca3 = new ClaseA("Emilio", cb);
		
		//accedemos a la propiedad cadena1 del obj de la claseB desde un obj de la clase A   ---> saca "buen dia"
		System.out.println(ca3.getClaseb().getCadena1());
	}

}
