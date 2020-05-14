import java.util.*;

public class FASE1 {

	public static void main(String[] args) {
		
		int bitllet1=5, bitllet2=10, bitllet3=20, bitllet4=50, bitllet5=100, bitllet6=200, bitllet7=500, preumenjar;

		ArrayList<String> plats= new ArrayList<String>(Arrays.asList("Tortilla de patatas", "Arroz negro", "Paella de Langosta", "Ensalda verde", "Entrecot"));
		
		ArrayList<String> preus=new ArrayList<String>(Arrays.asList("15", "25", "35", "12.50", "22.75"));
		
		ArrayList<String> carta = new ArrayList<String>(plats);
		carta.addAll(preus);
		
		System.out.print(carta);
		
	}

}
