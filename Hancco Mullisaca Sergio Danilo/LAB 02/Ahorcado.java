import java.util.*;
public class Ahorcado{
	public static void main(String []args){
		String ahor1 = " +---+ \n"+
				" | | \n" +
			   	  " | \n" +
				  " | \n" +
				  " | \n" +
				  " | \n" +
			      "=========";

		String ahor2 = " +---+ \n" +
				" | | \n" +
				" O | \n" +
			   	  " | \n" +
			          " | \n" +
				  " | \n" +
             		      "=========";
		
		String ahor3 = " +---+ \n" +
			        " | | \n" +
				" O | \n" +
				" | | \n" +
				  " | \n" +
				  " | \n" +
			      "=========" ;
		String ahor4 = " +---+\n" + 
				" | | \n" +
				" O | \n" +
			       " /| | \n"+
			          " | \n" +
			          " | \n" +
			      "=========" ;
		String ahor5 = " +---+ \n" +
				" |  | \n" +
				" O  | \n" +
			       " /|\\| \n" +
			          "  | \n" +
				  "  | \n" +
			       "=========" ;
		String ahor6 = " +---+ \n" +
				" |  | \n" +
				" O  | \n" +
			       " /|\\| \n" +
			      "  /   | \n" +
			       "     | \n" +
			       "=========" ;
		String ahor7 = " +---+ \n" +
				" |  | \n" +
				" O  | \n" +
				"/|\\|\n"+
				 "/\\|\n" +
				   " |\n"+
			       "=========";
		
		String [] figuras = {ahor1, ahor2, ahor3,ahor4,ahor5,ahor6,ahor7};
		int contador = 0;
		String letra;
		String [] palabras = {"programacion", "java", "identacion", "clases",
		"objetos", "desarrollador", "pruebas"};

		String palSecreta = getPalabraSecreta(palabras);
		
		char[] espacios = new char[palSecreta.length()];
        for (int i = 0; i < espacios.length; i++) {
            espacios[i] = '_';
        }
        
		System.out.println(figuras[contador]);
		mostrarBlancos(espacios);
		System.out.println("\n");
		
		while(contador < 6){
			letra = ingreseLetra();
			boolean acierto = letraEnPalabraSecreta(letra, palSecreta, espacios);
            if (acierto) {
                mostrarBlancosActualizados(espacios);
                if (!String.valueOf(espacios).contains("_")) {
                    System.out.println("Tristemente ganaste");
                    break;
                }
            } else {
                contador++;
                System.out.println(figuras[contador]);
                System.out.println("Turnos restantes: " + (6 - contador));
                if (contador == 6) {
                    System.out.println("Una penaaaa Perdiste, la letra que no encontraste era" + palSecreta);
                    break;
                }
            }
        }
    }
	
	public static String getPalabraSecreta(String [] lasPalabras){
		String palSecreta;
		int ind;
		int indiceMayor = lasPalabras.length -1;
		int indiceMenor = 0 ;
		ind = (int) ((Math.random() * (indiceMayor - indiceMenor + 1) + indiceMenor));
		return lasPalabras[ind];
	}
	
	public static void mostrarBlancos(char [] espacios){
		for (char espacio : espacios) {
            System.out.print(espacio + " ");
        }
	}
	
	public static String ingreseLetra(){
		String laLetra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese letra: ");
		while (true) {
            laLetra = sc.next();
            if (laLetra.length() == 1 && Character.isLetter(laLetra.charAt(0))) {
                break;
            } else {
                System.out.println("Entrada no válida. Debe ingresar una sola letra.");
            }
        }
        return laLetra;
    }
	
	public static boolean letraEnPalabraSecreta(String letra, String palabraSecreta, char [] espacios) {
		boolean acierto = false; 
		for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra.charAt(0)) {
                espacios[i] = letra.charAt(0);
                acierto = true;
            }
        }
        return acierto;
    }
	
	public static void mostrarBlancosActualizados(char[] espacios){
		
		System.out.println("PROCESANDO.....");
		 for (char espacio : espacios) {
	            System.out.print(espacio + " ");
	        }
	}
	
}

	
