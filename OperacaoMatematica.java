abstract class OperacaoMatematica {
    // Atributos protegidos
    protected double a;
    protected double b;

    // Construtor para inicializar os atributos
    public OperacaoMatematica(double a, double b) {
        // Inicializa os atributos com os valores fornecidos
        this.a = a;
        this.b = b;
    }

    // Método abstrato para calcular o resultado da operação
    public abstract double calcular();

}