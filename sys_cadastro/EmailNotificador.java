package sys_cadastro;

public class EmailNotificador implements Notificador {

    @Override
    public void enviarNotificacao(Usuario usuario){
        System.out.println("Enviando Email para: " + usuario.getEmail());
    }
}