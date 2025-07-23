public class Cultura extends Produtos implements Tributavel{

    public Cultura(String nome, double valorBruto) {
        super(nome, valorBruto);
    }

    @Override
    public double calcularImposto() {
        double imposto = 0.04;
        return this.getValorBruto() * imposto;
    }
}
