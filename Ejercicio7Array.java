
public class Ejercicio7Array {

	public static void main(String[] args) {
        int[] tabla = {3, 7, 2, 8, 5, 4, 9, 1, 6, 0};
        
        int pares = 0;
        int impares = 0;
        
       //Para ver los paras e impares que hay
        for (int elemento : tabla) {
            if (elemento % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        if (pares > impares) {
            System.out.println("Hay más números pares en el array.");
        } else if (impares > pares) {
            System.out.println("Hay más números impares en el array.");
        } else {
            System.out.println("El array tiene la misma cantidad de números pares e impares.");
        }

	}

}
