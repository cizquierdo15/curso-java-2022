package curso.java.git;

public class ApuntesGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * 	APUNTES GIT
 * 		llevar control de cambios y cambios de compañeros
 * 
 * 	fases de un proyecto (en general)
 * 		-	desarollo - fase en la  que el codigo se genera y junta para una determinada fecha en un repositorio central, en ella ha de estar operativo
 * 		-	preproduccio,  -  simula el entorno en lo que los clientes verian los cambios
 * 		- 	prod - 
 * 		
 * 	integracion continua
 * 		que los miembros del equipo suban sus cambios a diario,  push diario  (jenkins, github actions) <- para hacer pruebas automaticas al codigo que se va subiendo
 * 																										   y tener un informe de lo que va fallando
 * 		
 * 	
 * 	en nuestras maquinas tendriamos git,,,, en la del repo central git hub  git lab
 * 	
 * 	herramientas de control de versiones
 * 		svn - cvs  ( anteriores a git )
 * 		  aplicacion flip board
 * 
 * 	Como funciona Git:
 * 		los devs aparte de tener conex con el repo remoto, tambien tienen un repo local
 * 		los cambios de los archivos los subimos al repo local (con git), con los comits para ir teniendo un historial de los cambios
 * 		de ahi los pasamos al repo remoto (al github), con un push.... para traernos la info a local es con pull,  la primera vez es clone
 * 		
 * 
 *  Para subir lso cambios con git   de LOCAL a REMOTO   3 Fases:
 * 		
 * 				----  <- fichero  /dir/trabajo  | hacer el add        comit -a para subirlo directamente al repo local
 * 				|  |                            V
 * 				|  |
 *              ----
 * 				----  <-- stage   para pasarlo al r local hacer comit  |    para volver a arriba checkout 
 * 				|  |						                           V
 * 				|  |
 * 				----
 * 
 * 				----  <- R local  para pasar al R remoto  hacer push \/ para traer desde remoto  1ª vez clone,,,, siguientes veces pull   --  fetch para ver diferencias entre remoto y local
 * 				|  |
 * 				|  |
 * 				----
 * 
 * 
 * 		-----------------------
 * 	rama main     contiene lo que esta bien hecho
 * 		
 *  	_______________________________>
 * 
 * 		en proyectos cada grupo / usuario trabaja sobre otra rama, cuando los cambios ya estan probados los subes a la rama principal
 * 		
 * 		abrir terminal eclispe window show view desde el terminal  open a terminal y eliges git bash
 * 
 * 		git help para ver ayuda    ( reinstalar git)
 * 
 * 			asegurar que estamos en el dir correcto  el del proyecto
 * 				pwd
 * 			desde el dir ,  iniciar el proyecto  
 * 			
 * 			ls -la  ver permisos  y fecha de edicion  
 * 			
 * 			primer paso credenciales del u que va a trabajar.   config --global user.name "nusuarioQuequieras"
 * 			configurar el correo   git config --global user.email "email"
 * 			iniciar git en el proyecto    crea el repo local   git init
 * 			
 * 		en principio trabajaremos desde master+	--- seguimos
 * 			comandos utiles    --- git status  (en que rama nos encontramos)  subir fichero   git add .(uno de los ficheros)  ej .claspath
 * 				para subir todo git add .
 * 				ahora falta comitear los ficheros que estan en stage
 * 				para hacer el comit  git comit -m "comentario" 
 * 				ver estado de los comits  git log  git log --raw  cambios del ultimo comit ( se le puede añadir el id del comit)
 * 				
 * 
 * 		en git ignore le decimos a git que fichero ignorar, al subirse
 * en eclipse
 * en la consola git init
 * ver en proyecto boton derecho team share proyect
 * 	para hacer el comit,,,, click derecho team   add to index al fichero  ----  en el mismo menu se hace comit,,, se ven los ficheros que estan en stage y los que no --  ponemos el mensaje del comit y le damos a comit
 * 	
 * 	
 * 		joselllorente git profe
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
