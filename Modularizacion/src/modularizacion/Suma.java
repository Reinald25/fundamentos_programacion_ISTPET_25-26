package modularizacion;
import java.util.Scanner;
public class Suma {
      public static void main (String args[]) {
      Scanner sc = new Scanner (System.in);
      System.out.println("1er numero");
      Integer n1 = sc.nextInt();
      System.out.println("2do numero");
      Integer n2 = sc.nextInt();
      System.out.println("El resultado de la suma de "+n1+"+"+n2+"="+sum (n1,n2));
      System.out.println("El resultado de la resta de "+n1+"-"+n2+"="+rest (n1,n2));
      System.out.println("El resultado de la multiplicacion de "+n1+"*"+n2+"="+mult (n1,n2));
      System.out.print(div (n1,n2));
      }
public static int sum (int n1,int n2) {
	Integer s =n1+n2;
	return s;
}
public static int rest (int n1,int n2) {
	Integer r =n1-n2;
	return r;
}
public static int mult (int n1,int n2) {
	Integer m =n1-n2;
	return m;
}
public static float div (float n1,float n2) {
	if(n2==0) {
		 float d=0;
		 System.out.println("No se puede dividir para 0");
		 return d;
	}else {
		float d =n1/n2;
		System.out.print("El resultado de "+n1+"/"+n2+"=");
		return d;
	}
}
}

