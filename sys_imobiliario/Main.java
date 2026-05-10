package sys_imobiliario;

public class Main {
    public static void main(String[] args) {
        
        Imovel imovelUm = new Casa("Rua Santos Dummond", 500.25, 80000.00, true);
        Imovel imovelDois = new Apartamento("Rua 13 de Maio", 200.00, 100000.00, 4, true);
        Imovel imovelTres = new Terreno("Sítio Monte Belo", 10000.00, 300000.00, true);
        Imovel imovelQuatro = new SalaComercial("Shopping Iguatemi", 200.00, 70000.00, true);

        imovelUm.calcularValorFinal();
        imovelDois.calcularValorFinal();
        imovelTres.calcularValorFinal();
        imovelQuatro.calcularValorFinal();
        
        imovelUm.exibirDetalhes(true, true);
        imovelDois.exibirDetalhes(true, true);
        imovelTres.exibirDetalhes(true, true);
        imovelQuatro.exibirDetalhes(true, true);

    }
}