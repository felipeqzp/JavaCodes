package sys_biblioteca;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String isbn;
    private ArrayList<Autor> autores = new ArrayList<>();
    private Biblioteca biblioteca;
    private Leitor leitorEmprestado;
    private boolean disponivel = true;

    public String getTitulo() {
        if (titulo != null) {
            return titulo;
        } else {
            return "null";
        }
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            System.out.println("Título inválido!");
        } else {
            this.titulo = titulo;
        }
    }

    public String getIsbn() {
        if (isbn != null) {
            return isbn;
        } else {
            return "null";
        }
    }

    public void setIsbn(String isbn) {
        if (isbn == null || isbn.isBlank()) {
            System.out.println("ISBN inválido!");
        } else {
            this.isbn = isbn;
        }
    }

    public void adicionarAutor(Autor autor) {
        if (autores != null) {
            autores.add(autor);
        } else {
            System.out.println("Não é possível adicionar um autor nulo!");
        }
    }

    public void getAutores() {
        System.out.println("Autores do livro:");
        for (Autor autor : autores) {
            System.out.println("- " + autor.getNome());
        }
        System.out.println();
    }

    public String getBiblioteca() {
        if (biblioteca != null) {
            return biblioteca.getNome();
        } else {
            return "nenhuma biblioteca";
        }
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        if (biblioteca != null) {
            this.biblioteca = biblioteca;
        } else {
            this.biblioteca = null;
        }
    }

    public String getLeitorEmprestado() {
        if (leitorEmprestado == null) {
            return "nenhum leitor";
        } else {
            return leitorEmprestado.getNome();
        }
    }

    public void setLeitorEmprestado(Leitor leitor) {
        if (leitor != null) {
            this.leitorEmprestado = leitor;
            this.disponivel = false;
        } else {
            this.leitorEmprestado = null;
            this.disponivel = true;
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}