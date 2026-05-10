package sys_livro_biblioteca;

public class Livro implements Emprestavel{

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;
    private int exemplares;

    public Livro(String titulo, String autor, int anoPublicacao, int exemplares){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAnoPublicacao(anoPublicacao);
        this.setExemplares(exemplares);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo != null){
            this.titulo = titulo;
        }else{
            System.out.println("Título inválido, digite novamente\n");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor != null){
            this.autor = autor;
        }else{
            System.out.println("Autor inválido, digite novamente\n");
        }
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao > 0){
            this.anoPublicacao = anoPublicacao;
        }else{
            System.out.println("Data inválida, digite novamente\n");
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getExemplares() {
        return exemplares;
    }

    public void setExemplares(int exemplares) {
        if(exemplares > 0){
            this.exemplares = exemplares;
            this.disponivel = true;
        }else if (exemplares == 0){
            this.exemplares = exemplares;
            this.disponivel = false;
        }else{
            System.out.println("Quantidade inválida, digite novamente\n");
        }
    }

    @Override
    public boolean podeEmprestar() {
        if(this.disponivel && exemplares >= 1){
            return true;
        }else{
            return false;
        }
    }
}
