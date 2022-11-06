package curso.java.inicio;

import curso.java.ejercicios.libreria.Utilidades;

public class ApuntesLibreiras {

	public static void main(String[] args) {
		// Para USAR la libreria
			Utilidades utils = new Utilidades("Ataulfo", 15); //control sift o para importar la libreria automaticamente
			utils.funcion1("Pizza prueba");
			

	}
	/*
	 * Crear una Libreria y importarla
	 *  
	 *  	(Paquete de clases con funciones guardados como .class en un solo archivo, como un zip) un .jar
	 *  	recopilamos los .class del proyecto 
	 *  		
	 *  
	 *  	//simular como importar libreriras (metodo antiguo)
	 *  		// alguien generaria un .jar (java archive)      war (web archive)
	 *  				//crearia un paquete X , con sus Clases y funciones
	 *  				//tendria que generar la libreria con Export en la clase o paquete  jar  jar.file, vemos los ficheros que queremos meter
	 *  				//eliges la ruta donde guardarlo y el nombre 
	 *  		
	 *  
	 *  		//para importarlo lo coseguimos y lo implantamos en nuestro proyecto
	 *  				//al usar librerias externas , en un proyecto suele haber una carpeta llamada lib, si no crear carpeta lib
	 *  				// arrasttrar el jar a la carpeta lib, seleccionando copy files. Falta indicar a Java que añada ese contenido para utilizarlo
	 * 					//ir a la libreria, boton derecho Build Path --- add to build path 
	 * 					//aparece References Libraries en el menu de archivos. Ahora ya podrias usarla
	 * 
	 * 
	 * 
	 * 
	 * Para ver el funcionamiento de la libreria
	 * 		o en el .class  o en la documentacion al llamar a las funciones
	 * 
	 * 
	 * 	Maven
	 * 		Gestion de dependencias.   a traves de un fichero de conf, todo el mundo del proyecto, tiene las mismas librerias y versiones
	 * 									con el pom.xml  (ej de dato que tiene dentro  mysql-3.1)
	 * 									maven descargaria de su nube esa libreria en esa version
	 * 									asi todo el mundo que tenga el fichero de conf tendria las mismas dependencias
	 * 
	 * 		
	 * 		Gestion nombre paquetes , directorios
	 * 					maven genera plantillas para los proyectos, con la estructura 
	 * 		
	 * 		
	 * 		Crear proyecto maven
	 * 			file New Proyect, escribe maven selecciona Maven proyect
	 * 				elegir con plantillas o no( en este caso no)
	 * 				3 campos imprescindibles  groupId(como el dominio de la empresa)  artifactId(nombre del proyecto)  y version 
	 * 		
	 * 
	 * 		la configuracion del proyecto estara en el pom.xml
	 * 
	 * 
	 * 	para cambiar la version de compilacion del proyecto, cambiar en el pom ( o agregar)
	 * 		debajo de descripcion
	 * 		luego en el proyecto, boton derecho Maven, Update Proyect
	 * 
	 * 	cambiar dependencias
	 * 		 buscamos en google x libreria maven para que nos redirija al repositorio de maven, seleccionamos la vers, copiamos el codigo
	 * 		en el pom , entre las etiquetas	<dependencies> lo pegamos
	 * 		-- las descarga en c user userX  .m2 repository
	 * 			
	 * */
}
