
public class Ejercicio5Array {

	static int factorial (int x) {
	if (x==0 || x==1)
		return 1;
	
	else
		return x *  factorial(x-1);
}
	public static void main(String[] args) {
	     int[] tabla = new int[10];
	        
	     //Rellenar la tabla con factoriales
	        for (int i = 0; i < tabla.length; i++) {
	        	tabla[i] = calcularFactorial(i);
	        }
	        	
	        // Imprimir el array de factoriales
	        for (int elemento : tabla) {
	            System.out.print(elemento + " ");
	        }
	    }
	    
	    // Función para calcular el factorial
	    public static int calcularFactorial(int n) {
	        if (n <= 1) {
	            return 1;
	        } else {
	            return n * calcularFactorial(n - 1);
	        }
	}

}
