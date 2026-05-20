package model;

import java.util.ArrayList;
import java.util.List;
import service.ProcessadorMensagem;


public class Chat {
	private Usuario usuario;
	private List<Mensagem> historico;
	private ProcessadorMensagem ia;
	
	public Chat(Usuario usuario, ProcessadorMensagem ia) {
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
	
	public void enviarMensagem(String texto, String emocao) {
		Mensagem msg = usuario.enviarMensagem(texto, emocao);
		historico.add(msg);
		
		String resposta = ia.processarMensagem(msg);
		System.out.println("IA: " +resposta);
	}
	

}
