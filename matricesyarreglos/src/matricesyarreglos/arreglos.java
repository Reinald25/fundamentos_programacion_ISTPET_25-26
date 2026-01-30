package matricesyarreglos;

import java.util.Arrays;
import java.util.Scanner;

public class arreglos {
      static Scanner sc = new Scanner(System.in);
      static Integer i=0;
      static Integer j=0;
	public static void main(String[] args) {
		
		Integer [][] datos = {{1,2,3}, {4,5,6}, {7,8,9}};
		System.out.println(Arrays.deepToString(datos));
		System.out.println("Reglas:");
		System.out.println(" 1) Los valores de i y j deben ser menores");
		System.out.println(" 1) Los valores de i y j deben estar entre 1 y 3");
		bucle();
		i-=1;
	    j-=1;
		Integer valor = datos[i][j];
		System.out.println("El valor en "+"("+(i+1)+"i,"+(j+1)+"j)"+" es: "+valor);
		}
 public static void bucle() {
	do {
		System.out.println("Ingrese el orden de i a buscar");
		i = sc.nextInt();
		System.out.println("Ingrese el orden de j a buscar");
	    j = sc.nextInt();
	    if (i>3 && j>3) {
	    	
	    }
	    if (i<=3 && j<=3) {
	    	if (i>0 && j>0) {
	    		sc.close();
	    	break;
	    	}
	    }
	    	
	}while(true);	
 }
}
