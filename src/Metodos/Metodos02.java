package Metodos;

public class Metodos02 {
    public String nome;
    //Método de instância
    public void recebendoNome(String nome){
        this.nome = nome;
        System.out.println("Hello " + nome);
    }
    //metodos utilizando array
    public void metodosComArray(int[] numeros){
        int soma = 0;
        for (int numero : numeros){
            soma += numero;
        }
        System.out.println(soma);
    }
    //metodos com args que e COMO fosse um array
    public void metodosComArgs(int... numeros){
        int soma = 0;
        for (int numero : numeros){
            soma += numero;
        }
        System.out.println(soma);
    }
    //Fazendo os teste de metodos
    public static void main(String[] args) {
        Metodos02 metodosPt2 = new Metodos02();
        metodosPt2.recebendoNome("matheus");
        int[] numeros = {100,200,300,400,500};
        metodosPt2.metodosComArray(numeros);
        metodosPt2.metodosComArgs(100,200,300,400,500);
    }
}
