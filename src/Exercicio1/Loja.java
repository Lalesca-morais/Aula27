package Exercicio1;
public class Loja {
    public static void main(String[] args) {
        Item item = new Item();

        int[] vetorLoja = new int[5];

        vetorLoja[0]= new Livros(234, "fsfid",1, "Moby Dick",100);
        vetorLoja[1]= new Cd(654,"asopf", 1, "Guerra e Paz", 50 );
        vetorLoja[2]= new Dvd();
        vetorLoja[3]= new Livros();
        vetorLoja[4]= new Cd();
    }
}
