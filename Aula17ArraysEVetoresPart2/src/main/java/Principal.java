import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Giovanni
 * @version 1.0
 * @since 07/06/2020 - 17:53
 * @category View
 */
public class Principal {

    public static void main(String[] args) {

        Set<String> nomes = new HashSet<>();
        nomes.add("Giovanni");
        nomes.add("Giovanni");
        nomes.add("Davi");
        nomes.add("Marquito");
        nomes.add("Marquito");

        //foreach
        for(String nome : nomes) {
            System.out.println(nome);
        }

        //JDK8... 9,10, 11, 12 lambda - forma abreviada de fazer as coisas
        //produtivos...
        //legivel.. (legitividade abalada de tão abreviado)
        //pode ser usar IT ao invés de nome

        //lambda
        nomes.forEach(nome -> System.out.println(nome));

        nomes.forEach(System.out::println);

        //foreach
        for(String nome : nomes) {
            if(nome.contains("o")) { //filtro
                System.out.println(nome);
            }
        }

        //lambda
        nomes.stream().filter(nome -> nome.contains("o")).forEach(System.out::println);
    }
}
