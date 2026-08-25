package estoque;

import java.time.LocalDateTime;

public class Conferencia {
    private int id;
    private Ponto ponto;
    private LocalDateTime data;
    private Funcionario responsavel;
    private Produto produto;
    private int estoqueEsperado;
    private int estoqueFisico;
    private int divergencia;
    public Conferencia(int id, Ponto ponto, Funcionario responsavel, Produto produto,
        int estoqueEsperado, int estoqueFisico) {
        this.id = id;
        this.ponto = ponto;
        this.data = LocalDateTime.now();
        this.responsavel = responsavel;
        this.produto = produto;
        this.estoqueEsperado = estoqueEsperado;
        this.estoqueFisico = estoqueFisico;
        this.divergencia = estoqueFisico - estoqueEsperado;
    }
    public int getId() {
        return id;
    }
    public Ponto getPonto() {
        return ponto;
    }
    public LocalDateTime getData() {
        return data;
    }
    public Funcionario getResponsavel() {
        return responsavel;
    }
    public Produto getProduto() {
        return produto;
    }
    public int getEstoqueEsperado() {
        return estoqueEsperado;
    }
    public int getEstoqueFisico() {
        return estoqueFisico;
    }
    public int getDivergencia() {
        return divergencia;
    }
    @Override
    public String toString() {
        return "Conferencia: " + id +
                "\nProduto: " + produto +
                "\nPonto: " + ponto +
                "\nEsperado: " + estoqueEsperado +
                "\nFisico: " + estoqueFisico +
                "\nDivergencia: " + divergencia +
                "\nResponsavel: " + responsavel +
                "\nData: " + data;
    }
}