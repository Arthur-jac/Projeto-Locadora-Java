package views;

import java.util.Scanner;
import controllers.ClienteController;
import controllers.ICliente;
import models.Cliente;

public class CadastroCliente {
	public static void cadastrarCli() {
		Scanner ler = new Scanner(System.in);
		Cliente cliente = new Cliente();
		ClienteController controllerCli = new ClienteController();
		
		System.out.println("\n ****CADASTRO DE CLIENTE**** \n");
		System.out.println("A cnh está válida: [S/N]");
		cliente.setCnh(ler.next());
		if (cliente.getCnh().equals("S")) {
			System.out.println("Cpf: ");
			cliente.setCpf(ler.next());
			if (controllerCli.cadastrarCli(cliente)) {
				System.out.println("Nome: ");
				cliente.setNome(ler.next());
				System.out.println("Telefone: ");
				cliente.setTelefone(ler.next());
				System.out.println("Data de nascimento: ");
				cliente.setDataNasc(ler.next());
				System.out.println("Sexo: ");
				cliente.setSexo(ler.next());
				System.out.println("Cliente cadastrado com sucesso");
			} else {
				System.out.println("Esse cliente já existe");
			}
		} else {
			System.out.println("Cnh inválida ");
		}
		
	}
}
