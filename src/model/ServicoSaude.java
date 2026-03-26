package model;

public class ServicoSaude {
	private String servico;
	private String telefone;
	
	public ServicoSaude(String servico, String telefone) {
		this.servico = servico;
		this.telefone = telefone;
		
	}
	
	public void exibirServico() {
		System.out.print(servico+ " - Contato: "+ telefone);
	}

}
