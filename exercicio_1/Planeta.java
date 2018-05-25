package exercicio_1;

public class Planeta {
	
	private String nome;
	private double diametro;
	private String cor;
	private GovernoVigente governoVigente;
	private String sistema;
	private String capital;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public GovernoVigente getGovernoVigente() {
		return governoVigente;
	}
	public void setGovernoVigente(GovernoVigente governoVigente) {
		this.governoVigente = governoVigente;
	}
	
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
