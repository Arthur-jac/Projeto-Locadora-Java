package views;

import java.util.Scanner;
import models.Funcionario;
import controllers.FuncionarioController;

public class CadastrarFunc {
	public static void cadastrarFunc() {
		Scanner ler = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		FuncionarioController controllerFunc = new FuncionarioController();
		
		System.out.println("\n ****CADASTRO DO FUNCIONÁRIO**** \n");
		System.out.println("Cpf: ");
		funcionario.setCpf(ler.next());
		if (controllerFunc.cadastrarFunc(funcionario)) {
			System.out.println("Nome: ");
			funcionario.setNome(ler.next());
			System.out.println("Telefone: ");
			funcionario.setTelefone(ler.next());
			System.out.println("Data de nascimento: ");
			funcionario.setDataNasc(ler.next());
			System.out.println("Sexo: ");
			funcionario.setSexo(ler.next());
			System.out.println("Email: ");
			funcionario.setEmail(ler.next());
			System.out.println("Funcionário cadastrado com sucesso");
		} else {
			System.out.println("Esse funcionário já existe");
		}
	}
}
