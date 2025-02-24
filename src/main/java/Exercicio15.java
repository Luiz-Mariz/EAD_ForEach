import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonalSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (i + j == 2) {
                    somaDiagonalSecundaria += matriz[i][j];
                }
            }
        }

        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
    }
}
