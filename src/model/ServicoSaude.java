package model;

public class ServicoSaude extends Servico {
	private String telefone;
	
	public ServicoSaude(String nome, String telefone) {
		super(nome);
		this.telefone = telefone;
		
	}
	
	@Override
	public String exibirServico() {
		return nome + " - Contato: " + telefone;
	}
}
