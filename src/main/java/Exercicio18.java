import java.util.Random;

public class Exercicio18 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matriz = new int[4][4];
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(100);
                soma += matriz[i][j];
            }
        }

        double media = soma / 16.0;
        System.out.println("Média dos elementos da matriz: " + media);
    }
}
