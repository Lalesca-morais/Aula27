ppackage Exercicio1;
public class Cd extends Item{
    private int NumFaixa;
    public Cd(String cd, String dvd, String livros, String nomeLivros, int preco, String codigoBarras) {
        super(cd, dvd, livros, nomeLivros, preco, codigoBarras);
        this.NumFaixa = NumFaixa;
    }
    @Override
    public void mostrarDetalhesDoItem(String cd) {
        System.out.println("Nome: "+ getNome());
        System.out.println("Preço: "+ getPreco());
        System.out.println("Número da faixa: " +NumFaixa);
    }
}
