package models;

public class DescricaoAvancada {
	private Carro carro;
	private String cavalos;
	private String cambio;
	private String velocidadeMax;
	private String tempo;
			
	public Carro getCarro() {
		return this.carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public String getCavalos() {
		return this.cavalos;
	}
	
	public void setCavalos(String cavalos) {
		this.cavalos = cavalos;
	}
	
	public String getCambio() {
		return this.cambio;
	}
	
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	
	public String getKm() {
		return this.velocidadeMax;
	}
	
	public void setKm(String velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	
	public String getTempo() {
		return this.tempo;
	}
	
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	
	@Override
	public String toString(){
		return "Modelo: "+ carro.getModelo() +"| Cavalos: "+ getCavalos()+ 
				"| Câmbio: "+ getCambio()+ "| Velocidade máxima: "+ getKm()+
				"| Tempo: "+ getTempo();
	}
}
