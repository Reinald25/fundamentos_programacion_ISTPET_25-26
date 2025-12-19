package variables;
import java.util.Scanner;
//varia se declara como varaible global
public class varia {
    private static double suma =50;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Primer numero");
		double n1 = sc.nextDouble();
		System.out.println("Segundo numero");
		Double n2 = sc.nextDouble();
		//Se imprime la variable global
		System.out.println("Variable global "+varia.suma);
		//se llama a la clase
		sum();
		sc.close();
	}
	//No necesita retornar nada
public static void sum() {
	float n1=10;
	double n2=12.62;
	double suma=n1+n2;
	varia.suma+=n1+n2;
	System.out.println("Suma local "+suma);
	System.out.println("Suma global "+varia.suma);
}
}
