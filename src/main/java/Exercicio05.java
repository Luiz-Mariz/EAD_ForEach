import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            lista.add(rand.nextInt(100) + 1);
        }

        System.out.print("Digite um número para verificar se está na lista: ");
        int numero = scanner.nextInt();

        if (lista.contains(numero)) {
            System.out.println("O número " + numero + " está na lista.");
        } else {
            System.out.println("O número " + numero + " não está na lista.");
        }
    }
}
