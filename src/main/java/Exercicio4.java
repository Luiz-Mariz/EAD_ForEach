import java.util.ArrayList;
import java.util.Random;

public class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            lista.add(rand.nextInt(100) + 1);
        }

        int maior = lista.get(0);
        int menor = lista.get(0);

        for (int num : lista) {
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }

        System.out.println("Lista: " + lista);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
