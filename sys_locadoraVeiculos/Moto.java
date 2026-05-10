package sys_locadoraVeiculos;
public final class Moto extends Veiculo {

    private String tipoDeCombustivel;

    public Moto(String modelo, String placa, int ano, double precoDiaria, String tipoDeCombustivel) {
        super(modelo, placa, ano, precoDiaria);
        setTipoDeCombustivel(tipoDeCombustivel);
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        if(tipoDeCombustivel != null && !tipoDeCombustivel.isBlank()){
            this.tipoDeCombustivel = tipoDeCombustivel;
        }else{
            System.out.println("Tipo de combustível inválido!");
        }
    }

    @Override
    public void mostrarDados(){
        System.out.println("============ INFORMAÇÕES VEÍCULO ============");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tipo de combustível: " + getTipoDeCombustivel());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Ano: " + getAno());
        System.out.println("Preço diária: " + getPrecoDiaria());
        System.out.println("==============================================");
    }

    public void calcularCusto(int dias){
        if(dias > 5){
            custoDias = precoDiaria * dias;
            custoDias = custoDias - (custoDias * 0.03);
            System.out.println("O valor (com desconto de 3%) para aluguel por " + dias + " dias sairá por: " + custoDias);
        }else{
            custoDias = precoDiaria * dias;
            System.out.println("O valor para aluguel por " + dias + " dias sairá por: " + custoDias);
        }
    }
}
