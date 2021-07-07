package models;

public class FormaPag {
	private Cliente cliente;
	private String numCartao;
	private String nomeTitu;
	private String validade;
	private String codeSeg;
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String getnumCartao() {
		return this.numCartao;
	}

	public void setnumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public String getnomeTitu() {
		return this.nomeTitu;
	}

	public void setnomeTitu(String nomeTitu) {
		this.nomeTitu = nomeTitu;
	}

	public String getValidade() {
		return this.validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getcodeSeg() {
		return codeSeg;
	}

	public void setcodeSeg(String codeSeg) {
		this.codeSeg = codeSeg;
	}

	@Override
	public String toString() {
		return "Cpf: "+ cliente.getCpf()+ "| Número do cartão: "+ getnumCartao()+ 
				"| Nome do titular: "+ getnomeTitu()+ "| Validade: "+ getValidade()+
				"| Código de segurança: "+ getcodeSeg();
	}
	
}
