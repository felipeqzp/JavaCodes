package sys_acesso_restrito;

public class Main {
    public static void main(String[] args) {
        CartaoDeAcesso novoCartao = new CartaoDeAcesso(1, "Joao", 3);

        System.out.println("O nome do cliente é: " + novoCartao.getNome() + "\n");
        System.out.println("O nível de acesso do cliente é: " + novoCartao.getNivelAcesso() + "\n");

        novoCartao.setNivelAcesso(4);

        novoCartao.validacaoAcesso();

        System.out.println("O cartão está ativo? " + novoCartao.isAtivo() + " \n");

        novoCartao.setAtivo(false);

        System.out.println("O cartão está ativo? " + novoCartao.isAtivo() + " \n");

        novoCartao.validacaoAcesso();
    }
}