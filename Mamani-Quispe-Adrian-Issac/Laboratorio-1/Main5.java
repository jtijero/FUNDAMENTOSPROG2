import java.util.*;

class Main5 {
    public static void main(String[] args) {
        String[] ejercito1 = new String[(int) (Math.random() * 5) + 1];
        String[] ejercito2 = new String[(int) (Math.random() * 5) + 1];
        System.out.println(ejercito1.length);
        System.out.println(ejercito2.length);
        Scanner sc = new Scanner(System.in);
        int ganador = 2;
        if (ejercito1.length > ejercito2.length) {
            ganador = 1;
        } else if (ejercito1.length == ejercito2.length) {
            ganador = 0;
        }
        for (int i = 0; i < ejercito1.length; i++) {
            ejercito1[i] = "soldado" + (i + 1);
        }
        for (int i = 0; i < ejercito2.length; i++) {
            ejercito2[i] = "soldado" + (i + 1);
        }
        for (String s : ejercito1) {
            System.out.println("Ejercito 1:");
            System.out.println(s);
        }
        for (String s : ejercito2) {
            System.out.println("Ejercito 2:");
            System.out.println(s);
        }
        System.out.println("El ejercito ganador es: " + ganador);
    }
}