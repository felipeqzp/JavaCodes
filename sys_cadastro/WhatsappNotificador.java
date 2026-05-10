package sys_cadastro;

public class WhatsappNotificador implements WhatsappNotificacao{

    @Override
    public boolean validarNumeroWhatsapp(String numero) {
        if(numero == null) return false;
        //remove os caracteres q n sao digitos
        String numeroLimpo = numero.replaceAll("\\D", "");
        //verifica se possui so digitos (e se tem pelo menos 1) e se a qtd. de digitos é igual a 11
        return (numeroLimpo.matches("\\d+") && numeroLimpo.length() == 11);
    }

    @Override
    public void enviarNotificacao(Usuario usuario){
        if(validarNumeroWhatsapp(usuario.getTelefone())){
            System.out.println("Enviando mensagem via WhatsApp para: " + usuario.getTelefone());
        }else{
            System.out.println("Envio de mensagem falhou...");
        }
    }
}