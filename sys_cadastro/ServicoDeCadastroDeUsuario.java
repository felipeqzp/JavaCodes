package sys_cadastro;

public class ServicoDeCadastroDeUsuario {
    private Notificador notificador;
    private RepositorioDeUsuarios repo;

    public ServicoDeCadastroDeUsuario(RepositorioDeUsuarios repo, Notificador notificador){
        this.repo = repo;
        this.notificador = notificador;
    }

    public void registrarUsuario(Usuario usuario){
        System.out.println("Usuário '" + usuario.getNome() + "' registrado com sucesso!");
        notificador.enviarNotificacao(usuario);
    }
}