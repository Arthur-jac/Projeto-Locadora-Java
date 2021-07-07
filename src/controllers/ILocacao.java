package controllers;

import java.util.ArrayList;

import models.Cliente;
import models.Locacao;

public interface ILocacao {
	ArrayList<Locacao> mostrarLoc();
	void cadastrarLoc(Cliente cliente, Locacao locacao);
	 Cliente buscarLoc(String cpf);
	 Locacao verLoc(String placaLoc);
	 boolean estaLoc(Locacao locacao);
	 void removeLoc(int cod_loc);
}
