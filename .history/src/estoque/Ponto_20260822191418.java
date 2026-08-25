package estoque;

class Ponto{
    private int id;
    private String nome;
    public Ponto(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
    public String toString(){
        return "Ponto: " + id + " " + nome;
    }
}