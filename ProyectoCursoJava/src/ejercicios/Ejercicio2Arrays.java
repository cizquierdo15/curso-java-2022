package ejercicios;

import curso.java.funciones.Utils;



public class Ejercicio2Arrays {
	private static final String BUSQUEDA = "buscar";  //borrar insertar mostrar
	
	public static void main (String [] args){
		//tamaño de 3 guarda en memoria el espacio para eso
		String [ ] test = new String [3];
		
		//3 fila y 2 col, cada fila puede tener un num de columnas independiente
		String [][] matriz = new String [3] [2];
		
		// para que sea irregular
		String [][] colores = new String [3] [];
		colores[0] = new String [3];
		colores[1] = new String [5];
		colores[2] = new String [1];  //podriamos no definir alguna, no se quejaria hasta que usaramos una no definida
		
		colores[0][1] = "Blanco";
		
		
		//array bidimensional dinamico
		//inicia aplicaion, preguntamos ciantas aulas tiene el cole
		System.out.println("Colegio");
		//por cada aula preguntar cuantos alumnos caben en ella
		
		int nAulas = Integer.parseInt( Utils.pideValor( "Cuantas Aulas tiene el colegio?" ) ) ;
		int nAlumnos = Integer.parseInt( Utils.pideValor( "Cuantos Alumnos tiene el Aula?" ) );
		//matriz colegio
		String [][] colegio = new String[nAulas][nAlumnos];
		int opcion = 0;
		
		do {
		//menu
			Utils.pintarMenu("1 Insertar alumnos por aula\n2 buscar alumno\n3 borrar alumno\n4 mostrar alumno por aula\n5 mostrar alumnos\n6 salir");
			//introduce una opcion del menu
			opcion = Integer.parseInt( Utils.pideValor( "Elige una opcion" ) );
			
			switch (opcion) {
			case 1:System.out.println("opcion 1"); insertarAlumnos(colegio);  break;
			
			case 2: System.out.println("opcion 2"); buscarAlumno(colegio); break;
				
			case 3: System.out.println("opcion 3"); borrarAlumno(colegio); break;
				
			case 4: System.out.println("opcion 4"); mostrarAlumnoPorAula( colegio); break;
			
			case 5: System.out.println("opcion 5"); mostrarAlumnos(colegio); break;
			
			case 6: System.out.println("Adios"); break;
			
			default: System.out.println("opcion incorrecta");
				
			}
		}while(opcion != 6 );
		
	}
	// 1 inserrtar alumnos por aula
	// preguntar en que aula quieres meter al alumno, , alula 1, pedir nombre y guardarlo en la orumera posicion vacia
	//si el aula esta llena indicarlo
	// bjuntar el de insertar y mostrar por aula  con constantes, no mostrar los nulos, cambiar a gestionar alumnos (el nombre de la fun)
	static void insertarAlumnos(String [] [] colegio) {
		int nDeAula = Integer.parseInt( Utils.pideValor( "A que aula lo quieres meter?" ) ) ;
		//comprobar aula corrrecta
		comprobarAulaCorrecta(nDeAula,colegio);
		//mirar si el aula esta llena
		if( !comprobarArrayTieneHueco(colegio[nDeAula]) ) {
			System.out.println("Ese aula esta llena");
			nDeAula = Integer.parseInt( Utils.pideValor( "Elige otro aula" ) ) ;
		}else {// si no esta llena
			//meter el alumno en la clase
			for(int cont = 0; cont < colegio[nDeAula].length; cont++) {
				String nombreAlumno = Utils.pideValor( "Como se llama el alumno? "+ cont  ) ;
				meterAlumnoEnClase(colegio, nDeAula, nombreAlumno, cont);
			}
		}
	}
	
