package sistema;

public class Enfermeiro extends ProfissionalSaude {

    private String coren;
    private int salaVacinacao;

    public Enfermeiro(int id, String nome, String cpf, UnidadeSaude unidade, String coren, int salaVacinacao) {
        super(id, nome, cpf, unidade);
        setCoren(coren);
        setSalaVacinacao(salaVacinacao);
    }

    @Override
    public String getCargoDescricao() {
        return "Aplicação de vacinas e Supervisão";
    }
    
    public void prepararDose(Vacina vacina) {
        System.out.println("Preparando dose da vacina: " + vacina.getNome() + " na sala " + salaVacinacao);
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        if (coren != null && !coren.isEmpty()) {
            this.coren = coren;
        } else {
            throw new IllegalArgumentException("COREN inválido");
        }
    }

    public int getSalaVacinacao() {
        return salaVacinacao;
    }

    public void setSalaVacinacao(int salaVacinacao) {
        if (salaVacinacao > 0) {
            this.salaVacinacao = salaVacinacao;
        } else {
            throw new IllegalArgumentException("Sala inválida");
        }
    }
}