package ejercicio9Jedi;

import java.util.Scanner;

/*Escribe un algoritmo que pregunte por un número entero n mayor o igual que cero y devuelva
un texto con su representación en binario.*/

public class Binarios {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("    CONVERSOR A BINARIO\n    *******************");
		System.out.println();
		System.out.println("Empecemos...Pulse enter para continuar...");
		int numero;
		do {//Mientras el valor sea menor de 0
			do {//Mientras no ponga un valor de tipo entero.
				s.nextLine();
				System.out.print("Tecle un entero (mayor o igual que 0): ");
			}while(!s.hasNextInt());
			numero = s.nextInt();
		}while(numero < 0);
		
		System.out.println("  " + numero + " en binario = " + conversorBinario(numero));
	}
	
	public static String conversorBinario(int n) {
		String resultado="";//Guardo el resultado final en un String
		int resultDivision = n;//Para ir guardando la división entre 2.
		if(n==0) resultado ="0";
		else if(n==1) resultado ="1";
		else {
			while(true){
				if(resultDivision==1) {
					resultado = "1" + resultado;
					break;
				}
				if(resultDivision % 2 == 0) {//Si no tiene residuo...
					resultado = "0" + resultado;
				}else {//Si tiene residuo...
					resultado = "1" + resultado;
				}
				resultDivision /= 2;
			}
		}
		return resultado;
	}
}
