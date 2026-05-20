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

    private void mostrarDigitando() {
        System.out.println("IA está digitando...");
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    } 
    
   

    public void enviarMensagem(String texto, String emocao) {
        try {
            if (texto == null || texto.trim().isEmpty()) {
                throw new IllegalArgumentException("Texto não pode ser vazio.");
            }
            
            Mensagem msg = usuario.enviarMensagem(texto, emocao);
            historico.add(msg);
            mostrarDigitando();
            String resposta = ia.processarMensagem(msg);
            System.out.println("IA: " + resposta);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}