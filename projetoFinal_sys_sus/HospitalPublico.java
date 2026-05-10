package sistema;

public class HospitalPublico extends UnidadeSaude {

    private int qtdAgentesSaude;

    public HospitalPublico(String nome, String cnes, String endereco, EstoqueVacinas estoque, int qtdAgentesSaude) {
        super(nome, cnes, endereco, estoque);
        this.qtdAgentesSaude = qtdAgentesSaude;
    }

    public void internarPaciente(Cidadao cidadao){
        System.out.println("Internando paciente " + cidadao.getNome() + " no Hospital " + getNome());
    }

    public int getQtdAgentesSaude() {
        return qtdAgentesSaude;
    }

    public void setQtdAgentesSaude(int qtdAgentesSaude) {
        if(qtdAgentesSaude > 0){
            this.qtdAgentesSaude = qtdAgentesSaude;
        }else{
            throw new IllegalArgumentException("Qtd. de Agentes de Saúde inválida");
        }
    }

}
