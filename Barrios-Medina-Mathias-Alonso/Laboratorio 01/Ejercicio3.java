import java.util.*;
public class Ejercicio3 {
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		String [] nombre = new String [5];
		for (int i = 0; i < 5 ; i++){
			System.out.println("Ingrese el nombre del soldado");
			nombre [i] = sc.next();
			System.out.println("Nombre del soldado: " + nombre [i]);
		}
	}
}