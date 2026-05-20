package model;

public abstract class Servico {
	protected String nome;
	
	public Servico(String nome) {
		this.nome = nome;
	}
	
	public abstract String exibirServico();
}
