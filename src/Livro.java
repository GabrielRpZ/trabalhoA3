public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private Double preco;
    private int quantidadeEstoque;

    public Livro(String titulo, String autor, String isbn, Double preco, int quantidadeEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidade){
        this.quantidadeEstoque = quantidade;
    }
}
