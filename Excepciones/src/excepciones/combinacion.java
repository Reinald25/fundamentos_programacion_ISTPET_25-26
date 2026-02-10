package excepciones;

import java.util.Scanner;

public class combinacion {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String datoLeido = "";
		String datoAux = null;
		int datoConvertido;
		  System.out.println("Escriba el dato");
		 datoLeido = sc.nextLine();

		 if(datoLeido.length()>5){
		 datoAux = "hola";
		 }
		 
		 try{
		 Integer longitud = datoAux.length(); //Puede generar un error Null Pointer
		 datoConvertido = Integer.parseInt(datoAux); //Puede generar un error de conversión
		 System.out.println("Longitud es: "+longitud);
		 }catch(NullPointerException e){
		 System.out.println("Trabajando con un valor nulo!");
		 }catch (NumberFormatException e){
		 System.out.println("No se pudo realizar la conversión");
		 }
     sc.close();
	}

}
