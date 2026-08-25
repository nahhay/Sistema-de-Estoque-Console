package estoque;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto(sc.nextLine().trim());
        Funcionario funcionario = new Funcionario(sc.nextLine().trim());
        PontoService pontoService = new PontoService();
        String nomeponto = sc.nextLine().trim();
        pontoService.cadastrar(nomeponto);
        pontoService.listar();

        System.out.println(
            "SISTEMA DE ESTOQUE\n" +
            "1 - Produtos\n" +
            "2 - Funcionarios\n" +
            "3 - Pontos\n" +
            "0 - Sair\n" +
            "Escolha: "
        );
        int opcao = sc.nextInt();   
        switch(opcao){
            case 1:
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                break;
            default:
                System.out.println("Opcao invalida");
        }

        sc.close();
    }
}