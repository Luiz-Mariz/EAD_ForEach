import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;

        System.out.println("Digite 6 números para calcular a média:");
        for (int i = 0; i < 6; i++) {
            numeros.add(scanner.nextInt());
        }

        for (int num : numeros) {
            soma += num;
        }

        double media = (double) soma / numeros.size();
        System.out.println("Média dos números: " + media);
        scanner.close();
    }
}
