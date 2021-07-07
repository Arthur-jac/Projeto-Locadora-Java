package views;

import java.util.Scanner;

import controllers.CarroController;
import models.Carro;
import models.ErroTipo;

public class CadastrarCarro {
	public static void cadastrarCarro() {
		Scanner ler = new Scanner(System.in);
		Carro carro = new Carro();
		CarroController controllerCar = new CarroController();
		
		System.out.println("\n ****CADASTRO DE CARRO**** \n");
		System.out.println("Placa: ");
		carro.setPlaca(ler.next());
		if (controllerCar.cadastrarCarro(carro)) {
			System.out.println("Modelo: ");
			carro.setModelo(ler.next());
			System.out.println("Marca:");
			carro.setMarca(ler.next());
			System.out.println("Cor: ");
			carro.setCor(ler.next());
			System.out.println("Ano: ");
			carro.setAno(ler.next());
			carro.setCusto(ErroTipo.lerNum("Custo (diária): "));
			System.out.println("Carro cadastrado com sucesso");
		} else {
			System.out.println("Esse carro já foi cadastrado");
		}
	}
	
}
