package Ejercicio1;

public class Ejercicio1 {
	
		public static final int MAX_CLIENTES = 100;
		public static final String FORMATO_CEDULA= "\\d{10}";
		public static final String FORMATO_EMAIL = "^[\\W.-]+@[\\W.-]+\\.\\W+$";
		
		static String[] nombres = new String[MAX_CLIENTES];
		static String[] cedulas = new String[MAX_CLIENTES];
		static String[] emails = new String[MAX_CLIENTES];
		
		
		static int contadorClientes = 0;
				
				
		public static void inicializarSistema() {
			for(int i = 0; i < MAX_CLIENTES; i++) {
				nombres[i] = "";
				cedulas[i] = "";
				emails[i] = "";
			}
            contadorClientes = 0;
            System.out.println("Sistema inicializado correctamente.");
	}
    
	public static void main(String[] args) {
		inicializarSistema();
		
	}
}
