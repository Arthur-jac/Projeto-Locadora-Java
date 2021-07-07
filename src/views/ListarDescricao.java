package views;

import controllers.DescricaoController;
import models.DescricaoAvancada;

public class ListarDescricao {
	public static void listarDes() {
		DescricaoController controllerDes = new DescricaoController();
		System.out.println("\n **** PESQUISA AVANÇADA **** \n");
		for (DescricaoAvancada mostrar : controllerDes.mostrarDes()) {
			System.out.println(mostrar);
		}
	}
}