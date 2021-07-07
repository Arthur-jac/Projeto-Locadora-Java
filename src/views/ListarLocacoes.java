package views;

import controllers.LocacaoController;
import models.Locacao;

public class ListarLocacoes {
	public static void locacoes() {
		LocacaoController controllerLoc = new LocacaoController();
		System.out.println("\n **** LOCAÇÕES **** \n");
		for (Locacao locacoes : controllerLoc.mostrarLoc()) {
			System.out.println(locacoes);
		}
	}
}
