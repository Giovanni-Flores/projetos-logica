import java.util.Scanner;

/**
 * @author Giovanni
 * @version 1.0
 * @since 06/06/2020 - 19:32
 * @category View
 */
public class Principal {

    //psvm + TAB
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //sout + TAB
        System.out.println("OI");


        Pessoa pessoa = new Pessoa();

        System.out.println("Dígite seu nome: ");
        pessoa.setNome(scanner.nextLine());
        System.out.println("Dígite seu nome: ");
        pessoa.setIdade(scanner.nextInt());
        pessoa.calcularIdade();

        System.out.println(pessoa);





    }
}
