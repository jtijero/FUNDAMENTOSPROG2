//Laboratorio 01
//Fernandez Huarca Rodrigo Alexander
import java.util.Scanner;
public class Exercise01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 ,s2 ,s3 ,s4 ,s5;
        System.out.println("Ingrese el nombre de sus soldados");
        s1 = sc.next();     s2 = sc.next();
        s3 = sc.next();     s4 = sc.next(); 
        s5 = sc.next();
        System.out.println("Sus soldados son: ");
        System.out.println("Soldado1 :"+s1+ "\nSoldado2 :"+s2+
        "\nSoldado3 :"+s3+"\nSoldado4 :"+s4+"\nSoldado5 :"+s5);
    }
}
