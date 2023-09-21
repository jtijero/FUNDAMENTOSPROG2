import java.util.*;

public class Actividad04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vida = new double[5];
        String[] soldado = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del soldado " + i + 1);
            soldado[i] = sc.next();
            System.out.println("Ingrese su nivel de vida ");
            vida[i] = sc.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%nSoldado %d: %s   Vida: %.2f", (i + 1), soldado[i], vida[i]);
        }

    }
}
