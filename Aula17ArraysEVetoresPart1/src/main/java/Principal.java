import java.lang.reflect.Array;

/**
 * @author Giovanni
 * @version 1.0
 * @since 07/06/2020 - 15:44
 * @category View
 */
public class Principal {

    public static void main(String[] args) {

        String[] nomes = new String[3];
        nomes[0] = "Giovanni";
        nomes[1] = "Marcos";
        nomes[2] = "Andreia";

   /*     //foreach / para cada
        for(String nome : nomes) {
            System.out.println(nome);
        }

        //for
        for(int indice = 0 ; indice <nomes.length ; indice ++) {
            System.out.println(nomes[indice]);
        }

    */

        //inserindo os valores ao criar
        String[] nomess = {"\nGiovanni", "Não sei", "Não sei 2"};

/*
        //for
        for(int indice = 0 ; indice <nomess.length ; indice ++) {
            System.out.println(nomess[indice]);
        }

        Array.set(nomess, 1, "Mario");

        //foreach / para cada
        for(String nome : nomess) {
            System.out.println(nome);
        }

 */


        int[] numeros = new int[3];
        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 300;

        System.out.println("\nPrimeira Posição: " + numeros[0]);

 /*       //for
        for(int indice = 0 ; indice <numeros.length ; indice ++) {
            System.out.println(numeros[indice]);
        }

        //foreach
        for(int numero : numeros) {
            System.out.println(numero);
        }
         //Fim das variáveis unidimensionais.
  */

        //matriz
        int[][] matriz = new int[3][3]; //quadratica.

/*        matriz[0][0] = 1;
        matriz[0][1] = 1;
        matriz[0][2] = 1;

        matriz[1][0] = 2;
        matriz[1][1] = 2;
        matriz[1][2] = 2;

        matriz[2][0] = 3;
        matriz[2][1] = 3;
        matriz[2][2] = 3; */

//        for(int linha = 0 ; linha < 3 ; linha++) {
//            for(int coluna = 0 ; coluna < 3 ; coluna++) {
//               matriz[linha] [coluna] = 0;
//            }
//        }

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                //diagonal principal
                if (linha == coluna) {
                    matriz[linha][coluna] = 1;
                } else {
                    matriz[linha][coluna] = 0;
                }
            }
        }

        for(int linha = 0 ; linha < 3 ; linha++) {
            for(int coluna = 0 ; coluna < 3 ; coluna++) {
                System.out.print(" " + matriz[linha] [coluna] + " ");
            }
            System.out.print("\n");
        }

        /*   Coluna
     Linha   1 1 1
             2 2 2
             3 3 3
                      */
    }
}
