package br.com.trabalhofinal.main;
import java.util.Scanner;
import br.com.trabalhofinal.conta.*;


import java.util.Random;

public class TestaContas {

	public static void main(String[] args) {
		
		ContaTeste Ct = new ContaTeste();
		Scanner scan = new Scanner(System.in);
		Random sortear = new Random();
		int numero = sortear.nextInt(100000);

		// Iniciando o programa;
		System.out.println("|===========================================|");
		System.out.println("|                                           |");
		System.out.println("|               BANCO DO RAUL               |");
		System.out.println("|                                           |");
		System.out.println("|===========================================|");
		System.out.println("|Qual conta deseja abrir?                   |");
		System.out.println("|[1] Corrente                               |");
		System.out.println("|[2] Poupança                               |");
		System.out.println("|===========================================|");
		int tipo = scan.nextInt();
		
		if (tipo == 1) {
			ContaCorrente Cc = new ContaCorrente();

			Cc.setTipo("Corrente");
			System.out.println("|Digite seu nome: "+"                          |");
			String nome = scan.next();
			System.out.println("|Digite no formato: 000.000.000-00 "+"         |");
			System.out.println("|Digite se CPF: "+"                            |");
			String CPF = scan.next();
			Cc.setCPF(CPF);
			Cc.setTitular(nome);
			Cc.setNumConta(numero);

			Cc.ImpressaoDeDados();
			
			// Leaut de escolha; 
			System.out.println("|-------------------------------------------|");
			System.out.println("|O QUE PODEMOS FAZER POR VOCÊ HOJE?         |");
			System.out.println("|-------------------------------------------|");
			System.out.println("|                                           |");
			System.out.println("|Deseja realizar qual operação?             |");
			System.out.println("|[1] Sacar                                  |");
			System.out.println("|[2] Depositar                              |");
			System.out.println("|[3] Transferir                             |");
			System.out.println("|[4] Rendimento Mensal                      |");
			System.out.println("|===========================================|");
			int escolha = scan.nextInt();
			
			if (escolha == 1) {
				System.out.println("|Deseja Sacar quanto?  "+"                     |");
				double saque = scan.nextDouble();
				Cc.saca(saque);
				System.out.println("|Deseja fazer a impressão? [S/N]"+"            |");
				String resposta = scan.next();
				if(resposta.equals("S") || resposta.equals("s")) {
					Cc.ImpressaoDeDados();
					System.out.println("|                                           |");
					System.out.println("|              [Volte sempre!]              |");
					System.out.println("|___________________________________________|");


				} else {
					System.out.println("|                                           |");
					System.out.println("|              [Volte sempre!]              |");
					System.out.println("|___________________________________________|");


				}

			} else if (escolha == 2) {
				System.out.println("|Deseja Depositar quanto?                   |");
				double deposito = scan.nextDouble();
				Cc.deposita(deposito);
				System.out.println("|Deseja fazer a impressão? [S/N]"+"            |");
				String resposta = scan.next();
				if(resposta.equals("S") || resposta.equals("s")) {
					Cc.ImpressaoDeDados();
					System.out.println("|                                           |");
					System.out.println("|              [Volte sempre!]              |");
					System.out.println("|___________________________________________|");


				} else {
					System.out.println("|                                           |");
					System.out.println("|              [Volte sempre!]              |");
					System.out.println("|___________________________________________|");
				}

			} else if (escolha == 3) {
				String outroTitular;
				String outraConta;
				
				System.out.println("|Deseja Transferir quanto?                  |");
				double transferencia = scan.nextDouble();
				System.out.println("|Para quem deseja Transferir?               |");
				outroTitular = scan.next();
				System.out.println("|Conta:                                     |");
				outraConta = scan.next();
				Cc.transferencia(Cc, outraConta, transferencia);
				System.out.println("|Deseja fazer a impressão? [S/N]"+"            |");
				String resposta = scan.next();
				if(resposta.equals("S") || resposta.equals("s")) {
					Cc.ImpressaoDeDados();
					System.out.println("|                                           |");
					System.out.println("|              [Volte sempre!]              |");
					System.out.println("|___________________________________________|");


				} else {
					System.out.println("|                                           |");
					System.out.println("|              [Volte sempre!]              |");
					System.out.println("|___________________________________________|");
				}

			} else if (escolha == 4) {
				Cc.extrato();
			}
			else {
				System.out.println("|[ERRO] Não identificamos Sua escolha!|");

			}
			scan.close();

		} else if (tipo == 2) {
			ContaPoupanca Cp = new ContaPoupanca(); 

			Cp.setTipo("Poupança");
			System.out.println("|Digite seu nome:                           |");
			String nome = scan.next();
			System.out.println("|Digite no formato: 000.000.000-00 "+"         |");
			System.out.println("|Digite se CPF:                             |");
			String CPF = scan.next();
			Cp.setCPF(CPF);
			Cp.setTitular(nome);
			Cp.setNumConta(numero);

			Cp.ImpressaoDeDados();
			
			// Leaut de escolha; 
			System.out.println("|-------------------------------------------|");
			System.out.println("|O QUE PODEMOS FAZER POR VOCÊ HOJE?         |");
			System.out.println("|-------------------------------------------|");
			System.out.println("|                                           |");
			System.out.println("|Deseja realizar qual operação?             |");
			System.out.println("|[1] Sacar                                  |");
			System.out.println("|[2] Depositar                              |");
			System.out.println("|[3] Transferir                             |");
			System.out.println("|[4] Rendimento Mensal                      |");
			System.out.println("|===========================================|");
			int escolha = scan.nextInt();
			
			if (escolha == 1) {
				System.out.println("|Deseja Sacar quanto?  "+"                     |");
				double saque = scan.nextDouble();
				Cp.saca(saque);
				System.out.println("|Deseja fazer a impressão? [S/N]"+"            |");
				String resposta = scan.next();
				if(resposta.equals("S") || resposta.equals("s")) {
					Cp.ImpressaoDeDados();
					System.out.println("|                                           |");
					System.out.println("|              [Volte sempre!]              |");
					System.out.println("|___________________________________________|");


				} else {
					System.out.println("|                                           |");
					System.out.println("|              [Volte sempre!]              |");
					System.out.println("|___________________________________________|");


				}

			} else if (escolha == 2) {
				System.out.print("Deseja Depositar quanto? R$");
				double deposito = scan.nextDouble();
				Cp.deposita(deposito);
				System.out.println("|Deseja fazer a impressão? [S/N]"+"            |");
				String resposta = scan.next();
				if(resposta.equals("S") || resposta.equals("s")) {
					Cp.ImpressaoDeDados();
					System.out.println("|                                           |");
					System.out.println("|              [Volte sempre!]              |");
					System.out.println("|___________________________________________|");


				} else {
					System.out.println("|                                           |");
					System.out.println("|              [Volte sempre!]              |");
					System.out.println("|___________________________________________|");


				}


			} else if (escolha == 3) {
				String outroTitular;
				String outraConta;
				
				System.out.print("Deseja Transferir quanto?  ");
				double transferencia = scan.nextDouble();
				System.out.print("Para quem deseja Transferir?  ");
				outroTitular = scan.next();
				System.out.println("Conta: ");
				outraConta = scan.next();
				Cp.transferencia(Cp, outraConta, transferencia);
				System.out.println("|Deseja fazer a impressão? [S/N]"+"            |");
				String resposta = scan.next();
				if(resposta.equals("S") || resposta.equals("s")) {
					Cp.ImpressaoDeDados();
					System.out.println("|                                           |");
					System.out.println("|              [Volte sempre!]              |");
					System.out.println("|___________________________________________|");


				} else {
					System.out.println("|                                           |");
					System.out.println("|              [Volte sempre!]              |");
					System.out.println("|___________________________________________|");


				}

			} else if (escolha == 4) {
				Cp.extrato();
				
			} else {
				System.out.println("[ERRO] Não identificamos Sua escolha!");

			}
			scan.close();

		} else {
			System.out.println("[ERRO] Não identificamos esse tipo de conta!");
		}
		scan.close();
	}
}
