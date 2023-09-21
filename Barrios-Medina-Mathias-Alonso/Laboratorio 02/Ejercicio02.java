// Version del ahorcado al 70%
//Laboratorio Nro 2 - Ejercicio2
// Autor: Mathias Barrios Medina
// Tiempo: 60 min
import java.util.Scanner;
public class Ejercicio02 {
		public static void main(String []args){
			String ahor1 = " +---+ \n"+
					       " | | \n" +
			               " | \n" +
			               " | \n" +
			               " | \n" +
			               " | \n" +
			               "========= ";
			String ahor2 = " +---+ \n"+
			               " | | \n"+
			               " O | \n"+
			               " | \n"+
			               " | \n"+
			               " | \n"+
			               "=========";
			String ahor3 = " +---+ \n"+
			               " | | \n"+
			               " O | \n"+
			               " | | \n"+
			               "   | \n"+
			               "   | \n"+
			               "=========";
			String ahor4 = " +---+ \n"+
			               " |   | \n"+
			               " O   | \n"+
			               " /|  | \n"+
			               "     | \n"+
			               "     | \n"+
						   "=========";
			String ahor5 = " +---+ \n"+
			               " |   | \n"+
			               " O   | \n"+
			               " /|\\| \n"+
			               "     | \n"+
			               "     | \n"+
			               "=========";
			String ahor6 = " +---+ \n"+
						   " |   | \n"+
						   " O   | \n"+
			               " /|\\| \n"+
			               "/    | \n"+
			               "     | \n"+
			               "=========";
			String ahor7 = " +---+ \n"+
			               " |   |   \n"+
			               " O   |   \n"+
			               " /|\\|   \n"+
			               " / \\|   \n"+
			               "     |   \n"+
			               "=========";
			String [] figuras = {ahor1, ahor2, ahor3,ahor4,ahor5,ahor6,ahor7};
			int contador = 0;
			int turnos = 0;
			int acierto = 0;
			String letra;
			String [] palabras = {"programacion", "java", "identacion", "clases",
			"objetos", "desarrollador", "pruebas"};
			String palSecreta = getPalabraSecreta(palabras);
			String [] array = new String [palSecreta.length()];			
			for (int i = 0; i < palSecreta.length(); i++){
				array [i] = "_ ";
			}
			System.out.println(figuras[0]);
			mostrarBlancos(palSecreta);
			System.out.println("\n");
			while(contador <= 6){
				letra = ingreseLetra();
				if (letraEnPalabraSecreta(letra, palSecreta)){
					mostrarBlancosActualizados(letra, palSecreta, array);
					acierto++;
				}
				else {
					System.out.println(figuras[contador]);
					contador = contador +1;
				}
				turnos++;
				if(acierto == palSecreta.length()){
						System.out.println("Ganó el juego en " + turnos);
						break;
				}
			}
			if (contador >6){
				System.out.println("Perdiste en: " + turnos);
			}
			System.out.println("\n");
		}
		public static String getPalabraSecreta(String [] lasPalabras){
			String palSecreta;
			int ind;
			int indiceMayor = lasPalabras.length -1;
			int indiceMenor =0;
			ind = (int) ((Math.random() * (indiceMayor - indiceMenor + 1) + indiceMenor));
			return lasPalabras[ind];
		}
		public static void mostrarBlancos(String palabra){
			for(int i=0; i< palabra.length(); i++)
			System.out.print("_ " );

		}
		public static String ingreseLetra(){
			String laLetra;
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese letra: ");
			laLetra = sc.next();
			char Letra = laLetra.charAt(0);
			while(laLetra.length()!= 1  || Letra < 97 || Letra > 122){
				System.out.println("Ingrese letra: ");
				laLetra = sc.next();				
			}
			return laLetra;
		}
		public static boolean letraEnPalabraSecreta(String letra, String palSecreta ){
			for (int i = 0; i < palSecreta.length() ; i++){
				if (letra.equals(palSecreta.substring(i,i+1))){
					return true;
				}
			}
			return false;
		}
		public static void mostrarBlancosActualizados(String letra, String palSecreta, String[] str){
			System.out.println("PROCESANDO.....");
			for (int i = 0; i < palSecreta.length(); i++){
				if (letra.equals(palSecreta.substring(i,i+1))){
					str [i] = letra;
				}
				System.out.print(str [i]);
			}
			System.out.println();
		}
}
