public class Vestuario extends Produtos implements Tributavel {

    public Vestuario(String nome, double valorBruto) {
        super(nome, valorBruto);
    }

    @Override
    public double calcularImposto() {
        double imposto = 0.025;
        return this.getValorBruto() * imposto;
    }
}
