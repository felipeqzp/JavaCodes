package sys_imobiliario;
 
public abstract class Imovel {

    protected String tipo;
    protected String endereco;
    protected double area;
    protected double valorBase;
    private double valorFinal;

    public Imovel(String endereco, double area, double valorBase) {
        this.endereco = endereco;
        this.area = area;
        this.valorBase = valorBase;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        if(tipo == null || tipo.isBlank()){
            System.out.println("Tipo de imóvel inválido!");
        }else{
            this.tipo = tipo;
        }
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        if(endereco == null || endereco.isBlank()){
            System.out.println("Endereço inválido!");
        }else{
            this.endereco = endereco;
        }
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        if(area < 0.0){
            System.out.println("Área inválida!");
        }else{
            this.area = area;
        }
    }

    public double getValorBase() {
        return valorBase;
    }
    public void setValorBase(double valorBase) {
        if(valorBase < 0.0){
            System.out.println("Valor base inválido");
        }else{
            this.valorBase = valorBase;
        }
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        if(valorFinal < 0.0){
            System.out.println("Valor final inválido");
        }else{
            this.valorFinal = valorFinal;
        }
    }

    public abstract void calcularValorFinal();

    public void exibirDetalhes(){
        System.out.println();
        System.out.println("==========================");
        System.out.println("Tipo de imóvel: " + getTipo());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Área do imóvel: " + getArea());
        System.out.println("==========================");
        System.out.println();
    }

    public void exibirDetalhes(boolean detalhesCompletos){
        if(detalhesCompletos){
            System.out.println();
            System.out.println("==========================");
            System.out.println("Tipo de imóvel: " + getTipo());
            System.out.println("Endereço: " + getEndereco());
            System.out.println("Área do imóvel: " + getArea());
            System.out.println("Valor base: "  + getValorBase());
            System.out.println("==========================");
            System.out.println();
        }else{
            System.out.println();
            System.out.println("==========================");
            System.out.println("Tipo de imóvel: " + getTipo());
            System.out.println("Endereço: " + getEndereco());
            System.out.println("Área do imóvel: " + getArea());
            System.out.println("==========================");
            System.out.println();
        }
    }

    public void exibirDetalhes(boolean detalhesCompletos, boolean incluirVF){
        if(detalhesCompletos && incluirVF){
            System.out.println();
            System.out.println("==========================");
            System.out.println("Tipo de imóvel: " + getTipo());
            System.out.println("Endereço: " + getEndereco());
            System.out.println("Área do imóvel: " + getArea());
            System.out.println("Valor base: "  + getValorBase());
            System.out.println("Valor final: "  + getValorFinal());
            System.out.println("==========================");
            System.out.println();
        }else{
            System.out.println();
            System.out.println("==========================");
            System.out.println("Tipo de imóvel: " + getTipo());
            System.out.println("Endereço: " + getEndereco());
            System.out.println("Área do imóvel: " + getArea());
            System.out.println("==========================");
            System.out.println();
        }
    }
}