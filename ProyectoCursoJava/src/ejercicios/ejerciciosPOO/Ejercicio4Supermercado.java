package ejercicios.ejerciciosPOO;

import curso.java.funciones.Utils;

public class Ejercicio4Supermercado {
	private String nombreSuper;

	public Ejercicio4Supermercado(String n) {
		this.nombreSuper = n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nClientes = 4;
		
		Cliente [] clientes  = crearClientes();
		
		//bucle en el que los clientes compran
		for (int i = 0; i < nClientes; i++) {
			int precio = Integer.parseInt(Utils.pideValor("Cuanto cuesta los que quieres comprar " + clientes[i].getNombre()));
			//preguntar el ciente si quieres comprar de nuevo
			clientes[i].comprar(precio);
		}
		//crear obj supermercado y usar metodo importe
		Ejercicio4Supermercado superNuevo = new Ejercicio4Supermercado("Maradona");
		
		//usar funcion de la clase
		superNuevo.importeTotal(clientes);
		
	}
	
	//fun que crea los clientes, devuelve un array de estos
	static Cliente[] crearClientes(){
		//objs clientes
			Cliente jose = new Cliente("Jose","Garcia","02313551H");
			Cliente eva = new Cliente("Eva","Perez","12345678E");
			Cliente manu = new Cliente("Manuel","Gomez","25313551M");
			Cliente rosa = new Cliente("Rosa","Pincha","99313551R");
			
			Cliente [] clientes = {jose,eva,manu,rosa};
			return clientes;
			
	}
	//funcion inporte total, como es privada solo puede hacerse desde esta clase
	private void importeTotal(Cliente[] arrClientes) {
		double total = 0;
		for (Cliente cliente : arrClientes) {
			total += cliente.getImporteCompra();
		}
		System.out.println("El importe total de los clientes es: "+ total);
	}
	
	/*
	 * Crear Clase Cliente  --> nombre   apellidos , dni , importeCompa= 0  Funcion comprar(importe)   actualiza campo importeCompra
	 * 
	 * En otra clase con un Main, crear 4 objs cCientes   meterlos en un Array, despues decir total de la compra de todos los clientes ( la suma de los importes
	 * 
	 * 
	 * 
	 * 
	 */

}
