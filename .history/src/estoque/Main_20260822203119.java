package estoque;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ProdutoService produtoService = new ProdutoService();
        FuncionarioService funcionarioService = new FuncionarioService();
        PontoService pontoService = new PontoService();

        System.out.println(
            "SISTEMA DE ESTOQUE\n" +
            "1 - Produtos\n" +
            "2 - Funcionarios\n" +
            "3 - Pontos\n" +
            "0 - Sair\n" +
            "Escolha: "
        );
        int opcao = sc.nextInt(); 
        sc.nextLine();
        while (opcao != 0){
            switch(opcao){
                case 1:
                    System.out.print("Nome do produto: ");
                    String nomeProduto = sc.nextLine();
                    produtoService.cadastrar(nomeProduto);
                    break;
                case 2:
                    System.out.print("Nome do funcionario: ");
                    String nomeFuncionario = sc.nextLine();
                    funcionarioService.cadastrar(nomeFuncionario);
                    break;
                case 3:
                    System.out.print("Nome do ponto: ");
                    String nomePonto = sc.nextLine();
                    pontoService.cadastrar(nomePonto);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }

        sc.close();
    }
}