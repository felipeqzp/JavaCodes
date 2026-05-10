package sys_cadastro;

public class FakeNotificador implements Notificador{
    
    @Override
    public void enviarNotificacao(Usuario usuario){
        System.out.println("[FAKE] Notificação enviada para: " + usuario.getNome());
    }
}