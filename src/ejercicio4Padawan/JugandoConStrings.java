package ejercicio4Padawan;

import java.util.Scanner;

//import javax.swing.JOptionPane;

/**
 *
 *Define tres variables de tipo String, una llamada USERNAME, otra PASSWORD y otra VALIDACLAVE
(sigue las convenciones de nomenclatura de identificadores en el programa Java). Pregunta las
dos primeras al usuario y a la tercera la inicializas a la cadena vacía. Debes conseguir que:
• Si el usuario tecleado por el usuario coincide con "admin", añade a validaclave "El usuario
"admin" no se puede utilizar" (las dobles comillas deben aparecer en el mensaje) y un salto
de línea. De lo contrario añades la cadena vacía (dobles comillas sin nada dentro).
• Ahora comprueba que el usuario no comience por número, si lo hace añade a validaclave
"El nombre de usuario debe comenzar por letra" y un salto de línea.
• Luego comprueba si el password tiene al menos 8 caracteres de longitud, sino, añades a la
cadena validaclave "Password debe tener un mínimo de 8 caracteres" y un salto de línea.
• Ahora comprueba que tenga al menos una minúscula. Si no es así, añade a validaclave la
cadena "El password debe tener una letra minúscula" y un salto de línea.
• Ahora comprueba que tenga al menos una mayúscula. Si no es así añade a la cadena
validaclave la cadena "El password debe tener una letra mayúscula" y un salto de línea.
• Como última comprobación, chequea que tenga al menos una letra "." o "_" o "@". Si no es
así añade a la cadena validaclave la cadena "El password debe tener al menos un símbolo
"._@"" (las comillas dobles deben aparecer en el mensaje por pantalla) y un salto de línea
 */

public class JugandoConStrings {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		/*String userName = JOptionPane.showInputDialog("Nombre de usuario:");
		String passWord = JOptionPane.showInputDialog("Password:");*/
		System.out.print("Nombre de usuario: ");
		String userName = s.nextLine();
		System.out.print("Password: ");
		String passWord = s.nextLine();
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