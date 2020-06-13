import java.util.Scanner;

/**
 * @author matheus lippert
 */
public class Principal {

    public static void main(String[] args) {

        System.out.println("Oi");

        Scanner scanner = new Scanner(System.in);

        String opcao = "";
        do {
            Pessoa pessoa = new Pessoa();
            System.out.println("Digite a idade");
            pessoa.setIdade(scanner.nextInt());

            System.out.println("Digite:\nmeses-ver em meses"
                    + "\nsemanas-ver em semanas"
                    + "\nosDois-ver os dois"
                    + "\nsair-sair");
            opcao = scanner.next();

            System.out.println(pessoa.verificarOpcaoString(opcao));

        } while(!opcao.equals("sair"));
    }
}
