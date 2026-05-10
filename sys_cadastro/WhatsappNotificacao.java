package sys_cadastro;

public interface WhatsappNotificacao extends Notificador {
    boolean validarNumeroWhatsapp(String numero);
}