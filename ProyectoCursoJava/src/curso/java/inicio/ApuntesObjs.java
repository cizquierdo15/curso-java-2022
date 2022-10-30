package curso.java.inicio;

import curso.java.inicio.herencia.ClasePadre;
import curso.java.inicio.interfaces.Transporte;
import ejercicios.ejerciciosPOO.Ejercicio7BandaMusica.Guitarra;
import ejercicios.ejerciciosPOO.Ejercicio7BandaMusica.GuitarraElectrica;
import ejercicios.ejerciciosPOO.Ejercicio7BandaMusica.Instrumento;

public class ApuntesObjs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ------Diferencia entre clase y objeto
		 * 	Clases
		 * 		para representar objs o funcionalidades
		 * 		se pueden defnir los atributos del obj de la vida real
		 * 	(las clases con como los moldes) 
		 * 		..... Clase Mesa :    color tamaño material  precio  estado  ---- por otro lado las tareas,  plegar()    
		 * 									atributos															metodos
		 * 		a partir de la clase generamos los Objs....    
		 * 													mesaIkea   -marron   -l  -madera  -80
		 * 	
		 * 	(los obj se usan gracias a las variables,,, mesa1 ----->   -negro  -xs  -plastico  -20)   mesa1.precio   ... nos daria 20
		 * 		las variablles serian como la etiqueta que le das al obj, esta apunta a el ( en la memoria)
		 * 		
		 *  //-----4 Pilares de la POO
		 * 			-- Herencia
		 * 				hay una clase Padre de la cual las Hijas heredan atributos y metodos , pudiendo utilizar los elementos del Padre en las Hijas
		 * 					En java la Heremcia es unica, una Hija solo puede tener 1 Padre      Tooodas  las clases en java vienen de la clase Objet
		 * 					las clases hijas heredan los atributos y funciones excepto los privados
		 *					las var privadas las podemos utilizar desde la clase que la hemos creado
		 * 
		 *			-- Poslimorfismo 
		 *				diferentes formas de ejecutar una accion
		 *				la forma en la que se ejecuta un metrodo heredado de el padre es diferente para cada clase hija ( todos los Animales comen() pero no come igual una Vaca que una Serpiente	)
		 *			
		 * 			-- Abstraccion
		 * 				dependiiendo de donde se use cada oj , sera importante una cosa u otra,  centrarte solo en lo que vas a necesitar				
		 * 
		 * 			-- Encapsulacion
		 * 				evitar que desde otras aplicadioes o clase puedan acceder a la informacion de otra clase, evitando el comportamiento de mi clase
		 * 
		 * 				restringir el acceso a determinadas funcions , info
		 * 				
		 * 
		 * 	**********************		
		 * //------Modificadores de acceso
		*		private evitamos que se pueda editar desde fuera, solo seria al crearlo o con metodos de la clase (Getter Setter) --- desde la propia clase
		*		protecterd    acceden las del mismo paquete o clase en otro paquete pero hija de donde esta la var / fun que es protected
		*		con public  se puede acceder desde la propia clase, y incluso desde clases de otro paquete ( o proyecto)
		*		package   cuaando no ponemos nada delante de la variable, solo las clases del mismo paquete pueden acceder
		*
		*
		**  ****************
		*  //-----Static 
		*		al arracar una app hay 2 tipos de memoria   
		*				    obj que se quedan de manera statica     a esto podemos acceder desde que arrancamos  siempre estan creados
		*
		*					luego tenemos lo que se crean de manera Dinamica,,,, los otros objs .... al borrarlos desaparecen de la memoria
		*
		*		si una funcion no es staticos, solo es util cuando se crea un obj
		*			a las funciones static podemos llamarlas invocando a las clase   Math.random()  <- ej     NombreDeClase.metodo()
		*		desde la funcion main de una clase, que es Static    no podemos acceder a una funcion dinamica , sin haber creado un Obj de esta antes
		*		
		*		
		*
		*		Variables de clase
		*			static String saludo
		*			todos lo obj de la clase comparten esta variable y la pueden tulizar, i alguno lo modifica afectaria al resto
		*
		*
		*
		*
		***********
		*  //----Composicion
		*		Que un objeto este formado por otros objs, Un  coche de un motor, una rueda, etc
		*		Clase A necesita un obj de claseB, habiendo creado este desde el jb de clase A podriamos acceder a los valores del obj de clase B
		*		//merece la pena cuando la clase de dentro (B) tiene mas de 2 atributos    ---  
		*		
		*	
		*****************
		*
		*	// Herencia
		*		se Hereda metodos y atributos no privadas y usarlas como propios
		*		una clase solo puede tener 1 padre   todas las clases heredan de la clase Objet()  que tiene funciones utiles
		*			
		*			ver en paquete herencia, ejemplos con clase padre y estudiante
		*			extends ClasePadre  <- ejemplo herencia
		*		
		*		primero se llama al constructor de la clase padre,  si el padre solo tiene constructor por defecto igualmente lo llama
		*		super() 
		* 
		*		public Estudiante(String nombre, int edad, boolean mayorEdad, String asignaturaFavorita) {
					super(nombre, edad, mayorEdad);  ----- va creando los atributos que necesita el padre
					this.asignaturaFavorita =  asignaturaFavorita;
				}
				
				el primer constructir que se ejecuta es el del padre, luego ya el propio
				
				se pueden acceder a los metodos publicos del padre y atributos publicos, como si fuesen del hijo directamente
				
		*		
		*		sobreescribir
		*			un padre y un hijo tienen un metodo comun, se sebreescribe el metodo de la clase padre, se cambia el funcionamiento de este ( ejecuta el del hijo)
		*			para sobrescribirse ha de estar exactamente igual que la del padre, sease lo que retorna, nombre y parametros  y el modificador de acceso, sea igual o superior que el del padre (public)
		*			para asegurarnos  se usan anotaciones @Override    -  sirve para saber si este metodo esta correctamente escrito o no, si no esta bien sobreescrito, da un error de compilacion
		*
		*			public void metodo1() {
						System.out.println("metodo 1 clase estudiante");
						System.out.println(getNombre());  // llama al metodo publico del padre
					}
					
					para sobrescribirlo aout,, alt + shift+ s override implements methods, ahi se elige el metodo del padre, si ya tienes declarado ese metodo , no te aparece en la lista
		*		
		*
		*
		*	----Casting
				//el obj es un obj Guitarra,  la variable gNormal, que hace referencia al obj es de tipo Instrumento, solo se podria usar metodos de instrumentos
				//pero usaria los de Guitarra
					Instrumento gNormal = new Guitarra("Guitarra1", "Española", "alambra", 60, 5, "madera");
					GuitarraElectrica guitar = new GuitarraElectrica("Ge-1", "Electrica", "FEnder",500, 7, "caoba", 120);
					
					//hacer un cast (transformar)
					Guitarra gN2 = (Guitarra) gNormal;
					//para evitar problemas con los cast, compara el obj con el tipo de dato     
					if(gN2 instanceof Guitarra) {
						System.out.println("es una guitarra de verdad");
					}
		*
		*
		*
		*	------- Objetos abstractos
		*		no se pueden generar obj de una clase abstracta, un new-----  una clase es abstracta, poor que uno lo decide O  
		*		se crean os objetos con las clases hijas
		*		un metodo abstracto es un metodo que no define codigo ( no hace nada)..... public abstract limpiar();    si empre que hay un metodo abstracto la clase ha de ser Abstracta
		*		
		*		cuando tenemos una clase abstracta, las clases hijas han de tener sobrescrito el metodo abstracto, 
		*		
		*		si una clase hija es abstracta, no esta obligada a impllementar los metodos abstractos del padre, se pueden definir pero no obliga, le pasa el marron a la hija
		*
		*		si no quieres definir en una clase hija el metodo abstracto, se declara abstracto y la seguiente hija esta obligada a definirlo
		*
		*
		*
		*
		*
		*------- clase final
		*
		*			clase de la cual no e puede generar mas herencia, nadie puede heredar de aqui
		*			public final class GuitarraElectrica extends Guitarra{ }
		*			no puede ser final y abstract a la vez
		*
		*
		*------- //Interfaces
		*			dotan de funcionaliadades a las clases que implementan la interface   public class ClaseInterfaces implements Interfaz1
		*			
		*			si tiene herencia primero va el extends y luego el implements
		*			
		*				las variables aunque no pongamos nada son estaticas ( por eso esta en cursiva ) y aparte constantes
		*				todos los metodos son abstractos, 
		*			una interfaz puede heredar de otra interfaz con extends (en interfaces si hay herencia multiple), tendriamos que implementar los metodos de las interfaces padre en las clases
		*
		*			la mejor forma crear una clase abstracta que implemente la interfaz y desde esa clase implementar la herencia
		*			
		*			en cada clase que se implementan los metodos se sobreescriben para cambiar su funcionalidad
		*			
		*
		*
		 * */
		
	}

}
