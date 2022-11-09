package curso.java.hibernate;

//import curso.java.hibernate.util.JpaUtil;
//import jakarta.persistence.EntityManager;

//import jakarta.persistence.Id;

public class ApuntesHibernate {

}
/*
 * HIBERNATE
 * 
 * 	framework de BBDD
 * 
 * 	orn - obj relational mapping       relaciona clases con la bdd
 * 
 *  creamos los obj y le decimos ahiber que los guarde en la BDD
 *  cuesa adaptar los cambios de hibernate por otro orn
 *  se adapta a la BDD que tengamos(tipo de bdd)
 *  entidad, Clase representada en la BDD
 * 	 
 * hay que configurarlo en persistence.xml (en meta-inf)
 * 		clase a utilizar,,,, provider
 * 		entidades  <class>   clases que vamos a utilizar para acceder a las tablas  se indica la clase a utilizar <class> curso.java.hibernate.entity.Cliente </class>
 * 		propiedades de la conex
 * 			((( <property name="hibernate.hbm2ddl.auto" value="create"/> )) esta genera las tablas
 * 
 * 	
 * como hacer entidades ( en el paquete entity ) se crean las Clases
 * 		a traves de las anotaciones pdodemos dar funcionalidaes 
 * 
 * 		TIENEN que tener @Entity 
 * 		los atributos de la clase seran los campos de la tabla
 * 			@Id   generara la clave primaria, con el nombre del campo     IDENTITY es el autoincrementable
 * 			con @Column le damos restricciones al campo, como nombre,longituz que admita nulos etc
 * 			Necesita un constructor vacio de la clase
 * 			
 * Como usarlo Ejemplo, en Hibernatelistar
 * 			EntityManager em = JpaUtil.getEntityManager(); (creado en JpaUtil ,, hay que revisar en el metodo build de esa clase, si al decirle crear esta conf de la bd que pilla de persistence.xml)   obj que gestiona la comunicacion con la Bd
 * 				con el begin() comienza una transaccion
 * 				esto es un insert    em.persist(cliente1);
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
*/