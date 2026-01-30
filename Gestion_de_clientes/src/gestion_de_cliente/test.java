package gestion_de_cliente;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = {{1, 2}, {3, 4}};
		for (int i = 0; i < matriz.length; i++) {
		    for (int j = 0; j < matriz[i].length; j++) {
		        System.out.print(matriz[i][j] + " "); // Imprime horizontal
		    }
		    System.out.println(); // Salto de línea después de cada fila [13]
		}
}
}