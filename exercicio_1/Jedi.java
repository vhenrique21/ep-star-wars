package exercicio_1;

public class Jedi extends UsuarioDaForca {

	private boolean temPoderesDeTelepatia;
	private boolean temPoderesDePersuasao;
	private boolean temPoderesDeTelecinese;
	private double porcentualDePazInterna;
	
	protected int tipo = 0;

	
	public boolean isTemPoderesDePersuasao() {
		return temPoderesDePersuasao;
	}

	public void setTemPoderesDePersuasao(boolean temPoderesDePersuasao) {
		this.temPoderesDePersuasao = temPoderesDePersuasao;
	}

	public boolean isTemPoderesDeTelecinese() {
		return temPoderesDeTelecinese;
	}

	public void setTemPoderesDeTelecinese(boolean temPoderesDeTelecinese) {
		this.temPoderesDeTelecinese = temPoderesDeTelecinese;
	}

	public double getPorcentualDePazInterna() {
		return porcentualDePazInterna;
	}

	public void setPorcentualDePazInterna(double porcentualDePazInterna) {
		this.porcentualDePazInterna = porcentualDePazInterna;
	}

	public boolean isTemPoderesDeTelepatia() {
		return temPoderesDeTelepatia;
	}

	public void setTemPoderesDeTelepatia(boolean temPoderesDeTelepatia) {
		this.temPoderesDeTelepatia = temPoderesDeTelepatia;
	}
}
