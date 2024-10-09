package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/* Classe componente do Spring */
@Component
   public class SistemaMensagens {

	
/* As instâncias do Remetente, são injetadas automaticamente pelo Spring, permitindo uso dos Objetos
 * noreplay e techTeam: são nomes apenas para diferenciar */	
@Autowired	
   private Remetente dev;
@Autowired	
   private Remetente equipetech;


/* Método Confirmação Cadastro */
   public void enviarConfirmacaoCadastro() {
	System.out.println(dev); 
	System.out.println("Seu cadastro foi aprovado");
}

   
/* Método Enviar Mensagens */   
   public void enviarMensagemBoasVindas() {
	equipetech.setEmail("equipetech@dio.com.br");
	System.out.println(equipetech);
	System.out.println("Bem-vindo à Tech Elite");
    }
}
