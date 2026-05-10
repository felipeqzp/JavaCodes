package sys_imobiliario;

public final class SalaComercial extends Imovel {

    private boolean temEstacionamento;

    public SalaComercial(String endereco, double area, double valorBase, boolean temEstacionamento) {
        super(endereco, area, valorBase);
        setTipo("Sala Comercial");
        this.temEstacionamento = temEstacionamento;
    }
    public boolean isTemEstacionamento() {
        return temEstacionamento;
    }
    public void setTemEstacionamento(boolean temEstacionamento) {
        this.temEstacionamento = temEstacionamento;
    }

    @Override
    public void calcularValorFinal(){
        if(temEstacionamento){
            setValorFinal(valorBase + (valorBase * 0.05));
            System.out.println("O valor final da Sala Comercial é: R$" + getValorFinal());
        }else{
            setValorFinal(valorBase);
            System.out.println("O valor final da Sala Comercial é: R$" + getValorFinal());
        }
    }
    
}
