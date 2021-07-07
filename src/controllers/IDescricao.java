package controllers;

import java.util.ArrayList;
import models.DescricaoAvancada;

public interface IDescricao {
	ArrayList<DescricaoAvancada> mostrarDes();
	void cadastrarDes(DescricaoAvancada descricao);
}
