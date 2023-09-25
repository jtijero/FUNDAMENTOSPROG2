import java.util.*;
class Main3{
	public static void main(String [] args){
		String [] nombres = new String[5];
		Scanner sc = new Scanner(System.in);
        for(int i = 0; i < nombres.length; i++){
            nombres[i] = sc.nextLine();
        }
		for(String s: nombres){
            System.out.println(s);
        }
	}
}