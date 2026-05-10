package sys_ordemServico;

public class Servico {

    private String descricao;
    private double preco;

    public Servico( String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

     @Override
    public String toString() {
        return descricao + " (R$ " + String.format("%.2f", preco) + ")";
    }
    
}
