package entities;

public class Numero {

	public int numeroDigitado;

	private String parImpar() {
		if (this.numeroDigitado % 2 == 0) {
			return "\"é par\", \"não é impar\"";
		} else
			return "\"não é par\", \"é impar\"";
	}

	private String maiorQueDez() {
		if (this.numeroDigitado > 10) {
			return "\"é maior que 10\"";
		} else if (this.numeroDigitado < 10) {
			return "\"não é maior que 10\"";
		} else
			return "\"é igual a 10\"";
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
			return "\"é primo\"";
		}
		else
			return "\"não é primo\"";
	}

	public String toString() {
		return parImpar() + ", " + maiorQueDez() + ", \"o dobro de " + numeroDigitado + " é " + dobro() + "\", "
				+ primo();
	}
}
