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
		//Metodo para que ingresar la letra y comprobar si es valida
		public static String ingreseLetra(){
		        String laLetra;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Ingrese letra: ");
		        laLetra = sc.next();
		        while(laLetra.length()!= 1){
		                System.out.println("Ingrese letra: ");
		                laLetra = sc.next();
		        }
				while(Character.isLetter(laLetra.charAt(0)) == false){
					    System.out.println("Ingrese letra: ");
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
		//Metodo para iniciar el juego con "_"
		public static String[] InicioBlancos(String Secreto){
			String[] Avance = new String[Secreto.length()];
			for(int i = 0; i < Secreto.length(); i++){
				Avance[i] = "_";
			}
			return Avance;
		}
		//Metodo para actualiar lo mostrado
		public static String[] Actualizado(String[] Avance, String Secreto, String letra){
			String[] AvanceActualizado = new String[Avance.length];
			for(int i = 0; i < Secreto.length(); i++){
				if(letra.equals(Secreto.substring(i, i+1))){
					AvanceActualizado[i] = letra;
				}else{
					AvanceActualizado[i] = Avance[i];
				}
			}
			return AvanceActualizado;
		}
		public static void mostrarBlancosActualizados(String letra){
		        System.out.println("PROCESANDO.....");
		}
}