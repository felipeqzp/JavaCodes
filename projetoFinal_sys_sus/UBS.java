package sistema;

public class UBS extends UnidadeSaude {

    private int qtdAgentesSaude;

    public UBS(String nome, String cnes, String endereco, EstoqueVacinas estoque, int qtdAgentesSaude) {
        super(nome, cnes, endereco, estoque);
        this.qtdAgentesSaude = qtdAgentesSaude;
    }

    public void marcarConsultaPreventiva(){
        System.out.println("Consulta preventiva agendada na UBS " + getNome());
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