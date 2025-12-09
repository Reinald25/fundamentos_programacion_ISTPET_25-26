package Calculadora;

import java.util.ArrayList;

public class cal {
	public static void main (String args []) {
   	 ArrayList<Integer> numeros = new ArrayList<Integer> ();
   	 numeros.add(5);
   	 numeros.add(10);
   	 numeros.add(15);
   	 numeros.add(20);
   	 numeros.add(25);
   	 Integer suma = 0;
   	 for (Integer numero : numeros) {
   		 suma += numero;
   	 }
   	 Integer promedio = suma / numeros.size();
   	 System.out.print ("El promedio del estudiante es: "+ promedio);
    }
}
