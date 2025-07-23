public class SaudeEBemEstar extends Produtos implements Tributavel {

    public SaudeEBemEstar(String nome, double valorBruto) {
        super(nome, valorBruto);
    }

    @Override
    public double calcularImposto() {
        double imposto = 0.015;
        return this.getValorBruto() * imposto;
    }
}
