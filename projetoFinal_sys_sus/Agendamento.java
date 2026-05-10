package sistema;
import java.time.LocalDate;

public class Agendamento {
    private LocalDate dataHoraAgendada;
    private Cidadao cidadao;
    private Vacina vacinaDesejada;
    private UnidadeSaude unidade;
    private String status;

    public Agendamento(Cidadao cidadao, LocalDate dataHoraAgendada, Vacina vacinaDesejada, UnidadeSaude unidade, String status) {
        setCidadao(cidadao);
        setDataHoraAgendada(dataHoraAgendada);
        setVacinaDesejada(vacinaDesejada);
        setUnidade(unidade);
        setStatus(status);
    }

    public LocalDate getDataHoraAgendada() {
        return dataHoraAgendada;
    }

    public void setDataHoraAgendada(LocalDate dataHoraAgendada) {
        if(dataHoraAgendada != null){
            this.dataHoraAgendada = dataHoraAgendada;
        }else{
            throw new IllegalArgumentException("Data inválida");
        }
    }

    public Cidadao getCidadao() {
        return cidadao;
    }

    public void setCidadao(Cidadao cidadao) {
        if(cidadao != null){
            this.cidadao = cidadao;
        }else{
            throw new IllegalArgumentException("Cidadão inválido");
        }
    }

    public Vacina getVacinaDesejada() {
        return vacinaDesejada;
    }

    public void setVacinaDesejada(Vacina vacinaDesejada) {
        if(vacinaDesejada != null){
            this.vacinaDesejada = vacinaDesejada;
        }else{
            throw new IllegalArgumentException("Vacina inválida");
        }
    }

    public UnidadeSaude getUnidade() {
        return unidade;
    }

    public void setUnidade(UnidadeSaude unidade) {
        if(unidade != null){
            this.unidade = unidade;
        }else{
            throw new IllegalArgumentException("Unidade inválida");
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if(status != null){
            this.status = status;
        }else{
            throw new IllegalArgumentException("Status inválido");
        }
    }
}
