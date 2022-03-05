package Acaiteria;

public abstract class AcaiDecorator extends Acai {

	Acai acai;

	public AcaiDecorator(Acai umAcai) {
		acai = umAcai;
	}

	@Override
	public String getNome() {
		return acai.getNome() + " + " + nome;
	}

	public String getQuilo() {
		return acai.getQuilo() + " + " + quilo;
	}

}
