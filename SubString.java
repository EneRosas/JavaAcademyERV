import java.util.Scanner;

public class SubString{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese La Cadena");
		String  cadena = scanner.nextLine();
		String subCadena = "";
		int strLength = cadena.length();
		if (strLength < 2){
			System.out.println(cadena);
		} else {
			subCadena = cadena.substring(0,2);
			System.out.println(subCadena);
		}
	}
}