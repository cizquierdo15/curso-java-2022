package curso.java.inicio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import curso.java.ejercicios.libreria.Utilidades;





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
	 * 	
	 *
	 * */

