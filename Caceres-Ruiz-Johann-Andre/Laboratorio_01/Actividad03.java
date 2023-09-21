import java.util.*;

public class Actividad03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] soldado = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del soldado " + (i + 1));
            soldado[i] = sc.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%nSoldado %d: %s", (i + 1), soldado[i]);
        }

    }
}
