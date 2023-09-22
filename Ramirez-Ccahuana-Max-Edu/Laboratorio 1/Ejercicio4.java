//Laboratorio Nro 1 - Ejercicio4
//Autor: Ramirez Ccahuana Max Edú
//Tiempo: 10 minutos
import java.util.*;
class Ejercicio4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] soldados = new String[5];
    int[] vidas = new int[5];
    for(int i = 0; i < 5; i++){
      System.out.println("Ingrese el nombre y vida del soldado " + (i + 1) + ":");
      soldados[i] = sc.next();
      vidas[i] = sc.nextInt();
    }
    System.out.println("Los nombres y vidas de los soldados son: ");
    for(int i = 0; i < 5; i++){
      System.out.println((i + 1) + ". " + soldados[i] + " - " + vidas[i]);
    }
  }
}
