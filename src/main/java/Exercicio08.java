import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            nomes.add(scanner.nextLine());
        }

        Collections.sort(nomes);

        System.out.println("Nomes em ordem alfabética: " + nomes);
    }
}
