package sistema;

public class GestorAgendamento implements Gestor<Agendamento> {
    private Repositorio<Agendamento> repositorio;

    public GestorAgendamento(Repositorio<Agendamento> repositorio){
        setRepositorio(repositorio);
    }

    @Override
    public boolean registrar(Agendamento agendamento) {
        if(agendamento != null) {
            repositorio.adicionar(agendamento);
            return true;
        }else{
            return false;
        }
    }

    public Repositorio<Agendamento> getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(Repositorio<Agendamento> repositorio) {
        if(repositorio != null){
            this.repositorio = repositorio;
        }else{
            throw new IllegalArgumentException("Repositório inválido");
        }
    }

    
}
