 package views;

import java.util.Scanner;
import controllers.ClienteController;
import controllers.PagamentoController;
import models.FormaPag;
import models.Cliente;

public class Pagamento {
	public static void formaPag() {
		Scanner ler = new Scanner(System.in);
		FormaPag pagamento = new FormaPag();
		Cliente cliente = new Cliente();
		ClienteController controllerCli = new ClienteController();
		PagamentoController controllerPag = new PagamentoController();
		String cpf;
		
		System.out.println("\n **** FORMA DE PAGAMENTO **** \n");
		System.out.println("Digite o cpf do cliente: ");
		cpf = ler.next();
		cliente = controllerCli.buscarCpf(cpf);
		
		if (cliente != null) {
			pagamento.setCliente(cliente);
			System.out.println("Digite o nome do titular: ");
			pagamento.setnomeTitu(ler.next());
			System.out.println("Digite o n�mero do cart�o: ");
			pagamento.setnumCartao(ler.next());
			System.out.println("Digite o c�digo de seguran�a do cart�o: ");
			pagamento.setcodeSeg(ler.next());
			System.out.println("Digite a validade do cart�o: ");
			pagamento.setValidade(ler.next());
			controllerPag.cadastrarPag(pagamento);
			System.out.println("Forma de pagamento conclu�do");
		} else {
			System.out.println("Cliente n�o cadastrado");
		}
	}
}

