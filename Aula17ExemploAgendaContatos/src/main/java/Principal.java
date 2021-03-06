import java.util.Scanner;

/**
 * @author Giovanni
 * @version 1.0
 * @since 07/06/2020 - 19:03
 * @category View
 */
public class Principal {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        BancoArray agenda = new BancoArray();

        Pessoa pessoa = null;

        int opcao = 0;
        do {
            System.out.println("1- Cadastrar\n2- Ver Agenda\n3- Deletar\n4- Filtrar\n5- Ver Quantidade\n6- Esvaziar Agenda\n10- Sair");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    pessoa = new Pessoa();
                    System.out.println("Dígite o nome: " );
                    pessoa.setNome(scanner.next());
                    System.out.println("Dígite a idade: " );
                    pessoa.setIdade(scanner.nextInt());
                    agenda.cadastrar(pessoa);
                    System.out.println("Contato cadastrado com sucesso!");
                    break;
                case 2:
                    if(agenda.verificarQuantidade() != 0) {
                        agenda.buscar().forEach(System.out::println);
                    } else {
                        System.out.println("Não há contatos!");
                    }

//                    for(Pessoa pessoaAuxilicar : agenda.buscar()) {
//                        System.out.println(pessoaAuxilicar.toString());
//                    }
                    break;
                case 3:
                    System.out.println("Dígite uma posição para excluir: " );
                    int index = scanner.nextInt();
                    agenda.excluir(index);
                    System.out.println("Contato apagado com sucesso!");
                    break;
                case 4:
                    pessoa = new Pessoa();
                    System.out.println("Dígite o nome do contato que deseja filtrar: " );
                    pessoa.setNome(scanner.next());

                    pessoa = agenda.filtrar(pessoa, 1);
                    System.out.println(pessoa != null ? pessoa : "Contato não encontrado!");
                    break;
                case 5:
                    System.out.println("Há " + agenda.verificarQuantidade() + "contatos(s)");
                    break;
                case 6:
                    agenda.apagarAgenda();
                    System.out.println("Agenda Limpa!");
                    break;
                case 10:
                    System.exit(0);
                    break;
            }

        } while(opcao!=10);
    }
}
