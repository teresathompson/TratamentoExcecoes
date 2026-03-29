// classe que representa a operação de divisão
public class Divisao extends OperacaoMatematica {
    // Construtor que chama o construtor da classe base para inicializar os
    // atributos
    public Divisao(double a, double b) {
        // Chama o construtor da classe base para inicializar os atributos a e b
        super(a, b);
    }

    // Implementação do método calcular para realizar a divisão dos dois números
    @Override
    // Retorna a divisão dos atributos a e b
    public double calcular() {
        return a / b;
    }
}
