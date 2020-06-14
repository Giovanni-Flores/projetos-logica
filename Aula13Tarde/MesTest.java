import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste MesTest.
 *
 * @author  Giovanni
 * @version 1.0
 */
public class MesTest {
    /**
     * Construtor default para a classe de teste MesTest
     */
    public MesTest() {
    }
    
    Mes mes = new Mes();
    
    @Before
    public void setUp() {
        mes.setNumero(1);
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
     
    public void testRetornarMeses() {
       
        assertEquals("Janeiro", mes.retornarMeses());
        
        mes.setNumero(0);
        assertEquals("Não encontrado", mes.retornarMeses());
        
        mes.setNumero(2);
        assertEquals("Fevereiro", mes.retornarMeses());
        
        mes.setNumero(3);
        assertEquals("Março", mes.retornarMeses());
        
        mes.setNumero(4);
        assertEquals("Abril", mes.retornarMeses());
        
        mes.setNumero(5);
        assertEquals("Maio", mes.retornarMeses());
        
        mes.setNumero(6);
        assertEquals("Junho", mes.retornarMeses());
        
        mes.setNumero(7);
        assertEquals("Julho", mes.retornarMeses());
        
        mes.setNumero(8);
        assertEquals("Agosto", mes.retornarMeses());
        
        mes.setNumero(9);
        assertEquals("Setembro", mes.retornarMeses());
        
        mes.setNumero(10);
        assertEquals("Outubro", mes.retornarMeses());
        
        mes.setNumero(11);
        assertEquals("Novembro", mes.retornarMeses());
        
        mes.setNumero(12);
        assertEquals("Dezembro", mes.retornarMeses());
    
    }
  
}
