package estoque;

import java.util.ArrayList;

public class FuncionarioService {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private int proximo = 1;
    public void cadastrar(String nome) {
        Funcionario funcionario = new Funcionario(proximo, nome);
        funcionarios.add(funcionario);
        proximo++;
    }
    public void listar() {
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i));
        }
    }
    public Funcionario buscar(int id) {
        for (int i = 0; i < funcionarios.size(); i++) {

            if (funcionarios.get(i).getId() == id) {
                return funcionarios.get(i);
            }
        }
        return null;
    }
    public void editar(int id, String novoNome) {
        Funcionario funcionario = buscar(id);
        if (funcionario != null) {
            funcionario.setNome(novoNome);
        }
    }
    public void remover(int id) {
        Funcionario funcionario = buscar(id);
        if (funcionario != null) {
            funcionarios.remove(funcionario);
        }
    }
}