package exercicio_1;

import java.util.Random;

public class Batalha {

	Random gerador = new Random();
	
	/*1 para Jedi
	 *0 para Sith */
	
	public int modoJedi = 1;
	public int modoSith = 0;
	
	public static void main(String[] args) {
		Lorde lordeSith = new Lorde();
		Mestre mestreJedi = new Mestre();
		
		while(lordeSith.getVida() != 0 && mestreJedi.getVida() != 0) {
			System.out.println("inicio do turno: ");
			mestreJedi.turno();
			lordeSith.turno();
			
			System.out.println("Jedi:" + mestreJedi.defineAcao[3]);
			System.out.println("Sith:" + lordeSith.defineAcao[3]);
			
			
		
		
			
			
		}

	}

}
