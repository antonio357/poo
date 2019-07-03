package poo.code;

import java.util.Collection;

public class ProduzMensagens implements Runnable {
    private int comeco;
    private int fim;
    private Collection<String> mensagens;
    private String nome;

    public ProduzMensagens(int comeco, int fim, Collection<String> mensagens, String nome) {
        this.comeco = comeco;
        this.fim = fim;
        this.mensagens = mensagens;
        this.nome = nome;
    }


    @Override
    public void run() {
        for (int i = comeco; i < fim; i++) mensagens.add("Mensagem do " + this.nome + ": " + i);
    }
}
