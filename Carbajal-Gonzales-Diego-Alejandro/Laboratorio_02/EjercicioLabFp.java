import java.util.Scanner;

public class EjercicioLabFp {

    public static void main(String[] args) {
        String ahor1 =
                " +---+ \n" +
                " |   | \n" +
                " | \n" +
                " | \n" +
                " | \n" +
                " | \n" +
                "========= ";
        String ahor2 = 
                " +---+ \n" +
                " |   | \n" +
                " |   O \n" +
                " | \n" +
                " | \n" +
                " | \n" +
                "=========";
        String ahor3 = 
                " +---+ \n" +
                " |   | \n" +
                " |   O \n" +
                " |   | \n" +
                " |\n" +
                " |\n" +
                "=========";
        String ahor4 = 
                " +---+\n" +
                " |   |\n" +
                " |   O\n" +
                " |  /|\n" +
                " |\n" +
                " |\n" +
                "=========";
        String ahor5 = 
                " +---+\n" +
                " |   |\n" +
                " |   O\n" +
                " |  /|\\ \n" +
                " |\n" +
                " |\n" +
                "=========";
        String ahor6 = 
                " +---+\n" +
                " |   |\n" +
                " |   O\n" +
                " |  /|\\ \n" +
                " |  / \n" +
                " |\n" +
                "=========";
        String ahor7 = 
                " +---+\n" +
                " |   |\n" +
                " |   O \n" +
                " |  /|\\ \n" +
                " |  / \\ \n" +
                " |\n" +
                "=========";

        String[] figuras = {ahor1, ahor2, ahor3, ahor4, ahor5, ahor6, ahor7};
        int contador = 0;
        String letra;
        String[] palabras = {"programacion", "java", "identacion", "clases", "objetos", "desarrollador", "pruebas"};
        String palSecreta = getPalabraSecreta(palabras);
        char[] palabraActual = new char[palSecreta.length()];
        for (int i = 0; i < palSecreta.length(); i++) {
            palabraActual[i] = '_';
        }
        StringBuilder letrasIntentadas = new StringBuilder();
        System.out.println(figuras[contador]);
        mostrarPalabraActual(palabraActual);
        System.out.println("\n");
        while (contador < 6) {
            letra = ingreseLetra(letrasIntentadas.toString());
            letrasIntentadas.append(letra);
            if (letraEnPalabraSecreta(letra, palSecreta)) {
                actualizarPalabraActual(palSecreta, palabraActual, letra);
                if (String.valueOf(palabraActual).equals(palSecreta)) {
                    System.out.println("¡Has ganado! La palabra secreta era: " + palSecreta);
                    break;
                }
            } else {
                contador++;
                System.out.println(figuras[contador]);
            }
        }
        if (contador == 6) {
            System.out.println("¡Has perdido! La palabra secreta era: " + palSecreta);
        }
    }

    public static String getPalabraSecreta(String[] lasPalabras) {
        int ind;
        int indiceMayor = lasPalabras.length - 1;
        int indiceMenor = 0;
        ind = (int) ((Math.random() * (indiceMayor - indiceMenor + 1) + indiceMenor));
        return lasPalabras[ind];
    }

    public static void mostrarPalabraActual(char[] palabra) {
        System.out.println(new String(palabra));
    }

    public static String ingreseLetra(String letrasIntentadas) {
        String laLetra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese letra: ");
        laLetra = sc.next().toLowerCase();
        while (laLetra.length() != 1 || !Character.isLetter(laLetra.charAt(0)) || letrasIntentadas.contains(laLetra)) {
            System.out.println("Ingrese una letra válida que no haya sido intentada: ");
            laLetra = sc.next().toLowerCase();
        }
        return laLetra;
    }

    public static boolean letraEnPalabraSecreta(String letra, String palSecreta) {
        return palSecreta.contains(letra);
    }

    public static void actualizarPalabraActual(String palabraSecreta, char[] palabraActual, String letra) {
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra.charAt(0)) {
                palabraActual[i] = letra.charAt(0);
            }
        }
    }
}
