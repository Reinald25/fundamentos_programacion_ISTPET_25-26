package gestion_de_cliente;

import java.util.Scanner;

public class Entrada_de_clientes {
    //clase scanner como instnacia global
	static final Integer c = 3;
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		datos();
		sc.close();
	}

public static void datos() {
	System.out.println("Ingrese numero de datos a almacenar");
	//se genera el numero de filas de la matriz
	Integer f = sc.nextInt();
	//la matriz toma las filas de la consola y genra 3 columnas para almacenar
	//3 datos
	String[][] datos = new String[f][c];
	//se generan filas por medio de f o numero de datos a almacenar
	for (int i = 0; i < f; i++) { 
		//se generan las columnas para los 3 datos a tomar
	    for (int j = 0; j < c; j++) { 
	    	//compara si el indice de j e imprime un mensaje especifico
	    	//y almacena la informacion en rango i j
	    	if(j==0) {
	    		System.out.print("Ingrese nombre: " );
	        datos[i][j] = sc.next();
	    	}
	    	if(j==1) {
	    		System.out.print("Ingrese cedula: " );
	        datos[i][j] = sc.next();
	    	}
	    	if(j==2) {
	    		System.out.print("Ingrese correo: " );
	        datos[i][j] = sc.next();
	    	}
	        
	    }
}
	//impresion con salto
	for (int i = 0; i < f; i++) {
	    for (int j = 0; j < c; j++) {
	    	//evalua e imprime el elemento de la matriz
	    	if(j==0) {
	    		System.out.print("Nombre: "+datos[i][j] + " ");
	    	}
	    	if(j==1) {
	    		System.out.print("Cedula: "+datos[i][j] + " ");
	    	}
	    	if(j==2) {
	    		System.out.print("Correo: "+datos[i][j] + " ");
	    	}
	        
	    }
	    //slato de linea
	    System.out.println(); 
	}
}

}
