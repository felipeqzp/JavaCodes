package sistema;
public class GestorDeCadastro implements Gestor <Cidadao>{

    private Repositorio<Cidadao> repositorio;

    public GestorDeCadastro(Repositorio<Cidadao> repositorio) {
        setRepositorio(repositorio);
    }

    @Override
    public boolean registrar(Cidadao cidadao) {
        if(cidadao != null) {
            repositorio.adicionar(cidadao);
            return true;
        }else{
            return false;
        }
    }

    public Repositorio<Cidadao> getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(Repositorio<Cidadao> repositorio) {
        if(repositorio != null) {
            this.repositorio = repositorio;
        }else{
            throw new IllegalArgumentException("Repositório inválido");
        }
    }
}