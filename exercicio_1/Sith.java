package exercicio_1;

public class Sith extends UsuarioDaForca {

	private double percentualDeRaiva;
	private boolean temPoderesDeTelepatia;
	
	protected int tipo = 1;
	
	public double getPercentualDeRaiva() {
		return percentualDeRaiva;
	}
	public void setPercentualDeRaiva(double percentualDeRaiva) {
		this.percentualDeRaiva = percentualDeRaiva;
	}
	public boolean isTemPoderesDeTelepatia() {
		return temPoderesDeTelepatia;
	}
	public void setTemPoderesDeTelepatia(boolean temPoderesDeTelepatia) {
		this.temPoderesDeTelepatia = temPoderesDeTelepatia;
	}
	
}
