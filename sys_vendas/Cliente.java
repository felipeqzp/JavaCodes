package sys_vendas;

import java.util.ArrayList;

public class Cliente {
    private int idCliente;
    private String nome;
    private String cpf;
    private String email;
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Cliente(int idCliente, String nome, String cpf, String email){
        this.setIdCliente(idCliente);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        if(idCliente > 0){
            this.idCliente = idCliente;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()) {
            System.out.println("CPF inválido.");
        } else {
            this.cpf = cpf;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank()) {
            System.out.println("Email inválido.");
        } else {
            this.email = email;
        }
    }

    public void fazerPedido(Pedido pedido){
        if(pedido != null){
            pedidos.add(pedido);
            System.out.println("Pedido adicionado!");
        }else{
            System.out.println("Não é possível fazer um pedido nulo.");
        }
    }

    public void listarPedidos(){
        System.out.println("================== PEDIDOS DO CLIENTE ==================");
        for(Pedido pedido : pedidos){
            System.out.println("- ID: " + pedido.getIdPedido() + ", Status: " + pedido.getStatusPedido() + ", Valor total: " + pedido.calcularValorTotal() + ", Data do pedido: " + pedido.getDataPedido());
        }
        System.out.println();
    }
}