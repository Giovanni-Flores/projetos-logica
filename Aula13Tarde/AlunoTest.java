import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Author Giovanni Flores
 * Version 1.0
 * Since 01/06/2020 00:35
 * Category Test
 */
public class AlunoTest
{
    private Aluno aluno = new Aluno();
    
    /**
     * Construtor default para a classe de teste AlunoTest
     */
    public AlunoTest() {
        aluno.setNome("Giovanni");
        aluno.setNota1(9);
        aluno.setNota2(9);
    }

    
    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
        aluno.setNota1(9);
        aluno.setNota2(9);
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown() {
    }
    
    @Test
    public void getNome() {
        assertEquals("Giovanni",aluno.getNome());

    }
    
    @Test
    public void calcularMediaAritmetica() {
        assertEquals(9.0,aluno.calcularMediaAritmetica(),0.0);
        aluno.setNota1(4);
        aluno.setNota2(6);
        assertEquals(5.0,aluno.calcularMediaAritmetica(),0.0);
        
    } 
    
    @Test
    public void mostrarNotaFinal() {
        assertEquals("Aprovado!",aluno.mostrarNotaFinal());
        
        aluno.setNota1(4);
        aluno.setNota2(6);
        assertEquals("Reprovado!",aluno.mostrarNotaFinal());
        
    }
}
