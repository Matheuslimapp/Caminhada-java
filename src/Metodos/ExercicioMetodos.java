package Metodos;

public class ExercicioMetodos {
    public int mdc(int num1, int num2){
        int resultado = 0;
        if (num2 != 0){
            while (num2 != 0){
                resultado = num1 % num2;
                num1 = num2;
                num2 = resultado;

            }
        }
        return num1;
    }
    public void imc(int peso, double metros){
        double imc = peso / (Math.pow(metros,2));
        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }
        if (imc > 18.5 && imc < 24.9){
            System.out.println("Peso normal");
        }
        if (imc > 24.9 && imc < 29.9){
            System.out.println("Sobrepeso");
        }
        if (imc > 29.9 && imc < 34.9){
            System.out.println("Obesidade grau I");
        }
        if (imc > 34.9 && imc < 39.9 ){
            System.out.println("Obesidade grau II");
        }
        if (imc >= 40){
            System.out.println("Obesidade grau III (mórbida)");
        }
    }

    public void imc(int peso, int altura){
        double metros = altura / 100.0;
        double imc = peso / (Math.pow(metros,2));
        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }
        if (imc > 18.5 && imc < 24.9){
            System.out.println("Peso normal");
        }
        if (imc > 24.9 && imc < 29.9){
            System.out.println("Sobrepeso");
        }
        if (imc > 29.9 && imc < 34.9){
            System.out.println("Obesidade grau I");
        }
        if (imc > 34.9 && imc < 39.9 ){
            System.out.println("Obesidade grau II");
        }
        if (imc >= 40){
            System.out.println("Obesidade grau III (mórbida)");
        }
    }

    public void dividirMacros(double caloriasTotais) {
        double percProteina = 0.20;
        double percGordura  = 0.25;
        double percCarbo    = 0.55;

        double caloriasProteina = caloriasTotais * percProteina;
        double caloriasGordura  = caloriasTotais * percGordura;
        double caloriasCarbo    = caloriasTotais * percCarbo;

        double gramasProteina = caloriasProteina / 4;
        double gramasGordura  = caloriasGordura / 9;
        double gramasCarbo    = caloriasCarbo / 4;

        System.out.println("Proteínas: " + (int)gramasProteina + "g");
        System.out.println("Gorduras: " + (int)gramasGordura + "g");
        System.out.println("Carboidratos: " + (int)gramasCarbo + "g");
    }



    public double taxaMetabolicaBasal(int peso, int altura, int idade, char genero, int nivelDeAtividade) {
        if (peso <= 0 || altura <= 0 || idade <= 0) {
            throw new IllegalArgumentException("Peso, altura e idade devem ser positivos");
        }
        double TMB = 0;
        double atividade;
        switch (nivelDeAtividade) {
            case 0:
                atividade = 1.2;
                break;
            case 1:
                atividade = 1.375;
                break;
            case 2:
                atividade = 1.55;
                break;
            case 3:
                atividade = 1.725;
                break;
            case 4:
                atividade = 1.9;
                break;
            default:
                atividade = 1; // valor padrão
        }
            if (genero == 'm' || genero == 'M') {
                TMB = ((10 * peso) + (6.25 * altura) - (5 * idade) + 5) * atividade;

            }

        if (genero == 'f' || genero == 'F'){
            TMB = ((10 * peso) + (6.25 * altura) - (5 * idade) - 161) * atividade;
        }return TMB;
    }

    public static void main(String[] args) {
        System.out.println();
        ExercicioMetodos exercicioMetodos = new ExercicioMetodos();
        System.out.println(exercicioMetodos.mdc(45,56));
        exercicioMetodos.imc(52, 175);
        System.out.println(exercicioMetodos.taxaMetabolicaBasal(52,175,14,'M', 4));
        double taxa = exercicioMetodos.taxaMetabolicaBasal(52,175,14,'M', 4);
        exercicioMetodos.dividirMacros(taxa);
    }
}