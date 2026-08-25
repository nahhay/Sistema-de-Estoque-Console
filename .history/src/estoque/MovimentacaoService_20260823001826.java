package estoque;
import java.util.ArrayList;

public class MovimentacaoService {
    private ArrayList<Movimentacao> movimentacao = new ArrayList<>();
    private int cont = 1;
    private EstoqueService estoque;
    public MovimentacaoService(EstoqueService estoque){
        this.estoque = estoque;
    }
    public void registrarEntrada(Produto produto, Ponto ponto, Funcionario funcionario, int quantidade){
        if (quantidade >= 0) {
            System.out.println("Quantidade positiva");
            return;
        }
        estoque.adicionarEntrada(produto, ponto, quantidade);
        Movimentacao nova = new Movimentacao(
            cont,
            produto,
            ponto,
            funcionario,
            quantidade,
            TipoMovimentacao.ENTRADA
        );
        movimentacao.add(nova);
        cont++;
        System.out.println("Entrada registrada com sucesso!");
    }
    public void registrarSaida(Produto produto, Ponto ponto, Funcionario funcionario, int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser positiva!");
            return;
        }
        int quantidadeAtual = estoque.consultarQuantidade(produto, ponto);

        if (quantidadeAtual < quantidade) {
            System.out.println("Quantidade insuficiente em estoque!");
            return;
        }
        estoque.diminuir(produto, ponto, quantidade);
        Movimentacao nova = new Movimentacao(
            cont,
            produto,
            ponto,
            funcionario,
            quantidade,
            TipoMovimentacao.SAIDA
        );
        movimentacao.add(nova);
        cont++;
        System.out.println("Saída registrada com sucesso!");
    }
    public void listarTodas() {
        for (Movimentacao item : movimentacao) {
            System.out.println(item);
        }
    }
}