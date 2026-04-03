# TratamentoExcecoes

Projeto simples em Java para demonstrar:

- herança com classe abstrata;
- sobrescrita de método;
- uso de classe anônima;
- criação e tratamento de exceção personalizada.

## Objetivo

O programa executa duas operações matemáticas:

1. Soma de dois números.
2. Divisão de dois números com validação de divisor zero.

Quando o divisor é zero, é lançada e tratada a exceção `DivisaoPorZeroException`, exibindo uma mensagem de erro e retornando `NaN`.

## Estrutura do projeto

- `OperacaoMatematica.java`: classe abstrata base com os atributos `a` e `b` e o método abstrato `calcular()`.
- `Soma.java`: implementação da operação de soma.
- `Divisao.java`: implementação da operação de divisão.
- `DivisaoPorZeroException.java`: exceção personalizada para divisão por zero.
- `MainCalculation.java`: classe principal com o método `main`, responsável por executar os exemplos.

## Como executar

No terminal, dentro da pasta do projeto:

```bash
javac *.java
java MainCalculation
```

## Comportamento atual

No código atual, os valores utilizados são:

- Soma: `2 + 5`
- Divisão: `4 / 0`

Resultado esperado:

- a soma é exibida normalmente;
- a divisão por zero dispara a exceção personalizada, imprime a mensagem de erro e retorna `NaN`.

## Exemplo de saída

```text
********************************

Calculando a soma de dois números...

Soma: 7.0

********************************

Calculando a divisão de dois números...

Erro: Divisão por zero não é permitida.
Divisão: NaN
```