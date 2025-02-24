import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int j = 0; j < 4; j++) {
            int somaColuna = 0;
            for (int[] linha : matriz) {
                somaColuna += linha[j];
            }
            System.out.println("Soma da coluna " + j + ": " + somaColuna);
        }
    }
}