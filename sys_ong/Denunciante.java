package sys_ong;

public class Denunciante {
    private String nomeDenunciante;
    private String telefone;

    public Denunciante(String nomeDenunciante, String telefone){
        this.setNomeDenunciante(nomeDenunciante);
        this.setTelefone(telefone);
    }

    public String getNomeDenunciante() {
        return nomeDenunciante;
    }

    public void setNomeDenunciante(String nomeDenunciante) {
        if(nomeDenunciante.isEmpty() || nomeDenunciante.trim().length() <= 0){
            this.nomeDenunciante = "Anônimo";
        }else{
            this.nomeDenunciante = nomeDenunciante;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone.isEmpty() || telefone.trim().length() <= 0){ //valida se não foi preenchido nada, ou então apenas colocado espaços no input
            this.telefone = "Número anônimo";
        }else{
            this.telefone = telefone;
        }
    }
}
