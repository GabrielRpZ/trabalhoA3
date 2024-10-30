import java.util.Scanner;

public class Usuario {
    public enum TipoUsuario{
        ADMIN, CLIENTE
    }

    private String nome;
    private String email;
    private String senha;
    private TipoUsuario tipo;

    public Usuario(){
    }

    public Usuario(String nome, String email, String senha, TipoUsuario tipo){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
    }

    public void menuUsuario(){
        Scanner input = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("1 - Fazer login");
            System.out.println("2 - Cadastrar novo usuário");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            input.nextLine();

            switch (opcao){
                case 1:
                    login();
                    break;
                case 2:
                    cadastrarUsuario();
                    break;
                case 3:
                    System.out.println("Retornando ao menu anterior...");
                default:
                System.out.println("Opção inválida!");
            }
        }while(opcao != 3);
    }

    private static void login(){
        Scanner input = new Scanner(System.in);
        GerenciamentoUsuario gerenciamentoUsuario = new GerenciamentoUsuario();

        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Senha: ");
        String senha = input.nextLine();

        Usuario usuario = gerenciamentoUsuario.autentiarUsuario(email, senha);

        if(usuario != null){
            if(usuario.getTipo() == Usuario.TipoUsuario.ADMIN){
                menuAdmin();
            }else{
                menuCliente();
            }
        }
    }

    private static void cadastrarUsuario(){
        Scanner input = new Scanner(System.in);
        GerenciamentoUsuario gerenciamentoUsuario = new GerenciamentoUsuario();
        
        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("Senha: ");
        String senha = input.nextLine();

        System.out.print("Tipo de usuário (1 para ADMIN, 2 para CLIENTE): ");
        int tipoOpcao = input.nextInt();

        Usuario.TipoUsuario tipo;
        if (tipoOpcao == 1) {
            tipo = Usuario.TipoUsuario.ADMIN;
        } else {
            tipo = Usuario.TipoUsuario.CLIENTE;
        }

        Usuario novoUsuario = new Usuario(nome, email, senha, tipo);
        gerenciamentoUsuario.adicionarUsuario(novoUsuario);
    }

    private static void menuAdmin(){
        Scanner input = new Scanner(System.in);

        int opcao;
        do{
            System.out.println("\n=== Menu Administrador ===");
            System.out.println("1 - Gerenciar livros");
            System.out.println("2 - Exibir todos os usuários");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("gerenciamento de livro");
                    break;
                case 2: 
                    System.out.println("exibir todos os usuarios");
                    break;
                case 3:
                    System.out.println("Retornano ao menu anterior...");
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(opcao != 3);
    }

    private static void menuCliente(){
        Scanner input = new Scanner(System.in);
        
        int opcao;

        do{
            System.out.println("\n=== Menu Cliente ===");
            System.out.println("1 - Adicionar livro ao carrinho");
            System.out.println("2 - Adicionar livro à lista de desejos");
            System.out.println("3 - Retornar ao menu anterior");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Adicionando livro ao carrinho...");
                    break;
                case 2:
                    System.out.println("Adicionando livro à lista de desejos...");
                    break;
                case 3:
                    System.out.println("Retornano ao menu anterior...");
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(opcao != 3);
    }

    public String getEmail(){
        return email;
    }

    public String getSenha(){
        return senha;
    }

    public String getNome(){
        return nome;
    }

    public TipoUsuario getTipo(){
        return tipo;
    }
    //getEmail, getSenha e getNome são usados para acessar informações do usuário.
}
