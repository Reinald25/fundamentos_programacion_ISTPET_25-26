package gestion_de_cliente;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Entrada_de_clientes {
    //clase scanner como instnacia global
	static boolean encontrado = false;
	static String afirmacion ="si";
	static String negacion="no";
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
	
		while(true) {
			System.out.println("¿Desea buscar un cliente?");
	String confirmacion = sc.next();
	if (confirmacion.equalsIgnoreCase(afirmacion)) {
		System.out.println("Escriba su nombre o cedula");
		String nbuscar = sc.next();
		System.out.println("buscando a "+nbuscar);
		for (int i1 = 0; i1 < datos.length; i1++) {
		    // Recorrer columnas
		    for (int j = 0; j < datos[i1].length; j++) {
		        if (datos[i1][j].equalsIgnoreCase(nbuscar)) {
	                if(j==0) {
	                	 System.out.println("Nombre : "+datos[i1][j]+" Cedula:"+datos[i1][j+1]+" Correo:"+datos[i1][j+2]);
		            encontrado = true;
	                }
	                if(j==1) {
	                	 System.out.println("Nombre:"+datos[i1][j-1]+" Cedula:"+datos[i1][j]+" Correo:"+datos[i1][j+1]);
		            encontrado = true;
		            if (!encontrado) System.out.println("Elemento no encontrado");
		            
	                }
		        }
		    }
		}
		
		
	
	}else {
		break;
	}
		}
		    
	System.out.println("¿Desea cambiar los datos?");
		String confirmacion2 = sc.next();
		if(confirmacion2.equalsIgnoreCase(afirmacion)) {
			System.out.println("Modificar de quien?");
		}
	String ruta = "src/archivo.txt";
	try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta,true))){
		for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                bw.write(datos[i][j]);
                
                // Añadimos una coma si no es el último elemento de la fila
                if (j < datos[i].length - 1) {
                    bw.write(", ");
                }
            }
            // Al terminar cada fila, saltamos a la siguiente línea
            bw.newLine(); 
        }
        System.out.println("Archivo guardado exitosamente.");
	}catch(IOException e) {
		System.out.println(e);
	}
	
	
}

}
