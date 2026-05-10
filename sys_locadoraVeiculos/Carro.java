package sys_locadoraVeiculos;
public final class Carro extends Veiculo {
    
    private int numeroDePortas;

    public Carro(String modelo, String placa, int ano, double precoDiaria, int numeroDePortas) {
        super(modelo, placa, ano, precoDiaria);
        setNumeroDePortas(numeroDePortas);
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        if(numeroDePortas > 1){
            this.numeroDePortas = numeroDePortas;
        }else{
            System.out.println("O carro precisa ter pelo menos 2 portas...");
        }
    }

    @Override
    public void mostrarDados(){
        System.out.println("============ INFORMAÇÕES VEÍCULO ============");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Número de portas: " + getNumeroDePortas());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Ano: " + getAno());
        System.out.println("Preço diária: " + getPrecoDiaria());
        System.out.println("==============================================");
    }

    public void calcularCusto(int dias){
        if(dias > 10){
            custoDias = precoDiaria * dias;
            custoDias = custoDias - (custoDias * 0.05);
            System.out.println("O valor (com desconto de 5%) para aluguel por " + dias + " dias sairá por: " + custoDias);
        }else{
            custoDias = precoDiaria * dias;
            System.out.println("O valor para aluguel por " + dias + " dias sairá por: " + custoDias);
        }
    }
}
