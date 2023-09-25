// Laboratorio Nro02 - Ejercicio01
// Autor. Rafael Diego Nina Calizaya
// Colaboro : ---
// Tiempo : 120 min

import java.util.Scanner;
public class Ejercicio01 {
	public static void main(String []args){

		String ahor1 = "  +---+  \n"+
	  		       "  |   |  \n" +
		           "      |  \n" +
	  		       "      |  \n" +
	  		       "      |  \n" +
		           "      |  \n" +
			       "========= ";

		String ahor2 = "  +---+  \n"+
	  		       "  |   |  \n" +
		           "  O   |  \n" +
	  		       "      |  \n" +
	  		       "      |  \n" +
	  		       "      |  \n" +
			       "========= ";

		String ahor3 = "  +---+  \n"+
	  		       "  |   |  \n" +
		           "  O   |  \n" +
	  		       "  |   |  \n" +
	  		       "      |  \n" +
	  		       "      |  \n" +
			       "========= ";

		String ahor4 = "  +---+  \n"+
	  		       "  |   |  \n" +
		           "  O   |  \n" +
	  		       " /|   |  \n" +
	  		       "      |  \n" +
	  		       "      |  \n" +
			       "========= ";

		String ahor5 = "  +---+  \n"+
	  		       "  |   |  \n" +
		           "  O   |  \n" +
	  		       " /|\\  |  \n" +
	  		       "      |  \n" +
	  		       "      |  \n" +
			       "========= ";
		
		String ahor6 = "  +---+  \n"+
	  		       "  |   |  \n" +
		           "  O   |  \n" +
	  		       " /|\\  |  \n" +
	  		       " /    |  \n" +
	  		       "      |  \n" +
			       "========= ";
		
		String ahor7 = 	"  +---+  \n"+
	  		    		"  |   |  \n" +
		           	    "  O   |  \n" +
	  		   	   		" /|\\  |  \n" +
	  		    	    " / \\  |  \n" +
						"      |  \n" +
						"========= ";


		String [] figuras = {ahor1, ahor2, ahor3, ahor4, ahor5, ahor6, ahor7};
		int[] contador = {1,1};
		String letra;
		String [] palabras = {"programacion", "java", "identacion", "clases",
		"objetos", "desarrollador", "pruebas"};
		String palSecreta = getPalabraSecreta(palabras);
		//
		String[] palActual = new String[palSecreta.length()]; 
		//
	
		System.out.println(figuras[0]);
		mostrarBlancos(palSecreta);
		System.out.println("\n");
		
		while(contador[0] <= 6 && contador[1] <= palSecreta.length()) {
			letra = ingreseLetra();
			if (letraEnPalabraSecreta(letra, palSecreta)) {
				palActual = getPalSecretaActualizada(letra, palSecreta, palActual);
				mostrarBlancosActualizados(palActual, letra);
				contador[1] += getLetrasObtenidas(letra, palSecreta);
			}				
			else {
				System.out.println(figuras[contador[0]]);
				contador[0] ++;
			}
		}

		if(contador[0] > 6) {
			System.out.println("Usted PERDIO");
		} else {
			System.out.println("Usted GANO\t" + "Turnos necesarios: " + (contador[0] + contador[1] - 3));
		}

		System.out.println("\n");
	}


	
	public static String getPalabraSecreta(String [] lasPalabras){
		String palSecreta;
		int ind;
		int indiceMayor = lasPalabras.length - 1;
		int indiceMenor = 0;
		ind = (int) ((Math.random() * (indiceMayor - indiceMenor + 1) + indiceMenor));
		return lasPalabras[ind];
	}



	public static void mostrarBlancos(String palabra){
		for (int i=0; i< palabra.length(); i++)
			System.out.print("_ " );
	}



	public static String ingreseLetra(){
		String laLetra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese letra: ");
		laLetra = sc.next();
		while(laLetra.length()!= 1){
			System.out.println("Ingrese solo 1 letra: ");
			laLetra = sc.next();
		}
		return laLetra;
	}



	public static boolean letraEnPalabraSecreta(String letra, String palSecreta ){
		int contador = 0;
		char letraChar = letra.charAt(0);
		for (int i = 0; i < palSecreta.length(); i++) {
			if(letraChar == palSecreta.charAt(i))
				contador ++;
		}
		if (contador != 0) return true;
		return false;
	}

	public static int getLetrasObtenidas(String letra, String palSecreta) {
		int contador = 0;
		for(int i = 0; i < palSecreta.length(); i++)	
			if(letra.charAt(0) == palSecreta.charAt(i))
				contador ++;
		return contador;
	}
	
	public static String[] getPalSecretaActualizada (String letra, String palSecreta, String[] palActual) {
		String[] palActual2 = new String[palSecreta.length()];
		palActual2 = palActual;
		for(int i = 0; i < palSecreta.length(); i++)	
			if(letra.charAt(0) == palSecreta.charAt(i))
				palActual2[i] = letra;
		return palActual2;
	}


	public static void mostrarBlancosActualizados(String[] palActual, String letra){
		for(int i = 0; i < palActual.length; i++)	
			if(palActual[i] != null)
				System.out.print(palActual[i] + " ");
			else
				System.out.print("_ ");
		System.out.println("");
	}
}