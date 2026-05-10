package sys_cadastro;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeUsuarios {
    
    private List<Usuario> usuarios = new ArrayList<>();

    public void salvar(Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuário '" + usuario.getNome() + "' foi salvo com sucesso!");
    }
}