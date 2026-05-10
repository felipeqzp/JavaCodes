package sys_ordemServico;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        SistemaGerenciamento sistema = new SistemaGerenciamento();

        // Enderecos
        Endereco e1 = new Endereco("Rua A, 100", "Fortaleza", "CE", "60000-000");
        Endereco e2 = new Endereco("Av. B, 200", "Fortaleza", "CE", "60001-000");

        // Clientes
        Cliente c1 = new Cliente(101, "Ana Silva", "88999990000", e1);
        Cliente c2 = new Cliente(102, "Bruno Souza", "88988880000", e2);

        // Tecnicos
        Tecnico t1 = new Tecnico(201, "Carlos Pereira", "Eletrônica","88999495969");
        Tecnico t2 = new Tecnico(202, "Daniela Costa", "Mecânica","889965967687");

        c1.registrar();
        c2.registrar();
        t1.registrar();
        t2.registrar();

        // Equipamentos
        Equipamento eq1 = new Equipamento("Notebook", "Dell", "Inspiron 15","1234");
        Equipamento eq2 = new Equipamento("Smartphone", "Samsung", "A12","4567");

        // Serviços
        Servico s1 = new Servico("Troca de tela", 250.0);
        Servico s2 = new Servico("Substituição de HD", 180.0);
        Servico s3 = new Servico("Limpeza interna", 70.0);
        Servico s4 = new Servico("Troca de bateria", 120.0);

        // Abrir Ordens de Serviço com datas reais
        // os1: 15 de Outubro de 2025
        OrdemServico os1 = new OrdemServico(1001, c1, t1, eq1, LocalDate.of(2025, 10, 15));
        os1.adicionarServico(s2);
        os1.adicionarServico(s3);
        os1.definirPagamento("Cartão");
        os1.atualizarStatus(Status.EM_ANDAMENTO);

        // os2: 5 de Outubro de 2025
        OrdemServico os2 = new OrdemServico(1002, c2, t2, eq2, LocalDate.of(2025, 10, 5));
        os2.adicionarServico(s1);
        os2.adicionarServico(s4);
        os2.definirPagamento("Dinheiro");
        os2.atualizarStatus(Status.AGUARDANDO_PECA);

        // Abrir no sistema
        sistema.abrirOrdem(os1);
        sistema.abrirOrdem(os2);

        // Pagar e concluir uma OS (Ordem Servico)
        if (os1.getPagamento() != null) {
            os1.getPagamento().pagar();
        }

        os1.atualizarStatus(Status.CONCLUIDA);

        // Gerar relatório (mês = 10, ano = 2025)
        String rel = sistema.gerarRelatorioMensal(10, 2025);
        System.out.println("\n=== RELATÓRIO ===");
        System.out.println(rel);

        // Mostrar todas ordens
        System.out.println("\nTodas ordens no sistema:");
        for (OrdemServico os : sistema.getOrdens()) {
            System.out.println(os);
        }

        System.out.println(c1.toString());
    }
}