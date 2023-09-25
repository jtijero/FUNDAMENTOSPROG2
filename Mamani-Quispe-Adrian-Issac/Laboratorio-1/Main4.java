import java.util.*;
class Main4{
	public static void main(String [] args){
		String [][] nombres = new String[5][2];
		Scanner sc = new Scanner(System.in);
        for(int i = 0; i < nombres.length; i++){
            System.out.println("Ingrese el nombre del soldado: ");
            nombres[i][0] = sc.nextLine();
            System.out.println("Ingrese la vida del soldado: ");
            nombres[i][1] = sc.nextLine();
        }
		for(String[]s: nombres){
            System.out.println(s[0] + " tiene de vida: " + s[1]);
        }
	}
}