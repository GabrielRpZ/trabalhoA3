import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Livro> livros;

    public Estoque(){
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(Livro livro){ //Adiciona um livro ao estoque utilizando o isbn como chave.
            livros.put(livro.getIsbn(), livro);
    }

    public void atualizarQuantidade(String isbn, int quantidade){ //Atualiza a quantidade de exemplares em estoque de um livro, usando o ISBN para identificá-lo.
        Livro livro = livros.get(isbn);
        if (livro != null){
            livro.setQuantidadeEstoque(quantidade);
        }
    }

    public void removerLivro(String isbn){ //Remove um livro do estoque pelo ISBN.
        livros.remove(isbn);
    }

    public void consultarLivro(String isbn){ //Retorna o livro correspondente ao ISBN para verificar informações detalhadas.
        return livros.get(isbn);
    }
}
