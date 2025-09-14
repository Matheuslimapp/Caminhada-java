package Metodos;

public class ExercicioMetodos {
    // Método para calcular o MDC (Máximo Divisor Comum) de dois números usando o algoritmo de Euclides
    public int mdc(int num1, int num2){
        int resultado = 0;
        if (num2 != 0){ // só executa se o segundo número não for zero
            while (num2 != 0){
                resultado = num1 % num2; // pega o resto da divisão
                num1 = num2;             // o segundo número vira o primeiro
                num2 = resultado;        // o resto vira o segundo
            }
        }
        return num1; // o resultado final é o MDC
    }

    // Método para calcular o IMC (Índice de Massa Corporal) com altura em double (metros)
    public void imc(int peso, double metros){
        double imc = peso / (Math.pow(metros,2)); // fórmula: peso / altura²
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

    // Sobrecarga do método IMC: aqui a altura é recebida em int (centímetros)
    public void imc(int peso, int altura){
        double metros = altura / 100.0; // converte de centímetros para metros
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

    // Método para dividir as calorias em macronutrientes (proteínas, gorduras e carboidratos)
    public void dividirMacros(double caloriasTotais) {
        // Percentual de cada macronutriente
        double percProteina = 0.20;
        double percGordura  = 0.25;
        double percCarbo    = 0.55;

        // Calorias destinadas a cada macronutriente
        double caloriasProteina = caloriasTotais * percProteina;
        double caloriasGordura  = caloriasTotais * percGordura;
        double caloriasCarbo    = caloriasTotais * percCarbo;

        // Conversão de calorias para gramas (cada macronutriente tem valor energético diferente)
        double gramasProteina = caloriasProteina / 4; // 1g de proteína = 4 kcal
        double gramasGordura  = caloriasGordura / 9;  // 1g de gordura = 9 kcal
        double gramasCarbo    = caloriasCarbo / 4;    // 1g de carbo = 4 kcal

        // Mostra o resultado
        System.out.println("Proteínas: " + (int)gramasProteina + "g");
        System.out.println("Gorduras: " + (int)gramasGordura + "g");
        System.out.println("Carboidratos: " + (int)gramasCarbo + "g");
    }

    // Método para calcular a Taxa Metabólica Basal (TMB) ajustada pelo nível de atividade
    public double taxaMetabolicaBasal(int peso, int altura, int idade, char genero, int nivelDeAtividade) {
        // Verificação de valores inválidos
        if (peso <= 0 || altura <= 0 || idade <= 0) {
            throw new IllegalArgumentException("Peso, altura e idade devem ser positivos");
        }

        double TMB = 0; // variável para armazenar o resultado
        double atividade; // fator de atividade física

        // Define o fator de atividade com base no nível informado
        switch (nivelDeAtividade) {
            case 0:
                atividade = 1.2;   // sedentário
                break;
            case 1:
                atividade = 1.375; // levemente ativo
                break;
            case 2:
                atividade = 1.55;  // moderadamente ativo
                break;
            case 3:
                atividade = 1.725; // muito ativo
                break;
            case 4:
                atividade = 1.9;   // extremamente ativo
                break;
            default:
                atividade = 1; // valor padrão
        }

// Fórmulas de Harris-Benedict
        if (genero == 'm' || genero == 'M') {
            TMB = ((10 * peso) + (6.25 * altura) - (5 * idade) + 5) * atividade;
        }

        if (genero == 'f' || genero == 'F'){
            TMB = ((10 * peso) + (6.25 * altura) - (5 * idade) - 161) * atividade;
        }

        return TMB; // retorna o valor calculado
    }

    // Método principal para testar os outros métodos
    public static void main(String[] args) {
        System.out.println();
        ExercicioMetodos exercicioMetodos = new ExercicioMetodos();

        // Testa o cálculo do MDC
        System.out.println(exercicioMetodos.mdc(45,56));

        // Testa o cálculo do IMC
        exercicioMetodos.imc(52, 175);

        // Testa o cálculo da TMB
        System.out.println(exercicioMetodos.taxaMetabolicaBasal(52,175,14,'M', 4));

        // Calcula a TMB e divide em macronutrientes
        double taxa = exercicioMetodos.taxaMetabolicaBasal(52,175,14,'M', 4);
        exercicioMetodos.dividirMacros(taxa);
    }
}

