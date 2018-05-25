package exercicio_1;

public class Habilidades {

	private int valor;
	private int dano;
	private String nomeDaHabilidade;
	// tipo: 0 = Jedi e 1 = Sith
	// tipoDeDominioDaHabilidade: 0 = Forca e 1 = Sabre

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public String getNomeDaHabilidade() {
		return nomeDaHabilidade;
	}

	public void setNomeDaHabilidade(String nomeDaHabilidade) {
		this.nomeDaHabilidade = nomeDaHabilidade;
	}

	public void habilidade(int tipo, int tipoDeDominioDaHabidade) {

		valor = NomesDeHabilidades.habilidades();
		if (tipo == 0) {
			if (tipoDeDominioDaHabidade == 0) {
				nomeDaHabilidade = NomesDeHabilidades.habilidadeJediForca[valor];
				dano = NomesDeHabilidades.habilidadeJediForcaDano[valor];
			} else if (tipoDeDominioDaHabidade == 1) {
				nomeDaHabilidade = NomesDeHabilidades.habilidadeJediSabre[valor];
				dano = NomesDeHabilidades.habilidadeJediSabreDano[valor];
			}
		}

		if (tipo == 1) {
			if (tipoDeDominioDaHabidade == 0) {
				nomeDaHabilidade = NomesDeHabilidades.habilidadeSithForca[valor];
				dano = NomesDeHabilidades.habilidadeSithForcaDano[valor];
			} else if (tipoDeDominioDaHabidade == 1) {
				nomeDaHabilidade = NomesDeHabilidades.habilidadeSithSabre[valor];
				dano = NomesDeHabilidades.habilidadeSithSabreDano[valor];
			}
		}
	}
}
