package Exercicio2;
public abstract class Forma {
    private Float lado;
    private Float altura;
    private int resultadoArea = lado * altura, resultadoPerimetro;
    public Forma(Float lado, Float altura, int resultadoArea, int resultadoPerimetro) {
        this.lado = lado;
        this.altura = altura;
        this.resultadoArea= resultadoArea;
        this.resultadoPerimetro= resultadoPerimetro;
    }
    public Float getLado() {
        return lado;
    }
    public int getResultadoArea() {
        return resultadoArea;
    }
    public int getResultadoPerimetro() {
        return resultadoPerimetro;
    }
    public Float getAltura() {
        return altura;
    }
    public void setLado(Float lado) {
        this.lado = lado;
    }
    public void setResultadoArea(int resultadoArea) {
        this.resultadoArea= resultadoArea;
    }
    public void setResultadoPerimetro(int resultadoPerimetro) {
        this.resultadoPerimetro = resultadoPerimetro;
    }
    public void setAltura(Float altura) {
        this.altura = altura;
    }
    abstract void calcularArea();
    resultadoArea = lado * altura;
    abstract void calcularPerimetro();

}
