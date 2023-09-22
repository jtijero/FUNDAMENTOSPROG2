import java.util.Scanner;
	public class Ejercicio1 {
		public static void main(String []args){
 			String ahor1 =  " +---+ \n"+
					"  |  | \n" +
					"     | \n" +
 					"     | \n" +
					"     | \n" +
 					"     | \n" +
					"========= ";
			String ahor2 =   " +---+ \n"+
					 "  |  | \n"+
					 "  O  | \n"+
					 "     | \n"+
					 "     | \n"+
					 "     | \n"+
					"=========";

			 String ahor3 =  " +---+ \n"+
					 "  |  | \n"+
					 "  O  | \n"+
					 "  |  | \n"+
					 "     | \n"+
					 "     | \n"+
					 "=========";

			 String ahor4 =  " +---+ \n"+
					 "  |  | \n"+
					 "  O  | \n"+
					 " /|  | \n"+
					 "     | \n"+
					 "     | \n"+
					 "=========";

			 String ahor5 =  " +---+ \n"+
					 "  |  | \n"+
					 "  O  | \n"+
					 " /|\\ | \n"+
					 "     | \n"+
					 "     | \n"+
					 "=========";

			 String ahor6 =  " +---+ \n"+
					 "  |  | \n"+
					 "  O  | \n"+
					 " /|\\ | \n"+
					 " /   | \n"+
					 "     | \n"+
					 "=========";

			 String ahor7 =  " +---+ \n"+
					 "  |  | \n"+
					 "  O  | \n"+
					 " /|\\ | \n"+
					 " / \\ | \n"+
					 "     | \n"+
					 "=========";
			String [] figuras = {ahor1, ahor2, ahor3,ahor4,ahor5,ahor6,ahor7};
			int contador = 1, wi = 0;
			String letra;
			boolean win = false;
			String [] palabras = {"programacion", "java", "identacion", "clases",
					 "objetos", "desarrollador", "pruebas"};
			String palSecreta = getPalabraSecreta(palabras);
			System.out.println(figuras[0]);
			mostrarBlancos(palSecreta);
			System.out.println("\n");
			while(contador <= 6){
				letra = ingreseLetra();
				if (letraEnPalabraSecreta(letra, palSecreta)){
					mostrarBlancosActualizados(letra);
					contador = contador - 1;
			
					for(int j = 0; j < palSecreta.length(); j++ ){
						if(letra.charAt(0) == palSecreta.charAt(j))
							wi=wi+1;
					}

					if(wi == palSecreta.length()){
						win = true;
						contador = 6;
					
					}
				}
				else{
					System.out.println(figuras[contador]);}
				contador = contador +1;
				
			}
			if(win)
				System.out.print("Ganaste");
			else
				System.out.print("Perdiste");
			System.out.println("\n");
		}
		public static String getPalabraSecreta(String [] lasPalabras){
			String palSecreta;
			int ind;
			int indiceMayor = lasPalabras.length -1;
			int indiceMenor =0;
			ind = (int) ((Math.random() * (indiceMayor - indiceMenor + 1) + indiceMenor));
			return lasPalabras[ind];
		}
		public static void mostrarBlancos(String palabra){
			for(int i=0; i< palabra.length(); i++)
			System.out.print("_ " );
		}
		public static String ingreseLetra(){
			String laLetra;
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese letra: ");
			laLetra = sc.next();
			while(laLetra.length()!= 1){
				System.out.println("Ingrese letra: ");
				laLetra = sc.next();
			}
			System.out.print(laLetra);
			return laLetra;
		}
		public static boolean letraEnPalabraSecreta(String letra, String palSecreta ){
			
			for(int j = 0; j < palSecreta.length(); j++ ){
				char cet = letra.charAt(0);
				char letxlet = palSecreta.charAt(j);
				if(cet == letxlet)
					return true;
			}
			return false;
		}
		public static void mostrarBlancosActualizados(String letra){
			System.out.println("PROCESANDO.....");
			
		}
}
