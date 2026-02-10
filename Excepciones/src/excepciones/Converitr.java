package excepciones;

import java.util.Scanner;

public class Converitr {
    public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingrese un numero entero por cadena");
		String s = sc.nextLine();
		try {
			Integer n = Integer.parseInt(s);
			System.out.println("El numero entero es: "+n);
		}catch (Exception e) {
			System.out.println("No se puede convertir en numero entero");
		}
		System.out.println("Gracias por su visita");
		sc.close();
	}

}
