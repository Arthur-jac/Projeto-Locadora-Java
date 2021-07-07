 package models;

public class Cliente extends Pessoa{
	private String cnh;
	
	
	public String getCnh() {
		return this.cnh;
	}
	
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
	@Override
	public String toString() {
		return super.toString() + "| Cnh: "+ getCnh();
	}
}
