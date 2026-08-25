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
                    if (produtoEntrada == null) {
                        System.out.println("Produto não encontrado!");
                        break;
                    }
                    Ponto pontoEntrada = ponto.buscar(idPonto);
                    if (pontoEntrada == null) {
                        System.out.println("Ponto não encontrado!");
                        break;
                    }
                    Funcionario funcionarioEntrada = funcionario.buscar(idFuncionario);
                    if (funcionarioEntrada == null) {
                        System.out.println("Funcionário não encontrado!");
                        break;
                    }
                    movimentacao.registrarEntrada(produtoEntrada, pontoEntrada, funcionarioEntrada, quantidade);
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
                    if (produtoSaida == null) {
                        System.out.println("Produto não encontrado!");
                        break;
                    }
                    Ponto pontoSaida = ponto.buscar(idPontoSaida);
                    if (pontoSaida == null) {
                        System.out.println("Ponto não encontrado!");
                        break;
                    }
                    Funcionario funcionarioSaida = funcionario.buscar(idFuncionarioSaida);
                    if (funcionarioSaida == null) {
                        System.out.println("Funcionário não encontrado!");
                        break;
                    }
                    movimentacao.registrarSaida(produtoSaida, pontoSaida, funcionarioSaida, quantidadeSaida);
                    break;

                case 3:
                    System.out.print("Digite o id do produto: ");
                    int idProdutoConsulta = sc.nextInt();
                    System.out.print("Digite o id do ponto: ");
                    int idPontoConsulta = sc.nextInt();

                    Produto produtoConsulta = produto.buscar(idProdutoConsulta);
                    if (produtoConsulta == null) {
                        System.out.println("Produto não encontrado!");
                        break;
                    }
                    Ponto pontoConsulta = ponto.buscar(idPontoConsulta);
                    if (pontoConsulta == null) {
                        System.out.println("Ponto não encontrado!");
                        break;
                    }
                    int quantidadeAtual = estoque.consultarQuantidade(produtoConsulta, pontoConsulta);
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
        while (opcao != 0) {
            System.out.println(
                "1 - Solicitar reposicao\n" +
                "2 - Listar reposicoes\n" +
                "3 - Separar\n" +
                "4 - Conferir\n" +
                "5 - Entregar\n" +
                "6 - Cancelar\n" +
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

                    Produto produtoReposicao = produto.buscar(idProduto);
                    if (produtoReposicao == null) {
                        System.out.println("Produto não encontrado!");
                        break;
                    }
                    Ponto pontoReposicao = ponto.buscar(idPonto);
                    if (pontoReposicao == null) {
                        System.out.println("Ponto não encontrado!");
                        break;
                    }
                    Funcionario funcionarioReposicao = funcionario.buscar(idFuncionario);
                    if (funcionarioReposicao == null) {
                        System.out.println("Funcionário não encontrado!");
                        break;
                    }
                    reposicao.solicitar(produtoReposicao, pontoReposicao, funcionarioReposicao, quantidade);
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
                case 0:
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
                    if (pontoConferencia == null) {
                        System.out.println("Ponto não encontrado!");
                        break;
                    }
                    Funcionario funcionarioConferencia = funcionario.buscar(idFuncionario);
                    if (funcionarioConferencia == null) {
                        System.out.println("Funcionário não encontrado!");
                        break;
                    }
                    Produto produtoConferencia = produto.buscar(idProduto);
                    if (produtoConferencia == null) {
                        System.out.println("Produto não encontrado!");
                        break;
                    }
                    conferencia.realizarConferencia(pontoConferencia, funcionarioConferencia, produtoConferencia, quantidadeFisica);
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
        if (produtoHistorico == null) {
            System.out.println("Produto não encontrado!");
            return;
        }
        Ponto pontoHistorico = ponto.buscar(idPonto);
        if (pontoHistorico == null) {
            System.out.println("Ponto não encontrado!");
            return;
        }
        movimentacao.historicoProduto(produtoHistorico, pontoHistorico);
    }
}