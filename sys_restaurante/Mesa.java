package sys_restaurante;

public class Mesa {
    private int numeroMesa;
    private boolean reservada;

    public Mesa(int numeroMesa, boolean reservada){
        this.numeroMesa = numeroMesa;
        this.reservada = false;
    }
    public int getNumeroMesa() {
        return numeroMesa;
    }
    public void setNumeroMesa(int numeroMesa) {
        if(numeroMesa > 0){
            this.numeroMesa = numeroMesa;
            System.out.println("Número da mesa alterado\n");
        }else{
            System.out.println("Não foi possível alterar\n");
        }
    }
    public boolean isReservada() {
        return reservada;
    }
    public void setReservada(boolean reservada){
        this.reservada = reservada;
    }
}