package Ejercicio1Padawan;

import java.util.Scanner;

public class PasarKilometrosHorasAMetrosPorSegundo {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("     CAMBIO UNIDADES VELOCIDAD KM/H A M/S\n     ************************************");
		System.out.println();
		System.out.println("Presiona Enter para comenzar");
		//Mientras el usuario no introduzca un valor entero o double pedimos la velocidad
		do {
			s.nextLine();
			System.out.print("Teclee velocidad en Km/h: ");
		}while(!s.hasNextInt() && !s.hasNextDouble());
		double velocidad = s.nextDouble();
		double resultado = (double)velocidad * 5 / 18;//Paso km/h a m/s
		System.out.printf("Velocidad = %1.8f m/s",resultado);//Resultado con 8 decimales..
	}
}