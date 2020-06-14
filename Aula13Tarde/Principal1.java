/**
 * Author Giovanni Flores
 * Version 1.0
 * Since 01/06/2020 00:35
 * Category View
 */
import java.util.Scanner;
public class Principal1 {
    
    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        aluno.setNome("José");
        System.out.println("Dígite a Nota 1:");
        aluno.setNota1(scanner.nextDouble());
        System.out.println("Dígite a Nota 2:");
        aluno.setNota2(scanner.nextDouble());
        System.out.println(aluno);
        
        System.out.println("\nDígite seu nome: ");
        String nome = scanner.next();
        System.out.println("Dígite a Nota 1:");
        double nota1 = scanner.nextDouble();
        System.out.println("Dígite a Nota 2:");
        double nota2 = scanner.nextDouble();
        Aluno aluno1 = new Aluno(nome, nota1, nota2);
        System.out.println(aluno1);
        
        
    }
}
