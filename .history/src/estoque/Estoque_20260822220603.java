package estoque;

public class Estoque {
    private Produto produto;
    private Ponto ponto;
    private int quantidade;
    
    public Estoque(Produto produto, Ponto ponto, int quantidade){
        this.produto = produto;
        this.ponto = ponto;
        this.quantidade = quantidade;
    }
    public Produto getProduto(){
        return produto;
    }
    public Ponto getPonto(){
        return ponto;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    public void setPonto(Ponto ponto){
        this.ponto = ponto;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    @Override
    public String toString(){
        return produto + " no " 
        + ponto + " tem " + quantidade + " unidades.";
    }
}
