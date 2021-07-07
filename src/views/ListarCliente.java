package views;

import controllers.ClienteController;
import models.Cliente;


public class ListarCliente {	
	
	public static void Listar() {
		ClienteController controllerCli = new ClienteController();
		System.out.println("\n ****LISTAGEM DE CLIENTES**** \n");
		for (Cliente cliCad : controllerCli.Mostrar()) {
			System.out.println(cliCad);
		}
	}
	
}
