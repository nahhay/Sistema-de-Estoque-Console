package estoque;
import java.util.ArrayList;

public class PontoService {
    private ArrayList<Ponto> pontos = new ArrayList<>() ;
    private int proximo = 1;
    public void cadastrar(){
        Ponto ponto = new Ponto(proximo);
        pontos.add(ponto);
        proximo++;
    }
}
