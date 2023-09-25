package Laboratorio1;
import java.util.*;
public class Ejercicio05 {
    public static void main(String[] args) {
        String[] ejercito1 = inicializarEjercito();
        String[] ejercito2 = inicializarEjercito();
        System.out.println("Ejército 1:");
        mostrarEjercito(ejercito1);
        System.out.println("\nEjército 2:");
        mostrarEjercito(ejercito2);
        int resultado = compararEjercitos(ejercito1, ejercito2);
        if (resultado > 0) {
            System.out.println("\nEl Ejército 1 es el ganador.");
        } else if (resultado < 0) {
            System.out.println("\nEl Ejército 2 es el ganador.");
        } else {
            System.out.println("\n¡Es un empate!");
        }
    }
    public static String[] inicializarEjercito() {
        Random rand = new Random();
        int numSoldados = rand.nextInt(5) + 1;
        String[] ejercito = new String[numSoldados];
        for (int i = 0; i < numSoldados; i++) {
            ejercito[i] = "Soldado" + i;
        }
        return ejercito;
    }
    public static void mostrarEjercito(String[] ejercito) {
        for (String soldado : ejercito) {
            System.out.println(soldado);
        }
    }
    public static int compararEjercitos(String[] ejercito1, String[] ejercito2) {
        return ejercito1.length - ejercito2.length;
    }
}