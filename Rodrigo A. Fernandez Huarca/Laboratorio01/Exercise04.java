//Laboratorio 01
//Fernandez Huarca Rodrigo Alexander
import java.util.Scanner;
public class Exercise04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        int[] levels = new int[5];
        for(int i = 0; i < names.length; i++){
            System.out.println("Ingrese Nombres del soldado :"+ (i + 1));
            names[i] = sc.next();
            System.out.println("Ingrese nivel de vida de los soldados");
            levels[i] = sc.nextInt();
        }
        System.out.println("Datos de soldados: ");
        for(int i = 0 ; i < names.length; i++){  
            System.out.println("Nombre soldado " + (i + 1) +
            ": "+ names[i]);
            System.out.println("Nivel del soldado " + (i + 1) +
            ":      "+ levels[i]);
        }
    }
}
