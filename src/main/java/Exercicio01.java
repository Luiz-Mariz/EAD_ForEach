import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros.add(scanner.nextInt());
        }

        System.out.println("Números digitados:");
        for (int num : numeros) {
            System.out.println(num);
        }
        scanner.close();
    }
}
