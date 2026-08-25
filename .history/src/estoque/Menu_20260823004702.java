package estoque;
import java.util.Scanner;

public class Menu {
    private Scanner sc;
    private ProdutoService produto;
    private FuncionarioService funcionario;
    private PontoService ponto;
    private EstoqueService estoque;
    private MovimentacaoService movimentacao;
    private ReposicaoService reposicao;
    private ConferenciaService conferencia;
    public Menu(Scanner sc, ProdutoService produto, FuncionarioService funcionario,
        PontoService ponto, EstoqueService estoque, MovimentacaoService movimentacao,
        ReposicaoService reposicao, ConferenciaService conferencia) {
        this.produto = produto;
        this.funcionario = funcionario;
        this.ponto = ponto;
        this.estoque = estoque;
        this.movimentacao = movimentacao;
        this.reposicao = reposicao;
        this.conferencia = conferencia;
        this.sc = sc;
    }
    public void menuPrincipal(){
        int opcao = -1;
        while (opcao != 0){
            System.out.println(
            "1 - Produtos\n" +
            "2 - Funcionarios\n" +
            "3 - Pontos\n" +
            "4 - Estoque e Movimentacoes\n" +
            "5 - Reposicoes\n" +
            "6 - Conferencias\n" +
            "7 - Historico\n" +
            "0 - Sair\n"
            );
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao){
            case 1:
                menuProdutos();
                break;
            case 2:
                menuFuncionario();
                break;
            case 3:
                menuPontos();
                break;
            case 4:
                menuEstoque();
                break;
            case 5:
                menuReposicao();
                break;
            case 6:
                menuConferencia();
                break;
            case 7:
                menuHistorico();
                break;
            case 0:
                break;
            default:
                System.out.println("Opcao invalida");
            }
        }
    }
    public void menuProdutos(){
        int opcao = -1;
        while (opcao != 0){
            System.out.println(
            "1 - Cadastrar\n" +
                "2 - Listar\n" +
                "3 - Buscar\n" +
                "4 - Editar\n" +
                "5 - Remover\n" +
                "0 - Voltar\n"
            );
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao){
                case 1:
                    System.out.print("Nome do produto: ");
                    String nomeProduto = sc.nextLine();
                    produto.cadastrar(nomeProduto);
                    break;
                case 2:
                    produto.listar();
                    break;
                case 3:
                    System.out.print("Digite o id: ");
                    int id = sc.nextInt();
                    Produto resultado = produto.buscar(id);
                    System.out.println(resultado);
                    break;
                case 4:
                    System.out.print("Digite id para editar:");
                    int novoid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite novo nome: ");
                    String novo = sc.nextLine();
                    produto.editar(novoid, novo);
                    break;
                case 5:
                    System.out.print("Digite id para remover: ");
                    int removeid = sc.nextInt();
                    produto.remover(removeid);
                    break;
            }
        }
    }
    public void menuFuncionario(){
        int opcao = -1;
        while (opcao != 0){
            System.out.println(
            "1 - Cadastrar\n" +
                "2 - Listar\n" +
                "3 - Buscar\n" +
                "4 - Editar\n" +
                "5 - Remover\n" +
                "0 - Voltar\n"
            );
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao){
                case 1:
                    System.out.print("Nome do funcionario: ");
                    String nomeProduto = sc.nextLine();
                    funcionario.cadastrar(nomeProduto);
                    break;
                case 2:
                    funcionario.listar();
                    break;
                case 3:
                    System.out.print("Digite o id: ");
                    int id = sc.nextInt();
                    Funcionario resultado = funcionario.buscar(id);
                    System.out.println(resultado);
                    break;
                case 4:
                    System.out.print("Digite novo id: ");
                    int novoid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite novo nome: ");
                    String novo = sc.nextLine();
                    funcionario.editar(novoid, novo);
                    break;
                case 5:
                    System.out.print("Digite id para remover: ");
                    int removeid = sc.nextInt();
                    funcionario.remover(removeid);
                    break;
            }
        }
    }
    public void menuPontos(){
        int opcao = -1;
        while (opcao != 0){
            System.out.println(
            "1 - Cadastrar\n" +
                "2 - Listar\n" +
                "3 - Buscar\n" +
                "4 - Editar\n" +
                "5 - Remover\n" +
                "0 - Voltar\n"
            );
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao){
                case 1:
                    System.out.print("Nome do ponto: ");
                    String nomeProduto = sc.nextLine();
                    ponto.cadastrar(nomeProduto);
                    break;
                case 2:
                    ponto.listar();
                    break;
                case 3:
                    System.out.print("Digite o id: ");
                    int id = sc.nextInt();
                    Ponto resultado = ponto.buscar(id);
                    System.out.println(resultado);
                    break;
                case 4:
                    System.out.print("Digite novo id: ");
                    int novoid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite novo ponto: ");
                    String novo = sc.nextLine();
                    ponto.editar(novoid, novo);
                    break;
                case 5:
                    System.out.print("Digite id para remover: ");
                    int removeid = sc.nextInt();
                    ponto.remover(removeid);
                    break;
            }
        }
    }
    public void menuEstoque() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println(
                "1 - Registrar entrada\n" +
                "2 - Registrar saida\n" +
                "3 - Consultar estoque\n" +
                "4 - Listar movimentacoes\n" +
                "0 - Voltar\n"
            );
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o id do produto: ");
                    int idProduto = sc.nextInt();
                    System.out.print("Digite o id do ponto: ");
                    int idPonto = sc.nextInt();
                    System.out.print("Digite o id do funcionario: ");
                    int idFuncionario = sc.nextInt();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = sc.nextInt();
                    Produto produtoEntrada = produto.buscar(idProduto);
                    Ponto pontoEntrada = ponto.buscar(idPonto);
                    Funcionario funcionarioEntrada = funcionario.buscar(idFuncionario);
                    movimentacao.registrarEntrada(
                        produtoEntrada,
                        pontoEntrada,
                        funcionarioEntrada,
                        quantidade
                    );
                    break;

                case 2:
                    System.out.print("Digite o id do produto: ");
                    int idProdutoSaida = sc.nextInt();
                    System.out.print("Digite o id do ponto: ");
                    int idPontoSaida = sc.nextInt();
                    System.out.print("Digite o id do funcionario: ");
                    int idFuncionarioSaida = sc.nextInt();
                    System.out.print("Digite a quantidade: ");
                    int quantidadeSaida = sc.nextInt();
                    Produto produtoSaida = produto.buscar(idProdutoSaida);
                    Ponto pontoSaida = ponto.buscar(idPontoSaida);
                    Funcionario funcionarioSaida = funcionario.buscar(idFuncionarioSaida);
                    movimentacao.registrarSaida(
                        produtoSaida,
                        pontoSaida,
                        funcionarioSaida,
                        quantidadeSaida
                    );
                    break;

                case 3:
                    System.out.print("Digite o id do produto: ");
                    int idProdutoConsulta = sc.nextInt();
                    System.out.print("Digite o id do ponto: ");
                    int idPontoConsulta = sc.nextInt();
                    Produto produtoConsulta = produto.buscar(idProdutoConsulta);
                    Ponto pontoConsulta = ponto.buscar(idPontoConsulta);
                    int quantidadeAtual = estoque.consultarQuantidade(
                        produtoConsulta,
                        pontoConsulta
                    );
                    System.out.println("Quantidade em estoque: " + quantidadeAtual);
                    break;
                case 4:
                    movimentacao.listarTodas();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }
    }
    public void menuReposicao() {
        int opcao = -1;
        while (opcao != 7) {
            System.out.println(
                "1 - Solicitar reposicao\n" +
                "2 - Listar reposicoes\n" +
                "3 - Separar\n" +
                "4 - Conferir\n" +
                "5 - Entregar\n" +
                "6 - Cancelar\n" +
                "7 - Voltar\n"
            );
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o id do produto: ");
                    int idProduto = sc.nextInt();
                    System.out.print("Digite o id do ponto: ");
                    int idPonto = sc.nextInt();
                    System.out.print("Digite o id do funcionario: ");
                    int idFuncionario = sc.nextInt();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = sc.nextInt();

                    Produto produtoReposicao = produto.buscar(idProduto);
                    Ponto pontoReposicao = ponto.buscar(idPonto);
                    Funcionario funcionarioReposicao =
                            funcionario.buscar(idFuncionario);
                    reposicao.solicitar(
                            produtoReposicao,
                            pontoReposicao,
                            funcionarioReposicao,
                            quantidade
                    );
                    break;
                case 2:
                    reposicao.listarTodas();
                    break;
                case 3:
                    System.out.print("Digite o id da reposicao: ");
                    int idSeparar = sc.nextInt();
                    reposicao.separar(idSeparar);
                    break;
                case 4:
                    System.out.print("Digite o id da reposicao: ");
                    int idConferir = sc.nextInt();
                    reposicao.conferir(idConferir);
                    break;
                case 5:
                    System.out.print("Digite o id da reposicao: ");
                    int idEntregar = sc.nextInt();
                    reposicao.entregar(idEntregar);
                    break;
                case 6:
                    System.out.print("Digite o id da reposicao: ");
                    int idCancelar = sc.nextInt();
                    reposicao.cancelar(idCancelar);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }
    }
    public void menuConferencia() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println(
                "1 - Realizar conferencia\n" +
                "2 - Listar conferencias\n" +
                "0 - Voltar\n"
            );
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o id do ponto: ");
                    int idPonto = sc.nextInt();
                    System.out.print("Digite o id do funcionario: ");
                    int idFuncionario = sc.nextInt();
                    System.out.print("Digite o id do produto: ");
                    int idProduto = sc.nextInt();
                    System.out.print("Digite a quantidade fisica: ");
                    int quantidadeFisica = sc.nextInt();
                    Ponto pontoConferencia = ponto.buscar(idPonto);
                    Funcionario funcionarioConferencia =
                            funcionario.buscar(idFuncionario);
                    Produto produtoConferencia =
                            produto.buscar(idProduto);
                    conferencia.realizarConferencia(
                            pontoConferencia,
                            funcionarioConferencia,
                            produtoConferencia,
                            quantidadeFisica
                    );
                    break;
                case 2:
                    conferencia.listarTodas();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }
    }
    public void menuHistorico() {
        System.out.print("Digite o id do produto: ");
        int idProduto = sc.nextInt();
        System.out.print("Digite o id do ponto: ");
        int idPonto = sc.nextInt();
        Produto produtoHistorico = produto.buscar(idProduto);
        Ponto pontoHistorico = ponto.buscar(idPonto);
        movimentacao.historicoProduto(
                produtoHistorico,
                pontoHistorico
        );
    }
}