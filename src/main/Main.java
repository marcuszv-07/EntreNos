package main;

import java.util.Scanner;

import model.Chat;
import model.Usuario;
import service.IA;
import service.ProcessadorMensagem;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Aviso importante!! \nO Entre Nós é um sistema de apoio baseado em inteligência artificial, "
				+ "criado para fornecer informações e conversas de suporte. "
				+ "\nEle não substitui o atendimento psicológico ou psiquiátrico profissional.");
		
		try {
			String nome = "";
			while (nome.trim().isEmpty()) {
				System.out.print("\n\nDigite seu Nome: ");
				nome = scanner.nextLine();
				
				if (nome.trim().isEmpty()) {
					System.out.println("Nome nao pode ser vazio. Tente Novamente. ");
				}
			}
			Usuario usuario = new Usuario(nome);
			ProcessadorMensagem ia = new IA();
			Chat chat = new Chat(usuario, ia);
			
			System.out.println("\nChat iniciado! Digite 'sair' para encerrar o atendimento");
			
			while (true) {
				System.out.print("\nVoce: ");
				String entrada = scanner.nextLine();
				
				if(entrada.equalsIgnoreCase("sair")) {
					break;
				}
				
				if (entrada == null || entrada.trim() .isEmpty() ) {
					System.out.println("Por favor, digite alguma mensagem.");
					continue;
				}
				
				chat.enviarMensagem(entrada, "neutro");
				
			}
		
		}catch (Exception e) {
	            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
		} finally {
	            scanner.close();
	            System.out.println("Atendimento encerrado. Cuide-se! 💙");
		}
	}

}
