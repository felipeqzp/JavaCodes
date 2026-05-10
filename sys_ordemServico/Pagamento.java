package sys_ordemServico;

public class Pagamento {
    
    private String metodo;
    private double valor;
    private boolean pago;

    public Pagamento(String metodo, double valor) {
        this.metodo = metodo;
        this.valor = valor;
        this.pago = false;
    }

    public Pagamento(String metodo, double valor, boolean pago) {
        this.metodo = metodo;
        this.valor = valor;
        this.pago = pago;
    }

    public boolean isPago() { 
        return pago; 
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMetodo() {
        return metodo;
    }

    public double getValor() {
        return valor;
    }

    public void pagar() {
        this.pago = true;
        System.out.println("Pagamento de R$ " + String.format("%.2f", valor) + " realizado via " + metodo);
    }

    @Override
    public String toString() {
        return "Pagamento{valor=R$ " + String.format("%.2f", valor) + ", metodo='" + metodo + '\'' + ", pago=" + pago + '}';
    }
    
}
