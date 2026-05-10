package sistema;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== INICIALIZANDO SISTEMA DE GESTÃO DE VACINAS ===\n");

        try {
            // ---------------------------------------------------------
            // 1. PREPARAÇÃO DA INFRAESTRUTURA (Vacinas, Estoque, Unidade)
            // ---------------------------------------------------------
            
            // Criando uma Vacina
            Vacina vacinaCovid = new Vacina("Pfizer", "mRNA", 2);
            
            // Criando Lotes de Vacina (Validando Lógica de Data)
            LoteVacina lote1 = new LoteVacina(101, "Pfizer", 100, LocalDate.of(2026, 12, 31));
            LoteVacina lote2 = new LoteVacina(102, "Pfizer", 50, LocalDate.of(2025, 6, 30));

            // Criando o Estoque e o Gestor de Estoque para popula-lo
            EstoqueVacinas estoqueUBS = new EstoqueVacinas();
            GestorEstoque gestorDeEstoque = new GestorEstoque(estoqueUBS);
            
            // Registrando lotes no estoque
            if(gestorDeEstoque.registrar(lote1)){
                System.out.println("Lote " +  lote1.getIdLote() + " cadastrado!");
            }else{
                System.out.println("Houve um erro no cadastro do lote " +  lote2.getIdLote());
            }

            if(gestorDeEstoque.registrar(lote2)){
                System.out.println("Lote " +  lote2.getIdLote() + " cadastrado!");
            }else{
                System.out.println("Houve um erro no cadastro do lote " +  lote2.getIdLote());
            }
            
            System.out.println("\n>> Estoque inicializado com " + estoqueUBS.getQuantidadeTotal() + " doses.");

            // Criando a Unidade de Saúde (UBS) e vinculando o estoque
            UBS ubsCentral = new UBS("UBS Central", "123456", "Rua das Flores, 100", estoqueUBS, 5);
            
            // Repositório e Gestor de Unidades
            RepositorioDeUnidades repoUnidades = new RepositorioDeUnidades();
            GestorDeUnidades gestorUnidades = new GestorDeUnidades(repoUnidades);
            gestorUnidades.registrar(ubsCentral);

            // ---------------------------------------------------------
            // 2. CADASTRO DE PESSOAS (Profissionais e Cidadãos)
            // ---------------------------------------------------------

            // Criando Profissionais
            Enfermeiro enfermeiraAna = new Enfermeiro(1, "Ana Silva", "11122233344", ubsCentral, "COREN-CE-1234", 101);
            AtendenteSaude atendenteJoao = new AtendenteSaude(2, "Joao Souza", "22233344455", ubsCentral, "Manhã", 1);

            // Criando Cidadão (Conversão de LocalDate para Date antiga, pois sua classe Cidadao usa Date)
            Endereco enderecoCidadao = new Endereco(50, "Av. Brasil", "Fortaleza");
            
            Cidadao cidadaoCarlos = new Cidadao(
                "99988877766", // CPF (11 digitos)
                "Carlos Oliveira", 
                enderecoCidadao, 
                "85999998888", 
                LocalDate.of(1990,9,5), 
                "carlos@email.com"
            );

            // Gestor de Cadastro (Cidadãos)
            RepositorioDeCidadaos repoCidadaos = new RepositorioDeCidadaos();
            GestorDeCadastro gestorCadastro = new GestorDeCadastro(repoCidadaos);
            
            if(gestorCadastro.registrar(cidadaoCarlos)) {
                System.out.println(">> Cidadão " + cidadaoCarlos.getNome() + " cadastrado com sucesso.");
            }

            // ---------------------------------------------------------
            // 3. PROCESSO DE AGENDAMENTO
            // ---------------------------------------------------------
            System.out.println("\n--- INICIANDO AGENDAMENTO ---");
            
            // O atendente verifica a documentação
            boolean docOk = atendenteJoao.verificarDocumentacao(cidadaoCarlos);
            if(docOk) {
                System.out.println("Atendente " + atendenteJoao.getNome() + " verificou documentação: OK.");
                
                Agendamento agendamento = new Agendamento(
                    cidadaoCarlos, 
                    LocalDate.now().plusDays(1), 
                    vacinaCovid, 
                    ubsCentral, 
                    "Agendado"
                );

                RepositorioDeAgendamentos repoAgendamentos = new RepositorioDeAgendamentos();
                GestorAgendamento gestorAgendamento = new GestorAgendamento(repoAgendamentos);
                gestorAgendamento.registrar(agendamento);
                System.out.println(">> Agendamento realizado para: " + agendamento.getDataHoraAgendada());
            }

            // ---------------------------------------------------------
            // 4. PROCESSO DE APLICAÇÃO DA VACINA
            // ---------------------------------------------------------
            System.out.println("\n--- INICIANDO APLICAÇÃO ---");

            // Enfermeira prepara a dose
            enfermeiraAna.prepararDose(vacinaCovid);

            // Criando o registro da aplicação
            // Vamos usar o lote1 que criamos lá em cima
            AplicacaoVacina aplicacao = new AplicacaoVacina(
                101,
                cidadaoCarlos, 
                lote1, 
                enfermeiraAna, 
                1, 
                LocalDate.now()
            );

            RepositorioAplicacao repoAplicacao = new RepositorioAplicacao();
            GestorAplicacao gestorAplicacao = new GestorAplicacao(repoAplicacao);

            // O método registrar do GestorAplicacao reduz a quantidade do lote automaticamente!
            boolean vacinaAplicada = gestorAplicacao.registrar(aplicacao);

            if(vacinaAplicada) {
                System.out.println(">> SUCESSO! Vacina aplicada em " + cidadaoCarlos.getNome());
                System.out.println("   Profissional responsável: " + enfermeiraAna.getNome());
                System.out.println("   Lote utilizado: " + lote1.getIdLote());
            } else {
                System.out.println(">> ERRO: Falha na aplicação (estoque vazio ou dados inválidos).");
            }

            // ---------------------------------------------------------
            // 5. RELATÓRIOS E VALIDAÇÃO DE ESTADO
            // ---------------------------------------------------------
            System.out.println("\n--- RELATÓRIOS FINAIS ---");

            // Usando o polimorfismo na Unidade de Saúde para gerar relatório
            // Observe que o estoque total deve ter caído de 150 para 149
            System.out.println(ubsCentral.gerarRelatorio(true));
            
            // Verificando especificamente o lote usado
            System.out.println("Status do Lote " + lote1.getIdLote() + ":");
            System.out.println("Quantidade inicial: 100");
            System.out.println("Quantidade atual: " + lote1.getQuantidade()); // Deve ser 99

            // Testando notificação de estoque baixo (apenas simulando a chamada)
            if(!estoqueUBS.estoqueBaixo()) {
                System.out.println("Nível de estoque seguro.");
            }

        } catch (IllegalArgumentException e) {
            System.err.println("ERRO DE VALIDAÇÃO: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("ERRO INESPERADO: " + e.getMessage());
            e.printStackTrace();
        }
    }
}