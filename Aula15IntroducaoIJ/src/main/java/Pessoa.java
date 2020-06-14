/**
 * @author Giovanni
 * @version 1.0
 * @since 06/06/2020 - 19:46
 * @category Model
 */
public class Pessoa {

    private String nome;
    private int idade;

    //CTRL + ENTER  - MAC
    //ALT + INSERT - WINDOWS
    public Pessoa() {
    }

    /**
     *
     * @param nome Recebe o nome da pessoa por padrão
     * @param idade Recebe a idade da pessoa por padrão
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

    /**
     *
     * @return Retorna a idade em meses. x12
     */
    public int calcularIdade() {
        return this.idade * 12;
    }

    @Override
    public String toString() {
        return  "\nNome: " + nome
              + "\nIdade: " + idade
              + "\nIdade em Meses: " + calcularIdade();
    }
}
