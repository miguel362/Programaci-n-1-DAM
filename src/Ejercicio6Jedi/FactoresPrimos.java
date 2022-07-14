package Ejercicio6Jedi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactoresPrimos {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("    CALCULA FACTORES PRIMOS DE UN ENTERO");
		System.out.println("    ************************************");
		System.out.println();
		int entero=0;
		System.out.println("Pulsa Enter para empezar....");
		do {//para que el valor que me de sea mayor que 1
			do {//Para que me de un valor entero
				s.nextLine();
				System.out.print("Tecle un entero (mayor que 1): ");
			}while(!s.hasNextInt());
			entero = s.nextInt();
		}while(entero <= 1);
		int resultado = entero;
		List<Integer> lista= new ArrayList<>();//Creo una lista
		int contador = 2;
		while(resultado != 1 ) {
			if(resultado % contador == 0) {
				//añado a la lista todos los números que por los que sea divisible el resultado
				lista.add(contador);
				resultado /= contador;
				contador=2;//si es divisible empezamos...
			}else {
				contador++;//si no es divisible contador sube 1
			}
		}
		//añado los números de la lista a un String para imprimirlos después
		String listaNueva="";
		for (int j=0;j<lista.size();j++) {
			if(j != lista.size() - 1)
				listaNueva += lista.get(j) + " x ";
			else{
				listaNueva += lista.get(j) + "";
			}
		}
		System.out.println("    Factores primos de " + entero + " = " + listaNueva);
	}
}
