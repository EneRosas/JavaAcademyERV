import java.util.Scanner;

public class Calificaciones{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese La calificacion");
		int calificacion = scanner.nextInt();
		
		if(calificacion >= 0 && calificacion<= 4){
			System.out.println("Suspenso");
		} else if (calificacion == 5){
			System.out.println("Aprobado");
		} else if(calificacion == 6){
			System.out.println("Bien");
		} else if(calificacion >= 7 && calificacion<= 8){
			System.out.println("Notable");
		} else if(calificacion >= 9 && calificacion<= 10){
			System.out.println("Notable");
		}
		
	}
}