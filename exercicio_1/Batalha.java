package exercicio_1;

import java.util.Random;

public class Batalha {

	Random gerador = new Random();
	
	// VETOR[0] ---> Tipo: [1] para Jedi e [0] para Sith.	
	// VETOR[1] ---> Modo: [0] = Esquiva,  [1] = AtaqueForca e [2] = AtaqueSabre.	
	// VETOR[2] ---> Nome do ataque e seu Dano.	
	
	private static int i = 0;
	private static int x;
	private static int y;
	
	public static int valorSith;
	public static int valorJedi;
	public static int valor;
	
	public static void main(String[] args) {
		// Cria os objetos Sith e Jedi
		Lorde lordeSith = new Lorde();
		Mestre mestreJedi = new Mestre();
		System.out.println("A Proeficiencia do Jedi com Sabre é " + mestreJedi.dominioComOSabre + " e a sua proeficiencia com a Força é " + mestreJedi.dominioComAForca);
		System.out.println("A Proeficiencia do Sith com Sabre é " + lordeSith.dominioComOSabre + " e a sua proeficiencia com a Força é " + lordeSith.dominioComAForca);
		
		while(lordeSith.getVida() >= 0 && mestreJedi.getVida() >= 0) {
			
			i++;
			System.out.println("Inicio do turno " + i +  ":");
			
			// Define, aleatoriamente, os ataques a serem feito pelos personagens.
			mestreJedi.turno(); 
			lordeSith.turno();  
			
			//Variaveis associadas ao nome e dano das Habilidades.
			valorJedi = mestreJedi.defineAcao[2]; 
			valorSith = lordeSith.defineAcao[2];
			
			//Com base nos valores de Modo de ataque (no método defineAcao[1]), é chamado o caso de ataque correspondente.
			
			x = 0; y = 0;
			if(mestreJedi.defineAcao[1] == x && lordeSith.defineAcao[1] == y) {CasosDeAtaque.casoEE(mestreJedi, lordeSith);}
			
			x = 0; y = 1;
			if(mestreJedi.defineAcao[1] == x && lordeSith.defineAcao[1] == y) {CasosDeAtaque.casoEAF(mestreJedi, lordeSith);}
			
			x = 0; y = 2;
			if(mestreJedi.defineAcao[1] == x && lordeSith.defineAcao[1] == y) {CasosDeAtaque.casoEAS(mestreJedi, lordeSith);}
			
			x = 1; y = 0;
			if(mestreJedi.defineAcao[1] == x && lordeSith.defineAcao[1] == y) {CasosDeAtaque.casoAFE(mestreJedi, lordeSith);}
			
			x = 1; y = 1;
			if(mestreJedi.defineAcao[1] == x && lordeSith.defineAcao[1] == y) {CasosDeAtaque.casoAFAF(mestreJedi, lordeSith);}
			
			x = 1; y = 2;
			if(mestreJedi.defineAcao[1] == x && lordeSith.defineAcao[1] == y) {CasosDeAtaque.casoAFAS(mestreJedi, lordeSith);}
			
			x = 2; y = 0;
			if(mestreJedi.defineAcao[1] == x && lordeSith.defineAcao[1] == y) {CasosDeAtaque.casoASE(mestreJedi, lordeSith);}
			
			x = 2; y = 1;
			if(mestreJedi.defineAcao[1] == x && lordeSith.defineAcao[1] == y) {CasosDeAtaque.casoASAF(mestreJedi, lordeSith);}
			
			x = 2; y = 2;
			if(mestreJedi.defineAcao[1] == x && lordeSith.defineAcao[1] == y) {CasosDeAtaque.casoASAS(mestreJedi, lordeSith);}			
			
		/* A vida não pode ser negativa, se o personagem sofre um ataque mais forte que o total de vida 
		 * que possui essa é apenas zerada e ele morre, não fica negativa. */
			
			if(mestreJedi.getVida() < 0) {mestreJedi.setVida(0);}
			if(lordeSith.getVida() < 0) {lordeSith.setVida(0);}
			
			System.out.println("Vida Mestre Jedi: " + mestreJedi.getVida());
			System.out.println("Vida Lorde Sith: " + lordeSith.getVida());
			
			if(mestreJedi.getVida() <= 0) {
				System.out.println("\nMestre Jedi morreu.");
				System.out.println("Lorde Sith ganhou.");
				System.out.println("Fim do Jogo.");
				break;
			}
			else if(lordeSith.getVida() <= 0) {
				System.out.println("\nLorde Sith morreu.");
				System.out.println("Mestre Jedi ganhou.");
				System.out.println("\nFim do Jogo.");	
				break;
			}
			else {
				System.out.println("Fim do Turno.\n");
			}			
			
		}
	}
}
