package estoque;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Produto produtos = new Produto(sc.nextLine().trim());
        Funcionario funcionarios = new Funcionario(sc.nextLine().trim());
        Ponto pontos = new Ponto(sc.nextInt(), sc.nextLine().trim());

        System.out.println(produtos);
        System.out.println(funcionarios);
        System.out.println(pontos);

        sc.close();
    }
}