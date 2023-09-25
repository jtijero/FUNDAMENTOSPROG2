import java.util.*;
public class Ahorcado{
  public static void main(String []args){
	String ahor0 = " +---+ \n"+
				   "     | \n" +
				   "     | \n" +
				   "     | \n" +
				   "     | \n" +
				   "     | \n" +
				   "=========";
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
				   "/|\\  | \n" +
				   "     | \n" +
				   "     | \n" +
				   "=========";
	
	String ahor6 = " +---+ \n" +
				   " |   | \n" +
				   " 0   | \n" +
				   "/|\\  | \n" +
				   "/    | \n" +
				   "     | \n" +
				   "=========";
	
	String ahor7 = " +---+ \n" +
				   " |   | \n" +
				   " 0   | \n" +
				   "/|\\  | \n" +
				   "/ \\  | \n" +
				   "     | \n" +
				   "=========";
    String[] figuras = {ahor0, ahor1, ahor2, ahor3, ahor4, ahor5, ahor6, ahor7};
    String letra;
    String[] palabras = {"programacion", "java", "identacion", "clases", "objetos", "desarrollador", "pruebas"};
    String palSecreta = getPalabraSecreta(palabras);
	int turnos = 0;

    System.out.println(figuras[0]);
    String[] blanco = blanco(palSecreta);
	mostrarBlancos(palSecreta);
    System.out.println("\n");

	int contador = 0;
    while(contador < 7){
    	letra = ingreseLetra();
    	if (letraEnPalabraSecreta(letra, palSecreta)){
			blanco = blancoActualizado(blanco, palSecreta, letra);
			System.out.println(figuras[contador]);
    		mostrarBlancosActualizados(blanco);
			turnos++;
    	}else{
    	  System.out.println(figuras[contador + 1]);
		  mostrarBlancosActualizados(blanco);
		  turnos++;
    	  contador = contador +1;
    	}
		if(palabraFormada(blanco, palSecreta).equals(palSecreta)){
			System.out.println("\nFelicidades" + "\n  USTED GANA" + "\nTurnos: " + turnos);
			break;
		}
		if(contador >= 7){
		  System.out.println("Has sido ahorcado" + "\n   GAME OVER  " + "\nTurnos: " + contador);
		  break;
		}
    	//COMPLETAR PARA INDICAR SI GANÓ, PERDIÓ Y CUANTOS TURNOS NECESITÓ
    }
    System.out.println("\n");
  }
  public static String getPalabraSecreta(String[] lasPalabras) {
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
	while(Character.isLetter(laLetra.charAt(0)) == false){
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

  public static String palabraFormada(String[] progreso, String palSecreta){
	String palabraActual = "";
	for(int i = 0; i < palSecreta.length(); i++){
	  palabraActual += progreso[i];
	}
	return palabraActual;
  }
}