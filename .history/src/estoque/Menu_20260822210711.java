package estoque;
import java.util.Scanner;

public class Menu {
    private Scanner sc;
    private ProdutoService produto;
    private FuncionarioService funcionario;
    private PontoService ponto;

    public Menu(Scanner sc, ProdutoService produto, FuncionarioService funcionario, PontoService ponto){
        this.produto = produto;
        this.funcionario = funcionario;
        this.ponto = ponto;
        this.sc = sc;
    }
    public void menuPrincipal(){
        int opcao = sc.nextInt();
        while (opcao != 0){
            System.out.println(
                "1 - Produtos\n" +
                "2 - Funcionarios\n" +
                "3 - Pontos\n" +
                "0 - Sair\n"
            );
            int opcao1 = sc.nextInt();
            switch(opcao1){
            case 1:
                menuProdutos();
                break;
            case 2:
                menuFuncionario();
                break;
            case 3:
                menuPonto();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opcao invalida");
            }
        }
    }
    public void menuProdutos(){
        System.out.println(
            "1 - Cadastrar\n" +
                "2 - Listar\n" +
                "3 - Buscar\n" +
                "4 - Editar\n" +
                "5 - Remover\n" +
                "0 - Voltar\n"
        );
        int opcao = sc.nextInt();
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
                produto.buscar(id);
                break;
            case 4:
                System.out.print("Digite novo id: ");
                int novoid = sc.nextInt();
                System.out.print("Digite novo nome: ");
                String novo = sc.nextLine();
                produto.editar(novoid, novo);
                break;
                case 5:
                System.out.print("Digite novo id: ");
                int removeid = sc.nextInt();
                produto.remover(removeid);
                break;
            case 0:
                menuprincipal();
        }
    }
    public void menuFuncionario(){
        System.out.println(
            "1 - Cadastrar\n" +
                "2 - Listar\n" +
                "3 - Buscar\n" +
                "4 - Editar\n" +
                "5 - Remover\n" +
                "0 - Voltar\n"
        );
        int opcao = sc.nextInt();
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
                funcionario.buscar(id);
                break;
            case 4:
                System.out.print("Digite novo id: ");
                int novoid = sc.nextInt();
                System.out.print("Digite novo nome: ");
                String novo = sc.nextLine();
                funcionario.editar(novoid, novo);
                break;
                case 5:
                System.out.print("Digite novo id: ");
                int removeid = sc.nextInt();
                funcionario.remover(removeid);
                break;
            case 0:
                menuprincipal();
        }
    }
    public void menuPontos(){
        System.out.println(
            "1 - Cadastrar\n" +
                "2 - Listar\n" +
                "3 - Buscar\n" +
                "4 - Editar\n" +
                "5 - Remover\n" +
                "0 - Voltar\n"
        );
        int opcao = sc.nextInt();
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
                ponto.buscar(id);
                break;
            case 4:
                System.out.print("Digite novo id: ");
                int novoid = sc.nextInt();
                System.out.print("Digite novo ponto: ");
                String novo = sc.nextLine();
                ponto.editar(novoid, novo);
                break;
                case 5:
                System.out.print("Digite novo id: ");
                int removeid = sc.nextInt();
                ponto.remover(removeid);
                break;
            case 0:
                menuprincipal();
        }
    }
}      