package Lab2;
import java.util.Scanner;
public class Lab23 {
	public static void main(String []args){
		String ahor1 = " +---+  \n"+
		               " |   |  \n" +
		               "     |  \n" +
		               "     |  \n" +
		               "     |  \n" +
		               "     |  \n" +
		               "========= ";
		String ahor2 = " +---+  \n"+
                       " |   |  \n"+
                       " O   |  \n"+
                       "     |  \n"+
                       "     |  \n"+
                       "     |  \n"+
                       "========= ";
		String ahor3 = " +---+  \n"+
		               " |   |  \n"+
		               " O   |  \n"+
		               " |   |  \n"+
		               "     |  \n"+
		               "     |  \n"+
		               "========= ";
		String ahor4 = "  +---+ \n"+
				       "  |   | \n"+
				       "  O   | \n"+
				       " /|   | \n"+
				       "      | \n"+
				       "      | \n"+
				       "========= ";
		String ahor5 = "  +---+ \n"+
			           "  |   | \n"+
			           "  O   | \n"+
			           " /|\\  | \n"+
			           "      | \n"+
			           "      | \n"+
			           "========= ";
		String ahor6 = "  +---+ \n"+
		               "  |   | \n"+
		               "  O   | \n"+
		               " /|\\  | \n"+
		               " /    | \n"+
		               "      | \n"+
		               "========= ";
		String ahor7 = "  +---+ \n"+
	                   "  |   | \n"+
	                   "  O   | \n"+
	                   " /|\\  | \n"+
	                   " / \\  | \n"+
	                   "      | \n"+
	                   "========= ";
		String [] figuras = {ahor1, ahor2, ahor3,ahor4,ahor5,ahor6,ahor7};
		int contador = 1;
		String letra;
		String [] palabras = {"programacion", "java", "identacion", "clases",
		                              "objetos", "desarrollador", "pruebas"};
		String palSecreta = getPalabraSecreta(palabras);
		System.out.println(figuras[0]);
		mostrarBlancos(palSecreta);
		System.out.println("\n");
		
		while(contador <= 6){
		        letra = ingreseLetra();
		        if (letraEnPalabraSecreta(letra, palSecreta))
		                mostrarBlancosActualizados(letra);
		        else
		                System.out.println(figuras[contador]);
		        
		        contador = contador +1;
		}
		//COMPLETAR PARA INDICAR SI GANÓ, PERDIÓ Y CUÁNTOS TURNOS NECESITÓ
		
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
		        while(laLetra.length()!= 1){
		                System.out.println("Ingrese letra: "); //COMPLETAR PARA VALIDAR CARACTERES PERMITIDOS
		                laLetra = sc.next();
		        }
		        return laLetra;
		}
		//Metodo para conmprobar si la letra esta en la palabra
		public static boolean letraEnPalabraSecreta(String letra, String palSecreta ){
		        for(int i = 0; i < palSecreta.length(); i++){
					if(letra.equals(palSecreta.substring(i, i + 1))){
						return true;
					}
				}
		        return false;
	    }
		public static void mostrarBlancosActualizados(String letra){
		        //COMPLETAR
		        System.out.println("PROCESANDO.....");
		}
}