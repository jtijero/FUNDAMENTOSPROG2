import java.util.*;
public class Ejercicio2 {
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		for (int i = 1; i <= 5 ; i++){
			System.out.println("Ingrese el nombre del soldado");
			String solda = sc.next();
			System.out.println("Ingrese el nivel de vida: ");
			String nivevida = sc.next();
			System.out.println("Nombre del soldado " + i +": " + solda);
			System.out.println("Nivel de vida de " + solda + ": " + nivevida);
		}
	}
}