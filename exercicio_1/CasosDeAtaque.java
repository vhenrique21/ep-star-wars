package exercicio_1;

import java.util.Random;

public class CasosDeAtaque {

	public static int valor;
	public static double novodano;
	static Random gerador = new Random();

//	 A divis�o de casos � dada pela seguinte l�gica:
//	  
//	 Caso[Tipo de ataque do Jedi][Tipo de Ataque do Sith]	 
//	 Onde: [E] = Esquiva, [AF] = Ataque com a Forca, [AS] = ataque com o Sabre
//	 
//	 Exemplo: casoEAS --> Caso onde o Jedi esquiva e o Sith ataca com o Sabre
	
//	Os Casos AFAF e ASAS n�o tem prioridade definida, porteanto � usada uma gerac�o 
//	de numeros aleatoria para definir quem ataca primeiro.

//  Para o calculo da mudan�a de dano gerada pela proeficiencia � feita uma multiplica��o simples
//  entre o fator de proeficiencia e o dano causado pela habilidade, o aumento de dano � ent�o discriminado no print
	 
	
	
	public static void casoEE(Mestre jedi, Lorde sith) {
		System.out.println("Os dois personagens esquivaram, ningu�m atacou nesse turno.");
	}

	public static void casoEAF(Mestre jedi, Lorde sith) {
		novodano = Math.round(Habilidades.habilidadeSithForcaDano[Batalha.valorSith]*sith.dominioComAForca);
		System.out.println("O Mestre Jedi se esquiva");
		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithForca[Batalha.valorSith]);
		System.out.println("Mestre Jedi sofre " + novodano + " Hit Points, dos quais " + Math.round(Habilidades.habilidadeSithForcaDano[Batalha.valorSith]*(sith.dominioComAForca-1)) + " s�o devidos � proeficiencia do Sith com a For�a.");
		valor = jedi.getVida() - (int)novodano;
		jedi.setVida(valor);
	}

	public static void casoEAS(Mestre jedi, Lorde sith) {
		System.out.println("O Mestre Jedi se esquiva");
		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithSabre[Batalha.valorSith]);
		System.out.println("Mestre Jedi se esquivou. \nSem Efeito");
	}

	public static void casoAFE(Mestre jedi, Lorde sith) {
		novodano = Math.round(Habilidades.habilidadeSithForcaDano[Batalha.valorJedi]*jedi.dominioComAForca);
		System.out.println("O Lorde Sith se Esquiva.");
		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediForca[Batalha.valorJedi]);
		System.out.println("Lorde Sith sofre " + novodano + " Hit Points, dos quais " + Math.round(Habilidades.habilidadeJediForcaDano[Batalha.valorJedi]*(jedi.dominioComAForca-1)) + " s�o devidos � proeficiencia do Jedi com a For�a.");
		valor = sith.getVida() - (int)novodano;
		sith.setVida(valor);
	}

	public static void casoAFAF(Mestre jedi, Lorde sith) {
		valor = gerador.nextInt(2);
		switch (valor) {
		case 0:
			casoAFAF_opcao1(jedi, sith);
			break;
		case 1:
			casoAFAF_opcao2(jedi, sith);
			break;
		default:
			break;
		}
	}

	public static void casoAFAS(Mestre jedi, Lorde sith) {
		novodano = Math.round(Habilidades.habilidadeJediForcaDano[Batalha.valorJedi]*jedi.dominioComAForca);
		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediForca[Batalha.valorJedi]);
		System.out.println("Lorde Sith sofre " + novodano + " Hit Points, dos quais " + Math.round(Habilidades.habilidadeJediForcaDano[Batalha.valorJedi]*(jedi.dominioComAForca-1)) + " s�o devidos � proeficiencia do Jedi com a For�a.");
		valor = sith.getVida() - (int)novodano;
		sith.setVida(valor);

		if (sith.getVida() == 0) {
			return;
		}

		novodano = Math.round(Habilidades.habilidadeSithSabreDano[Batalha.valorSith]*sith.dominioComOSabre);
		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithSabre[Batalha.valorSith]);
		System.out.println("Mestre Jedi sofre " + novodano + " Hit Points, dos quais " + Math.round(Habilidades.habilidadeSithSabreDano[Batalha.valorSith]*(sith.dominioComAForca-1)) + " s�o devidos � proeficiencia do Sith com o Sabre.");
		valor = jedi.getVida() - (int)novodano;
		jedi.setVida(valor);
	}

	public static void casoASE(Mestre jedi, Lorde sith) {
		System.out.println("O Lorde Sith se Esquiva.");
		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediSabre[Batalha.valorJedi]);
		System.out.println("Lorde Sith se esquivou. \nSem Efeito");
	}

	public static void casoASAF(Mestre jedi, Lorde sith) {
		novodano = Math.round(Habilidades.habilidadeSithForcaDano[Batalha.valorSith]*sith.dominioComAForca);
		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithForca[Batalha.valorSith]);
		System.out.println("Mestre Jedi sofre " + novodano + " Hit Points, dos quais " + Math.round(Habilidades.habilidadeSithForcaDano[Batalha.valorSith]*(sith.dominioComAForca-1)) + " s�o devidos � proeficiencia do Sith com a For�a.");
		valor = jedi.getVida() - (int)novodano;
		jedi.setVida(valor);

		if (jedi.getVida() == 0) {
			return;
		}

		novodano = Math.round(Habilidades.habilidadeJediSabreDano[Batalha.valorJedi]*jedi.dominioComOSabre);
		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediSabre[Batalha.valorJedi]);
		System.out.println("Lorde Sith sofre " + novodano + " Hit Points, dos quais " + Math.round(Habilidades.habilidadeJediSabreDano[Batalha.valorJedi]*(jedi.dominioComAForca-1)) + " s�o devidos � proeficiencia do Jedi com o Sabre.");
		valor = sith.getVida() - Habilidades.habilidadeJediSabreDano[Batalha.valorJedi];
		sith.setVida(valor);
	}

	public static void casoASAS(Mestre jedi, Lorde sith) {
		valor = gerador.nextInt(2);
		switch (valor) {
		case 0:
			casoASAS_opcao1(jedi, sith);
			break;
		case 1:
			casoASAS_opcao2(jedi, sith);
			break;
		default:
			break;
		}
	}

	public static void casoAFAF_opcao1(Mestre jedi, Lorde sith) {
		novodano = Math.round(Habilidades.habilidadeJediForcaDano[Batalha.valorJedi]*jedi.dominioComAForca);
		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediForca[Batalha.valorJedi]);
		System.out.println("Lorde Sith sofre " + novodano + " Hit Points, dos quais " + Math.round(Habilidades.habilidadeJediForcaDano[Batalha.valorJedi]*(jedi.dominioComAForca-1)) + " s�o devidos � proeficiencia do Jedi com a For�a.");
		valor = sith.getVida() - (int)novodano;
		sith.setVida(valor);

		if (sith.getVida() == 0) {
			return;
		}

		novodano = Math.round(Habilidades.habilidadeSithForcaDano[Batalha.valorSith]*sith.dominioComAForca);
		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithForca[Batalha.valorSith]);
		System.out.println("Mestre Jedi sofre " + novodano + " Hit Points, dos quais " + Math.round(Habilidades.habilidadeSithForcaDano[Batalha.valorSith]*(sith.dominioComAForca-1)) + " s�o devidos � proeficiencia do Sith com a For�a.");
		valor = jedi.getVida() - (int)novodano;
		jedi.setVida(valor);
	}

	public static void casoAFAF_opcao2(Mestre jedi, Lorde sith) {
		novodano = Math.round(Habilidades.habilidadeSithForcaDano[Batalha.valorSith]*sith.dominioComAForca);
		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithForca[Batalha.valorSith]);
		System.out.println("Mestre Jedi sofre " + novodano + " Hit Points, dos quais " + Math.round(Habilidades.habilidadeSithForcaDano[Batalha.valorSith]*(sith.dominioComAForca-1)) + " s�o devidos � proeficiencia do Sith com a For�a.");
		valor = jedi.getVida() - (int)novodano;
		jedi.setVida(valor);
		
		if (jedi.getVida() == 0) {
			return;
		}

		novodano = Math.round(Habilidades.habilidadeJediForcaDano[Batalha.valorJedi]*jedi.dominioComAForca);
		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediForca[Batalha.valorJedi]);
		System.out.println("Lorde Sith sofre " + novodano + " Hit Points, dos quais " + Math.round(Habilidades.habilidadeJediForcaDano[Batalha.valorJedi]*(jedi.dominioComAForca-1)) + " s�o devidos � proeficiencia do Jedi com a For�a.");
		valor = sith.getVida() - (int)novodano;
		sith.setVida(valor);
	}
	

	public static void casoASAS_opcao1(Mestre jedi, Lorde sith) {
		novodano = Math.round(Habilidades.habilidadeJediSabreDano[Batalha.valorJedi]*jedi.dominioComOSabre);
		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediSabre[Batalha.valorJedi]);
		System.out.println("Lorde Sith sofre " + novodano + " Hit Points, dos quais " + Math.round(Habilidades.habilidadeJediSabreDano[Batalha.valorJedi]*(jedi.dominioComAForca-1)) + " s�o devidos � proeficiencia do Jedi com o Sabre.");
		valor = sith.getVida() - Habilidades.habilidadeJediSabreDano[Batalha.valorJedi];
		sith.setVida(valor);

		if (sith.getVida() == 0) {
			return;
		}

		novodano = Math.round(Habilidades.habilidadeSithSabreDano[Batalha.valorSith]*sith.dominioComOSabre);
		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithSabre[Batalha.valorSith]);
		System.out.println("Mestre Jedi sofre " + novodano + " Hit Points, dos quais " + Math.round(Habilidades.habilidadeSithSabreDano[Batalha.valorSith]*(sith.dominioComAForca-1)) + " s�o devidos � proeficiencia do Sith com o Sabre.");
		valor = jedi.getVida() - (int)novodano;
		jedi.setVida(valor);
	}

	public static void casoASAS_opcao2(Mestre jedi, Lorde sith) {
		novodano = Math.round(Habilidades.habilidadeSithSabreDano[Batalha.valorSith]*sith.dominioComOSabre);
		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithSabre[Batalha.valorSith]);
		System.out.println("Mestre Jedi sofre " + novodano + " Hit Points, dos quais " + Math.round(Habilidades.habilidadeSithSabreDano[Batalha.valorSith]*(sith.dominioComAForca-1)) + " s�o devidos � proeficiencia do Sith com o Sabre.");
		valor = jedi.getVida() - (int)novodano;
		jedi.setVida(valor);

		if (jedi.getVida() == 0) {
			return;
		}

		novodano = Math.round(Habilidades.habilidadeJediSabreDano[Batalha.valorJedi]*jedi.dominioComOSabre);
		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediSabre[Batalha.valorJedi]);
		System.out.println("Lorde Sith sofre " + novodano + " Hit Points, dos quais " + Math.round(Habilidades.habilidadeJediSabreDano[Batalha.valorJedi]*(jedi.dominioComAForca-1)) + " s�o devidos � proeficiencia do Jedi com o Sabre.");
		valor = sith.getVida() - Habilidades.habilidadeJediSabreDano[Batalha.valorJedi];
		sith.setVida(valor);

	}

}
