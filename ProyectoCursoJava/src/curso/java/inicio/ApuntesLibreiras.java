package curso.java.inicio;

//¡*import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;

//import java.sql.Connection;
//import java.math.BigDecimal;
//import java.sql.Date;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;

import curso.java.ejercicios.libreria.Utilidades;
//import curso.java.junit.models.Cuenta;





public class ApuntesLibreiras {

	public static void main(String[] args) {
		// Para USAR la libreria
			Utilidades utils = new Utilidades("Ataulfo", 15); //control sift o para importar la libreria automaticamente
			utils.funcion1("Pizza prueba");
			

	}
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
	 * REPASAR Log4J2
	 * ***********************************
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
	 *      CAMBIAR VERSION MAVEN,,,, en el pom.xml  <maven.compiler.source> y la de abajo,,, cambiar Nº a la version elegida,, Boton derecho en Proyecto -> Maven -> update Proyect
	 *      
	 * 
	 * 	cambiar dependencias
	 * 		 buscamos en google x libreria maven para que nos redirija al repositorio de maven, seleccionamos la vers, copiamos el codigo
	 * 		en el pom , entre las etiquetas	<dependencies> lo pegamos
	 * 		-- las descarga en c user userX  .m2 repository
	 * 	
	 * 	FASES MAVEN
	 * 		(test) Se puede generar el Jar   plugin.... maven-jar-plugin     (del pom.xml)
	 * 		(pakage) Hacer Pruebas unitarias   plugin.... maven-surefire-pligin
	 * 			
	 * 		 dependencia junit.jupiter es una libreria de JUNIT , para poder integrarlo con maven 
	 * 			las pruebas unitarias se ejecutan  antes de subir el codigo al repo 
	 * 			en el pom hay plugins con el mobre de maven- que añaden funcionalidades
	 * 			en el pom cambiar directorio al deseado (l 4 0 )
	 * 		DEsde al ejecutar el proyecto podemos acceder a las distintas funcionalidades de maven (run ->)
	 * 
	 * 		las pruebas UNITARIAS estan en:   src/test/java
	 * 		al hacer run --> maven build ,,, en el apartado goals podemo indicar que acciones hacer a la vez pej: clean y test 
	 * 
	 * 		con los test nos aseguramos de que el programa funciona bien, y si metemos nuevo codigo testearlo,,,, se pueden hacer test a nuestro gusto, crear los propios ofcc
	 * 		En las clases con los test, se van hasiendo asserts,,, que esperan valores distintos  pej:
	 * 																								Cuenta cuenta = new Cuenta("Persona1", new BigDecimal("10000.12345"));
																									String esperado = "Persona1";
																									String real = cuenta.getPersona();
																									
																									assertNotNull(null);
																									assertEquals(esperado, real);
																									assertTrue(real.equals("Persona1"));
	 * 				estos asserts vienen en el paquete or.junit.Jupiter.api.Assertions
	 * 
	 * 		la accion de pakage es la que te crea el jar (buid?)
	 * 
	 * 		como generar jar y pom.xml con junit y Maven
	 * 		como generar artifact id en la nube
	 * 
	 * __________________________________________________________________________________________
	 * 
	 *  BDDD		
	 * habiendo importado el proyecto de la BDDD
	 * 
	 * en el pom.x,ml vems los datos, tmabien al estar en este fichero, encima de la consola se despliegan nuevas pestañas, en Dependency Herarchy podemos vetr librerias que usaremos en el proyecto y demas INFO sobre el proyecto
	 * 
	 * desde ahi tambien se pueden añadir dependencias
	 *   Vamos a intentar conectarnos a la BDD ,,, cada BD tiene su driver(api)
	 *   Tenemos una Clase Producto con los campos de la tabla, con un constructor VACIO, para poder crear obj vacios e ir insertando la info (par hibernate)
	 *   hey una Interfaz, Repositorio, con un generico <T> , para poder ser de cualquier tipo
	 *   luego una clase que implementa la interfaz del tipo que queremos, implementaremos los metodos de la Inter con las funcionalidades que se quieren
	 *   
	 *   Tenemos una clase para conectarnos a la BD, con los datos de conexion y un metodo static para conectarnos
	 *   public class ConexionBaseDatos {
		    private static String url = "jdbc:mysql://localhost:3306/curso_java?serverTimezone=Europe/Madrid";  // aqui si la bd es externa ten
		    private static String username = "root";
		    private static String password = "pass";
		    private static Connection connection;
		
		    public static Connection getInstance() throws SQLException {  //quien llame el metodo ha de controla la excep
		        if (connection == null) {
		            connection = DriverManager.getConnection(url, username, password);
		        }
		        return connection;
		   }
		}
		
