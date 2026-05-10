package sistema;

import java.time.LocalDate;

public class LoteVacina implements Notificacao{
    private int idLote;
    private String tipoVacina;
    private int quantidade;
    private LocalDate dataValidade;

    public LoteVacina(int idLote, String tipoVacina, int quantidade, LocalDate dataValidade) {
        setIdLote(idLote);
        setTipoVacina(tipoVacina);
        setQuantidade(quantidade);
        setDataValidade(dataValidade);
    }

    @Override
    public String mandarNotificacao() {
        return "NOTIFICAÇÃO: Lote " + getIdLote() + " da vacina: " + getTipoVacina() + " - está vencido.";
    }

    public boolean estaVencido(){
        if(dataValidade.isBefore(LocalDate.now())){
            mandarNotificacao();
            return true;
        }else{
            return false;
        }
    }

    public void reduzirQuantidadeDoses() {
        if(quantidade > 0) {
            quantidade--;
        }else{
            throw new IllegalArgumentException("Quantidade de Doses Insuficiente");
        }
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        if(idLote > 0) {
            this.idLote = idLote;
        }else{
            throw new IllegalArgumentException("ID do Lote Inválido");
        }
    }

    public String getTipoVacina() {
        return tipoVacina;
    }

    public void setTipoVacina(String tipoVacina) {
        if(tipoVacina != null && !tipoVacina.isEmpty()) {
            this.tipoVacina = tipoVacina;
        }else{
            throw new IllegalArgumentException("Tipo de Vacina Inválido");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade >= 0) {
            this.quantidade = quantidade;
        }else{
            throw new IllegalArgumentException("Quantidade de Doses Inválida");
        }
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        if(dataValidade != null) {
            this.dataValidade = dataValidade;
        }else{
            throw new IllegalArgumentException("Data de Validade Inválida");
        }
    }
}
