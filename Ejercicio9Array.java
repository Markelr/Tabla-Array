
public class Ejercicio9Array {
	
	//Comprobar si u numero esta repetido en un subarray
	static boolean seRepite(int t[], int numero, int cantidad) {
		for(int i=0;i<cantidad;i++)
			if (t[i]==numero)
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		int tabla []= new int [8];
		
		//Calcular 8 posiciones diferentes
		for(int i=0;i<tabla.length;i++) {
			int aleatorio=(int)Math.floor(Math.random()* 39);
			while (seRepite(tabla, aleatorio, i))
				 aleatorio=(int)Math.floor(Math.random()* 39);
			tabla[i]=aleatorio;
		}
		//Visualizar tabla
	   for(int i=0;i<tabla.length;i++) {
			System.out.println(i +" - "  + tabla[i]);
			
		}

	}

	}

