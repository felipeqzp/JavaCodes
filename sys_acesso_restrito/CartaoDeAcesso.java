package sys_acesso_restrito;

public class CartaoDeAcesso implements Validacao {
    
    private int idCartao;
    private String nome;
    private int nivelAcesso;
    private boolean ativo;
    private boolean acesso;

    public CartaoDeAcesso(int idCartao, String nome, int nivelAcesso){

        this.setIdCartao(idCartao);
        this.setNome(nome);
        this.setNivelAcesso(nivelAcesso);
        this.acesso = false;
        this.ativo = true;

    }

    public int getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(int idCartao){
        if(idCartao < 0){
            System.out.println("Número de id inválido\n");
        }else{
            this.idCartao = idCartao;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            System.out.println("Nome inválido!\n");
        }else{
            this.nome = nome;
        }
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        if(nivelAcesso < 1 || nivelAcesso > 5){
            System.out.println("Nível de acesso inválido!\n");
        }else{
            this.nivelAcesso = nivelAcesso;
        }
    }

    public boolean isAtivo(){
        return ativo;
    }

    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }

    @Override
    public void validacaoAcesso() {
        if(this.ativo && this.nivelAcesso >= 3){
            this.acesso = true;
            System.out.println("Acesso permitido!\n");
        }else{
            System.out.println("Acesso negado!\n");
        }
    }
}
