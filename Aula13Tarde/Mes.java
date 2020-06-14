/**
 * Escreva a descrição da classe Mes aqui.
 * 
 * @author Giovanni Flores
 * @version 1.0
 * @since 29/05/2020 - 01:09
 * @category metody
 */
public class Mes {
    
    private int numero;
    
    public Mes() {
    }
    
    public Mes(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * return Mês de acordo com o numero atribuido.
     */
    public String retornarMeses() {
        if(this.numero == 1 ) {
            return "Janeiro";
       }  else if(this.numero == 2) {
           return "Fevereiro";
       } else if(this.numero == 3) {
           return "Março";
       } else if(this.numero == 4) {
           return "Abril";
       } else if(this.numero == 5) {
           return "Maio";
       } else if(this.numero == 6) {
           return "Junho";
       } else if(this.numero == 7) {
           return "Julho";
       } else if(this.numero == 8) {
           return "Agosto";
       } else if(this.numero == 9) {
           return "Setembro";
       } else if(this.numero == 10) {
           return "Outubro";
       } else if(this.numero == 11) {
           return "Novembro";
       } else if(this.numero == 12) {
           return "Dezembro";
       }
       return "Não encontrado";
    }
    
    @Override
    public String toString() {
        return "Mês: " + this.retornarMeses();
    }
       
}
