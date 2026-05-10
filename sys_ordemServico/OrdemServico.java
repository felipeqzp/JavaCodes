package sys_ordemServico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrdemServico implements Registravel {

    private int id;
    private Cliente cliente;
    private Tecnico tecnico;
    private List<Servico> servicos;
    private Equipamento equipamento;
    private Pagamento  pagamento;
    private Status status;
    private LocalDate dataAbertura;

    // Construtor com data específica
    public OrdemServico(int id, Cliente cliente, Tecnico tecnico, Equipamento equipamento, LocalDate dataAbertura) {
        this.id = id;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.equipamento = equipamento;
        this.servicos = new ArrayList<>();
        this.status = Status.ABERTA;
        this.dataAbertura = dataAbertura != null ? dataAbertura : LocalDate.now();
    }

    // Construtor que usa data atual
    public OrdemServico(int id, Cliente cliente, Tecnico tecnico, Equipamento equipamento) {
        this(id, cliente, tecnico, equipamento, LocalDate.now());
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void adicionarServico(Servico s) {
        servicos.add(s);
        System.out.println("Servico adicionado na OS " + id + ": " + s.getDescricao());
    }

    public double calcularCustoTotal() {
        double total = 0;
        for (Servico s : servicos)
            total += s.getPreco();
        return total;
    }

    public void definirPagamento(String metodo) {
        double total = calcularCustoTotal();

        if (total <= 0) {
        System.out.println("Aviso: não há serviços adicionados. Total = R$ " + String.format("%.2f", total));
        return;
        }

        this.pagamento = new Pagamento(metodo, total, true);
    }

    public void atualizarStatus(Status novo) {
        this.status = novo;
        System.out.println("OS " + id + " atualizada para status: " + novo);
    }

    @Override
    public void registrar() {
        System.out.println("Registrando OS: " + id + " | Cliente: " + cliente.getNome() + " | Tecnico: "
                + tecnico.getNome() + " | Data: " + dataAbertura);
    }

    @Override
    public String toString() {
        return "OrdemServico{" +
                "id=" + id +
                ", cliente=" + cliente.getNome() +
                ", tecnico=" + tecnico.getNome() +
                ", equipamento=" + equipamento +
                ", status=" + status +
                ", dataAbertura=" + dataAbertura +
                ", total=R$" + String.format("%.2f", calcularCustoTotal()) +
                '}';
    }
}