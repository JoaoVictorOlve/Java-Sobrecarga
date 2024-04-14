package Calculadora;

public class Operacao {
	
	private int numero1 = 0;
	private int numero2 = 0;

	public int soma(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public void setNumero1(int numero) {
		this.numero1 = numero;
	}

	public void setNumero2(int numero) {
		this.numero2 = numero;
	}

	public int subtracao() {
		return numero1 - numero2;
	}

	private int fatorialRecursivo(int numero) {
		if((numero == 1) || (numero == 0)) {
			return 1;
		} else {
			return fatorialRecursivo(numero - 1) * numero;
		}
	}

	public int getFatorial() {
		return fatorialRecursivo(numero1);
	}

	public int multiplicacao() {
		return numero1 * numero2;
	}

	public int divisao() {
		return numero1 / numero2;
	}

	public int soma(int numero1, int numero2, int numero3) {
		return numero1 + numero2 + numero3;
	}

	public int soma(String numero1, String numero2) {
		return Integer.parseInt(numero1) + Integer.parseInt(numero2);
	}
	
	public double exponenciacao(double numero1, double numero2) {
	    return Math.pow(numero1, numero2);
	}

}
