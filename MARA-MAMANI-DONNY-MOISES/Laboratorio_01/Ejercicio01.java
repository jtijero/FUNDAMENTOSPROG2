import java.util.*;
class Ejercicio01 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese los nombres de los soldados");
      String soldado1 = sc.next();
      String soldado2 = sc.next();
      String soldado3 = sc.next();
      String soldado4 = sc.next();
      String soldado5 = sc.next();
      System.out.println("Sus soldados son: \n" + soldado1 + "\n" +
                         soldado2 + "\n" +
                         soldado3 + "\n" + 
                         soldado4 + "\n" +
                         soldado5 + "\n");
    }
}