	static void meterAlumnoEnClase (String [] [] colegio , int nDeAula, String nombreAlumno, int puesto) {
			//si el puesto esta libre
			if( colegio[nDeAula] [puesto] == null ) { colegio[nDeAula] [puesto] = nombreAlumno; }
	}
	//recorre el array viendo si ahay alguna posicion vacia
	static boolean comprobarArrayTieneHueco( String [] array) {
		boolean tieneHueco = false;
		for (String valor : array) {
			if(valor == null || valor == ""){ tieneHueco = true; }
		}
		return tieneHueco;
	}
	static boolean comprobarAulaCorrecta( int nDeAula , String [] [] colegio) {
		boolean opcionCorrecta = false;
		if( nDeAula >= 0 && nDeAula < colegio.length) { opcionCorrecta = true;}
		while(opcionCorrecta == false) {
			System.out.println(" ingresa un num de clase valida");
			nDeAula = Integer.parseInt( Utils.pideValor( "Que aula quieres ver? "  ) ) ;
			if( nDeAula >= 0 && nDeAula < colegio.length) { opcionCorrecta = true;}
		}
		return opcionCorrecta;
	}
	
	//2 buscar alumno
		//pedir nombre, indicar en que aula esta decir
		//el alumno x no está en el colegio
	static void buscarAlumno(String [][] colegio) {
		//int nDeAula = Integer.parseInt( Utils.pideValor( "En que aula lo quieres buscar?" ) ) ;
		String nombre =  Utils.pideValor( "Como se llama el alumno que quieres buscar?" )  ;
		boolean encontrado = false;
		int contAulas = 0;
		//buscar dentro de ese alua si los nombres coinciden
		for (String [] aula : colegio) {
			contAulas++;
			for (String alumno : aula) {
				if(alumno != null && alumno.equals(nombre)) {  //o con otro foreach dentro
					System.out.println("el alumno: " + nombre +" esta en el aula "+ contAulas);
					encontrado = true;
					break;
				}
			}
			if(encontrado) break;
		}
		if(encontrado == false) {  // si no esta decirlo
			System.out.println("el alumno "+ nombre + " no esta en el colegio");
		}
	}
	
	
	//3 borrar alumno   juntar ambas fun, borrar y buscar
	//pedir nombre, si está lo borra
	static void borrarAlumno(String [][] colegio) {
		String nombre =  Utils.pideValor( "Como se llama el alumno que quieres buscar?" )  ;
		boolean borrado = false;
		int fila;
		//mirar en toda la matriz en busca del nombre
		for( fila = 0; fila < colegio.length; fila++  ) {
			if(borrado) { break; }
			System.out.println("mira en la clase: "+ fila);
			for(int pos = 0; pos < colegio[fila].length; pos++) {
				String nombreAlumn = colegio[fila][pos];
				if(nombreAlumn != null && nombreAlumn.equals(nombre) ) {
					System.out.println("Se borra : "+ nombre);
					colegio[fila][pos] = null;
					borrado = true;
				}
			}
		}// si al buscar no lo encuentra que lo avise
		if( !borrado && fila >= colegio.length ) { System.out.println( "el alumno " + nombre + " no se encuentra en el cole"); }
	}
	
	//4 mostrar alumno por aula		
	//pedir el aula, mostrarlos nombres de esta
	
	static void mostrarAlumnoPorAula( String [] [] colegio) {
		int nDeAula = Integer.parseInt( Utils.pideValor( "Que aula quieres ver?" ) ) ;
		//comprobar si aula metida esta bien
		comprobarAulaCorrecta(nDeAula,colegio);
		for (String alumno : colegio[nDeAula]) {
			System.out.println( alumno );
		}
	}
	
	//5 mostrar alumnos
	//mostrar todos los alumnos del cole, por aula

	static void mostrarAlumnos(String [][] colegio) {
		for( int fila = 0; fila < colegio.length; fila++ ) {
			System.out.println("Clase: " + fila);
			for (String alumno : colegio[fila]) {
				System.out.println( alumno );
			}
		}
	}
}
