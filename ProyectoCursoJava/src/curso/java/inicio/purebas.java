package curso.java.inicio;

public class purebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] colegio = new String[3][6];
		boolean encontrado = false;
		System.out.println(colegio.length + " fil");
		System.out.println(colegio[2].length + " col");
		

		colegio [0] [0] = "Antonio";
		colegio [0] [1] = "iker";
		colegio [0] [2] = "Roberto";
		
		
	
			for (String dato : colegio[0]) {
				System.out.println(dato);
				if("Antonio".equals(dato) ) {
					encontrado = true;
				}else {
					System.out.println("el alumno"+  " no esta en el colegio");
				}
				if(encontrado) System.out.println("esta"); break;
			}
		
	}	
	

}
