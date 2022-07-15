package Ejercicio7Jedi;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/*Enunciado: Escribe dos funciones llamadas fibo() y fibo_recur() que acepten de parámetro un número
entero n y devuelvan el n-ésimo término (siendo n un número entero mayor o igual a 0) de la
serie de Fibonacci.*/

public class Fibonacci {

	public static void main(String[] args) {
		int numero=-1;
		do {
			try {//Utilizo un try-catch por si no indica un número
				numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un número mayor ó igual a 0"));
			}catch(NumberFormatException e) {
				System.out.println("Escribe un número por favor...");
			}
		}while(numero < 0);

		System.out.println("No recursivo: F" + numero + "= " + fibo(numero));
		System.out.println("Recursivo: F" + numero + "= " + fibo_recur(numero));
	}

	public static int fibo(int n) {
		int contador=2;//Empiza a contar desde 2 porque los valores de 0 y 1 ya los tenemos. 
		int n1=0;
		int n2=1;
		int resultado=0;
		if(n==0) return 0;
		else if(n==1) return 1; 
		else {
			while(contador<=n) {//mientras el valor de la variable contador sea menor o igual a n....
				resultado=n1+n2;
				//colocamos los nuevos valores en n1 y n2
				n1=n2;
				n2=resultado;
				contador++;
			}
		}
		return resultado;
	}
	public static int fibo_recur(int n) {
		if(n==0) return 0;
		else if(n==1) return 1;
		else return fibo_recur(n-1) + fibo_recur(n-2);
	}
}
