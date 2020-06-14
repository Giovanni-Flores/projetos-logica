/**
 * @author Giovanni
 * @version 1.0
 * @since 07/06/2020 - 18:44
 * @category Model
 */
public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa() {
    }

    /**
     *
     * @param nome Recebe nome por padrão
     * @param idade Recebe idade por padrão
     */
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome
             + "\nIdade: " + idade ;
    }
}
