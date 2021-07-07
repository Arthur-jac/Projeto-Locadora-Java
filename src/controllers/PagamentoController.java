package controllers;

import java.util.ArrayList;
import models.FormaPag;

public class PagamentoController implements IPagamento{
	private static ArrayList<FormaPag> pagamentos = new ArrayList<FormaPag>();
	
	@Override
	public ArrayList<FormaPag> mostrarPag(){
		return pagamentos;
	}
	
	@Override
	public void cadastrarPag(FormaPag pagamento) {
		pagamentos.add(pagamento);
	}
	
	@Override
	public FormaPag buscarPag(String numC) {
		for (FormaPag forma : pagamentos) {
			if (forma.getnumCartao().equals(numC)) {
				return forma;
			}
		}	
		return null;
	}
}
