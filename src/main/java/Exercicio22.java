import java.util.ArrayList;

public class Exercicio22 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        int soma = 0;
        for (int num : lista) {
            soma += num;
        }
        System.out.println("Soma dos elementos: " + soma);
    }
}
