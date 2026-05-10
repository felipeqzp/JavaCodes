package sistema;
public class Endereco {
    private int numero;
    private String rua;
    private String cidade;

    public Endereco(int numero, String rua, String cidade) {
        setNumero(numero);
        setRua(rua);
        setCidade(cidade);
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        if(numero > 0) {
            this.numero = numero;
        }else{
            throw new IllegalArgumentException("Número Inválido");
        }
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        if(rua != null && !rua.isEmpty()) {
            this.rua = rua;
        }else{
            throw new IllegalArgumentException("Rua Inválida");
        }
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        if(cidade != null && !cidade.isEmpty()) {
            this.cidade = cidade;
        }else{
            throw new IllegalArgumentException("Cidade Inválida");
        }
    }
}