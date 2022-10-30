package curso.java.excepciones;

public class EcepcionesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio");
		
		try {//en el try controlamos las posibles excepciones que ocurran
			int num = 7 / 0;
		} catch (Exception e) { //aqui decimos la excepcion que queremos controlar
			// TODO: handle exception
			//e.printStackTrace(); //pintas lo que sacaria la excepcion
			System.out.println(e.getMessage());  //nos indica el error, sigue ejecutando el programa
			//para ir controlando el tipo de excepcion
			//opcion 1  if(e instanceof ArithmeticException ){  x }
			
			//SE suelen poner los catch que esperas encadenados y luego el general por si se te escapa
		}//opcion 2
		/*catch (ArithmeticException ae) {
		System.out.println("ha habido un problema con la division"+ae.getMessage());
		
		}*/
		
		
		System.out.println("Fin");
	}

}
