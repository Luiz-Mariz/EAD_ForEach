import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int somaLinha, somaColuna;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Soma das linhas:");
        for (int i = 0; i < 4; i++) {
            somaLinha = 0;
            for (int j = 0; j < 4; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + somaLinha);
        }

        System.out.println("Soma das colunas:");
        for (int j = 0; j < 4; j++) {
            somaColuna = 0;
            for (int i = 0; i < 4; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Soma da coluna " + j + ": " + somaColuna);
        }
    }
}