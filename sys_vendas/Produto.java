package sys_vendas;

public class Produto {
    private int idProduto;
    private String nome;
    private double preco;
    private int estoque;
    private String descricao;

    public Produto(int idProduto, String nome, double preco, int estoque){
        this.setIdProduto(idProduto);
        this.setNome(nome);
        this.setPreco(preco);
        this.setEstoque(estoque);
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        if(idProduto > 0){
            this.idProduto = idProduto;
        }else{
            System.out.println("ID inválido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("Nome inválido.");
        } else {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco > 0.0){
            this.preco = preco;
        }else{
            System.out.println("Preço inválido.");
        }
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        if(estoque > 0){
            this.estoque = estoque;
        }else{
            System.out.println("Estoque inválido.");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao == null || descricao.isBlank()){
            System.out.println("Não é possível adicionar descrição vazia.");
        }else{
            this.descricao = descricao;
        }
    }

    public void exibirInformacoes(){
        System.out.println("===================================");
        System.out.println("ID: " + this.getIdProduto());
        System.out.println("Nome produto: " + this.getNome());
        System.out.println("Preço produto: " + this.getPreco());
        System.out.println("Estoque produto: " + this.getEstoque());
        System.out.println("Descrição produto: " + this.getDescricao());
        System.out.println("===================================");
    }
}
