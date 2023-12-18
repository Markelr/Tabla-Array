
public class Ejercicio10Array {

	public static void main(String[] args) {
		int tabla [] = {2,6,2,77,3,10,23,14,45,78};
		int contadorDivisibles=0;
		
		//Divisibles de 7
		
		for (int i = 0; i<tabla.length;i++) {
			if (tabla[1]%7==0)
				contadorDivisibles++;
			}
		 System.out.println("Numeros divisibles por 7 :" + contadorDivisibles);
	}

}
