package curso.java.excepciones;

public class ApuntesExcepciones {

}
/*
 * 
 * Evitar que las excepciones lleguen al main sin haberse capturado
 * 
 * Las excepciones son clases  , con su jerarquia, la padre Throwable -----|1|| Exception (nullpoiinter)  ----- |2|| Error (quedarnos sin espacio, memoria
 * 	Las Exception si las podemos controlar  --- RuntimeException(errores en tiempo de ejecucion)              IoException () -------
 * 															nullpointer   arrayIndexOutofBounds					con ficheros
 * 
 * SE pueden crear clases de Excepciones personalizadas, con la herencia
 * 
 * 
 * 
 * Java indica el tipo , la linea y el metodo
 * 
 * 
 * Inicio
	Exception in thread "main" java.lang.ArithmeticException: / by zero
	at curso.java.excepciones.EcepcionesMain.main(EcepcionesMain.java:9)
 * 
 *      <- no se ejecuta fin
 * 
 * 
 * Para capturar la excepcion
 *
 *
 *	try {//en el try controlamos las posibles excepciones que ocurran
			int num = 7 / 0;
		} catch (Exception e) { //aqui decimos la excepcion que queremos controlar
			// TODO: handle exception
			//e.printStackTrace(); //pintas lo que sacaria la excepcion
			System.out.println(e.getMessage());  //nos indica el error, sigue ejecutando el programa
			//para ir controlando el tipo de excepcion
			//opcion 1  if(e instanceof ArithmeticException ){  x }
			//opcion 2
			/*catch (ArithmeticException ae) {
				System.out.println("ha habido un problema con la division"+ae.getMessage());
				
			}finally{
				syso("continua");
			}
		*
		*SE suelen poner los catch que esperas y luego el general , de mas expecifica a general
		*
		*finally para que se ejecute siempre algo, haya o no haya excepcion, ( para cerrar ficheros, conexiones a BDD etc)
		
 *		suele ser mejor controlar la excepcion de otras clases y metodos en el main, (propagacion)
 *
 *		se pueden lanzar excepciones propias y forzar a java a lanzar excepciones
 *
 *		con throw new ClaseExcepcion("mensaje") ------ si en una clase creas un obj excepcion , al haber un catch con esa excepcion recuperaria el mensaje
 *
 *		hay 2 tipos de Excepciones (Exception) 
 *		   	Checked (Exception y ioException)
 *	    	 Unchecked   (el resto)
 *		en la cheked estas obligado a capturar (tener un try catch) la excecpcion en las otras no
 *		
 *		o si no en vez de meterlo en el trycatch podemos obligar al metodo a propagarlo .... el que me llame a mi que lo controle
 *				public void metodo1() trhows Exception{}    para cuando haya que controlar una excepcion que me obligue
 *
 *		en la clase donde se ejecuta
 *				meter la llamada al metodo en un try  catch
 *
 *
 *		Se puede crear una clase excepcion con extend a Exception
 *		desde una clase  creamos una excepcion propia  la clase donde se usa con trows y su nombre y la throweamos ,,,, donde usamos (en un main) el try catch con la main podemos recuperarla con su nombre
 *
 *
 *
 *
 * 
 * */
 