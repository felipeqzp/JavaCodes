package sys_restaurante;

public class Main {
    public static void main(String[] args){
        Mesa[] mesas = {
            new Mesa(1, false),
            new Mesa(2, false),
            new Mesa(3, false),
            new Mesa(4, false),
            new Mesa(5, false),
            new Mesa(6, false)
        };

        Restaurante novoRestaurante = new Restaurante("Bisto", "Rua clovis melton, 65", "Italiana", 100, "18h as 00h", "via qr code", mesas);
        System.out.println("Endereço do restaurante: " + novoRestaurante.getEndereco() + "\n");
        System.out.println("Horario do restaurante: " + novoRestaurante.getHorario() + "\n");

        novoRestaurante.reservarMesa(1);
    }
}
