import java.util.*;
class Ejercicio05 {
  public static void Ejercito1(String[] batallon1){
    for(int i = 0; i < batallon1.length; i++){
      System.out.println("Soldado inca");
    }
  }
  public static void Ejercito2(String[] batallon2){
    for(int i = 0; i < batallon2.length; i++){
      System.out.println("Soldado español");
    }
  }
  public static String ganador(String[] batallon1, String[] batallon2){
    String ganador = "";
    if(batallon1.length < batallon2.length){
      ganador = "Españoles";
    }else{
      if(batallon2.length < batallon1.length){
        ganador = "Incas";
      }else{
        ganador = "Empate";
      }
    }
    return ganador;
  }
  public static void main(String[] args){
    int numR = (int)(Math.random() * 5 + 1);
    String[] incas = new String[numR];
    int numR2 = (int)(Math.random() * 5 + 1);
    String[] españoles = new String[numR2];
    String vencedor = ganador(incas, españoles);
    Ejercito1(incas);
    Ejercito2(españoles);
    System.out.println("El ganador es: " + vencedor);
  }
}
