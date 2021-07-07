package views;

import java.util.Scanner;
import controllers.CarroController;
import controllers.ClienteController;
import controllers.LocacaoController;
import controllers.PagamentoController;
import models.Carro;
import models.Cliente;
import models.FormaPag;
import models.Locacao;

public class Devolucao {
	public static void devolucao() {
		Scanner ler = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Carro carro = new Carro();
		FormaPag formaPag = new FormaPag();
		Locacao locacao = new Locacao();
		ClienteController controllerCli = new ClienteController();
		CarroController controllerCar = new CarroController();
		LocacaoController controllerLoc = new LocacaoController();
		PagamentoController controllerPag = new PagamentoController();
		String cpf, placa, pagamento;
		int cod_loc;
		
		System.out.println("\n **** DEVOLUÇÃO DO CARRO **** \n");
		System.out.println("Digite o cpf do cliente: ");
		cpf = ler.next();
		cliente = controllerCli.buscarCpf(cpf);
		if (cliente != null) {
			System.out.println("Digite a placa do carro: ");
			placa = ler.next();
			carro = controllerCar.buscarPlaca(placa);
			if (carro != null) {
				System.out.println("Digite o número do cartão: ");
				pagamento = ler.next();
				formaPag = controllerPag.buscarPag(pagamento);
				if (formaPag != null) {
					if (formaPag.getnumCartao().equals(pagamento)) {
						controllerLoc.removeLoc(locacao.getCod_loc());
						System.out.println("Carro devolvido com sucesso!");
					} else {
						System.out.println("Pagamento inválido");
					}
				} else {
					System.out.println("Forma de pagamento não compátivel");
				}
			} else {
				System.out.println("Carro não cadastrado");
			}
		} else {
			System.out.println("Cliente não cadastrado");
		}
	}
}
