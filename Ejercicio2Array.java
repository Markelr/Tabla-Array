
public class Ejercicio2Array {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};

        int longitud = tabla.length;
        
        int sumaPrimeraMitad = 0;
        int sumaSegundaMitad = 0;
        
        // Calcula la suma de la primera mitad
        for (int i = 0; i < longitud / 2; i++) {
            sumaPrimeraMitad += tabla[i];
        }
        
        // Calcula la suma de la segunda mitad
        for (int i = longitud / 2; i < longitud; i++) {
            sumaSegundaMitad += tabla[i];
        }
        
        if (sumaPrimeraMitad > sumaSegundaMitad) {
            System.out.println("La suma de la primera mitad es mayor: " + sumaPrimeraMitad);
        } else if (sumaSegundaMitad > sumaPrimeraMitad) {
            System.out.println("La suma de la segunda mitad es mayor: " + sumaSegundaMitad);
        } else {
            System.out.println("La suma de ambas mitades es igual: " + sumaPrimeraMitad);
        }
    }


	}


