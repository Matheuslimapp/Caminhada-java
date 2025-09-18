package Construtores;

import org.w3c.dom.ls.LSOutput;

public class ExercicioConstrutores {
    String titular;
    double saldo;
    double limite ;
    String tipoConta;


    public void imprimir(){
        System.out.println("Titular: " + this.titular + ", tipo da conta: " + this.tipoConta + ", Saldo: " + this.saldo + ", Limite da conta: " +  this.limite );
    }


    public ExercicioConstrutores(String titular){
        this.titular = titular;
        this.saldo = 0;
        this.limite = 500;
        this.tipoConta = "Corrente";
        imprimir();
    }

    public ExercicioConstrutores(String titular, String tipoConta) {
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.saldo = 0;
        boolean corrente = tipoConta.equalsIgnoreCase("corrente");
        boolean poupanca = tipoConta.equalsIgnoreCase("Poupança");

        if (corrente)
        {
            this.limite = 1000;
        }if (poupanca){
            this.limite = 0;
        }
        if (corrente == false && poupanca == false){
            System.out.println("INVALIDO!!");
        }
        imprimir();
    }

    public ExercicioConstrutores(String titular, String tipoConta, double saldo) {
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        boolean corrente = tipoConta.equalsIgnoreCase("corrente");
        boolean poupanca = tipoConta.equalsIgnoreCase("Poupança");

        if (corrente)
        {
            this.limite = 1000;
        }if (poupanca){
            this.limite = 0;
        }
        if (corrente == false && poupanca == false){
            System.out.println("INVALIDO!!");
        }
        imprimir();
    }


    public ExercicioConstrutores(String titular, String tipoConta, double saldo, double limite) {
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.limite = limite;
        imprimir();
    }



    public static void main(String[] args) {
        ExercicioConstrutores exercicioConstrutores = new ExercicioConstrutores("matheus");
        ExercicioConstrutores exercicioConstrutores1 = new ExercicioConstrutores("matheus", "corrente");
        ExercicioConstrutores exercicioConstrutores2 = new ExercicioConstrutores("matheus", "corrente",2000 );
        ExercicioConstrutores exercicioConstrutores3 = new ExercicioConstrutores("matheus", "corrente",2000,10000);
    }

}
