// Laboratorio Nro 2 - Ejercicio 1
// Primer avance
//Autor: Ramirez Ccahuana Max Edu
//Tiempo: -- minutos
import java.util.*;
public class Ejercicio02 {
  public static void main(String[] args){
    String ahor1 = " +---+ \n"+
                   " |   | \n" +
                   "     | \n" +
                   "     | \n" +
                   "     | \n" +
                   "     | \n" +
                   "========= ";
    String ahor2 = " +---+ \n"+
                   " |   | \n" +
                   " O   | \n" +
                   "     | \n" +
                   "     | \n" +
                   "     | \n" +
                   "========= ";
    String ahor3 = " +---+ \n"+
                   " |   | \n" +
                   " O   | \n" +
                   " |   | \n" +
                   "     | \n" +
                   "     | \n" +
                   "========= ";
    String ahor4 = " +---+ \n"+
                   " |   | \n" +
                   " O   | \n" +
                   "/|   | \n" +
                   "     | \n" +
                   "     | \n" +
                   "========= ";
    String ahor5 = " +---+ \n"+
                   " |   | \n" +
                   " O   | \n" +
                   "/|\\ | \n" +
                   "     | \n" +
                   "     | \n" +
                   "========= ";
    String ahor6 = " +---+ \n"+
                   " |   | \n" +
                   " O   | \n" +
                   "/|\\ | \n" +
                   "/    | \n" +
                   "     | \n" +
                   "========= ";
    String ahor7 = " +---+ \n"+
                   " |   | \n" +
                   " O   | \n" +
                   "/|\\ | \n" +
                   "/ \\ | \n" +
                   "     | \n" +
                   "========= ";
    String [] figuras = {ahor1,ahor2,ahor3,ahor4,ahor5,ahor6,ahor7};
    int contador = 1;
    String letra;
    String [] palabras = {"programacion", "java", "indentacion", "clases",
    "objetos", "desarrollador", "pruebas"};
    String palSecreta = getPalabraSecreta(palabras);
    System.out.println(figuras[0]);
    String progreso = mostrarBlancos(palSecreta);
    System.out.println("\n");
    //Aprovecharemos los metodos mostrarBlancos y mostrarBlancosActualizados para actualizar el String progreso
    while(contador <= 6 && !progreso.equals(palSecreta)){
      letra = ingreseLetra();
      if(letraEnPalabraSecreta(letra, palSecreta))
        progreso = mostrarBlancosActualizados(progreso, palSecreta, letra);
      else{
        System.out.println(figuras[contador]);
        contador++;
        imprimir(progreso);
      }
      System.out.println(progreso);
    }
    if(contador == 7)
      System.out.println(">>> GAME OVER :( <<<");
    else{
      System.out.println(">>> ¡CORRECTO! :) <<<" + 
                         "Lo lograste en " + contador + " turno(s)");
    }
    System.out.println("\n");
  }
  public static String getPalabraSecreta(String [] lasPalabras){
    String palSecreta;
    int ind;
    int indiceMayor = lasPalabras.length -1;
    int indiceMenor =0;
    ind = (int) (Math.random() * (indiceMayor - indiceMenor + 1) + indiceMenor);
    return lasPalabras[ind];
  }
  public static String mostrarBlancos(String palabra){
    String str = "";
    for(int i=0; i< palabra.length(); i++)
      str = str + "_";
    imprimir(str);
    return str;
  }
  public static String ingreseLetra(){
    String laLetra;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese letra: ");
    laLetra = sc.next();
    while(laLetra.length() != 1 && !letraValida(laLetra)){
      System.out.println("Ingrese letra: ");
      laLetra = sc.next();
    }
    return laLetra;
  }
  public static boolean letraEnPalabraSecreta(String letra, String palSecreta ){
    for(int i = 0; i < palSecreta.length(); i++){
      if(letra.equals(palSecreta.substring(i, i + 1)))
        return true;
    }
    return false;
  }
  public static String mostrarBlancosActualizados(String progreso, String palSecreta, String letra){
    System.out.println("PROCESANDO.....");
    String nProgreso = "";
    for(int i = 0; i < palSecreta.length(); i++){
      if(palSecreta.charAt(i) == letra.charAt(0)){
        nProgreso = nProgreso + letra;
      }else{
        nProgreso = nProgreso + progreso.charAt(i);
      }
    }
    imprimir(nProgreso);
    return nProgreso;
    
  }
  public static boolean letraValida(String laLetra){
    try{
      Integer.parseInt(laLetra);
    }catch(NumberFormatException ex){
      return true;
    }
    return false;
  }
  public static void imprimir(String str){
    for(int i = 0; i < str.length(); i++){
      System.out.print(str.charAt(i) + " ");
    }
    System.out.print("\n");
  }
}
