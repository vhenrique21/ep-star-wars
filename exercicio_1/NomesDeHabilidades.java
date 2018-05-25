package exercicio_1;

import java.util.Random;

public class NomesDeHabilidades {
	
	private static int valor;
	static Random geradorNumeros = new Random();

	public static String []habilidadeJediForca = {"FORCE PUSH", "JEDI MIND TRICK", "FORCE THROW", "FORCE HEALING", "FORCE ENHANCEMENT"};
	public static String []habilidadeJediSabre = {"ATAQUE FRACO", "ATAQUE NORMAL", "ATAQUE FORTE"};
	public static String []habilidadeSithForca = {"FORCE CHOKE", "FORCE LIGHTNING", "FORCE THROW", "FORCE HEALING", "FORCE ENHANCEMENT" };
	public static String []habilidadeSithSabre = {"ATAQUE FRACO", "ATAQUE NORMAL", "ATAQUE FORTE"};
	
	public static int []habilidadeJediForcaDano = {5, 3, 6, 2, 1};
	public static int []habilidadeJediSabreDano = {5, 8, 12};
	public static int []habilidadeSithForcaDano = {5, 6, 4, 1, 2};
	public static int []habilidadeSithSabreDano = {5, 8, 12};
	
	
	//Retorna uma Habilidade
	
	public static int habilidades() {
		valor = geradorNumeros.nextInt(7);	
		return valor;
	}
	

}
