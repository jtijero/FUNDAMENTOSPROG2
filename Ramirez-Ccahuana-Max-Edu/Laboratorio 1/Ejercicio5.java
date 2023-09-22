//Laboratorio Nro 1 - Ejercicio5
//Autor: Ramirez Ccahuana Max Edú
//Tiempo: 20 minutos
import java.util.*;
class Ejercicio5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    String[] ejercito1 = new String[rand.nextInt(5) + 1];
    String[] ejercito2 = new String[rand.nextInt(5) + 1];
    
    inicializar(ejercito1);
    inicializar(ejercito2);
    mostrar(ejercito1, "1");
    mostrar(ejercito2, "2");
    System.out.println(ganador(ejercito1, ejercito2));
  }
  public static void inicializar(String[] ejercito){
    for(int i = 0; i < ejercito.length; i++){
      ejercito[i] = "Soldado" + (i + 1);
    }
  }
  public static void mostrar(String[] ejercito, String num){
    System.out.println("> Integrantes del ejército " + num + ":");
    for(int i = 0; i < ejercito.length; i++){
      System.out.println((i + 1) + ". " + ejercito[i]);
    }
  }
  public static String ganador(String[] ejercito1, String[] ejercito2){
    if(ejercito1.length > ejercito2.length){
      return "> El ganador es el ejército 1";
    }
    if(ejercito1.length < ejercito2.length){
      return "> El ganador es el ejército 2";
    }
    return "> Empate";
  }
}
