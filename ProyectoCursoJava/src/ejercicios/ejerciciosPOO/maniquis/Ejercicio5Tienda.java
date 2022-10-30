package ejercicios.ejerciciosPOO.maniquis;

import java.util.Arrays;

import curso.java.funciones.Utils;

public class Ejercicio5Tienda {
	
	private String nombre;
	
	public Ejercicio5Tienda(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* POJO   plain old java objet (curiosidad)
		 * 	Crear clase boton, ----  color forma
		 * 	Clase Camisa   --- color, talla, precio, botones
		 * 	Clse pantalon  -- color , talla, precio, 1boton
		 * 	Clse vestido --- color, talla, precio
		 *  Clase Maniqui ---- id, Camisa, Pantalon  Vestido    -->  funciones maniqui  vestir() permite poner al maniqui camisa Y pantalon   O vestido      desvestir() quitar toda la ropa
		 * 
		 * 
		 * Clase Tienda --- nombre, 2 maniquis(no crearlos en el main)  crear ropa en la tienda      vestirlos  y hacer funcion que calcule el precio de la ropa de todos lo maniquis
		 */
		
		//creamos la tienda
		Ejercicio5Tienda tiendaSara = new Ejercicio5Tienda("Sarah");
		//creamos lo maniquis
		//Maniqui [] maniquisTienda = tiendaSara.crearManiquis(0, 1);
		
		Maniqui [] maniquisTienda = tiendaSara.crearTiendaCompleta();
		
		System.out.println("<<----Tienda "+tiendaSara.nombre);
		
		//para ves los arrays de objetos  Arrays.toString()
		//System.out.println(maniquisTienda[1].getCamisa().getColor());
		
		tiendaSara.mostrarPreciosRopaManiquis(maniquisTienda);
		
		//editar boton 1 de maniki1 
		maniquisTienda[0].getCamisa().getBotones()[0] = null;
	}
	
	//funcion crea 2 maniquis con ropa ya creada
	private Maniqui [] crearManiquis (long idManiqui1, long idManiqui2) {
		boolean vestido = true;
		Maniqui m1 = new Maniqui(idManiqui1, vestido);
		Maniqui m2 = new Maniqui(idManiqui2, vestido);
		Maniqui [] maniquis= {m1,m2};
		
		return maniquis;
	}
	
	/**
	 * fucion que crea 2 maniquis vestidos no una ropa predefinida
	 * @return un array de 2 Maniquis vestidos
	 */
	private Maniqui [] crearTiendaCompleta() {
		//botones
		String colorBoton = Utils.pideValor("Color del boton");
		Boton boton1 = new Boton(colorBoton, "redondo");
		Boton boton2 = new Boton(colorBoton, "redondo");
		Boton boton3 = new Boton(colorBoton, "cuadrado");
		Boton boton4 = new Boton(colorBoton, "cuadrado");
		Boton boton5 = new Boton(colorBoton, "triangular");
		
		Boton [] botonesCamisa1 = {boton1,boton2};
		Boton [] botonesCamisa2 = {boton3,boton4};
		//camisas
		Camisa camisa1 = new Camisa("negra", "L", 10, botonesCamisa1);
		Camisa camisa2 = new Camisa("Azul", "XL", 30);
		camisa2.setBotones(botonesCamisa2);
		//pantalon
		Pantalon pantalon1 = new Pantalon("Gris", "M", 50 , boton5);
		//vestido
		Vestido vestido1 = new Vestido("Granate", "S", 35);
		
		Maniqui m1 = new Maniqui(0);
		Maniqui m2 = new Maniqui(1, vestido1);
		
		m1.vestir(camisa1, pantalon1);
		Maniqui [] maniquis= {m1,m2};
		
		return maniquis;
	}
	
	//funcion calcular precio de ropa de los maniquis
	private void mostrarPreciosRopaManiquis( Maniqui [] maniquis) {
		double totalPrecio = 0;
		for (Maniqui maniqui : maniquis) {
			if (maniqui.getCamisa() != null && maniqui.getPantalon() != null && maniqui.getVestido() != null) { //si tiene las 3 prendas
				totalPrecio += (maniqui.getCamisa().getPrecio())  +  (maniqui.getPantalon().getPrecio()) + (maniqui.getVestido().getPrecio());
			}
			if(maniqui.getVestido() != null){//solo tiene vestido
				totalPrecio += (maniqui.getVestido().getPrecio());
			} 
			if(maniqui.getCamisa() != null && maniqui.getPantalon() != null){//tiene pantalo y camisa
				totalPrecio += (maniqui.getCamisa().getPrecio())  +  (maniqui.getPantalon().getPrecio());
			}else { //esta desnudo
				totalPrecio += 0;
			}
		}
		System.out.println("El precio total de las prendas es: "+ totalPrecio);
	}

}
