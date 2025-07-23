import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var Scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Olá. Você está na calculadora de impostos. Vamos la?");
            System.out.println("Escolha a categoria do seu produto");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Saúde e bem estar");
            System.out.println("3 - Vestuário");
            System.out.println("4 - Cultura");
            System.out.println("0 - Sair do programa");
            System.out.println("Sua opção:");

            int option;
            try {
                option = Scanner.nextInt();
                Scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um número válido.");
                Scanner.nextLine();
                continue;
            }

            if (option == 0) {
                System.out.println("Encerrando o programa...");
                break;
            }
            if (option < 1 || option > 4) {
                System.out.println("Opção inválida! Digite novamente:");
                continue;
            }

            System.out.println("Digite o nome do seu produto:");
            String nome = Scanner.nextLine();

            System.out.println("Digite o preço bruto do seu produto:");
            double valor = Scanner.nextDouble();
            Scanner.nextLine();

            Tributavel itemTributavel = switch (option) {
                case 1 -> new Alimentacao(nome, valor);
                case 2 -> new SaudeEBemEstar(nome, valor);
                case 3 -> new Vestuario(nome, valor);
                case 4 -> new Cultura(nome, valor);
                default -> null;
            };

            if (itemTributavel != null) {
                double imposto = itemTributavel.calcularImposto();
                Produtos produto = (Produtos) itemTributavel;

                System.out.println("\n--- Resumo do Cálculo ---");
                System.out.printf("Produto: %s\n", produto.getNome());
                System.out.printf("Valor Bruto: R$ %.2f\n", produto.getValorBruto());
                System.out.printf("Valor do Imposto: R$ %.2f\n", imposto);
                System.out.printf("Valor Total (Bruto + Imposto): R$ %.2f\n", (produto.getValorBruto() + imposto));
                System.out.println("----------------------------");
            }
        }

        Scanner.close(); // Fecha o scanner ao sair do loop
        }
    }
