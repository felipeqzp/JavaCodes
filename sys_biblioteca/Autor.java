package sys_biblioteca;

import java.util.ArrayList;

public class Autor {
    private String nome;
    private String nacionalidade;
    private ArrayList<Livro> livros = new ArrayList<>();

    public String getNome() {
        if (nome != null) {
            return nome;
        } else {
            return "null";
        }
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("Nome inválido!");
        } else {
            this.nome = nome;
        }
    }

    public String getNacionalidade() {
        if (nacionalidade != null) {
            return nacionalidade;
        } else {
            return "null";
        }
    }

    public void setNacionalidade(String nacionalidade) {
        if (nacionalidade == null || nacionalidade.isBlank()) {
            System.out.println("Nacionalidade inválida!");
        } else {
            this.nacionalidade = nacionalidade;
        }
    }

    public void adicionarLivro(Livro livro) {
        if (livro != null) {
            livros.add(livro);
        } else {
            System.out.println("Não é possível adicionar um livro nulo!");
        }
    }

    public void listarLivrosAutor() {
        if (livros.isEmpty()) {
            System.out.println("Este autor ainda não publicou nenhum livro.");
        } else {
            System.out.println("Livros do autor:");
            for (Livro livro : livros) {
                System.out.println("- " + livro.getTitulo());
            }
            System.out.println();
        }
    }
}