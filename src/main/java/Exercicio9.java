import java.util.ArrayList;
import java.util.Collections;

public class Exercicio9 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {
            lista.add(i);
        }

        Collections.reverse(lista);

        System.out.println("Lista na ordem inversa: " + lista);
    }
}
