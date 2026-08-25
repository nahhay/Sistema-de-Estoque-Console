package estoque;
import java.util.ArrayList;

public class EstoqueService {
    private ArrayList<Estoque> estoque = new ArrayList<>();
    public void adicionarEntrada(Produto produto, Ponto ponto, int quantidade){
        for (Estoque item : estoque){
            if (item.getProduto().getId() == produto.getId() && item.getPonto().getId() == ponto.getId()){
                item.setQuantidade(item.getQuantidade() + quantidade);
                System.out.println("Entrada adicionada com sucesso!");
                return;
            }
        }
        Estoque novo = new Estoque(produto, ponto, quantidade);
        estoque.add(novo);
        System.out.println("Entrada adicionada com sucesso!");
    }
    public int consultarQuantidade(Produto produto, Ponto ponto){
        for (Estoque item : estoque){
            if (item.getProduto().getId() == produto.getId() && item.getPonto().getId() == ponto.getId()) {
                return item.getQuantidade();
            }
        }
        return 0;
    }
    public void listarTodos() {
        for (Estoque item : estoque) {
            System.out.println(item);
        }
    }
    public void diminuir(Produto produto, Ponto ponto, int quantidade) {
        for (Estoque item : estoque) {
            if (item.getProduto().getId() == produto.getId() && item.getPonto().getId() == ponto.getId()) {
                if (item.getQuantidade() >= quantidade) {
                    item.setQuantidade(item.getQuantidade() - quantidade);
                    System.out.println("Saída registrada com sucesso!");
                } else {
                    System.out.println("Quantidade insuficiente em estoque!");
                }
                return;
            }
        }
        System.out.println("Produto não encontrado nesse ponto.");
    }

}
