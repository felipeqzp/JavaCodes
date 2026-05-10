package sys_locadoraVeiculos;
public class Main {
    public static void main (String[] args) {

        Carro carroUm = new Carro("Jeep Compass", "ASH1F82", 2015, 200, 4);

        Moto motoUm = new Moto("Tracer-09", "YAM0T09", 2024, 100, "Flex");

        carroUm.mostrarDados();
        motoUm.mostrarDados();

        carroUm.calcularCusto(9);
        carroUm.calcularCusto(15);

        motoUm.calcularCusto(2);
        motoUm.calcularCusto(10);
    }
}
