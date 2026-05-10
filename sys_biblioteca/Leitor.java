package sys_biblioteca;

import java.util.ArrayList;

public class Leitor {
    private String nome;
    private String email;
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();

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

    public String getEmail() {
        if (email != null) {
            return email;
        } else {
            return "null";
        }
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank()) {
            System.out.println("Email inválido!");
        } else {
            this.email = email;
        }
    }

    public void pegarEmprestado(Livro livro) {
        if (livro != null) {
            if (livro.isDisponivel()) {
                livrosEmprestados.add(livro);
                livro.setLeitorEmprestado(this);
            } else {
                System.out.println("Livro não está disponível!");
            }
        } else {
            System.out.println("Não é possível pegar um livro nulo!");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livro != null || livrosEmprestados.contains(livro)) {
            livrosEmprestados.remove(livro);
            livro.setLeitorEmprestado(null);
        } else {
            System.out.println("Este livro não foi emprestado para este leitor...");
        }
    }

    public void listarLivrosEmprestados() {
        if (livrosEmprestados.isEmpty()) {
            System.out.println("Este leitor não tem nenhum livro emprestado.");
        } else {
            System.out.println("Livros emprestados:");
            for (Livro livro : livrosEmprestados) {
                System.out.println("- " + livro.getTitulo());
            }
            System.out.println();
        }
    }
}