		En la clase que implementa la Interfaz
		 private Connection getConnection() throws SQLException { //hacemos la conex
        	return ConexionBaseDatos.getInstance();
    	}	
	 *   
	 *   en el resto de metodos, se comprueba con try / catsh la excepcion
	 *   
	 *   SELECT
	 *      @Override
		    public List<Producto> listar() {
		        List<Producto> productos = new ArrayList<>();
		
		        try (Statement stmt = getConnection().createStatement();
		             ResultSet rs = stmt.executeQuery("SELECT * FROM productos")) { //ejecuta la select
		            while (rs.next()) { //mientras hay productos añade
		                Producto p = crearProducto(rs);
		                productos.add(p);
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		        return productos;
		    }
		    
		    -----
		    private Producto crearProducto(ResultSet rs) throws SQLException {
		        Producto producto = new Producto();
		        producto.setId(rs.getLong("id")); // va cogiendo los campos y luego los añade a la lista al retornarlos
		        producto.setNombre(rs.getString("nombre"));
		        producto.setPrecio(rs.getInt("precio"));
		        producto.setFechaRegistro(rs.getDate("fecha_registro"));
		        return producto;
		    }
		    
		    por id
		    
		    	 @Override
				    public Producto porId(Long id) {
				        Producto producto = null;
				
				        try (PreparedStatement stmt = getConnection().   // <--- con prepareStatement
				                prepareStatement("SELECT * FROM productos WHERE id = ?")) {
				            stmt.setLong(1, id);  // cadainterrogante un campo
				            try (ResultSet rs = stmt.executeQuery()) {
				                if (rs.next()) {
				                    producto = crearProducto(rs);
				                }
				            }
				        } catch (SQLException e) {
				            e.printStackTrace();
				        }
				        return producto;
				    }
	 *   	----
	 * 	UPDATE
	 * 		 @Override
			    public void guardar(Producto producto) {
			        String sql;
			        if (producto.getId() != null && producto.getId()>0) {
			            sql = "UPDATE productos SET nombre=?, precio=? WHERE id=?";
			        } else {
			            sql = "INSERT INTO productos(nombre, precio, fecha_registro) VALUES(?,?,?)";
			        }
			        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			            stmt.setString(1, producto.getNombre());
			            stmt.setLong(2, producto.getPrecio());
			
			            if (producto.getId() != null && producto.getId() > 0) {
			                stmt.setLong(3, producto.getId());
			            } else {
			                stmt.setDate(3, new Date(producto.getFechaRegistro().getTime()));
			            }
			
			            stmt.executeUpdate();
			        } catch (SQLException throwables) {
			            throwables.printStackTrace();
			        }
			
			    }
	 * 	
	 * 
	 * 	DELETE
	 * 	  @Override
		    public void eliminar(Long id) {
		        try (PreparedStatement stmt = getConnection().prepareStatement("DELETE FROM productos WHERE id=?")) {
		            stmt.setLong(1, id);
		            stmt.executeUpdate();
		        } catch (SQLException throwables) {
		            throwables.printStackTrace();
		        }
		    }
	 * 	*****************************************************************************************************
	 * HIBERNATE
	 * 	framwork para trabajar con BDD
	 * 
	 * 	la clase ha de tener el @Entity encima del nombre de la clase
	 *  con @Tacle{name = "x"}  le dariamos un nombre a la tabla
	 * 	todas las tablas han de tener PrimaryKry, por ello ha de haber un campo con @Id un atributo de la clase sera la clave, junto con los campos de la tabla ( atributos de la clase)
	 * 	 @GeneratedValue{ strategy = GenerationType.IDENTIY}   (Buscar)
	 *  se puede dar propiedades a los campos de la tabla, en los atributos , encima @Column{lenght = 9 m name= "nombre_alumno, unque = true}  <- Ejemplos
	 *	@Transient (encima de un atributo) 	enste campo en la tabla de la BDD no ha de aparecer   pero podemos usar el atributo en la Clase
	 *	
	 *
	 *	En una Clase con main ,,, se obtiene el EntityManager em =JpaUtil.getEntityManager();  que es el obj con toda la configuracion
	 *	
	 *	a ese obj le vamos dando las instrucciones
	 *	//REvisar enum  
	 *	  Ver utilidadesHibernate
	 *	  
	 ************************************************************************************
	 *
	 *  SPRING
	 *  	**Detalles**
	 *  		frameork ,, tiene distintos modulos	
	 *  		 ventajas: abtraccion  ,  integra componentes con un fichero.xml
	 *  		 Caracteristicas:   Inversion de control(no se crean objs con new   los cra apartir de la configuracion k le damos) --- Inyeccion de dependencias (los valores y metodos se asignan a partir de un contenedor DI)--- Prog orientada a Aspectos(manejar los obj con AspectJ, maneja los componentes de los obj-- dependiendo de los permisos del obj , lo mira el)
	 *  		 
	 *  		creacion de objs
	 *  			con un fichero xml de config    el contenedor tiene la info necesaria      se crean los BEANS (contienen la info para que el contenedor sepa k tiene k tener)
	 *  			
	 *  		en beam.xml	
	 *  		<bean id="X" class="ruta.NClase" (scope="prototype" <- opcional   los obj con eso solo se cra cuando se invocan conel getBean() ... si no se crea al inicializar..... con scope="singleton"  solo crea un obj , luego accedes a la pos de memoria)>  para crear la clase, los campos que queremos van en <property>  .... creaame este obj con esta info  ,,, crea get y set de los campos
	 *  		en otro bean de abajo le dices oye necesito este bean (con id ="idDelBean" class="X")  y lo busca dentro de su contexto  
	 *  		
	 *  		luego en la calse con el main en vez de hacer new objX   creas el obj asi 
	 *  			llamas al contexto.... ApplicationContext contx = new ClassPathXmlApplicationContext("Beass-xml")
	 *  			contexto dame x obj.... XClase test = (XClase) context.getBean("XClase")  (necesito edte obj)
	 *  			usar obj.... test.metodo()
	 *  		
	 *  		en las clases tambien se puede indicar que es un componente con anotaciones @Component("nombre") y su Scope con @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) y valores por defecto en los sets con @Value("x")
	 *  			-- Proviamente en el beans.xml del proyecto hay que definir <context:componet-scan base-package="x"> para que se de cuenta
	 *  				y el <bean>
	 *  
	 *  		En una clase @Autowired private Persona x  crea obj con la clase definida en el <bean >  con los campos definidos en esa clase   si hay varios bean que usan la clase persona, se le puede concretar @Qualifier("idBean") @Autowired Persona x2
	 *  
	 *  		Spring Boot --- para crear proyectos de Spring
	 *  			new - proyect - Spring Boot starter proyect - config : en la url tambien se puede configurar,,, tipo proyecto - lenguaje - version - gurppo - articact - paquete    luego que queremos meter  
	 * 			
	 * 				luego hay que configurarlo aparte en application.properties
	 *  
	 *  *************************************************************			
	 *  		
	 *	
	 *		
	 *
	 *
	 *
	 * */

