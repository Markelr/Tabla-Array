
public class Ejercicio6Array {
	  static int fibonacci(int x){
	        int fibo = 1;
	        int fibo1 = 1;
	        int fibo2 = 1;
	        
	        for(int i = 2;i <= x;i++) {
	            fibo = fibo * i;
	        fibo = fibo1 + fibo2;
	        //tiene que ir obligatoriamente en este orden:
	        fibo2 = fibo1;
	        fibo1 = fibo;
	        }
	        return fibo;
	        }
 

	public static void main(String[] args) {
		

		   int tabla[] = new int[20];
	        
	        for(int i=0;i<tabla.length;i++)
	            tabla[i] = fibonacci(i);
	        
	        for(int i=0;i<tabla.length;i++)
	            System.out.print(" " + tabla[i]);
	}
	}