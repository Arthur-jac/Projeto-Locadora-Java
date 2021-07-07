package controllers;

import java.util.ArrayList;

import models.Funcionario;

public interface IFuncionario {
	ArrayList<Funcionario> mostrarFunc();
	boolean cadastrarFunc(Funcionario funcionario);
	Funcionario buscarCpf(String cpf);
}
