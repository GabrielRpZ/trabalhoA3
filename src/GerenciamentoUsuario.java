import java.util.HashMap;
import java.util.Map;

public class GerenciamentoUsuario {
    private Map<String, Usuario> usuarios;

    public GerenciamentoUsuario(){
        this.usuarios = new HashMap<>();
    }

    public boolean cadastrarUsuario(String nome, String email, String senha){ //adiciona um novo usuário ao sistema se o email não existir no Map.
        if(usuarios.containsKey(email)){
            System.out.println("E-mail já cadastrado."); //retorna falso se o email ja esta cadastrado.
            return false;
        }
        Usuario novoUsuario = new Usuario(nome, email, senha);
        usuarios.put(email, novoUsuario);
        System.out.println("Usuário cadastrado com sucesso."); //retorna verdadeiro se o cadastro for bem sucedido.
        return true;
    }

    public boolean login (String email, String senha){ //verifica se o email existe e a senha esta correta, se as credenciais estiverem correta o login é permitido.
        Usuario usuario = usuarios.get(email); 
        if (usuario != null && usuario.getSenha().equals(senha)){
            System.out.println("Login feito com sucesso. Seja Bem-vindo(a), " + usuario.getNome() + "!");
            return true;
        }
        System.out.println("E-mail ou senha incorretos.");
        return false;
    }
}
