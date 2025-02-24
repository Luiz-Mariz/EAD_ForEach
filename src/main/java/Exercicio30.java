import java.util.ArrayList;

public class Exercicio30 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(-5);
        lista.add(3);
        lista.add(-1);
        lista.add(7);
        lista.add(-2);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < 0) {
                lista.set(i, 0);
            }
        }

        System.out.println("Lista após substituir valores negativos por zero:");
        for (int num : lista) {
            System.out.print(num + " ");
        }
    }
}