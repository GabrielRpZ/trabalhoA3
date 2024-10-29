import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Livro> livros;

    public Estoque(){
        this.livros = new HashMap<>();
    }

    public void atualizarQuantidade(String isbn, int quantidade){
        Livro livro = livros.get(isbn);
        if (livro != null){
            livro.quantidadeEstoque(quantidade);
        }
    }

    public void removerLivro(String isbn){
        livros.remove(isbn);
    }

    public void consultarLivro(String isbn){
        return livros.get(isbn);
    }
}
