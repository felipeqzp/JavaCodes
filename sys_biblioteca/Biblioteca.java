package sys_biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
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

    public String getEndereco() {
        if (endereco != null) {
            return endereco;
        } else {
            return "null";
        }
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.isBlank()) {
            System.out.println("Endereço inválido!");
        } else {
            this.endereco = endereco;
        }
    }

    public void adicionarLivro(Livro livro) {
        if (livro != null) {
            livro.setBiblioteca(this);
            livros.add(livro);
        } else {
            System.out.println("Não é possível adicionar um livro nulo!");
        }
    }

    public void removerLivro(Livro livro){
        if(livro != null || livros.contains(livro)){
            livro.setBiblioteca(null);
            livros.remove(livro);
        }else{
            System.out.println("Este biblioteca não possui este livro.");
        }
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Não há livros na biblioteca!");
        } else {
            System.out.println("Livros da biblioteca:");
            for (Livro livro : livros) {
                System.out.println("- " + livro.getTitulo());
            }
        }
    }
}