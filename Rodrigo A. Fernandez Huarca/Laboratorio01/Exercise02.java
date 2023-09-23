//Laboratorio 01
//Fernandez Huarca Rodrigo Alexander
import java.util.Scanner;
public class Exercise02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los datos de sus soldados");
        for(int i = 0; i < 5 ; i++){
            System.out.println("Ingrese nombre del soldado");
            String name = sc.next();
            System.out.println("Ingrese nivel de vida del soldado");
            int level = sc.nextInt();
            System.out.println("Datos del soldado "+ (i+1) +
            "\nNombre: " + name +"\nNivel de Vida: " + level);
        }
    }
}
