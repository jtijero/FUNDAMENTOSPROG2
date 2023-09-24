import java.util.*;
class Ejercicio_lab_05{
    public static String[] ejercito(){
        Random random = new Random();
        int a = random.nextInt(5) + 1;
        String[] ejercito = new String[a];
        for(int i = 0; i < ejercito.length; i++){
            ejercito[i] = "soldado"+ (i+1);
        }
        return ejercito;
    }
    public static void batalla(String[] ejer1, String[] ejer2){
        int a = ejer1.length;
        int b = ejer2.length;
        int max = Math.max(a,b);
        if(a == b){
            System.out.println("Empate");
        }else{
            if(a>b){
                System.out.print("El ejercito 1 salio victorioso");
            }else{
                System.out.println("El ejercito 2 salio victorioso");
            }
        }
    }
    public static void main(String[] args){
        String[] ejercito1 = ejercito();
        String[] ejercito2 = ejercito();
        System.out.println("Ejercito1");
        for(int i = 0; i < ejercito1.length; i++){
            System.out.println("    " + ejercito1[i]);
        }
        System.out.println("Ejercito2");
        for(int i = 0; i < ejercito2.length; i++){
            System.out.println("    " + ejercito2[i]);
        }
        System.out.println("Los dos ejercitos entraron en batalla");
        batalla(ejercito1,ejercito2);
    }
}
