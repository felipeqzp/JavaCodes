package sys_vendas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private int idPedido;
    private Cliente cliente;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private Pagamento pagamento;
    private double valorTotal;
    private String statusPedido;
    private LocalDate dataPedido; // para atribuir a data de hoje é só concatenar com "now()"

    public Pedido(int idPedido, Cliente cliente) {
        this.setIdPedido(idPedido);
        this.setCliente(cliente);
        this.setStatusPedido("Aguardando cliente adicionar produtos...");
        this.setDataPedido(LocalDate.now());
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        if (idPedido > 0) {
            this.idPedido = idPedido;
        } else {
            System.out.println("ID inválido.");
        }
    }

    public String getCliente() {
        return cliente.getNome();
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        } else {
            System.out.println("Não é possível adicionar cliente nulo.");
        }
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        if (statusPedido == null || statusPedido.isBlank()) {
            System.out.println("Status inválido.");
        } else {
            this.statusPedido = statusPedido;
        }
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        if (dataPedido != null) {
            this.dataPedido = dataPedido;
        } else {
            System.out.println("Não é possível adicionar uma data nula.");
        }
    }

    public void adicionarProduto(Produto produto) {
        if (produto != null) {
            produto.setEstoque(produto.getEstoque() - 1);
            produtos.add(produto);
            this.setStatusPedido("Aguardando confirmação do pedido...");
        } else {
            System.out.println("Não é possível adicionar um produto nulo.");
        }
    }

    public void removerProduto(Produto produto) {
        if (produto != null || produtos.contains(produto)) {
            produto.setEstoque(produto.getEstoque() + 1);
            produtos.remove(produto);
        } else {
            System.out.println("O produto não está no pedido.");
        }
        if (this.produtos.isEmpty()) {
            this.setStatusPedido("Não há produtos");
        }
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            System.out.println("================== ITENS DO PEDIDO ==================");
            for (Produto produto : produtos) {
                System.out.println("Produto: " + produto.getNome() + ", Preço: " + produto.getPreco());
            }
        }
    }

    public void confirmarPedido() {
        this.setStatusPedido("Aguardando pagamento...");
        System.out.println("Pedido confirmado.");
    }

    public double calcularValorTotal() {
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }

    public void realizarPagamento(Pagamento pagamento) {
        if (pagamento != null) {
            if (this.statusPedido == "Aguardando pagamento...") {
                this.pagamento = pagamento;
                pagamento.setPedido(this);
                pagamento.setStatusPagamento("Pagamento realizado!");
                this.setStatusPedido("Concluído");
                System.out.println("Pagamento realizado com sucesso!");
            } else {
                System.out.println("Confirme o pedido antes.");
            }
        } else {
            System.out.println("Não foi possível realizar o pagamento.");
        }
    }

    public void detalhesPedido(){
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("ID Pedido: " + this.getIdPedido());
        System.out.println("Cliente: " + this.getCliente());
        System.out.println("Data do pedido: " + this.getDataPedido());
        System.out.println("Valor total do pedido: R$" + this.calcularValorTotal());
        System.out.println("Status do pedido: " + this.getStatusPedido());
        this.listarProdutos();
        System.out.println("=====================================================");
        System.out.println();
    }
}