package estoque;

class Funcionario{
    private String id;
    private String nome;
    public Funcionario(String id, String nome){
        this.id = id;
        this.nome = nome;
    }
    public String getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
    public String toString(){
        return "Funcionario: " + nome;
    }
}