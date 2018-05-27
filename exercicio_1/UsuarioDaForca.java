package exercicio_1;

import java.util.Random;

public class UsuarioDaForca extends Ser {
	
	private boolean MidiClorians;
	static Random geradorNumeros = new Random();
	protected int tipo;
	protected int []defineAcao = new int[3];
	public double dominioComAForca = Math.round((1 + geradorNumeros.nextDouble())*100.0)/100.0;  // Gera números aleatórios de proeficiencia para força com intervalo entre 1 e 2
	public double dominioComOSabre = Math.round((1 + geradorNumeros.nextDouble())*100.0)/100.0;  // Gera números aleatórios de proeficiencia para sabre com intervalo entre 1 e 2
 
	public void turno() {
		// modo: 0 = Esquiva e 1 = AtaqueForca e 2 = AtaqueSabre
		//Atribui valores ao vetor que indica se o personagem é jedi ou sith, qual o tipo de ataque e o nome e dano da habilidade usada;
	
		int i = geradorNumeros.nextInt(3);
		defineAcao[1] = i;
	
		if (defineAcao[1] == 0) {                       //É um Esquivar
			defineAcao[2] = -1;
		}
		
		else if (defineAcao[1] == 1) {                 //É um Ataque de Forca
			i = geradorNumeros.nextInt(5);
			defineAcao[2] = i;
		} 
		
		else if (defineAcao[1] == 2) {                 //É um Ataque de Sabre
			i = geradorNumeros.nextInt(3);
			defineAcao[2] = i;
		}	
	}

	public boolean isMidiClorians() {
		return MidiClorians;
	}

	public void setMidiClorians(boolean midiClorians) {
		MidiClorians = midiClorians;
	}
	
	

}
