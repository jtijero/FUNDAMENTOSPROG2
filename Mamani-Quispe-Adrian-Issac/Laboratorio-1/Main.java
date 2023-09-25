import java.util.*;
class Main{
	public static void main(String [] args){
		String nombres = "";
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++){
				nombres += sc.nextLine() + ",";
		}
		System.out.println(nombres.substring(0, nombres.length() - 1));
	}
}
