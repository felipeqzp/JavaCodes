public class Main {
    public static void main(String[] args){

        ClienteAcademia novoCliente = new ClienteAcademia();

        System.out.println("O nome do cliente é: " + novoCliente.getNome() + "\n");
        System.out.println("A idade do cliente é: " + novoCliente.getIdade() + "\n");
        System.out.println("A mensalidade do cliente é: " + novoCliente.getMensalidade() + "\n");

        novoCliente.setNome("Felipe");
        novoCliente.setIdade(19);
        novoCliente.setMensalidade(100);

        System.out.println("O nome do cliente é: " + novoCliente.getNome() + "\n");
        System.out.println("A idade do cliente é: " + novoCliente.getIdade() + "\n");
        System.out.println("A mensalidade do cliente é: " + novoCliente.getMensalidade() + "\n");

        novoCliente.pagarMensalidade(100);
    }
}