package excepciones;

import java.util.Scanner;

public class combinacion_2 {

	public static void main(String[] args) {
		String s=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un numero a transformar");
		String sn = sc.nextLine();
		
		try {
			Integer n1 = Integer.parseInt(sn);
			System.out.print("El numero es"+n1);
		}catch(NumberFormatException e) {
			System.out.print("No se pudo transformar");
		}catch(NullPointerException e) {
			System.out.print("Se encuentra vacio");
		}
		sc.close();

	}

}
