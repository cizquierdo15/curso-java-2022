package poo;

public class ClaseA {
	//atributos
	private int numero1;  //su valor x defecto es 0
	private int numero2;
	private String nombre; //private evitamos que se pueda editar desde fuera, solo con geters y seters
	private ClaseB claseb;  // la clase a necesita un objs de clase b
	
	//constructor,  inicializa los atributos de la clase, se ejecuta cuando se crea un obj de la clase
	//al crear un contructor personalizado, el de por defecto desaparece, hasta crear uno propio vacio
	//Al crear el constructor vacio, deberiamos perimitir el acceso a los atributos, por lo que la encapsulacion se merma
	public ClaseA (String n) {
		this.setNombre(n); //this hace referencia a las variables de la clase
	}
	
	public ClaseA (int n1, int n2 , String n) {
		this.setNumero1(n1);
		this.numero2 = n2;
		this.setNombre(n); 
	}
	
	//constructor nuevo con la clase B
	public ClaseA(int numero1, int numero2, String nombre, ClaseB claseb) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.nombre = nombre;
		this.claseb = claseb;
	}
	

	public ClaseA(String nombre, ClaseB claseb) {
		super();
		this.nombre = nombre;
		this.claseb = claseb;
	}

	//funciones
	void funcion1(){
		System.out.println("Funcion1");
	}
	
	//Getters y Setters, para ver o editar los atributos privados de la clase     alato de teclado,,, alt+shif+s      genera contructorusando campos
	
	
	//publico para poder acceder desde fuera de la clase, como es un strin ha de devolver el nombre
	public String getNombre() {
		//puede omitirse el this, es para hacer referencia a una variable de instancia
		return this.nombre;
	}
	
	//set igual son publicos para utilizarlos, pero no devuelve nada ya que se usa para editar una variable interna
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
	public int getNumero2() {
		return numero1;
	}

	public ClaseB getClaseb() {
		return claseb;
	}

	public void setClaseb(ClaseB claseb) {
		this.claseb = claseb;
	}

	
}
