import java.util.Scanner;
public class PresidenteContaPoupanca {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		// Mensagem de apresentação demorada (ESMAECER);
		System.out.println("|=======                    Seja bem Vindo ao Banco Do Raul                    =======|");

		//Apresenta menu;
		System.out.println("|_____________________________________________________________________________________|");
		System.out.println("|                                                                                     |");
		System.out.println("|                                                                     Banco do Raul   |");
		System.out.println("|_____________________________________________________________________________________|");
		System.out.println("|   Login(CPF)                                                                        |");
		long cpf = scan.nextLong();
		
		System.out.println("|                             Bem Vindo " + "*Cliente*" + "                                     |");
		System.out.println("|   Digite sua senha                                                                  |");
		int senha = scan.nextInt();
		
		System.out.println("|                                                                                     |");
		System.out.println("|   O que deseja fazer?                                                               |");
		System.out.println("|_____________________________________________________________________________________|");
		System.out.println("|                                                                                     |");
		System.out.println("|       [1] Movimentacoes                [2] Relatorios                [3] Sair       |");
		System.out.println("|_____________________________________________________________________________________|");
		int operacao = scan.nextInt();
		
		// [1] Movimentacoes;
		if(operacao == 1) {
			System.out.println("|_____________________________________________________________________________________|");
			System.out.println("|                                                                                     |");
			System.out.println("|              [1] Sacar                                   [2] Depositar              |");
			System.out.println("|                                                                                     |");
			System.out.println("|              [3] Tranferir                               [4] Voltar                 |");
			System.out.println("|_____________________________________________________________________________________|");
			int escolha1 = scan.nextInt();
			System.out.println("|                                                                                     |");
			
			switch (escolha1) {
			
				case 1:
					
					//Menu de saque;
					System.out.println("|   Qual valor deseja sacar?                                                          |");
					System.out.println("|_____________________________________________________________________________________|");
					System.out.println("|                                                                                     |");
					System.out.println("|              [1] R$10,00                                 [2] R$25,00                |");
					System.out.println("|              [3] R$50,00                                 [4] R$100,00               |");
					System.out.println("|              [5] R$200,00                                [6] Outro valor            |");
					System.out.println("|              [7] Voltar                                                             |");
					System.out.println("|_____________________________________________________________________________________|");
					int valor1 = scan.nextInt();
					System.out.println("|                                                                                     |");
				
					if(valor1 == 1) {
						System.out.println("|   Voce confirma o saque de R$10,00? [S/N]                                           |");
						String resposta = scan.next();
						if(resposta.equals("S") || resposta.equals("s")) {
							System.out.println("|   Saque realizado com sucesso!                                                   |");
						} else {
							System.out.println("|   Operacao cancelada!                                                               |");
						}
					} else if(valor1 == 2) {
						System.out.println("|   Voce confirma o saque de R$25,00? [S/N]                                           |");
						String resposta = scan.next();
						if(resposta.equals("S") || resposta.equals("s")) {
							System.out.println("|   Saque realizado com sucesso!                                                   |");
						} else {
							System.out.println("|   Operacao cancelada!                                                               |");
						}

					} else if(valor1 == 3) {
						System.out.println("|   Voce confirma o saque de R$50,00? [S/N]                                           |");
						String resposta = scan.next();
						if(resposta.equals("S") || resposta.equals("s")) {
							System.out.println("|   Saque realizado com sucesso!                                                   |");
						} else {
							System.out.println("|   Operacao cancelada!                                                               |");
						}

					} else if(valor1 == 4) {
						System.out.println("|   Voce confirma o saque de R$100,00? [S/N]                                          |");
						String resposta = scan.next();
						if(resposta.equals("S") || resposta.equals("s")) {
							System.out.println("|   Saque realizado com sucesso!                                                   |");
						} else {
							System.out.println("|   Operacao cancelada!                                                               |");
						}

					} else if(valor1 == 5) {
						System.out.println("|   Voce confirma o saque de R$200,00? [S/N]                                          |");
						String resposta = scan.next();
						if(resposta.equals("S") || resposta.equals("s")) {
							System.out.println("|   Saque realizado com sucesso!                                                   |");
						} else {
							System.out.println("|   Operacao cancelada!                                                               |");
						}

					} else if(valor1 == 6) {
						System.out.println("|   Digite o valor para o saque                                                       |");
						int outroValor = scan.nextInt();
						System.out.println("|   Voce confirma o saque de R$" + outroValor + "? [S/N]                              |");
						String resposta = scan.next();
						if(resposta.equals("S") || resposta.equals("s")) {
							System.out.println("|   Saque realizado com sucesso!                                                   |");
						} else {
							System.out.println("|   Operacao cancelada!                                                               |");
						}
					}else if(valor1 == 7) {
						/*// Volta ao menu movimentacoes;
						System.out.println("|_____________________________________________________________________________________|");
						System.out.println("|                                                                                     |");
						System.out.println("|              [1] Sacar                                   [2] Depositar              |");
						System.out.println("|                                                                                     |");
						System.out.println("|              [3] Tranferir                               [4] Voltar                 |");
						System.out.println("|_____________________________________________________________________________________|");
						int escolha1 = scan.nextInt();
						System.out.println("|                                                                                     |");
						
						;*/
					}
					break;
					
				case 2:
			
					//Menu de deposito;
					System.out.println("|   Qual valor deseja depositar?                                                      |");
					System.out.println("|                                                                                     |");
					int valor2 = scan.nextInt();
					System.out.println("|   Voce confirma o deposito de R$" + valor2 + "? [S/N]                              |");
					String resposta2 = scan.next();
					if(resposta2.equals("S") || resposta2.equals("s")) {
						System.out.println("|   Deposito realizado com sucesso!                                                   |");
					} else {
						System.out.println("|   Operacao cancelada!                                                               |");
					}
					System.out.println("|_____________________________________________________________________________________|");
					break;
			
				case 3:
				
					//Menu de transferência;
					System.out.println("|   Qual valor deseja transferir?                                                     |");
					System.out.println("|                                                                                     |");
					int valor3 = scan.nextInt();
					System.out.println("|   Voce confirma o saque de R$" + valor3 + "? [S/N]                              |");
					String resposta3 = scan.next();
					
					if(resposta3.equals("S") || resposta3.equals("s")) {
						System.out.println("|   Deposito realizado com sucesso!                                                   |");
					} else {
						System.out.println("|   Operacao cancelada!                                                               |");
					}
					System.out.println("|_____________________________________________________________________________________|");
					break;
					
				case 4:
					/*// Volta para o menu principal;
					// FuncaoMenu();
					System.out.println("|_____________________________________________________________________________________|");
					System.out.println("|                                                                                     |");
					System.out.println("|       [1] Movimentacoes                [2] Relatorios                [3] Sair       |");
					System.out.println("|_____________________________________________________________________________________|");
					int operacao = scan.nextInt();
					
					break;*/
			}
		}
		
