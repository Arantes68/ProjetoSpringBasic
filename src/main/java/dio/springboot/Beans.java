package dio.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/* Classe contém definições de beans */
@Configuration
public class Beans {

	
/* Método cria e configura um objeto remetente, definindo um e-mail e um nome */	
	@Bean
	public Remetente remetente() {
		System.out.println("CRIANDO UM OBJETO REMETENTE");
		Remetente remetente = new Remetente();
		remetente.setEmail("Arantes68@gmail.com");
		remetente.setNome("Marcos Vinicius de Lima Arantes");
		return remetente;
	}
}
