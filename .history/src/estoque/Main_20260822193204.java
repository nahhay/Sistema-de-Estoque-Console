package estoque;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto(sc.nextLine().trim());
        Funcionario funcionario = new Funcionario(sc.nextLine().trim());
        PontoService pontoService = new PontoService();
        String nomeponto = sc.nextLine().trim();
        pontoService.cadastrar(nomeponto);

        System.out.println(produto);
        System.out.println(funcionario);
        pontoService.listar();
        sc.close();
    }
}