import java.util.*;
public class Ejercicio5 {
	public static void main (String [] args){
		Random ran = new Random();
		int n = (int)(Math.random()*4) + 1;
		int m = (int)(Math.random()*4) + 1;
		String [] ejercitored = new String [n];
		String [] ejercitoblue = new String [m];
		iniciaEjer(ejercitored , n);
		iniciaEjer(ejercitoblue , m);
		System.out.println("Ejercito rojo: ");
		mostrarEjer(ejercitored);
		System.out.println("Ejercito azul: ");
		mostrarEjer(ejercitoblue);
		System.out.println("Ejercito ganador: ");
		mostrarEjergana(ejercitoblue,ejercitored);
	}
	public static String [] iniciaEjer(String [] solda, int n){
		for (int i = 0; i < n; i++){
			solda [i] = "Soldado " + i;
		}
		return solda;
	}
	public static void mostrarEjer(String [] solda){
		for (int i = 0; i < solda.length; i++){
			System.out.println(solda [i]);
		}
	}
	public static void mostrarEjergana (String [] solda1 , String [] solda2){
		if(solda1.length > solda2.length){
			System.out.println("Ejército rojo");
			mostrarEjer (solda1);
		} else if (solda1.length < solda2.length) {
			System.out.println("Ejército azul");
			mostrarEjer (solda2);
		} else {
			System.out.println("Empate");
		}
	}
}