package controllers;

import java.util.ArrayList;
import models.Cliente;

public interface ICliente {
	boolean cadastrarCli(Cliente cliente);
	ArrayList<Cliente> Mostrar();
	Cliente buscarCpf(String cpf);
	Cliente buscarCnh(String cnh);
}
