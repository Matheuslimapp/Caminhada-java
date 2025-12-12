package TiposPrimitivo;

/**
 * Classe de demonstração dos tipos primitivos em Java.
 * Cada atributo representa um tipo primitivo suportado pela linguagem
 * e contém um exemplo válido de valor.
 *
 * <p>Observação: tipos com maior capacidade ocupam mais memória.</p>
 */
public class TiposPrimitivos {

    /** Tipo byte: ocupa 1 byte e vai de -128 até 127. */
    byte nbyte = 100;

    /** Tipo short: ocupa 2 bytes e vai de -32.768 até 32.767. */
    short nshort = 3400;

    /** Tipo int: ocupa 4 bytes e vai de -2.147.483.648 até 2.147.483.647. */
    int nint = 3_400_900;

    /**
     * Tipo long: ocupa 8 bytes e vai de
     * -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807.
     */
    long nlong = 900_000_000L; // Sufixo L é recomendado para valores long

    /**
     * Tipo float: número decimal de precisão simples.
     * <p>Armazena aprox. 6 a 7 dígitos significativos.</p>
     */
    float nfloat = 2.00F; // Sufixo F obrigatório para float

    /**
     * Tipo double: número decimal de precisão dupla.
     * <p>Armazena aprox. 15 a 16 dígitos significativos.</p>
     */
    double ndouble = 2.909090;

    /** Tipo char: armazena um único caractere Unicode. */
    char lchar = 'A';

    /** Tipo boolean: representa valores lógicos (true ou false). */
    boolean tfboolean = true;
}

