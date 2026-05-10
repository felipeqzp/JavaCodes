package sys_restaurante;

public class Restaurante {

    private String nome;
    private String endereco;
    private String tipoDeCozinha;
    private int capacidade;
    private String horarioDeFuncionamento;
    private String cardapio;
    private Mesa[] mesas;

    public Restaurante(String nome, String endereco, String tipoDeCozinha, int capacidade, String horarioDeFuncionamento, String cardapio, Mesa[] mesas){
        this.nome = nome;
        this.endereco = endereco;
        this.tipoDeCozinha = tipoDeCozinha;
        this.capacidade = capacidade;
        this.horarioDeFuncionamento = horarioDeFuncionamento;
        this.cardapio = cardapio;
        this.mesas = mesas;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(nome != null){
            this.nome = nome;
            System.out.println("Nome alterado!\n");
        }else{
            System.out.println("Naõ foi possível alterar\n");
        }
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        if(endereco != null){
            this.endereco = endereco;
            System.out.println("Endereço alterado!\n");
        }else{
            System.out.println("Naõ foi possível alterar\n");
        }
    }
    public String getTipoDeCozinha(){
        return tipoDeCozinha;
    }
    public void setTipoDeCozinha(String tipoDeCozinha){
        if(tipoDeCozinha != null){
            this.tipoDeCozinha = tipoDeCozinha;
            System.out.println("Tipo de Cozinha alterado!\n");
        }else{
            System.out.println("Naõ foi possível alterar\n");
        }
    }
    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade){
        if(capacidade < 0){
            this.capacidade = capacidade;
            System.out.println("Capacidade alterada!\n");
        }else{
            System.out.println("Naõ foi possível alterar\n");
        }
    }
    public String getHorario(){
        return horarioDeFuncionamento;
    }
    public void setHorario(String horarioDeFuncionamento){
        if(horarioDeFuncionamento != null){
            this.horarioDeFuncionamento = horarioDeFuncionamento;
            System.out.println("Horário De Funcionamento alterado!\n");
        }else{
            System.out.println("Naõ foi possível alterar\n");
        }
    }
    public String getCardapio(){
        return cardapio;
    }
    public void setCardapio(String cardapio){
        if(cardapio != null){
            this.cardapio = cardapio;
            System.out.println("Cardapio alterado!\n");
        }else{
            System.out.println("Naõ foi possível alterar\n");
        }
    }
    public void reservarMesa(int numeroMesa){
        for(Mesa mesa : mesas){
            if(mesa.getNumeroMesa() == numeroMesa){
                if(!mesa.isReservada()){
                    mesa.setReservada(true);
                    System.out.println("Mesa: " + numeroMesa + "reservada com sucesso!\n");
                }else{
                    System.out.println("Mesa: " + numeroMesa + "já está reservada\n");
                }
            }
            System.out.println("Mesa não encontrada");
        }
    }
    public void cancelarReserva(int numeroMesa){
        for(Mesa mesa : mesas){
            if(mesa.getNumeroMesa() == numeroMesa){
                if(mesa.isReservada()){
                    mesa.setReservada(false);
                    System.out.println("Reserva da mesa " + numeroMesa + "cancelada\n");
                }else{
                    System.out.println("Esta mesa não possui reserva\n");
                }
            }
            System.out.println("Mesa não encontrada");
        }
    }
}