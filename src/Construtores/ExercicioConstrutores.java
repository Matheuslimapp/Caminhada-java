package Construtores;

import org.w3c.dom.ls.LSOutput;

public class ExercicioConstrutores {
    // Atributos dos construtores
    String titular;
    double saldo;
    double limite ;
    String tipoConta;


    public void imprimir(){
        // Exibe no console todas as informações da contas
        System.out.println(
                "Titular: " + this.titular
                + ", tipo da conta: " + this.tipoConta
                + ", Saldo: " + this.saldo + ", Limite da conta: "
                +  this.limite
        );
    }

    // Construtor 1 - só com titular
    public ExercicioConstrutores(String titular){
        this.titular = titular;
        this.saldo = 0;
        this.limite = 500;
        this.tipoConta = "Corrente";
        imprimir();
    }

    // Construtor 2 - titular e tipoConta
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

    // Construtor 3 - titular, tipoConta e saldo
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

    // Construtor 4 - titular, tipoConta, saldo e limite
    public ExercicioConstrutores(String titular, String tipoConta, double saldo, double limite) {
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.limite = limite;
        imprimir();
    }

    // Método main - testando os construtores
    public static void main(String[] args) {
// Cria uma conta só com o titular (usa Construtor 1)
        ExercicioConstrutores exercicioConstrutores = new ExercicioConstrutores("matheus");

        // Cria uma conta com titular e tipoConta (Construtor 2)
        ExercicioConstrutores exercicioConstrutores1 = new ExercicioConstrutores("matheus", "corrente");

        // Cria uma conta com titular, tipoConta e saldo (Construtor 3)
        ExercicioConstrutores exercicioConstrutores2 = new ExercicioConstrutores("matheus", "corrente", 2000);

        // Cria uma conta com todos os atributos definidos (Construtor 4)
        ExercicioConstrutores exercicioConstrutores3 = new ExercicioConstrutores("matheus", "corrente", 2000, 10000);
    }

}
