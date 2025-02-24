import java.util.ArrayList;

public class Exercicio25 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");

        for (String nome : nomes) {
            System.out.println("Olá, " + nome + "!");
        }
    }
}
