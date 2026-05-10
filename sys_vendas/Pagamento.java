package sys_vendas;

public class Pagamento {
    private int idPagamento;
    private double valorPagamento;
    private String formaPagamento;
    private String statusPagamento;
    private Pedido pedido;

    public Pagamento(int idPagamento, double valorPagamento, String formaPagamento){
        this.setIdPagamento(idPagamento);
        this.setValorPagamento(valorPagamento);
        this.setFormaPagamento(formaPagamento);
        this.setStatusPagamento("Pendente");
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        if(idPagamento > 0){
            this.idPagamento = idPagamento;
        }else{
            System.out.println("ID inválido.");
        }
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        if(valorPagamento > 0.0){
            this.valorPagamento = valorPagamento;
        }else{
            System.out.println("Valor inválido.");
        }
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        if(formaPagamento == null || formaPagamento.isBlank()){
            System.out.println("Forma de pagamento inválida.");
        }else{
            this.formaPagamento = formaPagamento;
        }
    }

    public void verificarStatusPagamento(){
        System.out.println("O status do pagamento é: " + this.statusPagamento);
    }

    public void setStatusPagamento(String statusPagamento) {
        if(statusPagamento == null || statusPagamento.isBlank()){
            System.out.println("Status de pagamento inválido.");
        }else{
            this.statusPagamento = statusPagamento;
        }
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        if(pedido != null){
            this.pedido = pedido;
        }else{
            System.out.println("Não é possível adicionar pedido nulo.");
        }
    }
    
}
