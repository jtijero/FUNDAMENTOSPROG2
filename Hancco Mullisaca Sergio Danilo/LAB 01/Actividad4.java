import java.util.*;
public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String [] soldados = new String [5];
    		double [] vida = new double [5];
    	
    		for (int i = 0 ; i < 5 ; i++) {
    			System.out.println("Escriba el nombre de los soldados: " );
    			soldados [i] = sc.nextLine();
    			System.out.print("Ingrese el nivel de vida: ");
        		vida [i] = sc.nextDouble();
        		sc.nextLine();
    		}

    		System.out.println("La lista de soldados es: " );
    		for (int i = 0 ; i < 5 ; i++) {
    			System.out.println("Soldado: " + soldados[i] + " y su vida es " + vida[i]);
    		}

	}

}
