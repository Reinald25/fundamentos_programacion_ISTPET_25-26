package excepciones;

public class prueba1 {

	public static void main(String[] args) {
		try {
			
		        int resultado = 10 / 0; 
		        System.out.println("Resultado: " + resultado);
		}catch (ArithmeticException e) {
			 System.out.println("No se puede dividir a 0");
		}
		    }

	}

