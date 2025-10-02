package aceptaelreto;

import java.util.Scanner;

public class AceptaElReto01 {

	public static void main(String[] args) {

		// Se declara la variable del numero a introducir
		int num;

		// Se crea el scanner
		Scanner sc = new Scanner(System.in);

		// Primer input
		num = sc.nextInt();

		// Se hace un bucle comprobando el numero anterior y outputteando el mensaje,
		// posteriormente se lee un nuevo numero. El bucle para cuando el numero sea 0
		while (num != 0) {
			System.out.println((num % 2 == 0) ? "DERECHA" : "IZQUIERDA");
			num = sc.nextInt();
		}
		// Se cierra el scanner
		sc.close();
	}

}
