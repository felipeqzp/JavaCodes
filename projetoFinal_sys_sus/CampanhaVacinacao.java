package sistema;
import java.util.Date;
import java.util.List;

public class CampanhaVacinacao {
    private String nome;
    private Date dataInicio;
    private Date dataFim;
    private List<Vacina> vacinasEnvolvidas;
    private List<UnidadeSaude> unidadesEnvolvidas;
    
    public CampanhaVacinacao(String nome, Date dataInicio, Date dataFim, List<Vacina> vacinasEnvolvidas, List<UnidadeSaude> unidadesEnvolvidas) {
        setNome(nome);
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        setVacinasEnvolvidas(vacinasEnvolvidas);
        setUnidadesEnvolvidas(unidadesEnvolvidas);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("Nome Inválido");
        }
    }
    public Date getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(Date dataInicio) {
        if(dataInicio != null) {
            this.dataInicio = dataInicio;
        }else{
            throw new IllegalArgumentException("Data de Início Inválida");
        }
    }
    public Date getDataFim() {
        return dataFim;
    }
    public void setDataFim(Date dataFim) {
        if(dataFim != null) {
            this.dataFim = dataFim;
        }else{
            throw new IllegalArgumentException("Data de Fim Inválida");
        }
    }
    public List<Vacina> getVacinasEnvolvidas() {
        return vacinasEnvolvidas;
    }
    public void setVacinasEnvolvidas(List<Vacina> vacinasEnvolvidas) {
        if(vacinasEnvolvidas != null && !vacinasEnvolvidas.isEmpty()) {
            this.vacinasEnvolvidas = vacinasEnvolvidas;
        }else{
            throw new IllegalArgumentException("Lista de Vacinas Inválida");
        }
    }
    public List<UnidadeSaude> getUnidadesEnvolvidas() {
        return unidadesEnvolvidas;
    }
    public void setUnidadesEnvolvidas(List<UnidadeSaude> unidadesEnvolvidas) {
        if(unidadesEnvolvidas != null && !unidadesEnvolvidas.isEmpty()) {
            this.unidadesEnvolvidas = unidadesEnvolvidas;
        }else{
            throw new IllegalArgumentException("Lista de Unidades de Saúde Inválida");
        }
    }
}
