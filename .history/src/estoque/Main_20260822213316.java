package estoque;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ProdutoService produtoService = new ProdutoService();
        FuncionarioService funcionarioService = new FuncionarioService();
        PontoService pontoService = new PontoService();
        Menu menu = new Menu(sc, produtoService, funcionarioService, pontoService);
        menu.menuPrincipal();

        sc.close();
    }
}