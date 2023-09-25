import java.util.*;
class Ejercicio02 {
  public static void main(String[] Args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese los nombres de sus soldados:");
    String soldado1 = sc.next();
    String soldado2 = sc.next();
    String soldado3 = sc.next();
    String soldado4 = sc.next();
    String soldado5 = sc.next();
    System.out.println("Ingrese el porcentaje de vida:");
    int vidaS1 = sc.nextInt();
    int vidaS2 = sc.nextInt();
    int vidaS3 = sc.nextInt();
    int vidaS4 = sc.nextInt();
    int vidaS5 = sc.nextInt();
    System.out.println("Sus soldados son: \n" + soldado1 + " HP " + vidaS1 + "%" + "\n" +
                        soldado2 + " HP " + vidaS2 + "%" + "\n" +
                        soldado3 + " HP " + vidaS3 + "%" + "\n" + 
                        soldado4 + " HP " + vidaS4 + "%" + "\n" +
                        soldado5 + " HP " + vidaS5 + "%" + "\n");
  }    
}
