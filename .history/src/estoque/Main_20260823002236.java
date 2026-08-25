package estoque;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ProdutoService produtoService = new ProdutoService();
        FuncionarioService funcionarioService = new FuncionarioService();
        PontoService pontoService = new PontoService();
        EstoqueService estoqueService = new EstoqueService();
        MovimentacaoService movimentacaoService =
                new MovimentacaoService(estoqueService);
        Menu menu = new Menu(
                sc,
                produtoService,
                funcionarioService,
                pontoService,
                estoqueService,
                movimentacaoService
        );
        menu.menuPrincipal();
        sc.close();
    }
}