
package sys_cadastro;

public class Main {
    public static void main(String[] args) {
        
        //criando as instancias dos objetos
        Usuario usuarioA = new Usuario("Maria", "maria123@gmail.com", "(88) 9 9732-9128");
        RepositorioDeUsuarios repo = new RepositorioDeUsuarios();
        WhatsappNotificador whatsappNotificador = new WhatsappNotificador();
        ServicoDeCadastroDeUsuario servicoUm = new ServicoDeCadastroDeUsuario(repo, whatsappNotificador);
        
        //fazendo os testes (usando os metodos)
        System.out.println("===============================================");
        System.out.println("Teste 1 - Cadastro e Notificação via WhatsApp\n");
        servicoUm.registrarUsuario(usuarioA);
        repo.salvar(usuarioA);
        System.out.println("===============================================");

        Usuario usuarioB = new Usuario("João", "joao123@gmail.com", "(85) 9 9824-9082");
        FakeNotificador fakeNotificador = new FakeNotificador();
        ServicoDeCadastroDeUsuario servicoDois = new ServicoDeCadastroDeUsuario(repo, fakeNotificador);
    
        System.out.println("Teste 2 - Cadastro e Notificação fake\n");
        servicoDois.registrarUsuario(usuarioB);
        repo.salvar(usuarioB);
        System.out.println("===============================================");

    }
}