package gestion_de_cliente;

import java.util.Arrays;
import java.util.Scanner;

public class Entrada_de_clientes {
    //clase scanner como instnacia global
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		datos();
	}
public static void datos() {
	System.out.println("Ingrese numero de datos a almacenar");
	//se genera el numero de filas de la matriz
	Integer n = sc.nextInt();
	//se genera una fila de nombres
	String[] nombre = new String[n];
	//fila de cedula
	String[] cedula = new String[n];
	//fila de correos
	String[] correo = new String[n];
	    for(int i = 0;i<n;i++) {
	    //se toman los datos de las filas
    	System.out.println("Ingrese nombre");
    	nombre[i]=sc.next();
    	System.out.println("Ingrese cedula");
    	cedula[i]=sc.next(); 
    	System.out.println("Ingrese correo");
    	correo[i]=sc.next();
    	
    	}
	//se imprimen las filas en orden
    System.out.println(Arrays.toString(nombre));
    System.out.println(Arrays.toString(cedula));
    System.out.println(Arrays.toString(correo));


}

}
