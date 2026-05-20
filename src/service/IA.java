package service;

import model.Mensagem;
import java.util.Random;
import model.ServicoSaude;

public class IA implements ProcessadorMensagem {
	private Random random = new Random();
	private String respostaAleatoria(String[] respostas) {
		return respostas[random.nextInt(respostas.length)];
	}

	
	@Override
	public String processarMensagem(Mensagem msg) {
		String texto = msg.getConteudo().toLowerCase();
		
		
		 if (texto.contains("desistir") || texto.contains("ajuda") || texto.contains("não aguento")) {
			
			ServicoSaude cvv = new ServicoSaude("Centro de Valorização da Vida (CVV)", "188");
			
			return "Sinto muito por você estar passando por isso.\n"
			 + "Você não está sozinho.\n"
			 + "Procure ajuda:\n"
			 + cvv.exibirServico();
		}
		 else if (texto.contains("triste") || texto.contains("ansioso") ) {
			String[] respostas = {
					"Sinto muito que esteja se sentindo assim. Quer me contar mais?",
					"Entendo... às vezes tudo fica pesado mesmo. Estou aqui com você.",
					"Você não está sozinho nisso. O que aconteceu?"
			};
			return respostaAleatoria(respostas);
		}
		else if(texto.contains("oi")  || texto.contains("ola")) {
			String[] respostas = {
					"Oi 😊 como você está se sentindo hoje?",
					"Olá! Pode conversar comigo, estou aqui pra te ouvir.",
					"Oi! Quer me contar como foi seu dia?"
				};
			return respostaAleatoria(respostas);
		} 
		else if (texto.contains("cansado") || texto.contains("estressado")) {
			String[] respostas = {
					"Parece que você está sobrecarregado... quer falar sobre isso?",
					"Cansaço mental pesa muito mesmo. Você tem conseguido descansar?",
					"Talvez seja um bom momento pra desacelerar um pouco."
			};
			return respostaAleatoria(respostas);
		}
		else if(texto.contains("aliviar")  || texto.contains("acalmar")) {
			return "Técnicas para aliviar a ansiedade: \nRespiração controlada (inspire 4s, segure 4s, expire 6s) \nPraticar exercícios físicos leves \n";
		}
		else if (texto.contains("obrigado")) {
			return "Fico feliz em ajudar, sempre que precisar, estou aqui.";
		}
		
		else {
			String[] respostas = {
				"Entendi... quer me contar mais sobre isso?",
				"Estou aqui pra te ouvir. Pode continuar.",
				"Isso parece importante. Como você se sente sobre isso?"
			};
			return respostaAleatoria(respostas);
		}
	}
}
