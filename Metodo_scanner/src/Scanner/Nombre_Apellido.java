package Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nombre_Apellido {

	public static void main(String[] args) {
		//llama al scanner y se lo nombre
		Scanner sc = new Scanner (System.in);
		System.out.print("Escriba su nombre ");
		String nombre = sc.next();
		System.out.print("Escriba su apellido ");
		String apellido = sc.next();
		System.out.print("Escriba su edad ");
		Integer edad = sc.nextInt();
		System.out.print("Escriba su estado civil ");
		String estadocivil = sc.next();
		System.out.print("Escriba su altura ");
		//Da a la variable el tipo float para almacenar numeros con ","	
		 try {
			 float altura = sc.nextFloat();
			    System.out.print("Usted es "+nombre+" "+apellido);
				System.out.print("\nSu edad es "+edad);
				System.out.print("\nSu edad es "+estadocivil);
				System.out.print("\nSu altura es "+altura);
	        } catch (InputMismatchException e) {
	        	System.out.print("Su nombre y apellido es "+nombre+" "+apellido);
				System.out.print("\nSu edad es "+edad);
				System.out.print("\nSu edad es "+estadocivil);
	            System.out.println("\nColocar altura con una coma ");
	            sc.next(); 
	        } finally {
	            sc.close();}
	}

}
