import javax.swing.*;
import java.lang.*;


import java.util.*;
import java.lang.*;


public class FASE3 {

	private static final double[] String = null;


	public static void main(String[] args) {
		
		double [] platspreu = new double[5];
		
		String [] plats = new String[5];
		
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
		int z = 0;
		while (condicion){
			
			String demanar;
			demanar = JOptionPane.showInputDialog("Tria plat: " + Arrays.toString(carta));
			
			z= Integer.parseInt(JOptionPane.showInputDialog("Vols seguir menjant: 1:Si / 0:No"));
			
			z++;
			if(z == 1){
				
				condicion = false;
				
			}
			
			
	
			ArrayList<String> demant = new ArrayList<String>();
			demant.add(demanar);
			
			System.out.println(demant);
			
			boolean ans = demant.contains("a");
			boolean anb = demant.contains("b");
			boolean anc = demant.contains("c");
			boolean and = demant.contains("d");
			boolean ane = demant.contains("e");
			

			if (ans){
				
				System.out.println("ok");
				
				
			}else if (anb){
				
				System.out.println("ok");
				
			}else if (anc){
				
				System.out.println("ok");
				
			}else if (and){
				
				System.out.println("ok");
			
			}else if (ane){
				
				System.out.println("ok");
				
				
			}else {
				
				System.out.println("El plat que has demant no existeix");
			}
			
		}
		}
		
		
		
			
			
		
			
			
	
		
	

	private static char[] sumar(String demanar) {
		// TODO Auto-generated method stub
		return null;
	}



	private static Collection<? extends String> asList(String demanar) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
