public class Produtos {

    private final String nome;
    private final double valorBruto;


    public Produtos(String nome, double valorBruto) {
        this.nome = nome;
        this.valorBruto = valorBruto;
    }

    public String getNome() {
        return nome;
    }

    public double getValorBruto() {
        return valorBruto;
    }

}