		// [2] Relatorios;
		else if(operacao == 2) {
			System.out.println("|_____________________________________________________________________________________|");
			System.out.println("|                                                                                     |");
			System.out.println("|          [1] Saldo                               [2] Rendimento Poupanca            |");
			System.out.println("|          [3] Clientes do Sistem                  [4] Capital Geral da Empresa       |");
			System.out.println("|                                                                                     |");
			System.out.println("|          [5] Voltar                                                                 |");
			System.out.println("|_____________________________________________________________________________________|");
			int escolha4 = scan.nextInt();
					
			switch(escolha4) {
					
				case 1:
					System.out.println("|_____________________________________________________________________________________|");
					System.out.println("|                                                                                     |");
					System.out.println("|          [1] Saldo na tela          [2] Imprimir Saldo          [3] Voltar          |");
					System.out.println("|_____________________________________________________________________________________|");
					int escolhaSaldo = scan.nextInt();
					
					if (escolhaSaldo == 1) {
						// ImprimeSaldo();
						// So o valor do saldo;
					} else if(escolhaSaldo == 2) {
						// ImprimeRelatorioSald();
						// Informacoes da conta e o valor de saldo;
						
					} else if(escolhaSaldo == 3) {
						/*System.out.println("|_____________________________________________________________________________________|");
						System.out.println("|                                                                                     |");
						System.out.println("|          [1] Saldo                               [2] Rendimento Poupanca            |");
						System.out.println("|          [3] Clientes do Sistem                  [4] Capital Geral da Empresa       |");
						System.out.println("|                                                                                     |");
						System.out.println("|          [5] Voltar                                                                 |");
						System.out.println("|_____________________________________________________________________________________|");
						int escolha4 = scan.nextInt();
			
						break;*/
					}
					
				case 2:
					// RendimentoPoupanca();
							
				case 3:
					// RelatorioDeClientesDoSistema();
						
				case 4:
					// Menu de captal do banco();
					System.out.println("|_____________________________________________________________________________________|");
					System.out.println("|                                                                                     |");
					System.out.println("|      [1] Saldo Total Geral       [2] Total de tarifas cobradas       [3] Voltar     |");
					System.out.println("|_____________________________________________________________________________________|");
					int operacao3 = scan.nextInt();
					if(operacao3 == 1) {
						// SaldoTotalGeral();
					} else if(operacao3 == 2) {
						//TotalDeTarifasCobradas();
					} else if(operacao3 == 3){
						/*System.out.println("|_____________________________________________________________________________________|");
						System.out.println("|                                                                                     |");
						System.out.println("|          [1] Saldo                               [2] Rendimento Poupanca            |");
						System.out.println("|          [3] Clientes do Sistem                  [4] Capital Geral da Empresa       |");
						System.out.println("|                                                                                     |");
						System.out.println("|          [5] Voltar                                                                 |");
						System.out.println("|_____________________________________________________________________________________|");
						int escolha4 = scan.nextInt();
						
						break*/	
					}
						
				case 5:
					/*// Volta ao menu principal;
					// FuncaoMenu();
					System.out.println("|_____________________________________________________________________________________|");
					System.out.println("|                                                                                     |");
					System.out.println("|       [1] Movimentacoes                [2] Relatorios                [3] Sair       |");
					System.out.println("|_____________________________________________________________________________________|");
					int operacao = scan.nextInt();
					
					break;*/					
			}
		}
		
		// [3] Sair;
		else {
			System.out.println("Obrigado volte sempre!");
		}
	}
}
