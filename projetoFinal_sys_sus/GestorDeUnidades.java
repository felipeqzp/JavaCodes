package sistema;
public class GestorDeUnidades implements Gestor <UnidadeSaude>{

    private Repositorio<UnidadeSaude> repositorio;

    public GestorDeUnidades(Repositorio<UnidadeSaude> repositorio) {
        setRepositorio(repositorio);
    }

    @Override
    public boolean registrar(UnidadeSaude unidade) {
        if(unidade != null) {
            repositorio.adicionar(unidade);
            return true;
        }else{
            return false;
        }
    }

    public Repositorio<UnidadeSaude> getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(Repositorio<UnidadeSaude> repositorio) {
        if(repositorio != null) {
            this.repositorio = repositorio;
        }else{
            throw new IllegalArgumentException("Repositório de Unidades Inválido");
        }
    }
}