package controllers;

import models.FormaPag;
import java.util.ArrayList;

public interface IPagamento {
	ArrayList<FormaPag> mostrarPag();
	void cadastrarPag(FormaPag pagamento);
	FormaPag buscarPag(String numC);
}
