package sistema;

import java.util.ArrayList;
import java.util.List;

public class RepositorioAplicacao implements Repositorio<AplicacaoVacina>{
    private List<AplicacaoVacina> aplicacoes;

    public RepositorioAplicacao() {
        this.aplicacoes = new ArrayList<>();
    }

    @Override
    public void adicionar(AplicacaoVacina aplicacao) {
        if(aplicacao != null) {
            this.aplicacoes.add(aplicacao);
        } else {
            throw new IllegalArgumentException("Aplicação Inválida");
        }
    }

    @Override
    public void remover(AplicacaoVacina aplicacao) {
        if(aplicacao != null) {
            this.aplicacoes.remove(aplicacao);
        } else {
            throw new IllegalArgumentException("Aplicação Inválida");
        }
    }

    public List<AplicacaoVacina> getAplicacoes() {
        return aplicacoes;
    }

    public void setAplicacoes(List<AplicacaoVacina> aplicacoes) {
        if(aplicacoes != null) {
            this.aplicacoes = aplicacoes;
        } else {
            throw new IllegalArgumentException("Aplicações Inválidas");
        }
    }
}