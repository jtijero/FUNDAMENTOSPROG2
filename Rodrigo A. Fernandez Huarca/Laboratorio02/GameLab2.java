import java.util.Scanner;

public class GameLab2 {
    public static void main(String[] args) {
        String ahor1 = " +---+ \n" +
                " | | \n" +
                " | \n" +
                " | \n" +
                " | \n" +
                " | \n" +
                "========= ";
        String ahor2 = " +---+ \n" +
                " | | \n" +
                " O | \n" +
                " | \n" +
                " | \n" +
                " | \n" +
                "=========";

        String ahor3 = " +---+ \n" +
                " | | \n" +
                " O | \n" +
                " | | \n" +
                " | \n" +
                " | \n" +
                "=========";

        String ahor4 = " +---+ \n" +
                " | | \n" +
                " O | \n" +
                " /| | \n" +
                " | \n" +
                " | \n" +
                "=========";

        String ahor5 = " +---+ \n" +
                " | | \n" +
                " O | \n" +
                " /|\\ | \n" +
                " | \n" +
                " | \n" +
                "=========";

        String ahor6 = " +---+ \n" +
                " | | \n" +
                " O | \n" +
                " /|\\ | \n" +
                " / | \n" +
                " | \n" +
                "=========";

        String ahor7 = " +---+ \n" +
                " | | \n" +
                " O | \n" +
                " /|\\ | \n" +
                " / \\ | \n" +
                " | \n" +
                "=========";
        String[] figuras = {ahor1, ahor2, ahor3, ahor4, ahor5, ahor6, ahor7};
        int contador = 1;
        String letra;
        String[] palabras = {"programacion","murcielago", "clases",
                                "objetos", "desarrollador", "pruebas", "poni"};
        // "java", "identacion"
        String palSecreta = getPalabraSecreta(palabras);
        System.out.println(figuras[0]);
        mostrarBlancos(palSecreta);
        System.out.println("\n");
        char[] caracter = new char[palSecreta.length() * 2];
        int numIntentos = 0;
        
        while (youWin(caracter) == false) {
            letra = ingreseLetra();
            if (letraEnPalabraSecreta(letra, palSecreta))
                mostrarBlancosActualizados(letra, palSecreta,caracter);
            else{
                System.out.println(figuras[contador]);
                contador++;
            }
            numIntentos ++;
            if (youWin(caracter) == true){
                System.out.println("Usted ha Ganado :) !!!\nNumero de intentos: "+
                (numIntentos));
                break;
            }else if(contador == 7){
                System.out.println("Usted ha Perdido :(  !!!\nNumero de intentos: "+
                (numIntentos));
                break;
                
            }
        }
        //COMPLETAR PARA INDICAR SI GANÓ, PERDIÓ Y CUÁNTOS TURNOS NECESITÓ
        System.out.println("\n");
    }

    public static String getPalabraSecreta(String[] lasPalabras) {
        String palSecreta;
        int ind;
        int indiceMayor = lasPalabras.length - 1;
        int indiceMenor = 0;
        ind = (int) ((Math.random() * (indiceMayor - indiceMenor + 1) + indiceMenor));
        return lasPalabras[ind];
    }

    public static void mostrarBlancos(String palabra) {
        for (int i = 0; i < palabra.length(); i++)
            System.out.print("_ ");
    }

    public static String ingreseLetra() {
        String laLetra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese letra: ");
        laLetra = sc.next();
        int ascci = (int)laLetra.charAt(0);
        while (laLetra.length() != 1) {
            System.out.println("Ingrese letra: ");
            laLetra = sc.next();     
        }
        while (ascci < 65 || (ascci > 90 && ascci < 97) || ascci > 122 ){
            System.out.println("Ingrese SOLO Letras");
            laLetra = sc.next();
            ascci = (int)laLetra.charAt(0);
        }
        return laLetra;
    }

    public static boolean letraEnPalabraSecreta(String letra, String palSecreta) {
        int letterChar = letra.charAt(0);
        for(int i = 0; i < palSecreta.length(); i++){
            if(palSecreta.charAt(i) == letterChar){
                return true;
            }
                
        }
        return false;
    }

    public static void mostrarBlancosActualizados(String letra, String palSecreta,char[] caracter) {
        char letterChar = letra.charAt(0);
        System.out.println("PROCESANDO.....");
        
        for(int i = 0; i < caracter.length; i+=2){
            if(palSecreta.charAt(i/2) == letterChar){
                caracter[i] = letterChar;
                caracter[i+1] = ' ';
            }
            else if (caracter[i] == '_'|| caracter[i]== '\u0000') {
                caracter[i] = '_';
                caracter[i+1] = ' ';
            }
        }
        for(int i =0 ; i < caracter.length;i++){
            System.out.print(caracter[i]);
        }
        System.out.println();
        
    }
    public static boolean youWin(char[] caracter){
        for(int i = 0; i < caracter.length ; i+=2){
            if(caracter[i] == '_'|| caracter [i] == '\u0000'){
                return false;
            }
        }
        return true;

    }

}

