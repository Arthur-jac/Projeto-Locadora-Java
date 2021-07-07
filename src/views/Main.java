package views;

import java.util.Scanner;
import models.ErroTipo;

public class Main {
	private static Scanner ler = new Scanner(System.in);
	
	public static int Menu() {
		int opcao;
		
		System.out.println("\n ****MENU**** \n");
		System.out.println("0 - Sair");
		System.out.println("1 - Cadastrar cliente");
		System.out.println("2 - Listar clientes");
		System.out.println("3 - Cadastrar carro");
		System.out.println("4 - Listar carros");
		System.out.println("5 - Cadastrar funcionário");
		System.out.println("6 - Listar funcionários");
		System.out.println("7 - Cadastro avançado");
		System.out.println("8 - Descrição listada");
		System.out.println("9 - Forma de pagamento");
		System.out.println("10 - Locação do carro");
		System.out.println("11 - Listar pagamentos");
		System.out.println("12 - Listar locações");
		System.out.println("13 - Delvover locação");
		opcao = ErroTipo.lerNum(" \nDigite o número que seja a opção correspondente ao seu pedido");
		return opcao;
	}

	public static void main(String[] args) {
		int op;
		
		System.out.println("****Bem-vindo a Locação de carros****");
		do {
			op = Menu();
			switch (op) 
			{
			case 0: System.out.println("Programa encerrado");break;
			
			case 1: CadastroCliente.cadastrarCli(); break;
			
			case 2: ListarCliente.Listar(); break;
			
			case 3: CadastrarCarro.cadastrarCarro(); break;
				
			case 4: ListarCarro.ListarCarros(); break;
				
			case 5: CadastrarFunc.cadastrarFunc(); break;
				
			case 6:  ListarFuncionario.ListarFuncionarios(); break;
			
			case 7: CadastroAvanc.cadastrarDes(); break;
			
			case 8: ListarDescricao.listarDes(); break;
			
			case 9: Pagamento.formaPag(); break;
			
			case 10: CadLoca.locacao(); break;
			
			case 11: ListarPagamentos.pagamentos(); break;
			
			case 12: ListarLocacoes.locacoes(); break;
			
			case 13: Devolucao.devolucao(); break;
				
			default:
				System.out.println("Opção inválida...");
			}
		} while (op!=0);
	}
}
