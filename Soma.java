// Classe que representa a operação de soma
public class Soma extends OperacaoMatematica {
    // Construtor que chama o construtor da classe base para inicializar os
    // atributos
    public Soma(double a, double b) {
        // Chama o construtor da classe base para inicializar os atributos a e b
        super(a, b);
    }

    // Implementação do método calcular para realizar a soma dos dois números
    @Override
    public double calcular() {
        // Retorna a soma dos atributos a e b
        return a + b;
    }
}
