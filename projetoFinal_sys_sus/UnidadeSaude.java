package sistema;
public abstract class UnidadeSaude implements Relatorio{
    private String nome;
    private String cnes;
    private String endereco;
    private EstoqueVacinas estoque;

    public UnidadeSaude(String nome, String cnes, String endereco, EstoqueVacinas estoque) {
        setNome(nome);
        setCnes(cnes);
        setEndereco(endereco);
        setEstoque(estoque);
    }

    @Override
    public String gerarRelatorio(){
        return ("Nome: " + nome + "\nEndereço: " + endereco + "\n");
    }

    @Override
    public String gerarRelatorio(boolean maisInformacoes) {
        return "Nome: " + nome + "\nEndereço: " + endereco + "\nCNES: " + cnes + "\nEstoque de vacinas: " + estoque.getQuantidadeTotal() + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()){
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("Nome Inválido");
        }
    }

    public String getCnes() {
        return cnes;
    }

    public void setCnes(String cnes) {
        if(cnes != null && !cnes.isEmpty()){
            this.cnes = cnes;
        }else{
            throw new IllegalArgumentException("CNES Inválido");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco != null && !endereco.isEmpty()){
            this.endereco = endereco;
        }else{
            throw new IllegalArgumentException("Endereço Inválido");
        }
    }

    public EstoqueVacinas getEstoque() {
        return estoque;
    }

    public void setEstoque(EstoqueVacinas estoque) {
        if(estoque != null){
            this.estoque = estoque;
        }else{
            throw new IllegalArgumentException("Estoque Inválido");
        }
    }   
}