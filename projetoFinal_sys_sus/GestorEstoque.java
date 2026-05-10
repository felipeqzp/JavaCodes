package sistema;

import java.time.LocalDate;

public class GestorEstoque implements Gestor<LoteVacina>{

    private EstoqueVacinas estoque;

    public GestorEstoque(EstoqueVacinas estoque){
        setEstoque(estoque);
    }

    @Override
    public boolean registrar(LoteVacina lote) {
        if(lote != null && lote.getDataValidade().isAfter(LocalDate.now())) {
            estoque.adicionarLote(lote);
            return true;
        }else{
            return false;
        }
    }

    public EstoqueVacinas getEstoque() {
        return estoque;
    }

    public void setEstoque(EstoqueVacinas estoque) {
        if(estoque != null) {
            this.estoque = estoque;
        }else{
            throw new IllegalArgumentException("Estoque Inválido");
        }
    }
}
