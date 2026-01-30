package arreglos;

import java.util.Scanner;

public class cadenas {
     public static void main(String args[]) {
    	 Scanner sc = new Scanner(System.in);
         System.out.println("Introduce una cadena de texto: ");
         String texto = sc.nextLine();

         // Longitud de la cadena
         System.out.println("Longitud: " + texto.length());

         // Convierte el texto en mayusculas y minusculas
         System.out.println("Mayúsculas: " + texto.toUpperCase());
         System.out.println("Minúsculas: " + texto.toLowerCase());

         // nmero de vocales en el texto
         int vocales = 0;
         String vocal = "aeiouAEIOU";
         for (int i = 0; i < texto.length(); i++) {
             char caracter = texto.charAt(i);
             if (vocal.indexOf(caracter) != -1) {
                 vocales++;
             }
         }
         System.out.println("Número de vocales: " + vocales);
         sc.close();
     }
}
