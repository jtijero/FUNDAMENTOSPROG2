//Laboratorio Nro 1 - Ejercicio3
//Autor: Ramirez Ccahuana Max Edú
//Tiempo: 10 minutos
import java.util.*;
class Ejercicio3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] soldados = new String[5];
    for(int i = 0; i < 5; i++){
      System.out.println("Ingrese el nombre del soldado " + (i + 1) + ":");
      soldados[i] = sc.next();
    }
    System.out.println("Los nombres de los soldados son: ");
    for(int i = 0; i < 5; i++){
      System.out.println((i + 1) + ". " + soldados[i]);
    }
  }
}
