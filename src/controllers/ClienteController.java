package controllers;

import java.util.ArrayList;
import models.Cliente;

public class ClienteController implements ICliente{
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	@Override
	public ArrayList<Cliente> Mostrar(){
		return clientes;
	}
	
	@Override
	public boolean cadastrarCli(Cliente cliente){
		if(buscarCpf(cliente.getCpf()) == null) {
			clientes.add(cliente);
			return true;
		}
		return false;
	}
	
	@Override
	public Cliente buscarCpf(String cpf) {
		for(Cliente cliCad : clientes) {
			if(cliCad.getCpf().equals(cpf)) {
				return cliCad;
			}
		}
		return null;
	}
	
	@Override
	public Cliente buscarCnh(String cnh) {
		for (Cliente cnhVali : clientes) {
			if(cnhVali.getCnh().equals("S")) {
				return cnhVali;
			}
		}
		return null;
	}
}
