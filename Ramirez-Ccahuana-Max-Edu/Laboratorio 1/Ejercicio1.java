//Laboratorio Nro 1 - Ejercicio1
//Autor: Ramirez Ccahuana Max Edú
//Tiempo: 10 minutos
import java.util.*;
class Ejercicio1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese los nombres de los soldados: ");
    String soldado1 = sc.next();
    String soldado2 = sc.next();
    String soldado3 = sc.next();
    String soldado4 = sc.next();
    String soldado5 = sc.next();
    System.out.println("Los nombres de los soldados son: ");
    System.out.println("1. " + soldado1);
    System.out.println("2. " + soldado2);
    System.out.println("3. " + soldado3);
    System.out.println("4. " + soldado4);
    System.out.println("5. " + soldado5);
  }
}
