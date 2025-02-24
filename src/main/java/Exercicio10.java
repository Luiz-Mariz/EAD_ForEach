import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        System.out.println("Digite 5 números para a primeira lista:");
        for (int i = 0; i < 5; i++) {
            lista1.add(scanner.nextInt());
        }

        System.out.println("Digite 5 números para a segunda lista:");
        for (int i = 0; i < 5; i++) {
            lista2.add(scanner.nextInt());
        }

        ArrayList<Integer> lista3 = new ArrayList<>(lista1);
        lista3.addAll(lista2);

        System.out.println("Lista combinada: " + lista3);
    }
}
