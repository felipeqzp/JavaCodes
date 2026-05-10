package sistema;

import java.util.List;

public class ServicoDeHistoricoVacinal {
    private Repositorio<AplicacaoVacina> repoAplicacoes;
    private Repositorio<Cidadao> repoCidadaos;

    public ServicoDeHistoricoVacinal(Repositorio<AplicacaoVacina> repoAplicacoes, Repositorio<Cidadao> repoCidadaos) {
        setRepoAplicacoes(repoAplicacoes);
        setRepoCidadaos(repoCidadaos);
    }

    public void getHistoricoPorCpf(String cpfCidadao) {
        System.out.println("=== HISTÓRICO DE VACINAÇÃO (CPF: " + cpfCidadao + ") ===");
        
        boolean encontrou = false;

        // Verifica se o repositório é do tipo correto para podermos acessar a lista
        if (repoAplicacoes instanceof RepositorioAplicacao) {
            
            // Fazemos a conversão para acessar o método getAplicacoes()
            RepositorioAplicacao repoConcreto = (RepositorioAplicacao) repoAplicacoes;
            List<AplicacaoVacina> lista = repoConcreto.getAplicacoes();
            
            if (lista != null) {
                for (AplicacaoVacina aplicacao : lista) {
                    if (aplicacao.getCidadao().getCpf().equals(cpfCidadao)) {
                        System.out.println("---------------------------------------------");
                        System.out.println("Data: " + aplicacao.getDataAplicacao());
                        System.out.println("Vacina: " + aplicacao.getLoteUtilizado().getTipoVacina());
                        System.out.println("Dose: " + aplicacao.getDose());
                        System.out.println("Unidade: " + aplicacao.getResponsavel().getUnidade().getNome());
                        System.out.println("Profissional: " + aplicacao.getResponsavel().getNome());
                        encontrou = true;
                    }
                }
            }
        }

        if (!encontrou) {
            System.out.println(">> Nenhuma vacina registrada para este CPF.");
        }
        System.out.println("=============================================\n");
    }

    public Repositorio<AplicacaoVacina> getRepoAplicacoes() {
        return repoAplicacoes;
    }

    public void setRepoAplicacoes(Repositorio<AplicacaoVacina> repoAplicacoes) {
        if(repoAplicacoes != null) {
            this.repoAplicacoes = repoAplicacoes;
        } else {
            throw new IllegalArgumentException("Repositório de Aplicações Inválido");
        }
    }

    public Repositorio<Cidadao> getRepoCidadaos() {
        return repoCidadaos;
    }

    public void setRepoCidadaos(Repositorio<Cidadao> repoCidadaos) {
        if(repoCidadaos != null) {
            this.repoCidadaos = repoCidadaos;
        } else {
            throw new IllegalArgumentException("Repositório de Cidadãos Inválido");
        }
    }
}