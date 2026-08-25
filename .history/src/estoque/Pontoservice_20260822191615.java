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
}
