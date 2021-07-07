package models;

public class Carro {
	private String placa;
	private String modelo;
	private String marca;
	private String cor;
	private double custo;
	private String ano;
	
	public double getCusto() {
		return this.custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public String getAno() {
		return this.ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo(){
		return this.modelo;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	@Override
	public String toString(){
		return "Placa: "+getPlaca()+ "| Modelo: "+ getModelo()+ "| Marca: "+ getMarca()+ "| Cor: "+ getCor()+ 
				"| Ano: "+ getAno()+ "| Custo: "+ getCusto();
	}
}
