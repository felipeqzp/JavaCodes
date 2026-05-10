package sys_ong;

public class Regiao {
    private String estado;
    private String cidade;

    public Regiao (String estado, String cidade){
        this.setEstado(estado);
        this.setCidade(cidade);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if(estado.isEmpty() || estado.trim().length() <= 0){
            System.out.println("Estado inválido, digite novamente\n");
        }else{
            this.estado = estado;
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if(cidade.isEmpty() || cidade.trim().length() <= 0){
            System.out.println("Cidade inválida, digite novamente\n");
        }else{
            this.cidade = cidade;
        }
    }
}
