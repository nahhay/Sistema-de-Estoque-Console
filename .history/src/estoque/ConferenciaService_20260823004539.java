package estoque;

import java.util.ArrayList;

public class ConferenciaService {
    private ArrayList<Conferencia> conferencias = new ArrayList<>();
    private int proximoId = 1;
    private EstoqueService estoque;
    public ConferenciaService(EstoqueService estoque) {
        this.estoque = estoque;
    }
    public void realizarConferencia(Ponto ponto, Funcionario funcionario, Produto produto, int quantidadeFisica) {
        if (ponto == null || funcionario == null || produto == null) {
            System.out.println("Dados invalidos!");
            return;
        }
        if (quantidadeFisica < 0) {
            System.out.println("Quantidade fisica invalida!");
            return;
        }
        int estoqueEsperado = estoque.consultarQuantidade(produto, ponto);
        Conferencia nova = new Conferencia(proximoId, ponto, funcionario, produto, estoqueEsperado, quantidadeFisica);
        
        proximoId++;
        conferencias.add(nova);
        System.out.println(nova);
        if (nova.getDivergencia() == 0) {
            System.out.println("Estoque conferido corretamente!");
        } else {
            System.out.println("ATENCAO: Existe divergencia no estoque!");
        }
    }
    public void listarTodas() {
        for (Conferencia conferencia : conferencias) {
            System.out.println(conferencia);
        }
    }
}