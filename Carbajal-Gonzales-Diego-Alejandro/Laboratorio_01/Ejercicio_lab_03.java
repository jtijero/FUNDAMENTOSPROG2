import java.util.*;
class Ejercicio_lab_03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] soldados = new String[5];
        for(int i = 0; i < soldados.length; i++){
            soldados[i] = sc.nextLine();
        }
        for(int i = 0; i < soldados.length; i++){
            System.out.println(soldados[i]);
        }
    }
}
