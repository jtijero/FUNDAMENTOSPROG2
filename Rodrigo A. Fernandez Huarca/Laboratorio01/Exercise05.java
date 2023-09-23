//Laboratorio 01
//Fernandez Huarca Rodrigo Alexander
import java.util.Scanner;
public class Exercise05 {
    public static void main(String[] args){
        String[] army01 = NamesArmy();
        String[] army02 = NamesArmy();
        print(army01, army02);
    }
    public static String[] NamesArmy(){
        int num = (int)(Math.random()*5 + 1);
        String[] names = new String[num];
        for(int i = 0; i < names.length; i++){
            names[i] = "Soldado0" + (i + 1);
        }
        return names;
    }
    public static void print(String[] army01, String[]army02){
        int numA1 = army01.length;
        int numA2 = army02.length;
        System.out.println("Numero de soldados: " );
        for(int i = 0; i < army01.length ; i++){        
            if(i == 0){
                System.out.println("Datos del primer Ejercito");
                System.out.println("Numero de soldados: " + numA1 );
            }
            System.out.println("Nombre: " + army01[i]);
        }
        for(int i = 0; i < army02.length ; i++){
            if(i == 0){
                System.out.println("Datos del segundo Ejercito");
                System.out.println("Numero de soldados: " + numA2 );
            }
            System.out.println("Nombre: " + army02[i]);
        }
        if(numA1 > numA2){
            System.out.println("Gana el Ejercito 01");
        }else if (numA2 > numA1 ){
            System.out.println("Gana el ejercito 02");
        }else
        System.out.println("Es un empate");
    }
}
