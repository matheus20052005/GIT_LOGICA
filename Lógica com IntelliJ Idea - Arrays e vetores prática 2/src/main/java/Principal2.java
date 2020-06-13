import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal2 {
    public static void main(String[] args) {

        List<String> contatos = new LinkedList<>();
        contatos.add("matheus");
        contatos.add("murilo");
        contatos.add("mauricio");

        contatos.remove(1);
        contatos.remove("matheus");

        contatos.clear();
        contatos.add("fernanda");
        contatos.add("vitor");

        System.out.println(contatos.isEmpty() ? "está vazio" : "não está");

        for(String contato : contatos) {
            System.out.println(contato);
        }

        contatos.forEach(System.out::println);

        //##############
        //##############

        List<String> nomes = new ArrayList<>();
        nomes.add("matheus");
        nomes.add("murilo");
        nomes.forEach(System.out::println;

        //##############
        //##############

        ArrayList<String> nomess = new ArrayList<>();
        nomess.add("nilza");
        nomess.add("paulinho");
        nomess.forEach(System.out::println;







    }
}
