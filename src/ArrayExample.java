/*
 * Arrays são estruturas de dados que armazenam elementos
 * do mesmo tipo em uma sequência contínua de memória
 * */

// Exemplo:
public class ArrayExample {
    public static void main(String[] args) {
//        // array de números inteiros
//        int[] numbers = {1, 2, 3, 4, 5};
//
//        // acesso a valores pelo indice do array
//        System.out.println(numbers[0]); // 1
//        System.out.println(numbers[4]); // 5
//
//        // modificando um valor
//        numbers[4] = 10;
//        System.out.println(numbers[4]); // 10

        calcSumAndAverage();
    }

    /*
     * Exercício:
     * Crie um programa que preencha um array com 10 números inteiros
     * e calcule a soma e a média desses números.
     * */
    public static void calcSumAndAverage(){
        // array com 10 números inteiros
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        float average = (float) sum / numbers.length;

        System.out.println("A soma de todos os números é: " + sum);
        System.out.println("A média de todos o números é: " + average);
    }
}