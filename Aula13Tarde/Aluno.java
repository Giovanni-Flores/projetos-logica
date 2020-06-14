/**
 * Author Giovanni Flores
 * Version 1.0
 * Since 01/06/2020 00:35
 * Category Model
 */
public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    
    public Aluno() {
    }
    
    /**
     * @param Recebe o nome da pessoa
     * @param Recebe a nota1 da pessoa
     * @param Recebe a nota2 da pessoa
     */
    public Aluno(String nome,double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getNota1() {
        return this.nota1;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
     public double getNota2() {
        return this.nota2;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    /**
     * return Retorna a média entre nota1 e nota2;
     */
    public double calcularMediaAritmetica() {
        return (this.nota1 + this.nota2) /2;
    }
    
    /**
     * return Retornar Aprovado ou Reprovado de acordo com a média aritmetica
     */
    public String mostrarNotaFinal() {
        if (this.calcularMediaAritmetica() >=6) {
            return "Aprovado!";
        }  
        return "Reprovado!";
          
    }
    
    @Override
    public String toString() {
        return "Seu nome: " + this.nome
             + "\nNota1: " + this.nota1
             + "\nNota2: " + this.nota2
             + "\nMédia: " + this.calcularMediaAritmetica()
             + "\nResultado final: " + this.mostrarNotaFinal();
             
    }
    
}