package arreglo;

import java.util.Arrays;
import java.util.Scanner;

public class arreglo1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Ingrese los elementos");
		   int n =sc.nextInt();
		   
		   int [] edades = new int[n];
		   for (int i=0;i<n;i++) {
			   System.out.println("Ingrese las edades");
			   Integer edad = sc.nextInt();
			   edades [i]=edad;
		   }
		  System.out.println(Arrays.toString(edades));
          sc.close();
	}

}
