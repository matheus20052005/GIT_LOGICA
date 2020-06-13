import java.util.HashSet;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {

        Set<String> nomes = new HashSet<>();
        nomes.add("matheus");
        nomes.add("matheus");
        nomes.add("mauricio");
        nomes.add("vitor");
        nomes.add("fernanda");
        nomes.add("fernanda");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.forEach(nome -> System.out.println(nome));

        nomes.forEach(System.out::println);

        for (String nome : nomes) {
            if (nome.contains("m")) {
                System.out.println(nome);
            }
        }
        nomes.stream().filter(nome -> nome.contains("c")).forEach(System.out::println);
    }
}