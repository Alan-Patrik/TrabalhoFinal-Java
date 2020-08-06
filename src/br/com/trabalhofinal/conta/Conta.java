package br.com.trabalhofinal.conta;

public abstract class Conta {
	
	private String titular;
	private String agencia = "3533";
	private double numConta;
	private String tipo;
	protected double saldo;

	Conta(){
		
	}
	
	abstract double calculaRendimento();

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public double getNumConta() {
		return numConta;
	}

	public void setNumConta(double numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
	
	