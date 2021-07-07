package views;

import java.util.Scanner;

import controllers.CarroController;
import controllers.DescricaoController;
import models.DescricaoAvancada;
import models.Carro;


public class CadastroAvanc {
	public static void cadastrarDes() {
		Scanner ler = new Scanner(System.in);
		DescricaoAvancada descricao = new DescricaoAvancada();
		Carro carro = new Carro();
		CarroController controllerCar = new CarroController();
		DescricaoController controllerDes = new DescricaoController();
		String modelo;
		
		System.out.println("\n **** CADASTRO AVANÇADO **** \n");
		System.out.println("Digite o modelo do carro: ");
		modelo = ler.next();
		carro = controllerCar.buscarModelo(modelo);
		if(carro != null) {
			if(carro.getModelo().equals(modelo)) {
				descricao.setCarro(carro);
				controllerDes.cadastrarDes(descricao);
				System.out.println("Digite a quantidade de cavalos: ");
				descricao.setCavalos(ler.next());
				System.out.println("Digite se o tipo de câmbio: ");
				descricao.setCambio(ler.next());
				System.out.println("Digite a velocidade máxima: ");
				descricao.setKm(ler.next());
				System.out.println("Digite o tempo de 0 - 100 segundos: ");
				descricao.setTempo(ler.next());
				System.out.println("Carro adiciondado com sucesso!");
			}else {
				System.out.println("Esse carro não foi cadastrado ainda");
			}
		}else {
			System.out.println("Carro não cadastrado");
		}
	}
}
