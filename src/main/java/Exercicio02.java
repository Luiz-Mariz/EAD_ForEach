import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;

        System.out.println("Digite 5 números para calcular a soma:");
        for (int i = 0; i < 5; i++) {
            numeros.add(scanner.nextInt());
        }

        for (int num : numeros) {
            soma += num;
        }

        System.out.println("Soma dos números: " + soma);
        scanner.close();
    }
}
