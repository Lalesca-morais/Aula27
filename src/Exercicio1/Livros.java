package Exercicio1;

public class Livros extends Item {
    private String autorLivro;
    public Livros(String cd, String dvd, String livros, String nomeLivros, int preco, String codigoBarras) {
        super(cd, dvd, livros, nomeLivros, preco, codigoBarras);
        this.autorLivro = autorLivro;
    }
    @Override
    public void mostrarDetalhesDoItem(String livros) {
        System.out.println("Nome: "+ getNome());
        System.out.println("Preço: "+ getPreco());
        System.out.println("Autor: " + autorLivro);
    }
}
