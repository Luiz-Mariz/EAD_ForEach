import java.util.ArrayList;

public class Exercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }

        lista.removeIf(n -> n % 2 != 0);

        System.out.println("Lista após remover os números ímpares: " + lista);
    }
}
