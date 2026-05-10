package sys_ong;

public final class Vitima implements Validavel {
    private String nome;
    private int idade;
    private String telefone;

    public Vitima(String nome, int idade, String telefone) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty() || nome.trim().length() <= 0) {
            System.out.println("Digite um nome válido!");
        }  else {
           this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            System.out.println("Digite uma idade maior que 0.");
        }else{
            this.idade = idade;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone.isEmpty() || telefone.trim().length() <= 0) {
            System.out.println("Digite um número válido.");
        }   else {
            this.telefone = telefone;
        }
    }
    
    @Override
    public boolean validarDados() {
        if (this.nome.trim().length() <= 0 && this.idade < 0) {
            return false;
        }   else {
            return true;
        }
    }
}