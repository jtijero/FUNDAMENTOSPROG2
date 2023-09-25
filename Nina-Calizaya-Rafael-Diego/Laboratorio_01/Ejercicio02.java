// Laboratorio Nro01 - Ejercicio02
// Autor. Rafael Diego Nina Calizaya
// Colaboro : ---
// Tiempo : 10 min

import java.util.*;
class Ejercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String soldado01, soldado02, soldado03, soldado04, soldado05;
    int vida01, vida02, vida03, vida04, vida05;
    System.out.println ("Ingrese el nombre del soldado");
    soldado01 = sc.next();
    System.out.println ("Ingrese vida del soldado");
    vida01 = sc.nextInt();
    System.out.println ("Ingrese el nombre del soldado");
    soldado02 = sc.next();
    System.out.println ("Ingrese vida del soldado");
    vida02 = sc.nextInt();
    System.out.println ("Ingrese el nombre del soldado");
    soldado03 = sc.next();
    System.out.println ("Ingrese vida del soldado");
    vida03 = sc.nextInt();
    System.out.println ("Ingrese el nombre del soldado");
    soldado04 = sc.next();
    System.out.println ("Ingrese vida del soldado");
    vida04 = sc.nextInt();
    System.out.println ("Ingrese el nombre del soldado");
    soldado05 = sc.next();
    System.out.println ("Ingrese vida del soldado");
    vida05 = sc.nextInt();
    System.out.println ("Nombre del Soldado 1: " + soldado01 + "  \nVida del Soldado 1: " + vida01);
    System.out.println ("Nombre del Soldado 2: " + soldado02 + "  \nVida del Soldado 2: " + vida02);
    System.out.println ("Nombre del Soldado 3: " + soldado03 + "  \nVida del Soldado 3: " + vida03);
    System.out.println ("Nombre del Soldado 4: " + soldado04 + "  \nVida del Soldado 4: " + vida04);
    System.out.println ("Nombre del Soldado 5: " + soldado05 + "  \nVida del Soldado 5: " + vida05);
  }
}