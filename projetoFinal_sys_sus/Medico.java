package sistema;

public class Medico extends ProfissionalSaude {
    
    private String crm;
    private String especialidade;

    public Medico(int id, String nome, String cpf, UnidadeSaude unidade, String crm, String especialidade) {
        super(id, nome, cpf, unidade);
        setCrm(crm);
        setEspecialidade(especialidade);
    }

    @Override
    public String getCargoDescricao() {
        return "Médico - " + especialidade;
    }

    public boolean autorizarVacinacao(Cidadao cidadao, Vacina vacina) {
        System.out.println("Médico Dr. " + getNome() + " avaliando paciente: " + cidadao.getNome() + "...");
        return true;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        if (crm != null && !crm.isEmpty()) {
            this.crm = crm;
        } else {
            throw new IllegalArgumentException("CRM inválido");
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        if(especialidade != null){
            this.especialidade = especialidade;
        }else{
            throw new IllegalArgumentException("Especialidade inválida");
        }
    }
}