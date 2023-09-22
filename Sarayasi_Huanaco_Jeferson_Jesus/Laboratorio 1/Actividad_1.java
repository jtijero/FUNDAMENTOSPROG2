/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_1;
import java.util.*;
/**
 *
 * @author jefer
 */
public class Actividad_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.println("Ingrese el nombre del primer soldado: ");
	String sold1 = sc.next();

	System.out.println("Ingrese el nombre del segundo soldado: ");
	String sold2 = sc.next();

	System.out.println("Ingrese el nombre del tercero soldado: ");
	String sold3 = sc.next();

	System.out.println("Ingrese el nombre del cuarto soldado: ");
	String sold4 = sc.next();

	System.out.println("Ingrese el nombre del quinto soldado: ");
	String sold5 = sc.next();

	System.out.println(sold1 + "\n"+ sold2 + "\n"+ sold3 + "\n"+ sold4 + "\n"+ sold5);
    }
    
}
