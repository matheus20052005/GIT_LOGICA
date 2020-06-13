/**
 * @author matheus lippert
 */
public class Pessoa {

    private String nome;

    public Pessoa() {
    }

    /**
     *
     * @param nome
     */
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * maneira de ensinar
     */
    public void imprimirNome10x() {
        int contador = 1;
        while(contador <= 10) {
            System.out.println("matheus lippert");
            contador = contador + 1;
        }
    }

    /**
     *
     * @return
     */
    public String imprimirNome10xx() {
        int contador = 1;
        String resposta = "";
        while(contador <= 10) {
            resposta = resposta + "\nmatheus lippert";
            contador = contador + 1;
        }
        return resposta;
    }

    /**
     *
     * @return
     */
    public String imprimirNome10xxx() {
        int contador = 1;
        StringBuilder nomes = new StringBuilder();
        while(contador <= 10) {
            nomes.append("\nmatheus lippert");
            contador = contador + 1;
        }
        return nomes.toString();
    }

    /**
     *
     * @return
     */
    public String imprimirNome10xxxx() {
        int contador = 1;
        StringBuilder nomes = new StringBuilder();
        while(contador <= 10) {
            nomes.append("\n"+this.nome);
            contador = contador + 1;
        }
        return nomes.toString();
    }

    /**
     *
     * @return
     */
    public String imprimirNome10xy() {
        StringBuilder nomes = new StringBuilder();
        for(int contador = 1 ; contador <= 10 ; contador++) {
            nomes.append("\nmatheus lippert");
        }
        return nomes.toString();
    }

    /**
     *
     * @return
     */
    public String imprimirNomeConformeSolicitacaXy(int quantidade) {
        StringBuilder nomes = new StringBuilder();
        for(int contador = 1 ; contador <= quantidade ; contador++) {
            nomes.append("\nmatheus lippert");
        }
        return nomes.toString();
    }

    /**
     *
     * @return
     */
    public String imprimirNomeConformeSolicitacao(int quantidade) {
        int contador = 1;
        StringBuilder nomes = new StringBuilder();
        while(contador <= quantidade) {
            nomes.append("\nmatheus lippert");
            contador = contador + 1;
        }
        return nomes.toString();
    }

    /**
     *
     * @return
     */
    public String imprimirNomeMatheusVitor() {
        int contador = 1;
        StringBuilder nomes = new StringBuilder();
        while(contador <= 20) {
            if(contador % 2 == 0) {
                nomes.append("\n" + contador + " - Matheus lippert");
            } else {
                nomes.append("\n" + contador + " - Vitor dionisio");
            }

            contador++;
        }
        return nomes.toString();
    }

    @Override
    public String toString() {
        return "\nNome = " + nome;
    }
}
