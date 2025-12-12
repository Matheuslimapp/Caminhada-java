package Metodos;

/**
 * Classe utilizada para demonstrar diferentes formas de métodos em Java:
 * métodos de instância, métodos que recebem arrays e métodos com varargs.
 */
public class Metodos02 {

    /** Nome associado à instância da classe. */
    public String nome;

    /**
     * Define o nome da instância e imprime uma saudação.
     *
     * @param nome Nome a ser atribuído à instância.
     */
    public void recebendoNome(String nome) {
        this.nome = nome; // "this" referencia o atributo da instância
        System.out.println("Hello " + nome);
    }

    /**
     * Recebe um array de inteiros, calcula a soma de todos os valores
     * e imprime o resultado.
     *
     * @param numeros Array contendo os valores a serem somados.
     */
    public void metodosComArray(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }

    /**
     * Recebe múltiplos valores inteiros utilizando varargs,
     * calcula a soma de todos os valores e imprime o resultado.
     *
     * @param numeros Valores inteiros fornecidos de forma variável.
     */
    public void metodosComArgs(int... numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }

    /**
     * Método principal utilizado para testar os demais métodos da classe.
     *
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Metodos02 metodosPt2 = new Metodos02();

        metodosPt2.recebendoNome("matheus");

        int[] numeros = {100, 200, 300, 400, 500};
        metodosPt2.metodosComArray(numeros);

        metodosPt2.metodosComArgs(100, 200, 300, 400, 500, 600);
    }
}

