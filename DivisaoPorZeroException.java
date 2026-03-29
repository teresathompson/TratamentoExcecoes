public class DivisaoPorZeroException extends Exception {
    // Construtor que recebe uma mensagem de erro personalizada
    public DivisaoPorZeroException(String message) {
        // Chama o construtor da classe base Exception para inicializar a mensagem de
        // erro
        super(message);
    }

    // Construtor padrão sem mensagem de erro
    public DivisaoPorZeroException() {
        super("Divisão por zero não é permitida.\n" + "\n Por favor, forneça um divisor diferente de zero.");
    }

}
