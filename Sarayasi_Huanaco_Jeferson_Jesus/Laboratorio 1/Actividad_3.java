/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_3;
import java.util.*;
/**
 *
 * @author jefer
 */
public class Actividad_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] solds = new String[5];
        for(int i = 0; i < 5;i++){
            System.out.println("Ingrese el nombre del soldado numero" + (i+1));
            solds[i]= sc.next();
        }
        for(int j = 0; j < 5;j++){
            System.out.println(solds[j]);
        }
    }
    
}
