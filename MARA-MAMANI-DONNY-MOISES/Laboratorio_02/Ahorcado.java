import java.util.*;
public class Ahorcado{
  public static void main(String []args){
    String ahor1 = " +---+ \n"+
				   " |   | \n" +
				   "     | \n" +
				   "     | \n" +
				   "     | \n" +
				   "     | \n" +
				   "=========";
    
	String ahor2 = " +---+ \n" +
				   " |   | \n" +
				   " O   | \n" +
				   "     | \n" +
				   "     | \n" +
				   "     | \n" +
				   "=========";
	
	String ahor3 = " +---+ \n" +
				   " |   | \n" +
				   " O   | \n" +
				   " |   | \n" +
				   "     | \n" +
				   "     | \n" +
				   "=========";
	
	String ahor4 = " +---+ \n" +
	  			   " |   | \n" +
				   " 0   | \n" +
				   "/|   | \n" +
				   "     | \n" +
				   "     | \n" +
				   "=========";
	
	String ahor5 = " +---+ \n" +
				   " |   | \n" +
				   " 0   | \n" +
				   "/|\\| \n" +
				   "     | \n" +
				   "     | \n" +
				   "=========";
	
	String ahor6 = " +---+ \n" +
				   " |   | \n" +
				   " 0   | \n" +
				   "/|\\| \n" +
				   "/    | \n" +
				   "     | \n" +
				   "=========";
	
	String ahor7 = " +---+ \n" +
				   " |   | \n" +
				   " 0   | \n" +
				   "/|\\| \n" +
				   "/ \\| \n" +
				   "     | \n" +
				   "=========";
    String[] figuras = {ahor1, ahor2, ahor3, ahor4, ahor5, ahor6, ahor7};
    int contador = 1;
    String letra;
    String[] palabras = {"programacion", "java", "identacion", "clases", "objetos", "desarrollador", "pruebas"};
    String palSecreta = getPalabraSecreta(palabras);
    System.out.println(figuras[0]);
    String[] blanco = blanco(palSecreta);
	mostrarBlancos(palSecreta);
    System.out.println("\n");
    while(contador <= 6){
    	letra = ingreseLetra();
    	if (letraEnPalabraSecreta(letra, palSecreta)){
			blanco = blancoActualizado(blanco, palSecreta, letra);
			System.out.println(figuras[contador]);
    		mostrarBlancosActualizados(blanco);
    	}else{
    	  System.out.println(figuras[contador]);
		  mostrarBlancosActualizados(blanco);
    	  contador = contador +1;
    	}
    	//COMPLETAR PARA INDICAR SI GANÓ, PERDIÓ Y CUANTOS TURNOS NECESITÓ
    }
    System.out.println("\n");
  }
  public static String getPalabraSecreta(String[] lasPalabras) {
	String palSecreta;
	int ind;
	int indiceMayor = lasPalabras.length - 1;
	int indiceMenor = 0;
	ind = (int)(Math.random() * (indiceMayor - indiceMenor + 1) + indiceMenor);
	return lasPalabras[ind];
  }
  public static void mostrarBlancos(String palabra){
	for(int i = 0; i < palabra.length(); i++) {
	  System.out.print("_" + " ");
	}
  }
  public static String ingreseLetra() {
    String laLetra;
    Scanner sc = new Scanner(System.in);
	System.out.println();
    System.out.println("Ingrese letra: ");
    laLetra = sc.next();
    while(laLetra.length() != 1) {
      System.out.println("ingrese letra: ");
      laLetra = sc.next();
    }
    return laLetra;
  }
  
  public static boolean letraEnPalabraSecreta(String letra, String palSecreta) {
    //COMPLETAR
	for(int i = 0; i < palSecreta.length(); i++){
	  if(letra.equals(palSecreta.substring(i, i + 1))){
		return true;
	  }
	}
	return false;
  }

  public static String[] blanco(String palSecreta){
	String[] progreso = new String[palSecreta.length()];
	for(int i = 0; i < progreso.length; i++){
	  progreso[i] = "_";
	}
	return progreso;
  }

  public static String[] blancoActualizado(String[] progreso, String palSecreta, String letra){
	String[] progresoActualizado = new String[progreso.length];
	for(int i = 0; i < palSecreta.length(); i++){
	  if(letra.equals(palSecreta.substring(i, i + 1))){
		progresoActualizado[i] = letra;
	  }else{
		progresoActualizado[i] = progreso[i];
	  }
	}
	return progresoActualizado;
  }

  public static void mostrarBlancosActualizados(String[] progreso) {
	//COMPLETAR
	for(int i = 0; i < progreso.length; i++){
	  System.out.print(" " + progreso[i]);
	}
  }
}