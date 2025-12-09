package Scanner;

import java.util.Scanner;

public class Convertor_de_unidades {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Ingrese la distancia en metros ");
		Double mt = sc.nextDouble();
		Double km= mt/1000;
		Double cm = mt *100;
		Double ft = mt*3.28084;
		System.out.print("La distancia en kilometros "+km);
		System.out.print("\nLa distancia en centimetros "+cm);
		System.out.print("\nLa distancia en pies "+ft);
	}

}
