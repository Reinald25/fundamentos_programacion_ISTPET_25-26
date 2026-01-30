package arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class nombres {
	static boolean encontrado = false;
	static Scanner sc = new Scanner(System.in);
	 public static void main(String args[]) {
		 nombre();
		 sc.close();
	 }
public static void nombre() {
	System.out.println("Ingrese el numero de nombres a guardar");
	Integer f = sc.nextInt();
	String[] n = new String[f];
	for(int i=0;i<f;i++) {
		System.out.println("Ingrese el nombre");
		n[i]=sc.next();
	}
	System.out.println(Arrays.toString(n));
	System.out.println("Ingrese el nombre a buscar: ");
    String nbuscar = sc.next();
   
    for (String nom : n) {
        if (nom.equalsIgnoreCase(nbuscar)) { // Ignora mayúsculas/minúsculas
            encontrado = true;
            break;
        }
    }
    
    // 3. Indicar si el nombre fue encontrado
    if (encontrado) {
        System.out.println("El nombre " + nbuscar + " fue encontrado.");
    } else {
        System.out.println("El nombre " + nbuscar + " no fue encontrado.");
    }
}
}
