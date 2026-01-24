package gestion_de_cliente;

import java.util.Arrays;
import java.util.stream.Stream;

public class test {

	public static void main(String[] args) {
		String[] arr1 = {"1", "2"};
        String[] arr2 = {"3", "4"};

        // Concatenar usando Streams [8]
        String[] resultado = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                                   .toArray(String[]::new);

        System.out.println(Arrays.toString(resultado));
	}

}
