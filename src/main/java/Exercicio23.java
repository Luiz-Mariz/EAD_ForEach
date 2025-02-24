import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        System.out.print("Digite um valor para multiplicar os elementos da lista: ");
        int valor = scanner.nextInt();

        for (int num : lista) {
            System.out.println(num * valor);
        }
    }
}
