package bucle;

public class triangulo2 {
   public static void main (String args[]) {
	   int n = 5; // Altura de la pirámide

	// Bucle para las filas (de n a 1)
	for (int i = n; i >= 1; i--) {
	    // Bucle para imprimir los espacios (n - i)
	    for (int j = 1; j <= n - i; j++) {
	        System.out.print(" ");
	    }
	    // Bucle para imprimir los asteriscos (2*i - 1)
	    for (int k = 1; k <= 2 * i - 1; k++) {
	        System.out.print("*");
	    }
	    System.out.println();
	}
   }
}
