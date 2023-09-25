import java.util.*;
class Main2{
	public static void main(String [] args){
		String nombres = "";
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++){
                System.out.println("Ingrese el nombre: ");
				nombres += sc.nextLine() + " con nivel de vida: ";
                System.out.println("Ingrese el nivel de vida: ");
                nombres += sc.nextLine()  + ", ";
		}
		System.out.println(nombres.substring(0, nombres.length() - 1));
	}
}
