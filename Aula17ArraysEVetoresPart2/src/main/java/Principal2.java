import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Giovanni
 * @version 1.0
 * @since 07/06/2020 - 18:19
 * @category View
 */
public class Principal2 {

    public static void main(String[] args) {

        //List - Interface, ArrayList, LinkedLList

        List<String> contatos = new LinkedList<>();
        contatos.add("Davi");
        contatos.add("Snoopy");
        contatos.add("Calopsita");
        contatos.add("Marinho Cavalo");
        contatos.add("Coelho");
        contatos.add("Àguia branca");

        contatos.remove(2);
        contatos.remove("Davi");

        contatos.clear();

        contatos.add("Marinho Cavalo");
        contatos.add("Coelho");
        contatos.add("Àguia branca");

        System.out.println(contatos.isEmpty() ? "Está Vazio" : "Não está");

        //forEach
        for(String contato : contatos) {
            System.out.println(contato);
        }

        //lambda
        contatos.forEach(System.out::println);

        //############ pulando linhas
        //############ ArrayList

        //se selecionar o LIST + CTRL ele entra dentro da classe API do java
        List<String> nomes = new ArrayList<>();
        nomes.add("\nA");
        nomes.add("B");
        nomes.add("C");
        nomes.forEach(System.out::println);

        //############
        //############ ArrayList também pq sim hehe

        ArrayList<String> nomess = new ArrayList<>();
        nomess.add("\nD");
        nomess.add("E");
        nomess.add("F");
        nomess.forEach(System.out::println);


    }
}
