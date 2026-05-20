package model;

public class Usuario {
	private String nome;
	
	public Usuario(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Mensagem enviarMensagem(String texto) {
		return new Mensagem(texto, this);
	}
	
	public Mensagem enviarMensagem(String texto, String emocao) {
		return new Mensagem (texto + "(" + emocao + ")", this);
	}
}
