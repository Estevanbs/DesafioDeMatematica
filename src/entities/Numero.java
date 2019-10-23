package entities;

public class Numero {

	public int numeroDigitado;

	private String parImpar() {
		if (this.numeroDigitado % 2 == 0) {
			return "\"� par\", \"n�o � impar\"";
		} else
			return "\"n�o � par\", \"� impar\"";
	}

	private String maiorQueDez() {
		if (this.numeroDigitado > 10) {
			return "\"� maior que 10\"";
		} else if (this.numeroDigitado < 10) {
			return "\"n�o � maior que 10\"";
		} else
			return "\"� igual a 10\"";
	}

	private int dobro() {
		return numeroDigitado * 2;
	}

	private String primo() {
		boolean primo = true;
		for (int i = 2; i < this.numeroDigitado; i++) {
			if (this.numeroDigitado % i == 0) {
				primo = false;
			}
		}
		if (primo && numeroDigitado >= 2) {
			return "\"� primo\"";
		}
		else
			return "\"n�o � primo\"";
	}

	public String toString() {
		return parImpar() + ", " + maiorQueDez() + ", \"o dobro de " + numeroDigitado + " � " + dobro() + "\", "
				+ primo();
	}
}
