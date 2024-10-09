package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/* Classe principal */
@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
		}
		
	
/* Métopdo run, usa o bean SistemaMensagens para enviar mensagens de confirmação e boas vindas */	
	   @Bean 
	   public CommandLineRunner run(SistemaMensagens sistema) throws Exception { 
		   return args -> {
		   
		   sistema.enviarConfirmacaoCadastro();
		   sistema.enviarMensagemBoasVindas();
	   };
	}
}
