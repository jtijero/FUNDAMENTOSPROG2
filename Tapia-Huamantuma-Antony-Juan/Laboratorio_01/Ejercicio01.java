package tarea130923;
import java.util.*;
public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre del Soldado1: ");
		String Soldado1 = sc.next();
		System.out.println("Ingrese el nombre del Soldado2: ");
		String Soldado2 = sc.next();
		System.out.println("Ingrese el nombre del Soldado3: ");
		String Soldado3 = sc.next();
		System.out.println("Ingrese el nombre del Soldado4: ");
		String Soldado4 = sc.next();
		System.out.println("Ingrese el nombre del Soldado5: ");
		String Soldado5 = sc.next();
		System.out.println("Los soldados son: " + "\n" + Soldado1 + "\n" + Soldado2 + "\n"
		                   + Soldado3 + "\n" + Soldado4 + "\n" + Soldado5);
	}
}