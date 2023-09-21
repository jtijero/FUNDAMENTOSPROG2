import java.util.*;
public class Ejercicio1 {
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		for (int i = 1; i <= 5 ; i++){
			String solda = sc.next();
			System.out.println("Nombre del soldado " + i +": " + solda);
		}
	}
}