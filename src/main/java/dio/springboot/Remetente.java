package dio.springboot;

/* Classe Remetente */
public class Remetente {

/* Atributos */	
	private String nome;
	private String email;
	
	
/* Métodos Especiais */	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
/* ToString */	
	@Override
	public String toString() {
		return "\n\n -----> REMETENTE: \n\n"
				+ "\nNome: " + nome
				+ "\nEmail: " + email;
	}	
}
