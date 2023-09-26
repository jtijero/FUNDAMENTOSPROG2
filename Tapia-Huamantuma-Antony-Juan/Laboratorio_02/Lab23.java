//Laboratorio N° 2 Ejercicio_01
//Proyecto: Juego del ahorcado
//Autor: Tapia Huamantuna, Antony Juan
//Colaboro: Mara Mamani, Donny Moises
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
		String letra;
		String [] palabras = {"programacion", "java", "identacion", "clases",
		                              "objetos", "desarrollador", "pruebas"};
		String palSecreta = getPalabraSecreta(palabras);
		int turnos = 0;

		System.out.println(figuras[0]);
		String[] blanco = InicioBlancos(palSecreta);
		mostrarBlancos(palSecreta);
		System.out.println("\n");
	
		int contador = 0;
		while(contador < 7){
			letra = ingreseLetra();
			if (letraEnPalabraSecreta(letra, palSecreta)){
				if(Comprobarsilaletrafueañadida(letra, blanco)){ 
				  System.out.println(figuras[contador + 1]); 
				  mostrarBlancosActualizados(blanco);
				  turnos++;
				  contador = contador +1;
				}else{
				  blanco = Actualizado(blanco, palSecreta, letra);
				  System.out.println(figuras[contador]);
				  mostrarBlancosActualizados(blanco);
				  turnos++;
				}  
			}else{
			  System.out.println(figuras[contador + 1]);
			  mostrarBlancosActualizados(blanco);
			  turnos++;
			  contador = contador +1;
			}
			if(palabraFormada(blanco, palSecreta).equals(palSecreta)){
				System.out.println("\nFelicidades" + "\ngano" + "\nTurnos: " + turnos);
				break;
			}
			if(contador >= 7){
			  System.out.println("Has sido ahorcado" + "\n   perdiste  " + "\nTurnos: " + contador);
			  break;
			}
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
		//Metodo para que ingresar la letra y comprobar si es valida
		public static String ingreseLetra(){
		        String laLetra;
		        Scanner sc = new Scanner(System.in);
				System.out.println();
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
		//Metodo para imprimir el avance actualizado
		public static void mostrarBlancosActualizados(String[] Avance){
			for(int i = 0; i < Avance.length; i++){
				System.out.print(" " + Avance[i]);
			}
		}
		//Metodo para ver el avance
		public static String palabraFormada(String[] Avance, String Secreto){
			String palabraActual = "";
			for(int i = 0; i < Secreto.length(); i++){
			  palabraActual += Avance[i];
			}
			return palabraActual;
		}
		//Metodo para comprobar si la letra fue añadida
		public static boolean Comprobarsilaletrafueañadida(String letra, String[] Avance){
			for(int i = 0; i < Avance.length; i++){
			  if(letra.equals(Avance[i])){
				return true;
			  }
			}
			return false;
		}
}