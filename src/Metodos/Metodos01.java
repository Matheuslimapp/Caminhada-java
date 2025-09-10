package Metodos;

import java.util.Random;

//Hello world com metodos
public class Metodos01 {
    public void helloWorld(){
        System.out.println("Hello world");
    }
//passagem de parametros com metodos
    public void soma(int num1, int num2){
        int resultado = num1 + num2;
        System.out.println(resultado);
    }
    //metodos com retorno de valor
    /*public int soma(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }*/
    //metodos com sobre sobrecarga
    public void soma(int num1, int num2, int num3){
        int resultado = num1 + num2 + num3;
        System.out.println(resultado);
    }
    //metodos com static
    public static void randomNumero(){
        Random random = new Random();
        int numeroRandom = random.nextInt(0, 10);
        System.out.println(numeroRandom);
    }
    //Execuçao do metodos
    public static void main(String[] args) {
        Metodos01 metodosPt1 = new Metodos01();
        metodosPt1.helloWorld();
        metodosPt1.soma(1000, 200);
        metodosPt1.soma(4300, 450, 1000);
        Metodos01.randomNumero();
    }
}
