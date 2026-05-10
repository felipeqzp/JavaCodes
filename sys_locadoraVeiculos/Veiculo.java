package sys_locadoraVeiculos;
public abstract class Veiculo {

    protected String modelo;
    protected String placa;
    protected int ano;
    protected int dias;
    protected double precoDiaria;
    protected double custoDias;
    
    public Veiculo(String modelo, String placa, int ano, double precoDiaria) {
        setModelo(modelo);
        setPlaca(placa);
        setAno(ano);
        setPrecoDiaria(precoDiaria);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo != null && !modelo.isBlank()){
            this.modelo = modelo;
        }else{
            System.out.println("Modelo inválido!");
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if(placa != null && !placa.isBlank()){
            this.placa = placa;
        }else{
            System.out.println("Placa inválido!");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 0){
            this.ano = ano;
        }else{
            System.out.println("Ano inválido!");
        }
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        if(precoDiaria > 0.0){
            this.precoDiaria = precoDiaria;
        }else{
            System.out.println("Preço inválido!");
        }
    }

    public abstract void mostrarDados();

    public abstract void calcularCusto(int dias);
}