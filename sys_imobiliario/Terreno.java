package sys_imobiliario;

public final class Terreno extends Imovel {

    private boolean permiteConstruir;

    public Terreno(String endereco, double area, double valorBase, boolean permiteConstruir) {
        super(endereco, area, valorBase);
        setTipo("Terreno");
        this.permiteConstruir = permiteConstruir;
    }
    public boolean isPermiteConstruir() {
        return permiteConstruir;
    }
    public void setPermiteConstruir(boolean permiteConstruir) {
        this.permiteConstruir = permiteConstruir;
    }

    @Override
    public void calcularValorFinal(){
        if(!permiteConstruir){
            setValorFinal(valorBase - (valorBase * 0.20));
            System.out.println("O valor final do Terreno é: R$" + getValorFinal());
        }else{
            setValorFinal(valorBase);
            System.out.println("O valor final do Terreno é: R$" + getValorFinal());
        }
    }
}