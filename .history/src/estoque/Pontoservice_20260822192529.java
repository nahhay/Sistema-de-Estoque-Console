package estoque;
import java.util.ArrayList;

public class PontoService {
    private ArrayList<Ponto> pontos = new ArrayList<>() ;
    private int proximo = 1;
    public void cadastrar(String nome) {
        Ponto ponto = new Ponto(proximo, nome);
        pontos.add(ponto);
        proximo++;
    }
    public void listar() {
        for (int i = 0; i < pontos.size(); i++) {
            System.out.println(pontos.get(i));
        }
    }
    public Ponto buscar(int id) {
        for (int i = 0; i < pontos.size(); i++) {
            if (pontos.get(i).getId() == id) {
                return pontos.get(i);
            }
        }
        return null;
    }
    public void editar(int id, String novonome){
        Ponto ponto = buscar(id);
        if(ponto != null){
            (ponto.setNome(novonome));
        }
    }
    public void remover(int id){
        Ponto ponto = buscar(id);
        if (ponto != null){
            pontos.remove(ponto);
        }
        
    }
}
