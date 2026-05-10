public class ClienteAcademia implements ContaCliente {

    private String nome;
    private int idade;
    private double mensalidade;

    public ClienteAcademia (String nome, int idade){
        this.setNome(nome);
        this.setIdade(idade);
    }

    public ClienteAcademia(){
        this.setNome("null");
        this.setIdade(0);
        this.setMensalidade(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        } else {
            System.out.println("Nome inválido\n");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 12){
            this.idade = idade;
        } else if (idade == 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade mínima não atendida\n");
        }
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        if(mensalidade >= 0){
            this.mensalidade = mensalidade;
        } else {
            System.out.println("Valor de mensalidade inválido\n");
        }
    }

    @Override
    public void pagarMensalidade(double mensalidade) {
        if(mensalidade > 0){
            this.mensalidade = 0;
            System.out.println("Mensalidade paga!\n");
        } else {
            System.out.println("Mensalidade já foi paga!\n");
        }
    }
}