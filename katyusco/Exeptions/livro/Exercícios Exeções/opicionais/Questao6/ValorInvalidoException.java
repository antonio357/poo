package poo.code;

public class ValorInvalidoException extends RuntimeException {
    ValorInvalidoException(String message) {
        super(message);
    }

    ValorInvalidoException(Double valorInvalido) {
        super("Valor invalido: " + valorInvalido);
    }
}
