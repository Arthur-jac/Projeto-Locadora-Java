package models;

public class Funcionario extends Pessoa{
	private String email;
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return super.toString() + "| Email: " + getEmail();
	}
}
