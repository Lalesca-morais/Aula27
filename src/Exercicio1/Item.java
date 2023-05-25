package Exercicio1;
public abstract class Item {
    private String cd;
    private String dvd;
    private String livros;
    private String nome;
    private int preco;
    private String codigoBarras;
    public Item(String cd, String dvd, String livros, String nomeLivros, int preco, String codigoBarras) {
        this.cd = cd;
        this.dvd = dvd;
        this.livros = livros;
        this.nome = nomeLivros;
        this.codigoBarras=codigoBarras;
    }
    public String getCd() {
        return cd;
    }
    public String getCodigoBarras() { return codigoBarras;}
    public int getPreco() { return preco;}
    public String getDvd() {return dvd;}
    public String getLivros() {return livros;}
    public String getNome() {return nome;}
    public void setCd(String cd) {
        this.cd = cd;
    }
    public void setPreco(int preco) { this.preco = preco;}
    public void setDvd(String dvd) {
        this.dvd = dvd;
    }
    public void setcodigoBarras(String codigoBarras) { this.codigoBarras= codigoBarras;}
    public void setLivros(String livros) {
        this.livros = livros;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public void mostrarDetalhesDoItem(String livros) {
    }
    @Override
    public void mostrarDetalhesDoItem(String cd) {
    }
    @Override
    public void mostrarDetalhesDoItem(String nome, int preco, int duracao) {
    }
}
