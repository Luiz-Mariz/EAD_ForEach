import java.util.ArrayList;

public class Exercicio24 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }

        for (int num : lista) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}