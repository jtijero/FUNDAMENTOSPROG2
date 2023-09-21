import java.util.*;

public class Actividad05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ejercito1 = new String[(int) (Math.random() * 5 + 1)];
        String[] ejercito2 = new String[(int) (Math.random() * 5 + 1)];
        for (int i = 0; i < ejercito1.length; i++) {
            ejercito1[i] = "soldado" + i;
        }
        for (int i = 0; i < ejercito2.length; i++) {
            ejercito2[i] = "soldado" + i;
        }
        System.out.println("Ejercito 1 , con " + ejercito1.length + " soldados:");
        for (int i = 0; i < ejercito1.length; i++) {
            System.out.println(ejercito1[i]);
        }
        System.out.println("Ejercito 2 , con " + ejercito2.length + " soldados:");
        for (int i = 0; i < ejercito2.length; i++) {
            System.out.println(ejercito2[i]);
        }
        if (ejercito1.length != ejercito2.length) {
            if (ejercito1.length > ejercito2.length) {
                System.out.print("El Ejercito 1 es el ganador");
            } else {
                System.out.print("El Ejercito 2 es el ganador");
            }
        } else {
            System.out.print("Es un empate");
        }
    }
}
