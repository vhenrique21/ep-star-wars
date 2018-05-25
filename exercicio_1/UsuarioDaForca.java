package exercicio_1;

import java.util.Random;

public class UsuarioDaForca extends Ser {
	
	
	private boolean MidiClorians;
	static Random geradorNumeros = new Random();
	protected int tipo;
	protected int[] defineAcao = new int[4];
	public boolean isMidiClorians() {
		return MidiClorians;
	}

	public void setMidiClorians(boolean midiClorians) {
		MidiClorians = midiClorians;
	}
	
	public void turno() {
		//modo: 0 = Esquiva e 1 = Ataque
		
		int i = geradorNumeros.nextInt(2);
		defineAcao[1] = i;
		if(defineAcao[1] == 1) {
			i = geradorNumeros.nextInt(2);
			defineAcao[2] = i;
			if (defineAcao[2]==0) { // É um ataque de força
				i = geradorNumeros.nextInt(5);
				defineAcao[3] = i;
			}
			else if (defineAcao[2] == 1) { //É um ataque de sabre
				i = geradorNumeros.nextInt(3);
				defineAcao[3] = i;
			}
		}
		
		
	}


}
