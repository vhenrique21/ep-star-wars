package exercicio_1;

public class Ser {
	
	private String nome;
	private String sexo;
	private String especie;
	private String nascimento;
	private Planeta planetaNatal;
	private int vida = 100;
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public Planeta getPlanetaNatal() {
		return planetaNatal;
	}
	public void setPlanetaNatal(Planeta planetaNatal) {
		this.planetaNatal = planetaNatal;
	}
}
