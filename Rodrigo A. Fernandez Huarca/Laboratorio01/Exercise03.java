//Laboratorio 01
//Fernandez Huarca Rodrigo Alexander
import java.util.Scanner;
public class Exercise03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        for(int i = 0; i < names.length; i++){
            System.out.println("Ingrese Nombres del soldado :"+ (i + 1));
            names[i] = sc.next();
        }
        System.out.println("Datos de soldados: ");
        for(int i = 0 ; i < names.length; i++){  
            System.out.println("Nombre soldado " + (i + 1) +
            ": "+ names[i]);
        }
    }
}
