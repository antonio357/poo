package poo.code;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Conta> contas = new HashMap<>();

    void adiciona(Conta c) {
        contas.put(c.getName(), c);
    }

    Conta pega(String name) {
        return contas.get(name);
    }

    int pegaQuantidadeDeContas() {
        return contas.size();
    }
}
