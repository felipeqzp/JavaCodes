package sys_vendas;

public class Main {
    public static void main(String[] args) {
        
        Produto produtoUm = new Produto(1, "Celular Samsung", 1109.90, 10);
        produtoUm.setDescricao("É um smartphone que pode satisfazer até o mais exigente dos usuários.");

        Produto produtoDois = new Produto(2, "Kit Ferramentas", 329.90, 5);
        produtoDois.setDescricao("Um kit para atender as mais diversas necessidades que surgirem no dia a dia.");

        Produto produtoTres = new Produto(3, "Livro de programação", 29.90, 25);
        produtoTres.setDescricao("Um livro didático para os intusiastas de tecnologia.");

        Cliente clienteUm = new Cliente(1, "Felipe", "000.111.222-33", "felipe.teste@gmail.com" );

        Pedido pedidoUm = new Pedido(1, clienteUm);

        System.out.println("Status do pedido: " + pedidoUm.getStatusPedido());
        
        pedidoUm.adicionarProduto(produtoUm);
        pedidoUm.adicionarProduto(produtoDois);
        pedidoUm.detalhesPedido();
        pedidoUm.confirmarPedido();

        System.out.println("Status do pedido: " + pedidoUm.getStatusPedido());

        Pagamento pagamentoUm = new Pagamento(1, pedidoUm.calcularValorTotal(), "Cartão crédito");

        pedidoUm.realizarPagamento(pagamentoUm);

        pagamentoUm.verificarStatusPagamento();

    }
}
