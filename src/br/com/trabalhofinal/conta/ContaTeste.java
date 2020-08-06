package br.com.trabalhofinal.conta;

public class ContaTeste extends Conta {
	private double saldo = 0;
	
	public ContaTeste() {
		this.saldo = 1000;
	}
	@Override
	double calculaRendimento() {
		return 0;
	}
}