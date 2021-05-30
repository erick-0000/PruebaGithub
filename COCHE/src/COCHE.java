

public class COCHE {
	//atributos
	
		 String Color;
		String Marca;
		 int Km;
	public static void main(String[] args) {
		COCHE Coche1= new COCHE();		
		
		 Coche1.Color= "Rojo ";
		 Coche1.Marca= "Tsuru";
		Coche1.Km= 0;
		
		
		 System.out.println("El color del Coche1 es: "+Coche1.Color);
		
		System.out.println("La marca del Coche1 es: "+Coche1.Marca);
		
	System.out.println("El Kilometraje del Coche1 es: "+Coche1.Km);
	
	
		
	
	 COCHE Coche2 = new COCHE();
	 
	 Coche2.Color= "Azul";
	 Coche2.Marca= "Volcho";
	Coche2.Km= 200 ;
	
	 System.out.println("\nEl color del Coche2 es: "+Coche2.Color);
	
	System.out.println("La marca del Coche2 es: "+Coche2.Marca);
	
System.out.println("El Kilometraje del Coche2 es: "+Coche2.Km);
	
	
	
	
	
	}

	}


