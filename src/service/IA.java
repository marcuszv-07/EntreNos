package service;

import model.Mensagem;

public class IA {
	
	public String processarMensagem(Mensagem msg) {
		String texto = msg.getConteudo().toLowerCase();
		
		if (texto.contains("triste") || texto.contains("ansiedade")) {
			return "Entendo como voce se sente. Voce nao esta sozinho";
		}else if(texto.contains("oi")  || texto.contains("ola")) {
			return "Olá! Como voce esta se sentindo hoje?";
		}else {
			return "Estou aqui para te ouvir. Pode me contar mais";
		}
		
		
	}

}
