
public class Ejercicio1Array {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};
		   int conteoDeTres = 0;
	        
	        for (int i = 0; i < tabla.length; i++) {
	            if (tabla[i] == 3) {
	                conteoDeTres++;
	            }
	        }
	        
	        System.out.println("Cantidad de veces que aparece el valor 3: " + conteoDeTres);

	}

}
