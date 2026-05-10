package sistema;
public class GestorAplicacao implements Gestor <AplicacaoVacina> {

    private Repositorio<AplicacaoVacina> repoAplicacao;

    public GestorAplicacao(Repositorio<AplicacaoVacina> repoAplicacao){
        setRepositorio(repoAplicacao);
    }

    public boolean validarAplicacao(Cidadao cidadao, LoteVacina lote) {
        if(cidadao != null && lote != null && lote.getQuantidade() > 0) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean registrar(AplicacaoVacina aplicacao) {

        if(validarAplicacao(aplicacao.getCidadao(), aplicacao.getLoteUtilizado())){
            repoAplicacao.adicionar(aplicacao);
            aplicacao.getLoteUtilizado().reduzirQuantidadeDoses();
            return true;
        }else{
            return false;
        }
    }

    public Repositorio<AplicacaoVacina> getRepositorio() {
        return repoAplicacao;
    }

    public void setRepositorio(Repositorio<AplicacaoVacina> repoAplicacao) {
        if(repoAplicacao != null) {
            this.repoAplicacao = repoAplicacao;
        }else{
            throw new IllegalArgumentException("Repositório inválido");
        }
    }
}