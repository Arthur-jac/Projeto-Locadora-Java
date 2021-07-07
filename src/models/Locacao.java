package models;

public class Locacao {
	private Cliente cliente;
	private Carro carro;
	private FormaPag pagamento;
	private String dataLoc;
	private String dataDev;
	private int cod_loc;
	private String placaLoc;
	
	public String getplacaLoc() {
		return placaLoc;
	}
	
	public void setplacaLoc(String placaLoc) {
		this.placaLoc = placaLoc;
	}
	
	public int getCod_loc() {
		return cod_loc;
	}

	public void setCod_loc(int cod_loc) {
		this.cod_loc = cod_loc;
	}

	public String getdataLoc() {
		return this.dataLoc;
	}

	public void setdatLoc(String dataLoc) {
		this.dataLoc = dataLoc;
	}

	public String getdataDev() {
		return this.dataDev;
	}

	public void setdataDev(String dataDev) {
		this.dataDev = dataDev;
	}

	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Carro getCarro() {
		return this.carro;
	}
	
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public FormaPag getPagamento() {
		return this.pagamento;
	}
	
	public void setPagamento(FormaPag pagamento) {
		this.pagamento = pagamento;
	}
	
	@Override
	public String toString() {
		return  "| Cpf: "+ cliente.getCpf()+ "| Cnh: "+ cliente.getCnh()+
				"| Placa: "+ carro.getPlaca()+ "| Modelo: "+ carro.getModelo()+
				"| Número do Cartão: "+ pagamento.getnumCartao()+ "| Preço: "+ carro.getCusto()+
				"| Data da locação: "+ getdataLoc()+ "| Data da devolução: "+ getdataDev();
	}
}
