import java.util.*;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String soldado = "";
        for (int i = 1; i < 6; i++) {
            System.out.println("Ingrese el nombre del soldado " + i);
            soldado = soldado + sc.next() + "-";
            System.out.println("Ingrese su nivel de vida ");
            soldado = soldado + sc.next() + " , ";
        }
        System.out.println(soldado.substring(0, soldado.length() - 2));
    }
}
