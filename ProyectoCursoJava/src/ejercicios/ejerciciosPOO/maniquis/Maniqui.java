package ejercicios.ejerciciosPOO.maniquis;

public class Maniqui {
	
	private long id;
	private Camisa camisa;
	private Pantalon pantalon;
	private Vestido vestido;
	
	//Constructores
	
		//sin ropa, solo con id  
	public Maniqui(long id) {
		this.id = id;
		System.out.println("Creando al maniqui "+ this.id + "  desnudo");
	}
	
		//con ropa ya creada
	public Maniqui(long id, boolean vestido) {
		super();
		if(vestido) {
			Boton uno = new Boton("Amarillo","redondo");
			Boton dos = new Boton("Amarillo","redondo");
			Boton tres = new Boton("Amarillo","redondo");
			Boton cuatro = new Boton("Amarillo","redondo");
			Boton bPantalon = new Boton("Marron","Cuadrado");
			Boton [] botones = {uno,dos,tres,cuatro};
			
			this.id = id;
			this.camisa = new Camisa("Negra", "XL", 20, botones);
			this.pantalon = new Pantalon("Gris", "M", 30, bPantalon);
			this.vestido = new Vestido("Rojo", "L", 35);
		}else {System.out.println("para crearlo asi, vestido ha de ser true");}
	}
		//Con todo     
	public Maniqui(int id, Camisa camisa, Pantalon pantalon, Vestido vestido) {
		super();
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
		this.vestido = vestido;
		System.out.println("Vistiendo al maniqui "+ this.id + " con todo");
		
		}
	
		//solo con camisa y pantalon
	public Maniqui(long id, Camisa camisa, Pantalon pantalon) {
		super();
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
		System.out.println("Vistiendo al maniqui "+ this.id + " con camisa de color "+ camisa.getColor() + " y pantalon de color "+pantalon.getColor());
		
	}
	
		//solo con vestido
	public Maniqui(long id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;
		System.out.println("Vistiendo al maniqui "+ this.id + " con vestido de color "+ vestido.getColor());
	}
	
	//funciones
	
	//deja vacia la ropa del maniqui
	private void desvestir() {
		//si tiene algo de ropa
		if( (this.tieneCamisa() && this.pantalon != null)  || this.vestido != null) {
			this.quitarCamisa();
			this.pantalon = null;
			this.vestido = null;
			
		}else {
			System.out.println("El maniqui "+ id + " NO tiene ropa");
		}
	}
	//le le quita lo que tuviese añade un vestido
	public void vestir( Vestido vestido) {
		this.desvestir();
		this.vestido = vestido;
	}
	//le quita lo que tuviese y añade una camisa y pantalones   //la visibilidad es public para que desde la tienda se pueda vestir
	public void vestir( Camisa camisa, Pantalon pantalon) {
		this.desvestir();
		this.camisa = camisa;
		this.pantalon = pantalon;
	}
	
	private boolean tieneCamisa() {
		return camisa != null;
	}
	private void quitarCamisa() {
		setCamisa(null);
	}
	
	//getters Setters
	public long getId() {
		return id;
	}


	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}
	
	
	
	

}
