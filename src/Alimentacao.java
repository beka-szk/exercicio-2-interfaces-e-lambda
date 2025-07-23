public class Alimentacao extends Produtos implements Tributavel {

    public Alimentacao(String nome, double valorBruto) {
        super(nome, valorBruto);
    }

    @Override
    public double calcularImposto() {
        double imposto = 0.01;
        return this.getValorBruto() * imposto;
    }
}
