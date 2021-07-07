package controllers;

import java.util.ArrayList;
import models.Locacao;
import models.Cliente;

public class LocacaoController implements ILocacao{
	private static ArrayList<Locacao> locacoes = new ArrayList<Locacao>();
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	@Override
	public ArrayList<Locacao> mostrarLoc(){
		return locacoes;
	}
	
	@Override
	public void cadastrarLoc(Cliente cliente, Locacao locacao) {
		if(buscarLoc(cliente.getCpf()) == null) {
			locacoes.add(locacao);
		}
	}
	
	@Override
	public Cliente buscarLoc(String cpf) {
		for(Cliente cliCad : clientes) {
			if(cliCad.getCpf().equals(cpf)) {
				return cliCad;
			}
		}
		return null;
	}
	
	@Override
	public Locacao verLoc(String placaLoc) {
		for (Locacao estaLoc : locacoes) {
			if (estaLoc.getplacaLoc().equals(placaLoc)) {
				return estaLoc;
			}
		}
		return null;
	}
	
	@Override
	public boolean estaLoc(Locacao locacao) {
		if(verLoc(locacao.getplacaLoc()) == null) {
			return true;
		}
		return false;
	}
	
	@Override
	public void removeLoc(int cod_loc) {
		locacoes.remove(cod_loc);
	}
}
