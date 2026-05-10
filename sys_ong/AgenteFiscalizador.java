package sys_ong;

public class AgenteFiscalizador implements Validavel{
    private String nomeFiscalizador;

    public AgenteFiscalizador(String nomeFiscalizador, String registro){
        this.setNomeFiscalizador(nomeFiscalizador);
    }

    public String getNomeFiscalizador() {
        return nomeFiscalizador;
    }

    public void setNomeFiscalizador(String nomeFiscalizador) {
        if(nomeFiscalizador != null){
            this.nomeFiscalizador = nomeFiscalizador;
        }else{
            System.out.println("Nome inválido, digite novamente\n");
        }
    }

    @Override
    public boolean validarDados() {
        if(this.nomeFiscalizador != null && this.nomeFiscalizador.isBlank()){
            System.out.println("Dados totalmente preenchidos!\n");
            return true;
        }else{
            System.out.println("Faltando dados!\n");
            return false;
        }
    }
}