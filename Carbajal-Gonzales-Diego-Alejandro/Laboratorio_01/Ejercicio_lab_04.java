import java.util.*;
class Ejercicio_lab_04{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] soldados = new String[5];
        System.out.println("Introdusca el nombre de los soldados seguido por su salud:");
        for(int i = 0; i < soldados.length; i++){
            System.out.println("Soldado"+i+1+":");
            String nombre = sc.nextLine();
            String salud = sc.nextLine();
            soldados[i] = "Nombre:"+nombre+ "      "+"Salud: "+salud;
        }
        for(int i = 0; i < soldados.length; i++){
            System.out.println(soldados[i]);
        }
    }
}
