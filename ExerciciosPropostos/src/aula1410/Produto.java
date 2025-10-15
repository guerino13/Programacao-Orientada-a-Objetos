package aula1410;


public class Produto {
      // Atributos
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor 1
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Construtor 2
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 10; // valor padrão
    }

    // Método vender (reduz o estoque)
    public void vender(int qtd) {
        if (qtd <= this.quantidade) {
            this.quantidade -= qtd;
            System.out.println(qtd + " unidade(s) vendida(s). Estoque atual: " + this.quantidade);
        } else {
            System.out.println("Estoque insuficiente! Venda não realizada.");
        }
    }

    // Método repor (aumenta o estoque)
    public void repor(int qtd) {
        this.quantidade += qtd;
        System.out.println(qtd + " unidade(s) adicionada(s). Estoque atual: " + this.quantidade);
    }

    // Método calcularValorTotal (preço × quantidade)
    public double calcularValorTotal() {
        return this.preco * this.quantidade;
    }

    // Método auxiliar para exibir informações do produto
    public void exibirInfo() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Quantidade em estoque: " + this.quantidade);
        System.out.println("Valor total em estoque: R$ " + calcularValorTotal());
    }

}
