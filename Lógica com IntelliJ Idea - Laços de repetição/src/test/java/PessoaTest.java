import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    private Pessoa pessoa = new Pessoa();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        pessoa.setNome("Thiago Cury");
    }

    @org.junit.jupiter.api.Test
    void imprimirNome10xxx() {
        assertEquals("\nThiago Cury\nThiago Cury\nThiago Cury\nThiago Cury\nThiago Cury\nThiago Cury\nThiago Cury\nThiago Cury\nThiago Cury\nThiago Cury", pessoa.imprimirNome10xxx());
    }
}