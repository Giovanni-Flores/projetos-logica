import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Giovanni
 * @version 1.0
 * @since 06/06/2020 - 20:13
 * @category Test
 */
class PessoaTest {

    Pessoa pessoa = new Pessoa();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        pessoa.setNome("Giovanni");
        pessoa.setIdade(17);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void calcularIdade() {
        assertEquals(204,pessoa.calcularIdade());
    }
}