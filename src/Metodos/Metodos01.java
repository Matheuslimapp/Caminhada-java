package Metodos;

import java.util.Random;

/**
 * Classe de demonstração contendo exemplos de métodos,
 * incluindo passagem de parâmetros, retorno de valores,
 * sobrecarga de métodos e métodos estáticos.
 */
public class Metodos01 {

    /**
     * Imprime a mensagem "Hello world" no console.
     * Método simples que demonstra um método de instância sem retorno.
     */
    public void helloWorld() {
        System.out.println("Hello world");
    }

    /**
     * Soma dois números inteiros e imprime o resultado no console.
     *
     * @param num1 primeiro número para a soma
     * @param num2 segundo número para a soma
     */
    public void soma(int num1, int num2) {
        int resultado = num1 + num2;
        System.out.println(resultado);
    }

    /**
     * Soma dois números inteiros e retorna o valor resultante.
     *
     * @param num1 primeiro número da operação
     * @param num2 segundo número da operação
     * @return o resultado da soma de num1 e num2
     */
    public int somaRetorno(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Sobrecarga do método soma.
     * Soma três números inteiros e retorna o resultado.
     *
     * @param num1 primeiro valor
     * @param num2 segundo valor
     * @param num3 terceiro valor
     * @return a soma de num1, num2 e num3
     */
    public int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    /**
     * Gera e retorna um número inteiro aleatório no intervalo de 0 a 9.
     * Método estático, pode ser chamado sem instanciar a classe.
     *
     * @return número aleatório entre 0 (inclusive) e 10 (exclusivo)
     */
    public static int randomNumero() {
        Random random = new Random();
        return random.nextInt(0, 10);
    }

    /**
     * Método principal para executar exemplos da classe.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Metodos01 metodosPt1 = new Metodos01();

        metodosPt1.helloWorld();
        System.out.println(metodosPt1.soma(1000, 200, 1450));
        System.out.println(metodosPt1.soma(4300, 450, 1000));
        System.out.println(Metodos01.randomNumero());
    }
}
