package Construtores;

public class Construtores01 {
    // Construtor padrão (default)
    // Dentro coloquei um valor no padrão não tem valor nenhum
    public Construtores01(){
        System.out.println("Bem Vindo");
    }
    //passando parametro para o construtor
    public Construtores01(String nome){
        System.out.println("Ola " + nome);
    }
    // sobrecarga com construtor
    public Construtores01(String nome, int idade){
        System.out.println("Ola " + nome + " com idade de " + idade);
    }

    // Parte da execuçao do codigo
    public static void main(String[] args) {
        Construtores01 construtores01 = new Construtores01();
        Construtores01 construtores02 = new Construtores01("matheus");
        Construtores01 construtores03 = new Construtores01("matheus", 14);
    }
}
