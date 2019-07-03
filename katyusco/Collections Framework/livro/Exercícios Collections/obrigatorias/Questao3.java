package poo.code;


import java.util.HashMap;
import java.util.Map;

public class Questao3 {

    public static void main(String[] args) {
        exemple();
        alterandoParaGenerics();
    }

    public static void alterandoParaGenerics() {

        Conta c1 = new ContaCorrente();
        c1.deposita(10000);
        Conta c2 = new ContaCorrente();
        c2.deposita(3000);

        // cria o mapa
        Map<String, Conta> mapaDeContas = new HashMap();
        // adiciona duas chaves e seus valores
        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);

        // qual a conta do diretor?
        Conta contaDoDiretor = mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());

    }

    public static void exemple() {

        Conta c1 = new ContaCorrente();
        c1.deposita(10000);
        Conta c2 = new ContaCorrente();
        c2.deposita(3000);

        // cria o mapa
        Map mapaDeContas = new HashMap();
        // adiciona duas chaves e seus valores
        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);

        // qual a conta do diretor?
        Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());

    }

}

