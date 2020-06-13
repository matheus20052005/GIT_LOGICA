/**
 * @author matheus lippert
 */
public class Pessoa {

    private int idade;

    public Pessoa() {
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     *
     * @return
     */
    public int calcularIdadeMeses() {
        return this.idade * 12;
    }

    /**
     *
     * @return
     */
    public int calcularIdadeSemanas() {
        return this.idade * 52;
    }

    /**
     *
     *
     * @param opcao
     * @return
     */
    public String verificarOpcao(int opcao) {
        switch(opcao) {
            case 1: return "em meses: " + this.calcularIdadeMeses();
            case 2: return "em semanas: " + this.calcularIdadeSemanas();
            case 3: return "\nem meses: " + this.calcularIdadeMeses()
                         + "\nem semanas: " + this.calcularIdadeSemanas();
            case 4: System.exit(0);
            return null;
            default:
                System.exit(0);
                return null;
        }
    }

    /**
     *
     * @param opcao
     * @return
     */
    public String verificarOpcaoString(String opcao) {
        if(opcao.equals("meses")) {
            return "em meses: " + this.calcularIdadeMeses();
        } else if(opcao.equals("semanas")) {
            return "em semanas: " + this.calcularIdadeSemanas();
        } else if(opcao.equals("osdois")) {
            return "\nem meses: " + this.calcularIdadeMeses()
                    + "\nem semanas: " + this.calcularIdadeSemanas();
        } else if(opcao.equals("sair")) {
            System.exit(0);
            return null;
        }
        System.exit(0);
        return null;
    }

    @Override
    public String toString() {
        return "\nIdade = " + idade
             + "\nIdade em meses = " + this.calcularIdadeMeses()
             + "\nIdade em semanas = " + this.calcularIdadeSemanas();
    }
}
