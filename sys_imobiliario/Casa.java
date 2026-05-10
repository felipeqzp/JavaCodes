package sys_imobiliario;

public final class Casa extends Imovel {
    
    private boolean temQuintal;
    
    public Casa(String endereco, double area, double valorBase, boolean temQuintal) {
        super(endereco, area, valorBase);
        setTipo("Casa");
        this.temQuintal = temQuintal;
    }

    public boolean isTemQuintal() {
        return temQuintal;
    }

    public void setTemQuintal(boolean temQuintal) {
        this.temQuintal = temQuintal;
    }

    @Override
    public void calcularValorFinal(){
        if(temQuintal){
            setValorFinal(valorBase + (valorBase * 0.10));
            System.out.println("Valor final da Casa é: R$" + getValorFinal());
        }else{
            setValorFinal(valorBase);
            System.out.println("Valor final da Casa é: R$" + getValorFinal());
        }
    }
}
