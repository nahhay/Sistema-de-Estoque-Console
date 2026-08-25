package estoque;
import java.util.ArrayList;

public class ReposicaoService {
    private ArrayList<Reposicao> reposicoes = new ArrayList<>();
    private int proximoId = 1;
    private EstoqueService estoque;
    private MovimentacaoService movimentacao;
    public ReposicaoService(EstoqueService estoque, MovimentacaoService movimentacao) {
        this.estoque = estoque;
        this.movimentacao = movimentacao;
    }
    public void solicitar(Produto produto, Ponto ponto, Funcionario funcionario, int quantidade) {
        if (produto == null || ponto == null || funcionario == null) {
            System.out.println("Produto, ponto ou funcionario invalido!");
            return;
        }
        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser positiva!");
            return;
        }
        Reposicao reposicao = new Reposicao(
                produto,
                ponto,
                funcionario,
                quantidade
        );
        reposicao.setId(proximoId);
        proximoId++;
        reposicoes.add(reposicao);
        System.out.println("Reposicao solicitada com sucesso!");
    }
    public void listarTodas() {
        for (Reposicao reposicao : reposicoes) {
            System.out.println(reposicao);
        }
    }
    public void separar(int id) {
        Reposicao reposicao = buscar(id);
        if (reposicao == null) {
            System.out.println("Reposicao nao encontrada!");
            return;
        }
        if (reposicao.getStatus() == StatusReposicao.SOLICITADA) {
            reposicao.setStatus(StatusReposicao.SEPARADA);
            System.out.println("Reposicao separada com sucesso!");
        } else {
            System.out.println("A reposicao nao pode ser separada nesse status!");
        }
    }
    public void conferir(int id) {
        Reposicao reposicao = buscar(id);
        if (reposicao == null) {
            System.out.println("Reposicao nao encontrada!");
            return;
        }
        if (reposicao.getStatus() == StatusReposicao.SEPARADA) {
            reposicao.setStatus(StatusReposicao.CONFERIDA);
            System.out.println("Reposicao conferida com sucesso!");
        } else {
            System.out.println("A reposicao nao pode ser conferida nesse status!");
        }
    }
    public void entregar(int id) {
        Reposicao reposicao = buscar(id);
        if (reposicao == null) {
            System.out.println("Reposicao nao encontrada!");
            return;
        }
        if (reposicao.getStatus() == StatusReposicao.CONFERIDA) {
            estoque.adicionarEntrada(
                    reposicao.getProduto(),
                    reposicao.getPonto(),
                    reposicao.getQuantidade()
            );
            movimentacao.registrarEntrada(
                    reposicao.getProduto(),
                    reposicao.getPonto(),
                    reposicao.getFuncionario(),
                    reposicao.getQuantidade()
            );
            reposicao.setStatus(StatusReposicao.ENTREGUE);
            System.out.println("Reposicao entregue com sucesso!");
        } else {
            System.out.println("A reposicao nao pode ser entregue nesse status!");
        }
    }
    public void cancelar(int id) {
        Reposicao reposicao = buscar(id);
        if (reposicao == null) {
            System.out.println("Reposicao nao encontrada!");
            return;
        }
        reposicao.setStatus(StatusReposicao.CANCELADA);
        System.out.println("Reposicao cancelada com sucesso!");
    }
    private Reposicao buscar(int id) {
        for (Reposicao reposicao : reposicoes) {
            if (reposicao.getId() == id) {
                return reposicao;
            }
        }
        return null;
    }
}