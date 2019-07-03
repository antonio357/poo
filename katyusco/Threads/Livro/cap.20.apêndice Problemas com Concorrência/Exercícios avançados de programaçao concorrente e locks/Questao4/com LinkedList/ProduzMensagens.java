package poo.code;

import java.util.Collection;
import java.util.Vector;

public class ProduzMensagens implements Runnable {
    private int comeco;
    private int fim;
    private Collection<String> mensagens;
    private boolean canAdd;
    private String ad;

    public ProduzMensagens(int comeco, int fim, Collection<String> mensagens) {
        this.comeco = comeco;
        this.fim = fim;
        this.mensagens = mensagens;
        this.canAdd = true;
    }

    @Override
    public void run() {
        for (int i = comeco; i < fim; i++) {
            ad = "Mensagem " + i;
            // precisa ser cincronizado pois no caso a coleção sera um Vector que é não Thread-safe
            synchronized (mensagens) {
                mensagens.add(ad);
            }
            System.out.println("len(mensagens) = " + mensagens.size());
        }
    }
}
