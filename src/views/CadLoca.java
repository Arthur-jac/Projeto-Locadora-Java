package views;
import java.util.Scanner;

import controllers.CarroController;
import controllers.ClienteController;
import controllers.LocacaoController;
import controllers.PagamentoController;
import models.Locacao;
import models.Cliente;
import models.Carro;
import models.FormaPag;

public class CadLoca{
	public static void locacao() {
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
		int cod_loc = 0;
					
		System.out.println("\n **** LOCAÇÃO DO CARRO **** \n");
		System.out.println("Digite a placa do carro para a verificação das locações: ");
		locacao.setplacaLoc(ler.next());
		if (controllerLoc.estaLoc(locacao)) {
			System.out.println("Digite o cpf do cliente: ");
			cpf = ler.next();
			cliente = controllerCli.buscarCpf(cpf);
			if (cliente != null) {
				locacao.setCliente(cliente);
				System.out.println("Digite a placa do carro: ");
				placa = ler.next();
				carro = controllerCar.buscarPlaca(placa);
				if (carro != null) {
					locacao.setCarro(carro);
						System.out.println("Digite o número do cartão: ");
						pagamento = ler.next();
						formaPag = controllerPag.buscarPag(pagamento);
						if (formaPag != null) {
							if (formaPag.getnumCartao().equals(pagamento)) {
								locacao.setPagamento(formaPag);
								System.out.println("Digite a data da locação: ");
								locacao.setdatLoc(ler.next());
								System.out.println("Digite a data da devolução: ");
								locacao.setdataDev(ler.next());
								cod_loc++;
								locacao.setCod_loc(cod_loc);
								controllerLoc.cadastrarLoc(cliente, locacao);
								System.out.println("Carro locado com sucesso");	
							}else {
								System.out.println("Pagamento não compátivel");
							}
						}else {
							System.out.println("Pagamento não cadastrado");
						}
				}else {
					System.out.println("Carro não cadastrado");
				}
			}else {
				System.out.println("Cliente não cadastrado");
			}
		} else {
			System.out.println("Carro já locado");
		}
	}
}