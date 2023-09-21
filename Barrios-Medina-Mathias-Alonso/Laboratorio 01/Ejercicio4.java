import java.util.*;
public class Ejercicio4 {
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		String [] nombre = new String [5];
		String [] nivevida = new String [5];
		for (int i = 0; i < 5 ; i++){
			System.out.println("Ingrese el nombre del soldado");
			nombre [i] = sc.next();
			System.out.println("Ingrese el nivel de vida: ");
			nivevida [i] = sc.next();
			System.out.println("Nombre del soldado: " + nombre [i]);
			System.out.println("Nivel de vida de " + nombre [i] + ": " + nivevida [i]);
		}
	}
}