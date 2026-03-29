// Classe principal para realizar os cálculos
public class MainCalculation {
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        // Cria uma instância da classe Soma usando uma classe anônima para sobrescrever
        // o método calcular
        Soma soma = new Soma(2, 5) {
            // Sobrescreve o método calcular para chamar o método da classe base (Soma)
            @Override
            public double calcular() {
                return super.calcular();
            }

        };
        // Imprime o resultado da soma usando o método calcular da classe Soma
        System.out.println("********************************" + "\n");
        System.out.println("Calculando a soma de dois números..." + "\n");
        System.out.println("Soma: " + soma.calcular() + "\n");

        // Cria uma instância da classe Divisao usando uma classe anônima para
        // sobrescrever o método calcular
        Divisao divisao = new Divisao(4, 0) {
            // Sobrescreve o método calcular para verificar se o divisor é zero antes de
            // realizar a divisão
            @Override
            public double calcular() {
                // Verifica se o divisor (b) é zero antes de realizar a divisão
                if (b == 0) {
                    try {
                        throw new DivisaoPorZeroException(RED + "Erro: Divisão por zero não é permitida." + RESET);
                    } catch (DivisaoPorZeroException e) {
                        System.out.println(e.getMessage());
                        return Double.NaN; // Retorna NaN para indicar que a divisão não é válida
                    }
                }
                return super.calcular();
            }
        };

        System.out.println("********************************" + "\n");
        System.out.println("Calculando a divisão de dois números..." + "\n");
        System.out.println("Divisão: " + divisao.calcular());
    }
}
