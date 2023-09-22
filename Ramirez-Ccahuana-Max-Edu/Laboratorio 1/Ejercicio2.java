//Laboratorio Nro 1 - Ejercicio2
//Autor: Ramirez Ccahuana Max Edú
//Tiempo: 10 minutos
import java.util.*;
class Ejercicio2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese los nombres de los soldados, junto con su nivel de vida: ");
    String soldado1 = sc.next();
    int vida1 = sc.nextInt();
    String soldado2 = sc.next();
    int vida2 = sc.nextInt();
    String soldado3 = sc.next();
    int vida3 = sc.nextInt();
    String soldado4 = sc.next();
    int vida4 = sc.nextInt();
    String soldado5 = sc.next();
    int vida5 = sc.nextInt();
    System.out.println("Los nombres y vidas de los soldados son: ");
    System.out.println("1. " + soldado1 + vida1);
    System.out.println("2. " + soldado2 + vida2);
    System.out.println("3. " + soldado3 + vida3);
    System.out.println("4. " + soldado4 + vida4);
    System.out.println("5. " + soldado5 + vida5);
  }
}
