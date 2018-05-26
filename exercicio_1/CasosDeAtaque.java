package exercicio_1;

import java.util.Random;

public class CasosDeAtaque {

	public static int valor;
	static Random gerador = new Random();

//	 A divisão de casos é dada pela seguinte lógica:
//	  
//	 Caso[Tipo de ataque do Jedi][Tipo de Ataque do Sith]	 
//	 Onde: [E] = Esquiva, [AF] = Ataque com a Forca, [AS] = ataque com o Sabre
//	 
//	 Exemplo: casoEAS --> Caso onde o Jedi esquiva e o Sith ataca com o Sabre
	
//	Os Casos AFAF e ASAS não tem prioridade definida, porteanto é usada uma geracão 
//	de numeros aleatoria para definir quem ataca primeiro.
	 
	
	
	public static void casoEE(Mestre jedi, Lorde sith) {
		System.out.println("Os dois personagens esquivaram, ninguém atacou nesse turno.");
	}

	public static void casoEAF(Mestre jedi, Lorde sith) {
		System.out.println("O Mestre Jedi se esquiva");
		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithForca[Batalha.valorSith]);
		System.out.println("Mestre Jedi sofre " + Habilidades.habilidadeSithForcaDano[Batalha.valorSith] + " Hit Points.");
		valor = jedi.getVida() - Habilidades.habilidadeSithForcaDano[Batalha.valorSith];
		jedi.setVida(valor);
	}

	public static void casoEAS(Mestre jedi, Lorde sith) {
		System.out.println("O Mestre Jedi se esquiva");
		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithSabre[Batalha.valorSith]);
		System.out.println("Mestre Jedi se esquivou. \nSem Efeito");
	}

	public static void casoAFE(Mestre jedi, Lorde sith) {
		System.out.println("O Lorde Sith se Esquiva.");
		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediForca[Batalha.valorJedi]);
		System.out.println("Lorde Sith sofre " + Habilidades.habilidadeJediForcaDano[Batalha.valorJedi] + " Hit Points.");
		valor = sith.getVida() - Habilidades.habilidadeJediForcaDano[Batalha.valorJedi];
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
		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediForca[Batalha.valorJedi]);
		System.out.println("Lorde Sith sofre " + Habilidades.habilidadeJediForcaDano[Batalha.valorJedi] + " Hit Points.");
		valor = sith.getVida() - Habilidades.habilidadeJediForcaDano[Batalha.valorJedi];
		sith.setVida(valor);

		if (sith.getVida() == 0) {
			return;
		}

		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithSabre[Batalha.valorSith]);
		System.out.println("Mestre Jedi sofre " + Habilidades.habilidadeJediSabreDano[Batalha.valorSith] + " Hit Points.");
		valor = jedi.getVida() - Habilidades.habilidadeSithSabreDano[Batalha.valorSith];
		jedi.setVida(valor);
	}

	public static void casoASE(Mestre jedi, Lorde sith) {
		System.out.println("O Lorde Sith se Esquiva.");
		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediSabre[Batalha.valorJedi]);
		System.out.println("Lorde Sith se esquivou. \nSem Efeito");
	}

	public static void casoASAF(Mestre jedi, Lorde sith) {
		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithForca[Batalha.valorSith]);
		System.out.println("Mestre Jedi sofre " + Habilidades.habilidadeSithForcaDano[Batalha.valorSith] + " Hit Points.");
		valor = jedi.getVida() - Habilidades.habilidadeSithForcaDano[Batalha.valorSith];
		jedi.setVida(valor);

		if (jedi.getVida() == 0) {
			return;
		}

		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediSabre[Batalha.valorJedi]);
		System.out.println("Lorde Sith sofre " + Habilidades.habilidadeJediSabreDano[Batalha.valorJedi] + " Hit Points.");
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
		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediForca[Batalha.valorJedi]);
		System.out.println("Lorde Sith sofre " + Habilidades.habilidadeJediForcaDano[Batalha.valorJedi] + " Hit Points.");
		valor = sith.getVida() - Habilidades.habilidadeJediForcaDano[Batalha.valorJedi];
		sith.setVida(valor);

		if (sith.getVida() == 0) {
			return;
		}

		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithForca[Batalha.valorSith]);
		System.out.println("Mestre Jedi sofre " + Habilidades.habilidadeSithForcaDano[Batalha.valorSith] + " Hit Points.");
		valor = jedi.getVida() - Habilidades.habilidadeSithForcaDano[Batalha.valorSith];
		jedi.setVida(valor);
	}

	public static void casoAFAF_opcao2(Mestre jedi, Lorde sith) {
		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithForca[Batalha.valorSith]);
		System.out.println("Mestre Jedi sofre " + Habilidades.habilidadeSithForcaDano[Batalha.valorSith] + " Hit Points.");
		valor = jedi.getVida() - Habilidades.habilidadeSithForcaDano[Batalha.valorSith];
		jedi.setVida(valor);

		if (jedi.getVida() == 0) {
			return;
		}

		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediForca[Batalha.valorJedi]);
		System.out.println("Lorde Sith sofre " + Habilidades.habilidadeJediForcaDano[Batalha.valorJedi] + " Hit Points.");
		valor = sith.getVida() - Habilidades.habilidadeJediForcaDano[Batalha.valorJedi];
		sith.setVida(valor);
	}
	

	public static void casoASAS_opcao1(Mestre jedi, Lorde sith) {
		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediSabre[Batalha.valorJedi]);
		System.out.println("Lorde Sith sofre " + Habilidades.habilidadeJediSabreDano[Batalha.valorJedi] + " Hit Points.");
		valor = sith.getVida() - Habilidades.habilidadeJediSabreDano[Batalha.valorJedi];
		sith.setVida(valor);

		if (sith.getVida() == 0) {
			return;
		}

		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithSabre[Batalha.valorSith]);
		System.out.println("Mestre Jedi sofre " + Habilidades.habilidadeJediSabreDano[Batalha.valorSith] + " Hit Points.");
		valor = jedi.getVida() - Habilidades.habilidadeSithSabreDano[Batalha.valorSith];
		jedi.setVida(valor);
	}

	public static void casoASAS_opcao2(Mestre jedi, Lorde sith) {
		System.out.println("Lorde Sith usou: " + Habilidades.habilidadeSithSabre[Batalha.valorSith]);
		System.out.println("Mestre Jedi sofre " + Habilidades.habilidadeJediSabreDano[Batalha.valorSith] + " Hit Points.");
		valor = jedi.getVida() - Habilidades.habilidadeSithSabreDano[Batalha.valorSith];
		jedi.setVida(valor);

		if (jedi.getVida() == 0) {
			return;
		}

		System.out.println("Mestre Jedi usou: " + Habilidades.habilidadeJediSabre[Batalha.valorJedi]);
		System.out.println("Lorde Sith sofre " + Habilidades.habilidadeJediSabreDano[Batalha.valorJedi] + " Hit Points.");
		valor = sith.getVida() - Habilidades.habilidadeJediSabreDano[Batalha.valorJedi];
		sith.setVida(valor);

	}

}
