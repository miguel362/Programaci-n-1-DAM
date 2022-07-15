package ejercicio8Jedi;

import java.util.Scanner;

/*Leer un nº entero repetidamente hasta que sea mayor de 1 y mostrar todos los números
menores o iguales que él y que lo dividen e indicar cuantos de ellos tiene. El algoritmo debe
verificar el dato.*/
public class Divisores {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("    CALCULA DIVISORES DE UN ENTERO\n    ******************************");
		System.out.println();
		System.out.println("Empecemos....pulsa enter para continuar...");
		int numero;
		do {//Mientras el valor sea menor de 1
			do {//Mientras no ponga un valor de tipo entero.
				s.nextLine();
				System.out.print("Tecle un entero (mayor o igual que 1): ");
			}while(!s.hasNextInt());
			numero = s.nextInt();
		}while(numero < 1);
		
		divisores(numero);//Llamo al método
	}
	
	public static void divisores(int num) {
		String resultado="";//Este String guarda los valores divisibles
		int contador=0;//Para guardar cuantos divisores hay.
		for(int i=1;i<=num;i++) {
			if(num % i == 0) {//Si es así es divisible
				if (num == i) {//Para que no imprima la coma después del último valor
					resultado += i;
					contador++;
				}else {
					resultado += i + ", "; 
					contador++;
				}
			}
		}
		System.out.println("  Divisores de " + num + " = " + resultado + "\n  En total tiene " + contador + " divisores.");
	}
}
