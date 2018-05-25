package exercicio_1;

import java.util.Random;

public class UsuarioDaForca extends Ser {
	
	
	private boolean MidiClorians;
	static Random geradorNumeros = new Random();
	protected int tipo;
	public boolean isMidiClorians() {
		return MidiClorians;
	}

	public void setMidiClorians(boolean midiClorians) {
		MidiClorians = midiClorians;
	}
	
	private void turno(int modo) {
		//modo: 0 = Esquiva e 1 = Ataque
		
		if(modo == 1) {
			int i = geradorNumeros.nextInt(1);
			Habilidades habilidadeDoTurno = new Habilidades();
			habilidadeDoTurno.habilidade(tipo, i);
		}
		
		
		
		
	}


}
