/**
 * @author Giovanni Flores
 * @version 1.0
 * @since 29/05/2020 - 11:42
 */
import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        Scanner scanner = new Scanner(System.in);
    
        Mes mes = new Mes();
        System.out.println("Dígite o número do mês que procura: ");
        mes.setNumero(scanner.nextInt());
        System.out.println(mes);
    
        System.out.println("\nDígite o número do mês que procura: ");
        int numero = scanner.nextInt();
        Mes mes1 = new Mes(numero);
        System.out.println(mes1);
    }   
}
