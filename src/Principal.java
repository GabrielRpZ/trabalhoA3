import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Livro livro = new Livro();

        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Fazer cadastro");
            System.out.println("2. Consultar livros");
            System.out.println("3. Ver livros disponíveis");
            System.out.println("4. Previsão de entrega dos livros");
            System.out.println("5. Sair");

            opcao = input.nextInt();
            input.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println();
                    break;
                case 2:
                    livro.menuLivro();
                    break;
                case 3:
                System.out.println();
                    break;
                case 4:
                System.out.println();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while (opcao != 5);

         
    }

    /*public static void fazerCadastro(Scanner scanner) {
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite seu email:");
        String email = scanner.nextLine();
        // Aqui você pode adicionar o código para salvar o cadastro
        System.out.println("Cadastro realizado com sucesso!");
    }

    public static void alugarLivro(Scanner scanner) {
        System.out.println("Digite o nome do livro que deseja alugar:");
        String livro = scanner.nextLine();
        // Aqui você pode adicionar o código para processar o aluguel do livro
        System.out.println("Livro '" + livro + "' alugado com sucesso!");
    }

    public static void verLivrosDisponiveis() {
        // Aqui você pode adicionar o código para listar os livros disponíveis
        System.out.println("Lista de livros disponíveis:");
        System.out.println("1. Livro A");
        System.out.println("2. Livro B");
        System.out.println("3. Livro C");
    }

    public static void previsaoEntrega() {
        // Aqui você pode adicionar o código para calcular a previsão de entrega dos livros
        System.out.println("Previsão de entrega dos livros:");
        System.out.println("Livro A: 5 dias");
        System.out.println("Livro B: 3 dias");
        System.out.println("Livro C: 7 dias");
    }*/

}
