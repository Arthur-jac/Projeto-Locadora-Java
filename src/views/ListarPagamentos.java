package views;
import models.FormaPag;
import controllers.PagamentoController;

public class ListarPagamentos {
	public static void pagamentos() {
		PagamentoController controllerPag = new PagamentoController();
		System.out.println("\n **** PAGAMENTOS **** \n");
		for (FormaPag listar : controllerPag.mostrarPag()) {
			System.out.println(listar);
		}
	}
}
