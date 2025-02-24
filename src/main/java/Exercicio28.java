import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento > maior) {
                    maior = elemento;
                }
            }
        }

        System.out.println("Maior elemento da matriz: " + maior);
    }
}