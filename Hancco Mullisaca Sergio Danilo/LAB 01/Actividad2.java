import java.util.*;
public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba el nombre del soldado");
    		String s1 = sc.next();
   	 	System.out.print("Ingrese el nivel de vida: ");
   	 	double v1 = sc.nextDouble();
    		System.out.println("Escriba el nombre del soldado");
    		String s2 = sc.next();	
	    	System.out.print("Ingrese el nivel de vida: ");
    		double v2 = sc.nextDouble();
    		System.out.println("Escriba el nombre del soldado");
    		String s3 = sc.next();
    		System.out.print("Ingrese el nivel de vida: ");
    		double v3 = sc.nextDouble();
    		System.out.println("Escriba el nombre del soldado");
    		String s4 = sc.next();	
    		System.out.print("Ingrese el nivel de vida: ");
    		double v4 = sc.nextDouble();
    		System.out.println("Escriba el nombre del soldado");
    		String s5 = sc.next();
    		System.out.print("Ingrese el nivel de vida: ");
    		double v5 = sc.nextDouble();
    	
    		System.out.println("El nombre de todos los soldados es: " );
    		System.out.println("El nombre del primer soldado es: " +  s1 + "y su vida es:" + v1);
    		System.out.println("El nombre del segundo soldado es: " + s2 + "y su vida es:" + v2);
    		System.out.println("El nombre del tercer soldado es: " +  s3 + "y su vida es:" + v3);
    		System.out.println("El nombre del cuarto soldado es: " +  s4 + "y su vida es:" + v4);
    		System.out.println("El nombre del quinto soldado es: " +  s5 + "y su vida es:" + v5);

	}

}
