package sistema;

import java.time.LocalDate;

public class AplicacaoVacina {
    private int idAplicacao;
    private Cidadao cidadao;
    private LoteVacina loteUtilizado;
    private ProfissionalSaude responsavel;
    private int dose;
    private LocalDate dataAplicacao;

    public AplicacaoVacina(int idAplicacao, Cidadao cidadao, LoteVacina loteUtilizado, ProfissionalSaude responsavel, int dose, LocalDate dataAplicacao) {
        setIdAplicacao(idAplicacao);
        setCidadao(cidadao);
        setLoteUtilizado(loteUtilizado);
        setResponsavel(responsavel);
        setDose(dose);
        setDataAplicacao(dataAplicacao);
    }

    public int getIdAplicacao() {
        return idAplicacao;
    }

    public void setIdAplicacao(int idAplicacao) {
        if(idAplicacao >= 0){
            this.idAplicacao = idAplicacao;
        }else{
            throw new IllegalArgumentException("ID de Aplicação Inválido");
        }
    }

    public Cidadao getCidadao() {
        return cidadao;
    }

    public void setCidadao(Cidadao cidadao) {
        if(cidadao != null){
            this.cidadao = cidadao;
        }else{
            throw new IllegalArgumentException("Cidadão Inválido");
        }
    }

    public LoteVacina getLoteUtilizado() {
        return loteUtilizado;
    }

    public void setLoteUtilizado(LoteVacina loteUtilizado) {
        if(loteUtilizado != null){
            this.loteUtilizado = loteUtilizado;
        }else{
            throw new IllegalArgumentException("Lote de Vacina Inválido");
        }
    }

    public ProfissionalSaude getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ProfissionalSaude responsavel) {
        if(responsavel != null){
            this.responsavel = responsavel;
        }else{
            throw new IllegalArgumentException("Profissional de Saúde Inválido");
        }
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        if(dose >= 0){
            this.dose = dose;
        }else{
            throw new IllegalArgumentException("Dose Inválida");
        }
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        if(dataAplicacao != null){
            this.dataAplicacao = dataAplicacao;
        }else{
            throw new IllegalArgumentException("Data de Aplicação Inválida");
        }
    }
}
