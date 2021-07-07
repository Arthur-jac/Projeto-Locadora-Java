package views;

import controllers.FuncionarioController;
import models.Funcionario;

public class ListarFuncionario {
	public static void ListarFuncionarios() {
		FuncionarioController controllerFunc = new FuncionarioController();
		System.out.println("\n ****LISTAGEM DE FUNCIONÁRIOS**** \n");
		for (Funcionario listarFunc : controllerFunc.mostrarFunc()) {
			System.out.println(listarFunc);
		}
	}
}
