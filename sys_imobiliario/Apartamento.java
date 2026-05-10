package sys_imobiliario;

public final class Apartamento extends Imovel {

    private int andar;
    private boolean temElevador;

    public Apartamento(String endereco, double area, double valorBase, int andar, boolean temElevador) {
        super(endereco, area, valorBase);
        setTipo("Apartamento");
        this.andar = andar;
        this.temElevador = temElevador;
    }
    public int getAndar() {
        return andar;
    }
    public void setAndar(int andar) {
        if(andar < 0){
            System.out.println("Andar inválido!");
        }else{
            this.andar = andar;
        }
    }
    public boolean isTemElevador() {
        return temElevador;
    }
    public void setTemElevador(boolean temElevador) {
        this.temElevador = temElevador;
    }

    @Override
    public void calcularValorFinal(){
        if(andar > 5 && !temElevador){
            setValorFinal(valorBase - (valorBase * 0.15));
            System.out.println("Valor final do Apartamento é: R$" + getValorFinal());
        }else{
            setValorFinal(valorBase);
            System.out.println("Valor final do Apartamento é: R$" + getValorFinal());
        }
    }
}
