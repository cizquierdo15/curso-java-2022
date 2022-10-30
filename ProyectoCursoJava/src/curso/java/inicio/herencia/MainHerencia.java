package curso.java.inicio.herencia;

public class MainHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante estu = new Estudiante("Juan", 17, false, "fisica");
		estu.metodo1();
	}

}


/*
 * 
 * Ejerrcicio 7
 * Banda de musica
 * Clase intrumento ( padre )  nombre, tipo  , precio , marca  //  afinar() <--- aleatorio entre 1 y 10 , si num + de 8 , simular que esta desafinada, si eta bien tambien se muestra,,, guardar si esta afinado o no
 * 															tocar()  <---- mirar si esta afinado, si lo está ---> el ins X esta tocando correctamente , si no esta sonando mal
 * 
 * Clase guitarra ... hereda de instrumento ,  nDeCuerdas, material   // guitarra al tocar, lo sobreescribe <-- poner se esta tocando la guitarra y si esta afinada o no ( bien o mal)
 * 
 * Clase guitarraElectrica   ... hereda de guitarra,  potencia   // guitarraElectrica al tocar, lo sobreescribe de guitarra, hace lo del padre y agrega , con la potencia X
 * 
 * Clase bateria ,,, hereda de instrumento, numtimbales, numplatos  //  aporrear() <---  
 * 
 * Clase piano ,,, hereda de instrumento , numteclas, numdeoctabas, numpedales
 * 
 * 
 * Banda musica
 * 		1 guitarra
 * 		1 gE
 * 		1 bateria
 * 		1 piano
 * 
 * al tener  todos, meterlos en un array
 * Funcion para iniciar el concierto,,, poner a todos a afinar y cuando terminen .. tocar   .... cuando el i sea la bateria, se aporree 8cuando termine el ej
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
