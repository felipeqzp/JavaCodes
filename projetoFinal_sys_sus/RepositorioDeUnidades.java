package sistema;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeUnidades implements Repositorio<UnidadeSaude>{
    private List<UnidadeSaude> unidades;

    public RepositorioDeUnidades() {
        this.unidades = new ArrayList<>();
    }

    @Override
    public void adicionar(UnidadeSaude unidade) {
        if(unidade != null) {
            unidades.add(unidade);
        }else{
            throw new IllegalArgumentException("Unidade de Saúde Inválida");
        }
    }

    @Override
    public void remover(UnidadeSaude unidade) {
        if(unidade != null) {
            unidades.remove(unidade);
        }else{
            throw new IllegalArgumentException("Unidade de Saúde Inválida");
        }
    }

    public List<UnidadeSaude> getUnidades() {
        return unidades;
    }

    public void setUnidades(List<UnidadeSaude> unidades) {
        if(unidades != null) {
            this.unidades = unidades;
        } else {
            throw new IllegalArgumentException("Unidades Inválidas");
        }
    }
}
