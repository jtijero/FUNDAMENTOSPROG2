// Laboratorio Nro01 - Ejercicio04
// Autor. Rafael Diego Nina Calizaya
// Colaboro : ---
// Tiempo : 15 min

import java.util.*;
class Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String[] soldados = new String[5];
    int[] vida = new int[5];
    for (int i = 0; i < 5; i++){
      System.out.println ("Ingrese el nombre del soldado");
      soldados[i] = sc.next();
      System.out.println ("Ingrese la vida del soldado");
      vida[i] = sc.nextInt();
    }
    for (int i = 0; i < 5; i++){
      System.out.printf("Nombre del Soldado %d: %s\n", i + 1, soldados[i]);
      System.out.printf("Vida del Soldado %d: %s\n\n", i + 1, vida[i]);
    }
  }
}