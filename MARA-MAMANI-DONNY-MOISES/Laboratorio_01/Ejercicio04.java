import java.util.*;
class Ejercicio04 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] soldados = new String[5];
    System.out.println("\nIngrese los Nombres de sus soldados:\n");
    for(int i = 0; i < 5; i++){
      soldados[i] = sc.next();
    }
    int[] vida = new int[5];
    System.out.println("\nIngrese el porcentaje de vida\n");
    for(int i = 0; i < 5; i++){
      vida[i] = sc.nextInt();
    }
    System.out.println("\nEjercito\n");
    for(int i = 0; i < 5; i++){
      System.out.println(soldados[i] + " --> HP " + vida[i]);
    }
  }    
}
