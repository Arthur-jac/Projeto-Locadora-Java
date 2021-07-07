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
		System.out.println("5 - Cadastrar funcion�rio");
		System.out.println("6 - Listar funcion�rios");
		System.out.println("7 - Cadastro avan�ado");
		System.out.println("8 - Descri��o listada");
		System.out.println("9 - Forma de pagamento");
		System.out.println("10 - Loca��o do carro");
		System.out.println("11 - Listar pagamentos");
		System.out.println("12 - Listar loca��es");
		System.out.println("13 - Delvover loca��o");
		opcao = ErroTipo.lerNum(" \nDigite o n�mero que seja a op��o correspondente ao seu pedido");
		return opcao;
	}

	public static void main(String[] args) {
		int op;
		
		System.out.println("****Bem-vindo a Loca��o de carros****");
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
				System.out.println("Op��o inv�lida...");
			}
		} while (op!=0);
	}
}
