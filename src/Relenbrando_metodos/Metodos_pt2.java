package Relenbrando_metodos;

public class Metodos_pt2 {
    public String nome;
    public void recebendoNome(String nome){
        this.nome = nome;
        System.out.println("Hello " + nome);
    }
    public void metodosComArrays(int[] numeros){
        int soma = 0;
        for (int numero : numeros){
            soma += numero;
        }
        System.out.println(soma);
    }
    public void metodosComArgs(int... numeros){
        int soma = 0;
        for (int numero : numeros){
            soma += numero;
        }
        System.out.println(soma);
    }

    public static void main(String[] args) {
        Metodos_pt2 metodosPt2 = new Metodos_pt2();
        metodosPt2.recebendoNome("matheus");
        int[] numeros = {100,200,300,400,500};
        metodosPt2.metodosComArrays(numeros);
        metodosPt2.metodosComArgs(100,200,300,400,500);
    }
}
