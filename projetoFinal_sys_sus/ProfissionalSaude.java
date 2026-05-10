package sistema;
public abstract class ProfissionalSaude {
    private int idProfissionalSaude;
    private String nome;
    private String cpf;
    private UnidadeSaude unidade;

    public ProfissionalSaude(int idProfissionalSaude, String nome, String cpf, UnidadeSaude unidade) {
        setIdProfissionalSaude(idProfissionalSaude);
        setNome(nome);
        setCpf(cpf);
        setUnidade(unidade);
    }

    abstract String getCargoDescricao();

    public int getIdProfissionalSaude() {
        return idProfissionalSaude;
    }

    public void setIdProfissionalSaude(int idProfissionalSaude) {
        if(idProfissionalSaude > 0) {
            this.idProfissionalSaude = idProfissionalSaude;
        }else{
            throw new IllegalArgumentException("ID Inválido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome Inválido");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf != null && !cpf.isEmpty()) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF Inválido");
        }
    }

    public UnidadeSaude getUnidade() {
        return unidade;
    }

    public void setUnidade(UnidadeSaude unidade) {
        if(unidade != null) {
            this.unidade = unidade;
        } else {
            throw new IllegalArgumentException("Unidade Inválida");
        }
    }
}
