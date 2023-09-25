package tarea130923;
import java.util.*;
public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] Soldados = new String[5];
		for(int i = 0; i < 5; i++) {
			System.out.println("Ingrese el nombre del Soldado" + (i + 1) + ":");
			Soldados[i] = sc.next();
		}
		for(int j = 0; j < 5; j++) {
			System.out.println("El nombre del Soldado" + (j + 1) + " es: " + Soldados[j]);
		}
	}
}