package estoque;
import java.time.LocalDateTime;

public class Reposicao {
    private int id;
    private Produto produto;
    private Ponto ponto;
    private int quantidade;
    private Funcionario funcionario;
    private StatusReposicao status;
    private LocalDateTime dataHora;

    public Reposicao(Produto produto, Ponto ponto, Funcionario funcionario, int quantidade) {
        this.produto = produto;
        this.ponto = ponto;
        this.funcionario = funcionario;
        this.quantidade = quantidade;
        this.status = StatusReposicao.SOLICITADA;
        this.dataHora = LocalDateTime.now();
    }
    public int getId() {
        return id;
    }
    public Produto getProduto() {
        return produto;
    }
    public Ponto getPonto() {
        return ponto;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public StatusReposicao getStatus() {
        return status;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setStatus(StatusReposicao status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Reposicao: " + id +
                "\nProduto: " + produto +
                "\nPonto: " + ponto +
                "\nQuantidade: " + quantidade +
                "\nFuncionario: " + funcionario +
                "\nStatus: " + status +
                "\nData: " + dataHora;
    }
}