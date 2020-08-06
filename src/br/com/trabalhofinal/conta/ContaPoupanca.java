package br.com.trabalhofinal.conta;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {

	Date dataHoraAtual = new Date();
	String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
	String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
	
	private double saldo;
	private String CPF;

	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public ContaPoupanca(){
		this.saldo = 150;
	}
	
	public void saca(double valor) {
		if(valor > this.saldo) {
			System.out.println("Não foi possível realizar o saque. Saldo insuficiente!");

		}
		else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			System.out.println("Saque realizado com Sucesso!");

		}
	}
	
	public void deposita(double valor) {
		if(valor <= 0){
			System.out.println("Não foi possível realizar o depósito. Verifique o valor!");
			
		}
		else {
			double novoSaldo = this.saldo + valor;
			this.saldo = novoSaldo;
			System.out.println("Depósito realizado com Sucesso!");

		}
	}
	
	public void transferencia(Conta remetente, String outraConta, double valor) {
		if (valor > this.saldo ) {
			System.out.println("Não foi possível realizar a tranferência. Verifique seu Saldo!");
			
			
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			System.out.println("Tranferência realizada com Sucesso!");
			
		}
	}
	
	public double getSaldo() {
		return super.getSaldo();
	}
	
	public String getTipo() {
		return super.getTipo();
	}

	public String getTitular() {
		return super.getTitular();
	}

	double calculaRendimento() {
		return this.saldo * 0.15; 
	}
	
	public void extrato() {
		System.out.println("|" + "["+data+"]" + " " + hora + "                        |");
		System.out.println("|Tipo: Conta " + getTipo()+"                       |");
		System.out.println("|Titular: " + getTitular()+"                              |");
		System.out.println("|Agência: " + getAgencia()+"                              |");
		System.out.println("|Conta: " + getNumConta()+"                             |");
		System.out.println("|CPF: " + getCPF()+"                        |");
		System.out.println("|Saldo: R$"+this.saldo+ "                             |");
		System.out.println("|Seu Rendimento: " + calculaRendimento()+"                       |");
		System.out.println("|Saldo R$" + this.saldo + " + " + calculaRendimento() + " = " + (this.saldo + calculaRendimento())+"               |");
		System.out.println("|Seu novo Saldo: R$"+(this.saldo + calculaRendimento())+"                    |");
		System.out.println("|                                           |");
		System.out.println("|              [Volte sempre!]              |");
		System.out.println("|___________________________________________|");
	}

	public void ImpressaoDeDados() {
		System.out.println("|" + "["+data+"]" + " " + hora + "                      |");
		System.out.println("|-------------------------------------------|");
		System.out.println("|Tipo: Conta " + this.getTipo()+"                       |");
		System.out.println("|Titular: " + this.getTitular()+"                              |");
		System.out.println("|Agência: " + this.getAgencia()+"                              |");
		System.out.println("|Conta: " + this.getNumConta()+"                             |");
		System.out.println("|CPF: " + this.getCPF()+"                        |");
		System.out.println("|Saldo: R$"+this.saldo+"                             |");
		
	}
	
}
