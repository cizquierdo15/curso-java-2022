package curso.java.inicio.interfaces;

public interface IUpdatetable extends IInsertable{
	/**
	 * Metodo para actualizar el reguistro de la BD
	 */
	void update(long id);
}
