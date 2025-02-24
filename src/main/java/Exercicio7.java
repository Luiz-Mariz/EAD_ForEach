import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número: ");
            lista.add(scanner.nextInt());
        }

        Collections.sort(lista);

        System.out.println("Lista ordenada em ordem crescente: " + lista);
    }
}
