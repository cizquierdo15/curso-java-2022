package poo;

import curso.java.inicio.interfaces.IInsertable;
import curso.java.inicio.interfaces.IUpdatetable;
import ejercicios.ejerciciosPOO.Ejercicio7BandaMusica.GuitarraElectrica;
import ejercicios.ejerciciosPOO.Ejercicio7BandaMusica.Instrumento;
import ejercicios.ejerciciosPOO.Ejercicio7BandaMusica.Piano;
import ejercicios.ejerciciosPOO.carreraCaballos.Caballo;

public class UsoInterfaces {
	
	public UsoInterfaces() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsoInterfaces ui = new UsoInterfaces();
		Instrumento [] instrumentos = ui.crearBanda();
		
		for (Instrumento instrumento : instrumentos) {
			ui.insertar(instrumento);
		}
		
		Caballo c1 = new Caballo(10, "tormento", 6,4, 7);
		//como caballo tiene updatable y esta hereda iinsertable deja
		ui.insertar(c1);
		
	}
	//metodo
	public Instrumento[] crearBanda() {
		Piano piano = new Piano("blancote","clasico","yamaha",500,8,4);
		GuitarraElectrica guitar = new GuitarraElectrica("Ge-1", "Electrica", "FEnder",500, 7, "caoba", 120);
		Instrumento[] instrumentos = {piano,guitar};
		return instrumentos;		
	}
	
	//metodo para guardar cualquier obj insertable en la BD, tienen k ser solo las objs con la interfaz  
	public void insertar(IInsertable obj) {
		obj.guardar();
	}
	//actualizar obj que tengan la interface
	public void actualizar(IUpdatetable obj) {
		obj.update(1);;
	}
}
