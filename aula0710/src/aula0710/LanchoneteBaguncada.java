package aula0710;

public class LanchoneteBaguncada {

    public static void main(String[] args) {
        // Dados do cliente
        Cliente pessoa = new Cliente();
        pessoa.nomeCliente = "Ana";
        pessoa.idadeCliente = 22;

        // Dados dos lanches
        Cardapio l1 = new Cardapio();
        l1.lanche = "X-Burger";
        l1.valor = 15.0;

        Cardapio l2 = new Cardapio();
        l2.lanche = "Coxinha";
        l2.valor = 6.5;

        // Exibe informações do cliente
        pessoa.exibirDadosCliente(pessoa.nomeCliente, pessoa.idadeCliente);

        // Mostra os detalhes dos lanches
        l1.mostrarDetalhesLanche(l1.lanche, l1.valor);
        l2.mostrarDetalhesLanche(l2.lanche, l2.valor);

        // Calcula total
        Caixa pagar = new Caixa();
        double total = pagar.valorAPagar(l1.valor, l2.valor);

        // Verifica se o cliente tem direito a desconto
        if (pessoa.temDesconto(pessoa.idadeCliente)) {
            total *= 0.9;
            System.out.println("Desconto aplicado!");
        }

        System.out.println("Total a pagar: R$ " + total);
    }

}
