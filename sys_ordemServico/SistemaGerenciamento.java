package sys_ordemServico;

import java.util.ArrayList;
import java.util.List;

public class SistemaGerenciamento {

    private List<OrdemServico> ordens;

    public SistemaGerenciamento() {
        this.ordens = new ArrayList<>();
    }

    public void abrirOrdem(OrdemServico os) {
        ordens.add(os);
        os.registrar();
        System.out.println("Ordem " + os.getId() + " aberta.");
    }

    public List<OrdemServico> getOrdens() {
        return ordens;
    }

    // Gera relatório filtrando por mês/ano reais com base em dataAbertura
    public String gerarRelatorioMensal(int mes, int ano) {
        StringBuilder sb = new StringBuilder();
        sb.append("Relatorio para ").append(mes).append("/").append(ano).append("\n");
        double soma = 0;
        int count = 0;
        for (OrdemServico os : ordens) {
            if (os.getDataAbertura() != null &&
                os.getDataAbertura().getMonthValue() == mes &&
                os.getDataAbertura().getYear() == ano) {
                sb.append(os.toString()).append("\n");
                soma += os.calcularCustoTotal();
                count++;
            }
        }
        
        sb.append("Total de ordens: ").append(count).append("\n");
        sb.append("Custo total do periodo: R$ ").append(String.format("%.2f", soma)).append("\n");
        return sb.toString();
    }
}