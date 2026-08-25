package estoque;

import java.util.ArrayList;

public class ProdutoService {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private int proximo = 1;
    public void cadastrar(String nome) {
        Produto produto = new Produto(proximo, nome);
        produtos.add(produto);
        proximo++;
    }
    public void listar() {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }
    }
    public Produto buscar(int id) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == id) {
                return produtos.get(i);
            }
        }
        return null;
    }
    public void editar(int id, String novoNome) {
        Produto produto = buscar(id);
        if (produto != null) {
            produto.setNome(novoNome);
        }
    }
    public void remover(int id) {
        Produto produto = buscar(id);
        if (produto != null) {
            produtos.remove(produto);
        }
    }
}
