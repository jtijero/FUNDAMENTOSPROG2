/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_2;
import java.util.*;
/**
 *
 * @author jefer
 */
public class Actividad_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.println("Ingrese el nombre del primer soldado y puntos de vida: ");
	String sold1 = sc.next();
	double vsold1 = sc.nextDouble();

	System.out.println("Ingrese el nombre del segundo soldado y puntos de vida: ");
	String sold2 = sc.next();
	double vsold2 = sc.nextDouble();

	System.out.println("Ingrese el nombre del tercer soldado y puntos de vida: ");
	String sold3 = sc.next();
	double vsold3 = sc.nextDouble();

	System.out.println("Ingrese el nombre del cuarto soldado y puntos de vida: ");
	String sold4 = sc.next();
	double vsold4 = sc.nextDouble();

	System.out.println("Ingrese el nombre del quinto soldado y puntos de vida: ");
	String sold5 = sc.next();
	double vsold5 = sc.nextDouble();

	System.out.println(sold1 + " " + vsold1 + "\n"+ sold2 + " " + vsold2 + "\n"+ sold3 + " " 
	+ vsold3 + "\n"+ sold4 + " " + vsold4 + "\n"+ sold5+ " " + vsold5 );
    }
    
}
