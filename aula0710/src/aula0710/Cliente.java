package aula0710;

public class Cliente {

    String nomeCliente;
    int idadeCliente;

    public void exibirDadosCliente(String nome, int idade) {
        System.out.println("Cliente: " + nome + " (" + idade + " anos)");
    }

    public boolean temDesconto(int idade) {
        return this.idadeCliente < 25;
    }
}
