package sistema;
import java.time.LocalDate;

public class Cidadao {
    private String cpf;
    private String nome;
    private Endereco endereco;
    private String telefone;
    private LocalDate dataNascimento;
    private String email;
    
    public Cidadao(String cpf, String nome, Endereco endereco, String telefone, LocalDate dataNascimento, String email) {
        setCpf(cpf);
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
        setDataNascimento(dataNascimento);
        setEmail(email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("Número deve ser maior que zero.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf != null && cpf.matches("\\d{11}")) {
            this.cpf = cpf;
        }else{
            throw new IllegalArgumentException("CPF Inválido");
        }
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        if(endereco != null) {
            this.endereco = endereco;
        }else{
            throw new IllegalArgumentException("Endereço Inválido");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone != null && telefone.matches("\\d{10,11}")) {
            this.telefone = telefone;
        }else{
            throw new IllegalArgumentException("Telefone Inválido");
        }
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if(dataNascimento != null) {
            this.dataNascimento = dataNascimento;
        }else{
            throw new IllegalArgumentException("Data de Nascimento Inválida");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email != null && email.contains("@")) {
            this.email = email;
        }else{
            throw new IllegalArgumentException("Email Inválido");
        }
    }
}