/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_5;
import java.util.*;
/**
 *
 * @author jefer
 */
public class Actividad_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] batallon1 = new String [(int)(Math.random()* 5 ) + 1];
       	String [] batallon2 = new String [(int)(Math.random()* 5 ) + 1];
       	System.out.println("La lista de soldados del ejercito 1 es :");
       	for ( int i = 0 ; i < batallon1.length ; i ++){
               	System.out.println("Soldado" + i);
       	}
       	System.out.println("La lista de soldados del ejercito 2 es :");
       	for ( int i = 0 ; i < batallon2.length ; i ++){
               	System.out.println("Soldado" + i);
   		}
       	if (batallon1.length < batallon2.length){
       		System.out.println("Gana jugador Nº 2 ");
            
   		}else if (batallon1.length == batallon2.length){
       		System.out.println("Nadie gana - Nadie pierde");
            
   		}else {
       		System.out.println("Gana el jugador Nº 1");
       	}
    }
    
}
