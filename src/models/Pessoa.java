 package models;

public abstract class Pessoa {
	private String cpf;
	private String nome;
	private String dataNasc;
	private String sexo;
	private String telefone;
	
	
	
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataNasc() {
		return this.dataNasc;
	}
	
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Cpf "+getCpf()+ "| Nome: "+ getNome()+ "| Data de nascimento: "+ getDataNasc()+ 
				"| Sexo: "+ getSexo()+ "| Telefone: "+ getTelefone();
	}
}
