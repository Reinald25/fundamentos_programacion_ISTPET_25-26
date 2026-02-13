package buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el mombre del archivo");
		String nombrearchivo = sc.nextLine();
		String ruta = "src/"+nombrearchivo+".txt";
		System.out.println("Escriba un  texto");
		String contenido = sc.nextLine();
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true))){
			bw.write(contenido);
			bw.newLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
