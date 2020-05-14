import javax.swing.*;

import java.util.*;


public class FASE2 {

	public static void main(String[] args) {
		
		double [] platspreu = new double[5];
		
		String [] plats = new String[5];
		
		// "Tortilla de patatas", "Arroz negro", "Paella de Langosta", "Ensalda verde", "Entrecot"
		
		//"15", "25", "35", "12.50", "22.75"
		
		for(int i=0; i<5; i++){
			
			plats[i]=JOptionPane.showInputDialog("Intodueix plat: " + (i+1));
			
			
		}
		
		for (int i=0; i<5;i++){
			
			platspreu[i]=Integer.parseInt(JOptionPane.showInputDialog("Intodueix preu: " + (i+1)));
		}
		
		String[] carta = plats;
		
		double [] cartapreus = platspreu;
		
		System.out.println(Arrays.toString(carta));
		System.out.println(Arrays.toString(platspreu));
		
		boolean condicion = true;
		int a = 0;
		while (condicion){
			
			String demanar;
			demanar = JOptionPane.showInputDialog("Tria plat: " + Arrays.toString(carta));
			
			a= Integer.parseInt(JOptionPane.showInputDialog("Vols seguir menjant: 1:Si / 0:No"));
			
			a++;
			if(a == 1){
				
				condicion = false;
				
			}
			
			ArrayList<String> demant = new ArrayList<String>();
			demant.add(demanar);
			
		}
	}

	private static Collection<? extends String> asList(String demanar) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
