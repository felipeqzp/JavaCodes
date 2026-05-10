package sistema;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeCidadaos implements Repositorio<Cidadao>{
    private List<Cidadao> cidadaosCadastrados;

    public RepositorioDeCidadaos() {
        this.cidadaosCadastrados = new ArrayList<>();
    }

    public void adicionar(Cidadao cidadao) {
        if(cidadao != null) {
            cidadaosCadastrados.add(cidadao);
        }else{
            throw new IllegalArgumentException("Cidadão Inválido");
        }
    }

    public void remover(Cidadao cidadao) {
        if(cidadao != null && cidadaosCadastrados.contains(cidadao)) {
            cidadaosCadastrados.remove(cidadao);
        }else{
            throw new IllegalArgumentException("Cidadão Inválido ou não encontrado");
        }
    }

    public List<Cidadao> getCidadaosCadastrados() {
        return cidadaosCadastrados;
    }

    public void setCidadaosCadastrados(List<Cidadao> cidadaosCadastrados) {
        if(cidadaosCadastrados != null) {
            this.cidadaosCadastrados = cidadaosCadastrados;
        } else {
            throw new IllegalArgumentException("Cidadãos Cadastrados Inválidos");
        }
    }
}
