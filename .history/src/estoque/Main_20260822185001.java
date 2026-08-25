package estoque;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine().trim();
        String nome = sc.nextLine().trim();
        Produto produtos = new Produto(id, nome);

        String ide = sc.nextLine().trim();
        String nomee = sc.nextLine().trim();
        Funcionario funcionarios = new Funcionario(ide, nomee);

        String idx = sc.nextLine().trim();
        String nomex = sc.nextLine().trim();
        Ponto pontos = new Ponto(idx, nomex);

        System.out.println(produtos);
        System.out.println(produtos);
        System.out.println(produtos);

        sc.close();
    }
}