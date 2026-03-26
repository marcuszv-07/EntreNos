package model;

import java.util.ArrayList;
import java.util.List;

import service.IA;

public class Chat {
	private Usuario usuario;
	private IA ia;
	private List<Mensagem> historico;
	
	public Chat(Usuario usuario, IA ia) {
		this.usuario = usuario;
		this.ia = ia;
		this.historico = new ArrayList<>();
	}
	
	public void enviarMensagem(String texto) {
		Mensagem msg = usuario.enviarMensagem(texto);
		historico.add(msg);
		
		String resposta = ia.processarMensagem(msg);
		System.out.println("IA: "+resposta);
	}
	
	

}
