import java.util.*;
public class Actividad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String [] army1 = new String [(int)(Math.random()* 5 ) + 1];
        	String [] army2 = new String [(int)(Math.random()* 5 ) + 1];

        	System.out.println("La lista de soldados del ejercito 1 es :");
        	for ( int i = 0 ; i < army1.length ; i ++){
                	System.out.println("Soldado" + i);
        	}
        	System.out.println("La lista de soldados del ejercito 2 es :");
        	for ( int i = 0 ; i < army2.length ; i ++){
                	System.out.println("Soldado" + i);
       		}

        	if (army1.length < army2.length){
            		System.out.println("Resultado: El ejercito numero 2 ");
       		}else if (army1.length == army2.length){
        		System.out.println("Resultado: Empate");
       		}else {
            		System.out.println("Resultado: El ejercito numero 1 ");
        	}

	}

}
