package sys_ordemServico;

public class Tecnico implements Registravel{

    private int id;
    private String nome;
    private String especialidade;
    private String telefone;

    public Tecnico( int id, String nome, String especialidade, String telefone) {

        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.telefone = telefone;
    }

    public int getId() {
         return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public void registrar() {
        System.out.println("Registrando tecnico: " + nome + " (ID: " + id + ")");
    }

    @Override
    public String toString() {
        return "Tecnico{" + "id=" + id + ", nome='" + nome + '\'' + ", especialidade='" + especialidade + '\'' + '}';
    }
    
}
