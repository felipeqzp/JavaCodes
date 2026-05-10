package sistema;

public class PostoVolante extends UnidadeSaude {

    private String veiculoPlaca;

    public PostoVolante(String nome, String cnes, String endereco, EstoqueVacinas estoque, String veiculoPlaca) {
        super(nome, cnes, endereco, estoque);
        this.veiculoPlaca = veiculoPlaca;
    }

    public void alterarLocalizacao(String novoEndereco){
        System.out.println("Posto volante movido para: " + novoEndereco);
    }

    public String getVeiculoPlaca() {
        return veiculoPlaca;
    }

    public void setVeiculoPlaca(String veiculoPlaca) {
        if(veiculoPlaca != null){
            this.veiculoPlaca = veiculoPlaca;
        }else{
            throw new IllegalArgumentException("Placa inválida");
        }
    }
}
