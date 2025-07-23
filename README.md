# 📊 Calculadora de Impostos de Produtos (Java POO)

![Linguagem](https://img.shields.io/badge/Linguagem-Java-blue.svg)
![Status](https://img.shields.io/badge/Status-Concluído-green.svg)
![Licença](https://img.shields.io/badge/Licença-MIT-yellow.svg)

## 📄 Sobre o Projeto

Este projeto é uma aplicação de console em Java que demonstra a aplicação de conceitos fundamentais de **Programação Orientada a Objetos (POO)**, como **Herança, Interfaces e Polimorfismo**, para resolver um problema de negócio prático.

O programa funciona como uma calculadora de impostos para diferentes categorias de produtos. O usuário seleciona uma categoria, informa o nome e o valor do produto, e o sistema calcula e exibe o imposto correspondente com base em regras específicas para cada categoria.

*(Este projeto foi desenvolvido como um exercício prático para o Bootcamp de Java e IA da DIO com a NTT DATA).*

---

## ✨ Funcionalidades Principais

* 🔹 **Menu Interativo:** Um menu de console robusto que guia o usuário na escolha da categoria do produto e permite encerrar o programa.
* 🔹 **Cálculo de Impostos por Categoria:** Aplica alíquotas de imposto distintas para cada tipo de produto:
    * - **Alimentação:** 1%
    * - **Saúde e Bem-estar:** 1.5%
    * - **Vestuário:** 2.5%
    * - **Cultura:** 4%
* 🔹 **Entrada de Dados Validada:** Utiliza um bloco `try-catch` para lidar com entradas numéricas inválidas (ex: digitar texto em vez de número), tornando a aplicação mais resiliente a erros do usuário.
* 🔹 **Resumo Detalhado:** Apresenta um resumo claro ao final de cada cálculo, mostrando o nome, valor bruto, valor do imposto e o valor total do produto (bruto + imposto).

---

## 🛠️ Conceitos e Tecnologias em Ação

* **Linguagem:** Java (JDK 17+)
* **Princípios de POO:**
    * - **Interface (`Tributavel`):** Define um contrato comum (`calcularImposto()`) que todas as classes de produto devem seguir, garantindo o polimorfismo.
    * - **Herança (`extends Produtos`):** Utiliza uma classe base para compartilhar atributos comuns (nome, valor) entre todos os tipos de produto.
    * - **Polimorfismo:** A classe `Main` manipula todos os objetos através da interface `Tributavel`, chamando o mesmo método `calcularImposto()` e obtendo o comportamento correto para cada tipo de produto.
    * - **Sobrescrita (`@Override`):** Cada subclasse de produto fornece sua própria implementação da lógica de cálculo de imposto.
* **Recursos Modernos do Java:**
    * - **Switch Expressions (Java 14+):** Utilizado para criar o objeto correto de forma concisa e legível, retornando diretamente o resultado para a variável `itemTributavel`.
* **Boas Práticas:**
    * - **Tratamento de Exceções:** Uso de `try-catch` para `InputMismatchException`.
    * - **Separação de Responsabilidades:** A classe `Main` foca na interação com o usuário, enquanto as classes de domínio (`Produtos`, `Tributavel`, etc.) contêm a lógica de negócio.

---

## 📂 Estrutura do Projeto
```
/src
├── Main.java              # Ponto de entrada e interface com o usuário
├── Tributavel.java        # A interface do contrato de imposto
├── Produtos.java          # A classe base dos produtos
├── Alimentacao.java       # Subclasse para produtos de Alimentação
├── SaudeEBemEstar.java    # Subclasse para produtos de Saúde
├── Vestuario.java         # Subclasse para produtos de Vestuário
└── Cultura.java           # Subclasse para produtos de Cultura
```

---

## 🚀 Como Executar

**Pré-requisitos:**
* Java Development Kit (JDK) 17 ou superior.

**Passos:**
1.  Clone o repositório:
    ```bash
    git clone [https://github.com/beka-szk/exercicio-2-interfaces-e-lambda]
    ```
2.  Abra o projeto em sua IDE Java de preferência (IntelliJ, Eclipse, VS Code).
3.  Localize e execute o arquivo `Main.java`.
4.  Siga as instruções no console.

---

## ✒️ Autors

Desenvolvido por **Beka S.**.

[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/beka-szk/)
