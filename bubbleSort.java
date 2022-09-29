import java.util.Scanner;

public class bubbleSort {

    public static void main(String args[]) {
        int X[] = new int[5];
        int aux; // essa variável vai receber o valor que sera trocado na ordenação.
        
        Scanner entrada = new Scanner(System.in);
        // 'for' para carregar os numeros no vetor
        for (int i = 0; i <= 4; i++) {
            System.out.println("digite o " + (i + 1) + "º numero");
            X[i] = entrada.nextInt();

        }
        // ordenando de forma crescente o
        // laço com a quantidade de elementos do vetor e enquanto houver troca.

        for (int j = 0; j <= 4; j++) {
            for (int i = 0; i <= 3; i++) {
                if (X[i] > X[i + 1]) {
                    aux = X[i];
                    X[i] = X[i + 1];
                    X[i + 1] = aux;

                }
            }
        }

        // mostrando os valores ordenados em ordem crescente 
        for (int i = 0; i <= 4; i++) {
            System.out.println((i + 1) + "º numero: " + X[i]);
        }
    }
}