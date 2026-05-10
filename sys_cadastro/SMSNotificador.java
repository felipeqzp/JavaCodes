package sys_cadastro;

public class SMSNotificador implements Notificador {
    
    @Override
    public void enviarNotificacao(Usuario usuario){
        System.out.println("Enviando SMS para: " + usuario.getTelefone());
    }
}