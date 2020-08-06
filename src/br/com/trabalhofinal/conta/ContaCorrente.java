package br.com.trabalhofinal.conta;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta {

	Date dataHoraAtual = new Date();
	String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
	String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

	
	private double saldo;
	private String CPF;

	
	public ContaCorrente(){
		this.saldo = 50;
	}
	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
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
		return getSaldo();
	}
	
	public String getTitular() {
		return super.getTitular();
	}
	
	public String getTipo() {
		return super.getTipo();
	}

	public double calculaRendimento() {
		return this.saldo * 0.10; 
	}
	
	public void extrato() {
		System.out.println("|" + "["+data+"]" + " " + hora + "                      |");
		System.out.println("|Tipo: Conta " + getTipo()+"                       |");
		System.out.println("|Titular: " + getTitular()+"                              |");
		System.out.println("|Agência: " + getAgencia()+"                              |");
		System.out.println("|Conta: " + getNumConta()+"                             |");
		System.out.println("|CPF: " + getCPF()+"                        |");
		System.out.println("|Saldo: R$"+this.saldo+ "                              |");
		System.out.println("|Seu Rendimento: " + calculaRendimento()+"                        |");
		System.out.println("|Saldo R$" + this.saldo + " + " + calculaRendimento() + " = " + (this.saldo + calculaRendimento())+"                  |");
		System.out.println("|Seu novo Saldo: R$"+(this.saldo + calculaRendimento())+"                     |");
		System.out.println("|                                           |");
		System.out.println("|              [Volte sempre!]              |");
		System.out.println("|___________________________________________|");
	}
	
	public void ImpressaoDeDados() {
		System.out.println("|" + "["+data+"]" + " " + hora + "                      |");
		System.out.println("|-------------------------------------------|");
		System.out.println("|Tipo: Conta " + getTipo()+"                       |");
		System.out.println("|Titular: " + getTitular()+"                              |");
		System.out.println("|Agência: " + getAgencia()+"                              |");
		System.out.println("|Conta: " + getNumConta()+"                             |");
		System.out.println("|CPF: " + getCPF()+"                        |");
		System.out.println("|Saldo: R$"+this.saldo+"                              |");
		
	}

}
