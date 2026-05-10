package sys_ong;
import java.util.List;

public class RelatorioRegiao {
    private Regiao regiao;
    private AgenteFiscalizador responsavel;
    private List<Violacao> violacoes;
    private String dataRelatorio;

    public RelatorioRegiao(Regiao regiao, AgenteFiscalizador responsavel, String dataRelatorio){
        
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public AgenteFiscalizador getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(AgenteFiscalizador responsavel) {
        this.responsavel = responsavel;
    }

    public List<Violacao> getViolacoes() {
        return violacoes;
    }

    public void setViolacoes(List<Violacao> violacoes) {
        this.violacoes = violacoes;
    }

    public String getDataRelatorio() {
        return dataRelatorio;
    }

    public void setDataRelatorio(String dataRelatorio) {
        this.dataRelatorio = dataRelatorio;
    }
}
