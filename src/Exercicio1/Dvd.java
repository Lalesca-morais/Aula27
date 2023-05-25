package Exercicio1;

public class Dvd extends Item {
    private int duracao;
    public Dvd(String cd, String dvd, String livros, String nomeLivros, int preco, String codigoBarras) {
        super(cd, dvd, livros, nomeLivros, preco, codigoBarras);
        this.duracao = duracao;
    }
    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("Nome: "+ getNome());
        System.out.println("Preço: "+ getPreco());
        System.out.println("Autor: " + duracao);
    }
}
