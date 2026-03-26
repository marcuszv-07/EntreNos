package model;

public class Mensagem {
	private String conteudo;
	private Usuario remetente;
	
	public Mensagem(String conteudo, Usuario remetente) {
		this.conteudo = conteudo;
		this.remetente = remetente;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public Usuario getRemetente() {
		return remetente;
	}
	

}
