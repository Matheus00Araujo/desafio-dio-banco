package aplicação;

import java.util.InputMismatchException;
import java.util.Scanner;

import Entidades.Agencia;
import Entidades.Banco;
import Entidades.Cliente;
import Entidades.Conta;
import Entidades.ContaCorrente;
import Entidades.ContaPoupanca;
import Entidades.Endereco;

public class Programa {

	public static void main(String[] args) {
		//Gerando BANCO
		Banco matheusBank = new Banco("Matheus Bank");
				
		//Gerando Agências + seus respectivos endereços
		//Agência1 + seu endereço
		Endereco enderecoAgencia1 = new Endereco("São Paulo", "SP", "Av. Paulista", 1000, "11111-111");
		Agencia banco1Agencia1 = new Agencia(matheusBank, enderecoAgencia1);
		matheusBank.adicionarAgencia(banco1Agencia1);
				
		//Agência2 + seu endereço
		Endereco enderecoAgencia2 = new Endereco("Rio de Janeiro", "RJ", "Av. Brasil", 2000, "22222-222");
		Agencia banco1Agencia2 = new Agencia(matheusBank, enderecoAgencia2);
		matheusBank.adicionarAgencia(banco1Agencia2);
				
		//Agência3 + seu endereço
		Endereco enderecoAgencia3 = new Endereco("Curitiba", "PR", "Av. Brasil", 2000, "33333-333");
		Agencia banco1Agencia3 = new Agencia(matheusBank, enderecoAgencia3);
		matheusBank.adicionarAgencia(banco1Agencia3);
				
				
				
		//Populando Dados dos Clientes,  Contas e Agências
				
		//Agência1
		Cliente cliente1Agencia1 = new Cliente("Matheus Araujo", "001.001.001-01");
		Conta contaCorrenteCliente1Agencia1 = new ContaCorrente(cliente1Agencia1, banco1Agencia1);
		contaCorrenteCliente1Agencia1.depositar(100);
		banco1Agencia1.adicionarContas(contaCorrenteCliente1Agencia1);
				
		Cliente cliente2Agencia1 = new Cliente("Angelo Vieira", "002.002.002-02");
		Conta contaPoupancaCliente2Agencia1 = new ContaPoupanca(cliente2Agencia1, banco1Agencia2);
		contaPoupancaCliente2Agencia1.depositar(200);
		banco1Agencia1.adicionarContas(contaPoupancaCliente2Agencia1);
				
		//Agência2
		Cliente cliente1Agencia2 = new Cliente("Maria Eduarda", "003.003.003-03");
		Conta contaCorrenteCliente1Agencia2 = new ContaCorrente(cliente1Agencia2, banco1Agencia2);
		contaCorrenteCliente1Agencia2.depositar(300);
		banco1Agencia2.adicionarContas(contaCorrenteCliente1Agencia2);
						
		Cliente cliente2Agencia2 = new Cliente("João Lucas", "004.004.004-04");
		Conta contaPoupancaCliente2Agencia2 = new ContaPoupanca(cliente2Agencia2, banco1Agencia2);
		contaPoupancaCliente2Agencia2.depositar(400);
		banco1Agencia2.adicionarContas(contaPoupancaCliente2Agencia2);
				
		//Agência3
		Cliente cliente1Agencia3 = new Cliente("Ana Clara", "005.005.005-05");
		Conta contaCorrenteCliente1Agencia3 = new ContaCorrente(cliente1Agencia3, banco1Agencia3);
		contaCorrenteCliente1Agencia3.depositar(500);
		banco1Agencia3.adicionarContas(contaCorrenteCliente1Agencia3);
								
		Cliente cliente2Agencia3 = new Cliente("Gabriela Arantes", "006.006.006-06");
		Conta contaPoupancaCliente2Agencia3 = new ContaPoupanca(cliente2Agencia3, banco1Agencia3);
		contaPoupancaCliente2Agencia3.depositar(600);
		banco1Agencia3.adicionarContas(contaPoupancaCliente2Agencia3);
		
		
		//MENU DE INTERAÇÃO
		boolean continuar = false;;
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("======= BANCO =======");
			System.out.println("1. Listar Agências");
			System.out.println("2. Listar Contas");
			System.out.println("3. Entrar na Conta");
			System.out.println("4. Sair");
			System.out.println("\nDigite o número de acordo com o que deseja: ");
			
			try {
				int menuItem = sc.nextInt();
				switch(menuItem) {
					case 1:
						matheusBank.listarAgencias();
						break;
					
					case 2:
						do {
							System.out.println("\nDeseja Listar Contas de Qual Agência? ");
							try {
								int listarContas = sc.nextInt();
								switch(listarContas) {
									case 1:
										banco1Agencia1.listarContas();
										break;
										
									case 2:
										banco1Agencia2.listarContas();
										break;
										
									case 3:
										banco1Agencia3.listarContas();
										break;
									
									default:
										System.out.println("\nDigite o número 1, 2 ou 3 para listar as contas!");
										break;
								}
								System.out.println("\nDeseja Listar as Contas de outra Agência? s/n");
								char listarOutra = sc.next().toLowerCase().charAt(0);
								if(listarOutra == 's') {
									continuar = true;
								}else {
									continuar = false;
								}
							}catch(InputMismatchException erro) {
								System.out.println("\\n========================== ERRO ==========================");
								System.out.println("|| Digite Apenas o Número Correspondente ao da Agência! ||");
								System.out.println("==========================================================\n");
								continuar = true;
							}
						}while(continuar);
						break;
					
					case 3:
						do {
							try {
								System.out.println("Digite o Número da Agência: ");
								int numeroAgencia = sc.nextInt();
								System.out.println("Digite o Número da Conta: ");
								int numeroConta = sc.nextInt();
								
								Conta c = matheusBank.procurarConta(numeroAgencia, numeroConta);
								continuar = menuContaCliente(c);
								
							}catch(InputMismatchException erro) {
								System.out.println("\n=========== ERRO ===========");
								System.out.println("||     CPF Incorreto!     ||");
								System.out.println("============================\n");
								continuar = true;
							}
						}while(continuar);
						
						break;
						
					case 4:
						continuar = false;
						continue;
						
					default:
						System.out.println("\n=========== ERRO ============");
						System.out.println("|| Digite um Número Válido ||");
						System.out.println("=============================\n");
				}
			}catch(InputMismatchException erro) {
				System.out.println("\n=========== ERRO ===========");
				System.out.println("|| Digite Apenas Números! ||");
				System.out.println("============================\n");
				continuar = true;
			}
			System.out.println("\nDeseja voltar ao menu principal? s/n");
			char voltarMenu = sc.next().toLowerCase().charAt(0);
			if(voltarMenu == 's') {
				continuar = true;
			}else {
				continuar = false;
			}
		}while(continuar);
		
