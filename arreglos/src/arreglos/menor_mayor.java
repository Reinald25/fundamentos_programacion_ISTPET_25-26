package arreglos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class menor_mayor {
    static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		arreglo();
		sc.close();
	}
public static void arreglo () {
	System.out.println("Ingrese el numero de elementos a guardar");
	Integer f = sc.nextInt();
	Integer[] datos = new Integer[f];
	for (int i=0; i<f;i++) {
		System.out.println("Ingrese un numero");
		datos[i]=sc.nextInt();
	}
	System.out.println("El arreglo es:");
	System.out.println(Arrays.toString(datos));
	//Busca el menor numero del arreglo
	Integer minimo = Collections.min(Arrays.asList(datos));
    System.out.println("El valor mínimo es: " + minimo);
    // Encontrar el valor máximo
    Integer maximo = Collections.max(Arrays.asList(datos));
    System.out.println("El valor máximo es: " + maximo);
}
}
