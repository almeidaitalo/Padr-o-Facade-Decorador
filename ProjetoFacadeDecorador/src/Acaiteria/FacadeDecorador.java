package Acaiteria;

public class FacadeDecorador {
	private Acai AcaiBomba = new AcaiNormal();
	private Acai AcaiSergipano = new AcaiNormal();
	private Acai AcaiBaiano = new AcaiNormal();
	private Acai AcaiParaense = new AcaiNormal();

	public void AcaiBomba() {
		System.out.println("\t 1. Acai Bomba: ");
		System.out.println(this.AcaiBomba.getNome() + " = " + this.AcaiBomba.getQuilo());

		AcaiBomba = new Amendoim();
		System.out.println(AcaiBomba.getNome() + " = " + AcaiBomba.getQuilo());

		AcaiBomba = new PoDeGuarana();
		System.out.println(AcaiBomba.getNome() + " = " + AcaiBomba.getQuilo());
	}

	public void AcaiSergipano() {
		System.out.println("\t 2. Acai Sergipano: ");
		System.out.println(this.AcaiSergipano.getNome() + " = " + this.AcaiSergipano.getQuilo());

		AcaiSergipano = new Banana();
		System.out.println(AcaiSergipano.getNome() + " = " + AcaiSergipano.getQuilo());

		AcaiSergipano = new Amendoim();
		System.out.println(AcaiSergipano.getNome() + " = " + AcaiSergipano.getQuilo());

		AcaiSergipano = new Morango();
		System.out.println(AcaiSergipano.getNome() + " = " + AcaiSergipano.getQuilo());
	}

	public void AcaiBaiano() {
		System.out.println("\t 3. Acai Baiano: ");
		System.out.println(this.AcaiBaiano.getNome() + " = " + this.AcaiBaiano.getQuilo());

		AcaiBaiano = new Ninho();
		System.out.println(AcaiBaiano.getNome() + " = " + AcaiBaiano.getQuilo());

		AcaiBaiano = new Pimenta();
		System.out.println(AcaiBaiano.getNome() + " = " + AcaiBaiano.getQuilo());
	}

	public void AcaiParaense() {
		System.out.println("\t 4. Acai Paraense: ");
		System.out.println(this.AcaiParaense.getNome() + " = " + AcaiParaense.getQuilo());

		AcaiParaense = new Castanha();
		System.out.println(this.AcaiParaense.getNome() + " = " + AcaiParaense.getQuilo());

	}
}
