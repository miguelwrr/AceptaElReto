package aceptaelreto;

import java.util.Scanner;

public class AceptaElReto02 {

	public static void main(String[] args) {

		// Se declaran las variables del input y del numero de intentos
		String input;
		int attempts;

		// Se crea el scanner
		Scanner sc = new Scanner(System.in);

		// Se elige un numero de intentos
		attempts = sc.nextInt();

		// Mediante un bucle for hacemos que el usuario introduzca 'colgantes' ó
		// 'colgadas', invalidando otro input, y se escribe en consola si está bien o mal
		for (int i = 1; i <= attempts; i++) {

			input = sc.nextLine();
			while (!(input.equalsIgnoreCase("colgadas")) && !(input.equalsIgnoreCase("colgantes"))) {
				input = sc.nextLine();
			}
			System.out.println((input.equalsIgnoreCase("colgadas") ? "Bien" : "Mal"));
		}

		// Se cierra el scanner
		sc.close();
	}

}
