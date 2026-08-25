package estoque;
import java.time.LocalDateTime;

public class Movimentacao {
    private int id;
    private Produto produto;
    private Ponto ponto;
    private Funcionario funcionario;
    private int quantidade;
    private LocalDateTime dataHora;
    private TipoMovimentacao tipo;

    public Movimentacao(int id, Produto produto, Ponto ponto, Funcionario funcionario, int quantidade, TipoMovimentacao tipo){
        this.id = id;
        this.produto = produto;
        this.ponto = ponto;
        this.funcionario = funcionario;
        this.quantidade = quantidade;
        this.dataHora = LocalDateTime.now();
        this.tipo = tipo;
    }
    public int getId(){
        return id;
    }
    public Produto getProduto(){
        return produto;
    }
    public Ponto getPonto(){
        return ponto;
    }
    public Funcionario getFuncionario(){
        return funcionario;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public TipoMovimentacao getTipo(){
        return tipo;
    }
    public LocalDateTime getDataHora(){
        return dataHora;
    }
    @Override
    public String toString(){
        return "Data: " + dataHora + 
        "\nFuncionario: " + funcionario + 
        "\nTipo: " + tipo + 
        "\nQuantidade: " + quantidade + 
        "\nProduto: " + produto + 
        "\nPonto: " + ponto;
    }
}
