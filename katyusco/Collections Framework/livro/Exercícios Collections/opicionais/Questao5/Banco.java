package poo.code;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    void adiciona(Conta c) {
        contas.add(c);
    }

    Conta pega(int index) {
        return contas.get(index);
    }

    int pegaQuantidadeDeContas() {
        return contas.size();
    }
}
