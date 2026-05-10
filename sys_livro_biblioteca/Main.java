package sys_livro_biblioteca;

public class Main {
    public static void main(String[] args) {
        
        Livro novoLivro = new Livro("1984", "George Orwell", 1949, 30);

        System.out.println("Título do livro: " + novoLivro.getTitulo());
        System.out.println("Autor do livro: " + novoLivro.getAutor());
        System.out.println("Ano de publicação do livro: " + novoLivro.getAnoPublicacao());
        System.out.println("Quantidade de exemplares do livro: " + novoLivro.getExemplares() + "\n");

        System.out.println("Livro pode ser emprestado? " + novoLivro.podeEmprestar());

        novoLivro.setExemplares(0);

        System.out.println("Livro pode ser emprestado? " + novoLivro.podeEmprestar());
    }
}