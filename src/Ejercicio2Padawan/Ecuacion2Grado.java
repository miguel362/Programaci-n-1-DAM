package Ejercicio2Padawan;

import java.util.Scanner;

public class Ecuacion2Grado {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("     ECUACIÓN DE SEGUNDO GRADO: ax2+bx+c=0\n     *************************************");
		System.out.println();
		System.out.println("Empezamos...presiona la tecla enter para empezar a introducir datos por favor");
		//pido el primer número y lo guardo en la variable
		//Me aseguro de que me dan valores numéricos
		do {
			s.nextLine();
			System.out.print("Teclee a: ");
		}while(!s.hasNextInt() && !s.hasNextDouble());
		double a = s.nextDouble();
		//pido el segundo número y lo guardo en la variable
		do {
			s.nextLine();
			System.out.print("Teclee b: ");
		}while(!s.hasNextInt() && !s.hasNextDouble());
		double b = s.nextDouble();
		//pido el tercer número y lo guardo en la variable
		do {
			s.nextLine();
			System.out.print("Teclee c: ");
		}while(!s.hasNextInt() && !s.hasNextDouble());
		double c = s.nextDouble();
		double resultado1,resultado2;
		double primerValorRaiz = Math.pow(b, 2);//calculo b al cuadrado
		double segundoValorRaiz = 4*a*c;//calculo 4 x a x c
		int resultadoEntero,resultadoEntero2;
		if(a==0) {//si a vale 0 la ecuación es la siguiente....x = -c/b
			double resultado = (-c)/b;
			//compruebo si el resultado tiene decimales para imprimirlo con ó sin ellas
			if(resultado % 1 == 0) {
				resultadoEntero = (int) resultado;
				System.out.println("      Una solución. x= " + resultado);
			}else {
				System.out.println("      Una solución. x= " + resultado);
			}
		//si la raiz es negativa
		}else if(primerValorRaiz < segundoValorRaiz){
			System.out.println("      No tiene soluciones en los reales.");
		}else {
			resultado1 = ((-b) + Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
			resultado2 = ((-b) - Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
			//si los dos resultados son iguales que imprima sólo uno.
			if(resultado1 == resultado2) {
				if(resultado1 % 1 == 0) {
					resultadoEntero = (int)resultado1;
					System.out.println("      Una solución. x= " + resultadoEntero);
				}else {
					System.out.println("      Una solución. x= " + resultado1);
				}
			}else {
				if(resultado1 % 1 == 0 && resultado2 % 1 == 0) {
					resultadoEntero = (int)resultado1;
					resultadoEntero2 = (int)resultado2;
					System.out.println("       Dos soluciones. x= " + resultadoEntero + " y x= " + resultadoEntero2);
				}
				else if(resultado2 % 1 == 0 && resultado1 % 1 != 0) {
					resultadoEntero2 = (int)resultado2;
					System.out.println("       Dos soluciones. x= " + resultado1 + " y x= " + resultadoEntero2);
				}else if(resultado2 % 1 != 0 && resultado1 % 1 == 0) {
					resultadoEntero = (int)resultado1;
					System.out.println("       Dos soluciones. x= " + resultadoEntero + " y x= " + resultado2);
				}else {
					System.out.println("       Dos soluciones. x= " + resultado1 + " y x= " + resultado2);
				}
			}
		}
	}
}