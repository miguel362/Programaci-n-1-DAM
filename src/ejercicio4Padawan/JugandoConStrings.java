package ejercicio4Padawan;

import javax.swing.JOptionPane;

public class JugandoConStrings {

	public static void main(String[] args) {
		String userName = JOptionPane.showInputDialog("Nombre de usuario:");
		String passWord = JOptionPane.showInputDialog("Password:");
		String validaClave="";
		//Compruebo que el usuario no es admin
		if(userName.toLowerCase().equals("admin")) {//Tanto en mayúsculas como en minúsculas
			validaClave = "El usuario \"admin\" no se puede utilizar.\n";
			System.out.print(validaClave);
		}
		//Compruebo que el usuario no empieza con un número
		if(userName.charAt(0)=='0' || userName.charAt(0)=='1' || userName.charAt(0)=='2' || userName.charAt(0)=='3' 
			|| userName.charAt(0)=='4' || userName.charAt(0)=='5' || userName.charAt(0)=='6' 
			|| userName.charAt(0)=='7'|| userName.charAt(0)=='8' || userName.charAt(0)=='9'){
			validaClave = "El nombre de usuario debe comenzar por letra.\n";	
			System.out.print(validaClave);
		}
		//Compruebo si el Password tiene un mínimo de 8 caracteres de longitud 
		if(passWord.length() < 8) {
			validaClave = "El password debe tener un mínimo de 8 caracteres.\n";
			System.out.print(validaClave);
		}
		
		//Compruebo si el Password tiene alguna letra minúscula
		boolean minusculas = false;//en principio supongo que no pone minúsculas.
		for(int i = 0;i < passWord.length();i++) {
			if(passWord.charAt(i) == passWord.toLowerCase().charAt(i)) {//si hay alguna minúscula..
				minusculas = true;
				break;//Cuando veo la primera minúscula ya puedo salir.
			}
		}
		if(minusculas == false) {//Si no hay minúsculas
			validaClave = "El password debe tener una letra minúscula.\n";
			System.out.print(validaClave);
		}
		
		//Compruebo si el Password tiene alguna letra mayúscula
		boolean mayusculas = false;
		for(int i = 0;i < passWord.length();i++) {
			if(passWord.charAt(i) == passWord.toUpperCase().charAt(i)) {
				mayusculas = true;
				break;
			}
		}
		if(mayusculas == false) {
			validaClave = "El password debe tener una letra mayúscula.\n";
			System.out.print(validaClave);
		}
		
		//Compruebo si el Password tiene al menos un símbolo de estos(._@)
		boolean caracter = false;
		for(int i = 0;i < passWord.length();i++) {
			if(passWord.charAt(i) == '.' || passWord.charAt(i) == '_' || passWord.charAt(i) == '@') {
				caracter = true;
				break;
			}
		}
		if(caracter == false) {
			validaClave = "El password debe tener al menos un símbolo\"._@\".\n";
			System.out.print(validaClave);
		}
	}
}