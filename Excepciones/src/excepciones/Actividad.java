package excepciones;

public class Actividad {
    public static String texto;
	public static void main(String[] args) {
		//crea una clase con un try-catch que capture NullPointerException al intentar acceder a un String null. ¿Qué sucede?
		
		try {
		System.out.println(texto.length());
		}catch(NullPointerException e) {
			System.out.println("el texto es nulo");
		}
		
	}

}
