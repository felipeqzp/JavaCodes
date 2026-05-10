package sistema;

public class AtendenteSaude extends ProfissionalSaude {
    
    private String turno;
    private int numeroGuiche;

    public AtendenteSaude(int id, String nome, String cpf, UnidadeSaude unidade, String turno, int numeroGuiche) {
        super(id, nome, cpf, unidade);
        setTurno(turno);
        setNumeroGuiche(numeroGuiche);
    }

    @Override
    public String getCargoDescricao() {
        return "Responsável pela triagem";
    }

    public boolean verificarDocumentacao(Cidadao cidadao) {
        if (cidadao != null && cidadao.getCpf() != null && !cidadao.getCpf().isEmpty()) {
            return true;
        }
        return false;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getNumeroGuiche() {
        return numeroGuiche;
    }

    public void setNumeroGuiche(int numeroGuiche) {
        if (numeroGuiche > 0) {
            this.numeroGuiche = numeroGuiche;
        } else {
            throw new IllegalArgumentException("Número do guichê inválido");
        }
    }
}