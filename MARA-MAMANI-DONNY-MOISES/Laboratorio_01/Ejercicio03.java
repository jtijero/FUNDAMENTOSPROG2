import java.util.*;
class Ejercicio03 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] soldados = new String[5];
    System.out.println("\nIngrese el nombre de sus soldados: \n");
    for(int i = 0; i < 5; i++){
      soldados[i] = sc.next();
    }
    System.out.println("\nEjercito: \n");
    for(int i = 0; i < 5; i++){
      System.out.println(soldados[i]);
    }
  }
}
