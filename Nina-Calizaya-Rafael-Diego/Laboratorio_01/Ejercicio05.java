// Laboratorio Nro01 - Ejercicio05
// Autor. Rafael Diego Nina Calizaya
// Colaboro : ---
// Tiempo : 20 min

import java.util.*;
class Ejercicio05 {
  public static void main(String[] args) {
	int random01 = (int)(Math.random()*5) + 1;
	int random02 = (int)(Math.random()*5) + 1;
	String ganador;
    String[] army01 = new String[(int)(random01)];
	String[] army02 = new String[(int)(random02)];
	for (int i = 0; i < random01; i++){
		army01[i] = "Soldado0" + (i + 1);
	}
	for (int i = 0; i < random02; i++){
		army02[i] = "Soldado0" + (i + 1);
	}
	System.out.println("Army01");
	for (int i = 0; i < random01; i++){
		System.out.println(army01[i]);
	}
	System.out.println("Army02");
	for (int i = 0; i < random02; i++){
		System.out.println(army02[i]);
	}
	if(army01.length < army02.length) ganador = "Army02";
	else if (army01.length == army02.length) ganador = "Empate";
	else ganador = "Army01";
	System.out.println("Winner: " + ganador);
  }
}