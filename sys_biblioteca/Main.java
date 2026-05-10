package sys_biblioteca;

public class Main {
    public static void main(String[] args) {

        Biblioteca bibliotecaUm = new Biblioteca();
        bibliotecaUm.setNome("Biblioteca Maya");
        bibliotecaUm.setEndereco("Rua ABC, 25, Iguatu - CE");

        Autor autorUm = new Autor();
        autorUm.setNome("Colleen Hoover");
        autorUm.setNacionalidade("Norte-americana");

        Autor autorDois = new Autor();
        autorDois.setNome("Tarryn Fisher");
        autorDois.setNacionalidade("Sul-africana");

        Leitor leitorUm = new Leitor();
        leitorUm.setNome("João");
        leitorUm.setEmail("joao123@gmail.com");

        Livro livroUm = new Livro();
        livroUm.setTitulo("Nunca Jamais");
        livroUm.setIsbn("0-8300-4720-4");
        livroUm.adicionarAutor(autorUm);
        livroUm.adicionarAutor(autorDois);

        autorUm.adicionarLivro(livroUm);
        autorDois.adicionarLivro(livroUm);
        leitorUm.pegarEmprestado(livroUm);

        // =============================== TESTES ABAIXO: =========================================

        System.out.println("Nome da biblioteca: " + bibliotecaUm.getNome());
        System.out.println("Endereço da biblioteca: " + bibliotecaUm.getEndereco());
        bibliotecaUm.adicionarLivro(livroUm);
        bibliotecaUm.listarLivros();

        System.out.println();

        System.out.println("Título do livro: " + livroUm.getTitulo());
        System.out.println("ISBN do livro: " + livroUm.getIsbn());
        livroUm.getAutores();
        System.out.println("O livro pertence a " + livroUm.getBiblioteca());
        System.out.println("O livro está emprestado para " + livroUm.getLeitorEmprestado());
        System.out.println("O livro está disponível? " + livroUm.isDisponivel());

        System.out.println();

        System.out.println("Nome do autor: " + autorUm.getNome());
        System.out.println("Nacionalidade do autor: " + autorUm.getNacionalidade());
        autorUm.listarLivrosAutor();

        System.out.println();

        System.out.println("Nome do autor: " + autorDois.getNome());
        System.out.println("Nacionalidade do autor: " + autorDois.getNacionalidade());
        autorDois.listarLivrosAutor();

        System.out.println();

        System.out.println("Nome do leitor: " + leitorUm.getNome());
        System.out.println("Email do leitor: " + leitorUm.getEmail());
        leitorUm.listarLivrosEmprestados();

        leitorUm.devolverLivro(livroUm);

        leitorUm.listarLivrosEmprestados();
        System.out.println("O livro está emprestado para " + livroUm.getLeitorEmprestado());
        System.out.println("O livro está disponível? " + livroUm.isDisponivel());

        bibliotecaUm.removerLivro(livroUm);
        bibliotecaUm.listarLivros();
        System.out.println("O livro pertence a " + livroUm.getBiblioteca());
        
    }
}