package sistema;
public class Vacina {
    private String nome;
    private String tipo;
    private int dosesNecessarias;

    public Vacina(String nome, String tipo, int dosesNecessarias) {
        setNome(nome);
        setTipo(tipo);
        setDosesNecessarias(dosesNecessarias);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("Nome Inválido");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo != null && !tipo.isEmpty()) {
            this.tipo = tipo;
        }else{
            throw new IllegalArgumentException("Tipo Inválido");
        }
    }

    public int getDosesNecessarias() {
        return dosesNecessarias;
    }

    public void setDosesNecessarias(int dosesNecessarias) {
        if(dosesNecessarias > 0) {
            this.dosesNecessarias = dosesNecessarias;
        }else{
            throw new IllegalArgumentException("Número de Doses Inválido");
        }
    }
}