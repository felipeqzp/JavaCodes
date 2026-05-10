package sys_ong;

public final class Violacao implements Monitoravel {
    private String tipo;
    private String descricao;
    private String data;
    private int gravidade;

    public Violacao(String tipo, String descricao, String data, int gravidade) {
        this.setTipo(tipo);
        this.setDescricao(descricao);
        this.setData(data);
        this.setGravidade(gravidade);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.isEmpty() || tipo.trim().length() <= 0) {
            System.out.println("O de tipo está vazio!");
        }   else {
            this.tipo = tipo;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao.isEmpty() || descricao.trim().length() <= 0) {
            System.out.println("Descrição está vazia, digite algo!");
        }   else {
            this.descricao = descricao;
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data){
        if (data.isEmpty() || data.trim().length() <= 0) {
            System.out.println("A data está vazia, digite algo!");
        }   else {
            this.data = data;
        }
    }
    
    public int getGravidade() {
        return gravidade;
    }
    
    public void setGravidade(int gravidade) {
        if (gravidade >= 1 && gravidade <= 5 ) {
            this.gravidade = gravidade;
        }   else {
            System.out.println("Digite o nível de gravidade entre 1 a 5.");
        }
    }    
    
    @Override
    public void gerarRelatorio(){
        System.out.println("O tipo de violação é: " + this.tipo + "ocorreu na data: " + this.data);
        System.out.println("Descrição do acontecido: " + this.descricao);
    }
    
}
