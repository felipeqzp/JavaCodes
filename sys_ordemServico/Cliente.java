package sys_ordemServico;

public class Cliente implements Registravel{

    private int id;
    private String nome;
    private String telefone;
    private Endereco endereco;

    public Cliente(int id, String nome, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getId() { 
        return id; 
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public void registrar() {
        System.out.println("Registrando cliente: " + nome + " (ID: " + id + ")");
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome='" + nome + '\'' + ", telefone='" + telefone + '\'' + ", endereco=" + endereco + '}';
    }
}