package sistema;
import java.util.ArrayList;
import java.util.List;

public class EstoqueVacinas implements Relatorio, Notificacao{
    private List<LoteVacina> estoqueDeLotes;
    private int quantidadeTotal = 0;

    public EstoqueVacinas(){
        this.estoqueDeLotes = new ArrayList<>();
    }

    @Override
    public String gerarRelatorio() {
        return "Estoque total de vacinas: " + quantidadeTotal + "\n";
    }

    @Override
    public String gerarRelatorio(boolean maisInformacoes){

        String resultado = "Estoque total de vacinas: " + quantidadeTotal + "\n";

        if (estoqueDeLotes != null) {
            for (LoteVacina lote : estoqueDeLotes) {
                resultado += "Lote ID: " + lote.getIdLote() + ", Tipo: " + lote.getTipoVacina() + ", Quantidade: " + lote.getQuantidade() + ", Validade: " + lote.getDataValidade() + "\n";
            }
        }
        return resultado;
    }

    @Override
    public String mandarNotificacao(){
        return "NOTIFICAÇÃO: Estoque de vacinas baixo!\n";
    }

    public boolean estoqueBaixo(){
        if(quantidadeTotal < 50){
            mandarNotificacao();
            return true;
        }
        return false;
    }

    public int atualizarQuantidadeTotal() {
        if(estoqueDeLotes != null) {
            int total = 0;
            for (LoteVacina lote : estoqueDeLotes) {
                total += lote.getQuantidade();
            }
            setQuantidadeTotal(total);
        }
        return getQuantidadeTotal();
    }

    public void adicionarLote(LoteVacina lote){
        if(lote != null) {
            estoqueDeLotes.add(lote);
            atualizarQuantidadeTotal();
        }else{
            throw new IllegalArgumentException("Lote inválido");
        }
    }

    public LoteVacina buscarLote(int idLote){
        for(LoteVacina lote : estoqueDeLotes){
            if(lote.getIdLote() == idLote) {
                return lote;
            }
        }
        return null;
    }

    public void removerLote(int idLote){
        for(LoteVacina lote : estoqueDeLotes){
            if(lote.getIdLote() == idLote) {
                estoqueDeLotes.remove(lote);
                atualizarQuantidadeTotal();
                return;
            }else{
                throw new IllegalArgumentException("Lote inválido ou não encontrado");
            }
        }
    }

    public List<LoteVacina> getEstoqueDeLotes() {
        return estoqueDeLotes;
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(int quantidadeTotal) {
        if(quantidadeTotal >= 0) {
            this.quantidadeTotal = quantidadeTotal;
        }else{
            throw new IllegalArgumentException("Quantidade Total Inválida");
        }
    }
}