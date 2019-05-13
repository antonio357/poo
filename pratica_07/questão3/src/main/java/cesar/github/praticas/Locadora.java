package cesar.github.praticas;

import java.util.HashMap;
import java.util.Map;

public class Locadora {
    private Map<String, Mídia> naLoja = new HashMap<>();
    private Map<String, Mídia> alugados = new HashMap<>();

    public void colocar(Mídia midia) {
        naLoja.put(midia.getCod(), midia);
    }

    public void alugar(Mídia midia) {
        naLoja.remove(midia.getCod());
        alugados.put(midia.getCod(), midia);
    }

    public void retorna(Mídia midia) {
        alugados.remove(midia.getCod());
        naLoja.put(midia.getCod(), midia);
    }

    public Map<String, Mídia> getAlugados() {
        return alugados;
    }

    public Map<String, Mídia> getNaLoja() {
        return naLoja;
    }
}
