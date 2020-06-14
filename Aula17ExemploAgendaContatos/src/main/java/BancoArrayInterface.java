import java.util.List;

/**
 * @author Giovanni
 * @version 1.0
 * @since 07/06/2020 - 18:49
 * @category Interface
 */
public interface BancoArrayInterface {

    public void cadastrar(Pessoa pessoa);
    public List<Pessoa> buscar();
    public void excluir(int index);
    public void alterar(int index, Pessoa pessoa);
    public Pessoa filtrar(Pessoa pessoa, int filtro);
    public int verificarQuantidade();
    public void apagarAgenda();


}