		System.out.println("\nOBRIGADO POR USAR O NOSSO BANCO =)");
	}

	//Método Para o Menu de interação de Cliente
	private static boolean menuContaCliente(Conta c) {
		Scanner sc = new Scanner(System.in);
		boolean continuar = false;
		do {
			System.out.println(String.format("Bem Vindo %s", c.getCliente().getNome()));
			System.out.println("\nDigite o número correspondente ao que deseja fazer?");
			System.out.println("1. Depositar");
			System.out.println("2. Sacar");
			System.out.println("3. Transferir");
			System.out.println("4. Consultar Saldo");
			System.out.println("5. Voltar");
			try {
				int resposta = sc.nextInt();
				double valor;
				switch (resposta) {
					case 1:
						System.out.println("\nDigite o Valor a ser Depositado: ");
						valor = sc.nextDouble();
						c.depositar(valor);
						break;
					case 2:
						System.out.println("\nDigite o Valor a ser Sacado: ");
						valor = sc.nextDouble();
						c.sacar(valor);
						break;
					case 3:
						System.out.println("\nDigite o número da Agência de destino: ");
						int ag = sc.nextInt();
						System.out.println("\nDigite o número da Conta de destino: ");
						int contaDestino = sc.nextInt();
						System.out.println("\nDigite o Valor a ser Transferido: ");
						valor = sc.nextDouble();
						Conta contaTransferir = c.getAgencia().getBanco().procurarConta(ag, contaDestino);
						if (contaTransferir != null) {
							c.transferir(valor, contaTransferir);
							System.out.println("\nTransferência realizada com Sucesso!");
						}else {
							System.out.println("\nConta não Encontrada!" +
												"\nTransferência não pode ser concluida!");
						}
						
						break;
					case 4:
						c.imprimirDadosConta();
						break;
					case 5:
						continuar = false;
						continue;
					default:
						System.out.println("\n=========== ERRO ============");
						System.out.println("|| Digite um Número Válido ||");
						System.out.println("=============================\n");
						continuar = true;
				}
				System.out.println("\nDeseja Realizar outra Operação? s/n");
				char voltarMenu = sc.next().toLowerCase().charAt(0);
				if(voltarMenu == 's') {
					continuar = true;
				}else {
					continuar = false;
				}
				
			}catch(InputMismatchException erro) {
				System.out.println("\n=========== ERRO ===========");
				System.out.println("|| Digite Apenas Números! ||");
				System.out.println("============================\n");
				continuar = true;
			}
		}while(continuar);
		
		return false;
	}
}
