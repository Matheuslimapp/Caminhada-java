package Relenbrando_metodos;

import java.util.Random;

public class Metodos_pt1 {
    public void helloWorld(){
        System.out.println("Hello world");
    }
    public void soma(int num1, int num2){
        int resultado = num1 + num2;
        System.out.println(resultado);
    }
    /*public int soma(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }*/

    public void soma(int num1, int num2, int num3){
        int resultado = num1 + num2 + num3;
        System.out.println(resultado);
    }

    public static void randomNumero(){
        Random random = new Random();
        int numeroRandom = random.nextInt(0, 10);
        System.out.println(numeroRandom);
    }

    public static void main(String[] args) {
        Metodos_pt1 metodosPt1 = new Metodos_pt1();
        metodosPt1.helloWorld();
        metodosPt1.soma(1000, 200);
        metodosPt1.soma(4300, 450, 1000);
        Metodos_pt1.randomNumero();
    }
}
