package controllers;

import java.util.ArrayList;
import models.DescricaoAvancada;

public class DescricaoController implements IDescricao{
	private static ArrayList<DescricaoAvancada> descricoes = new ArrayList<DescricaoAvancada>();
	@Override
	public ArrayList<DescricaoAvancada> mostrarDes(){
		return descricoes;
	}
	
	@Override
	public void cadastrarDes(DescricaoAvancada descricao) {
		descricoes.add(descricao);
	}
}
