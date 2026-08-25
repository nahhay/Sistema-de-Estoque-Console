package estoque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoService produtoService = new ProdutoService();
        FuncionarioService funcionarioService = new FuncionarioService();
        PontoService pontoService = new PontoService();
        EstoqueService estoqueService = new EstoqueService();
        MovimentacaoService movimentacaoService = new MovimentacaoService(estoqueService);
        ReposicaoService reposicaoService = new ReposicaoService(movimentacaoService);

        ConferenciaService conferenciaService = new ConferenciaService(estoqueService);
        Menu menu = new Menu(sc, produtoService, funcionarioService, pontoService, estoqueService, movimentacaoService,
            reposicaoService, conferenciaService);
        menu.menuPrincipal();
        sc.close();
    }
}