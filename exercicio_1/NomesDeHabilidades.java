package exercicio_1;

import java.util.Random;

public class NomesDeHabilidades {
	
	private int valor;
	Random geradorNumeros = new Random();

	public String []habilidadeJediForca = {"FORCE PUSH", "JEDI MIND TRICK", "FORCE THROW", "FORCE HEALING", "FORCE ENHANCEMENT"};
	public String []habilidadeJediSabre = {"ATAQUE FRACO", "ATAQUE NORMAL", "ATAQUE FORTE"};
	public String []habilidadeSithForca = {"FORCE CHOKE", "FORCE LIGHTNING", "FORCE THROW", "FORCE HEALING", "FORCE ENHANCEMENT" };
	public String []habilidadeSithSabre = {"ATAQUE FRACO", "ATAQUE NORMAL", "ATAQUE FORTE"};
	
	public int []habilidadeJediForcaDano = {5, 3, 6, 2, 1};
	public int []habilidadeJediSabreDano = {5, 8, 12};
	public int []habilidadeSithForcaDano = {5, 6, 4, 1, 2};
	public int []habilidadeSithSabreDano = {5, 8, 12};
	
		
	
	
	
	
	
	
	//Retorna uma Habilidade
	
	public String habilidades(String tipo, String tipoHabilidade) {
		
		if(tipo == "Jedi") {
			if(tipoHabilidade == "Forca") {
				valor = geradorNumeros.nextInt(7);
				return habilidadeJediForca[valor];				
			}else if (tipoHabilidade == "Sabre") {
				valor = geradorNumeros.nextInt(7);
				return habilidadeJediSabre[valor];				
			}
		}
		
		else if(tipo == "Sith") {
			if(tipoHabilidade == "Forca") {
				valor = geradorNumeros.nextInt(7);
				return habilidadeJediForca[valor];				
			}else if (tipoHabilidade == "Sabre") {
				valor = geradorNumeros.nextInt(7);
				return habilidadeJediSabre[valor];				
			}
		}
		
		
	}
	

}
