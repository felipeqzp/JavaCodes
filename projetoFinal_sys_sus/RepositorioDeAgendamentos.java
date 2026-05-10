package sistema;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAgendamentos implements Repositorio<Agendamento>{
    private List<Agendamento> agendamentos;

    public RepositorioDeAgendamentos(){
        this.agendamentos = new ArrayList<>();
    }

    @Override
    public void adicionar(Agendamento agendamento) {
        if(agendamento != null) {
            agendamentos.add(agendamento);
        }else{
            throw new IllegalArgumentException("Agendamento Inválido");
        }
    }

    @Override
    public void remover(Agendamento agendamento){
        if(agendamento != null) {
            agendamentos.remove(agendamento);
        }else{
            throw new IllegalArgumentException("Agendamento Inválido");
        }
    }

}