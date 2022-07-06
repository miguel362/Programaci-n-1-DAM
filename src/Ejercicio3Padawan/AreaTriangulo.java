package Ejercicio3Padawan;

import java.util.Scanner;

public class AreaTriangulo {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int opcion;
		do {//Para que salga el menú
			opcion=menu();
			//si elige la opción 1
			if(opcion == 1) {
				//pregunto por la base y la guardo en la variable
				System.out.print("¿Que mide la base del triángulo?: ");
				double base = s.nextDouble();
				//pregunto por la altura y la guardo en la variable
				System.out.print("¿Altura del triángulo?: ");
				double altura = s.nextDouble();
				System.out.println();
				System.out.println("El área del triángulo es de " + areaTriangulo(base,altura) + "\n");
				System.out.println("Pulse enter para continuar...");
				s.nextLine();
				s.nextLine();
			}else if(opcion == 2) {
				//pregunto por la longitud de los tres lados del triángulo
				System.out.print("Dime la longitud del primer lado del triángulo: ");
				double lado1 = s.nextDouble();
				System.out.print("Dime la longitud del segundo lado del triángulo: ");
				double lado2 = s.nextDouble();
				System.out.print("Dime la longitud del tercer lado del triángulo: ");
				double lado3 = s.nextDouble();
				System.out.println();
				double areaTriangulo = areaTrianguloHeron(lado1,lado2,lado3);
				System.out.printf("El área del triángulo es de %1.2f \n\n",areaTriangulo);
				System.out.println("Pulse Enter para continuar...");
				s.nextLine();
				s.nextLine();
			}else if(opcion == 3) {
				System.out.println("Hasta la próxima.");
			}
		}while(opcion != 3);
	}
	
	public static int menu() {
		int opcion;
		System.out.println("     CALCULA AREAS DE TRIANGULOS\n     ***************************");
		System.out.println();
		System.out.println("  1. Conociendo base y altura.");
		System.out.println("  2. Conociendo la longitud de los 3 lados.");
		System.out.println("  3. Salir.");
		System.out.println();
		System.out.print("        Escoja una opción (1-3): ");
		opcion = s.nextInt();
		System.out.println();
		
		return opcion;
	}
	public static double areaTriangulo(double base,double altura) {
		return (base*altura)/2;
	}
	
	public static double areaTrianguloHeron(double lado1,double lado2,double lado3) {
		double s = (lado1 + lado2 + lado3)/2;
		double area = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
		return area;
	}
}