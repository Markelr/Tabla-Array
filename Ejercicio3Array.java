
public class Ejercicio3Array {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};
		
		boolean repetido = false;
		
		for(int i=0;i<tabla.length;i++)
			for (int j = i+1; j<tabla.length;j++)
				if (tabla[i] == tabla[j])
					repetido=true;
		
	      
	        
	        if (repetido == true) {
	        	 System.out.println("Hay elementos repetidos en el array.");	       
	        	 } else {
	        	 
	            System.out.println("Todos los elementos del array son diferentes.");
	        }
	        }

	}


