package main;

import java.util.Scanner;

import model.Chat;
import model.Usuario;
import service.IA;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu Nome: ");
		String nome = scanner.nextLine();
		
		Usuario usuario = new Usuario(nome);
		IA ia = new IA();
		Chat chat = new Chat(usuario, ia);
		
		System.out.println("Chat iniciado! Digite 'sair' para encerrar o atendimento");
		
		while (true) {
			System.out.print("Voce: ");
			String entrada = scanner.nextLine();
			
			if(entrada.equalsIgnoreCase("sair")) {
				break;
			}
			
			chat.enviarMensagem(entrada);
			
		}
		
		scanner.close();
		System.out.println("Encerrado");
	}

}
