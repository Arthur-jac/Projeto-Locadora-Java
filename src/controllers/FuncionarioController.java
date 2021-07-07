package controllers;

import java.util.ArrayList;
import models.Funcionario;

public class FuncionarioController implements IFuncionario{
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	@Override
	public ArrayList<Funcionario> mostrarFunc(){
		return funcionarios;
	}
	
	@Override
	public boolean cadastrarFunc(Funcionario funcionario) {
		if (buscarCpf(funcionario.getCpf()) == null) {
			funcionarios.add(funcionario);
			return true;
		}
		return false;
	}
	
	@Override
	public Funcionario buscarCpf(String cpf) {
		for (Funcionario cadastrarFunc : funcionarios) {
			if (cadastrarFunc.getCpf().equals(cpf)){
				return cadastrarFunc;
			}
		}
		return null;
	}
}
