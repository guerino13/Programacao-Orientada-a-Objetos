package aula0309;

import java.util.Scanner;

public class Aula0309 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        double valor;
        double saldo = 3500.00;
        do {
            System.out.println("Bem vindo ao seu banco. Escolha uma das opcoes a seguir:\n"
                    + "1 - Consultar seu saldo.\n"
                    + "2 - Deposito\n"
                    + "3 - Saque\n"
                    + "4 - Encerrar operação\n");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    consultaSaldo(saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    valor = sc.nextDouble();
                    deposito(valor, saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor a ser sacado: ");
                    valor = sc.nextDouble();
                    saque(valor, saldo);
                    break;
                case 4:
                    sair();
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            System.out.println("Operacao concluida! Retornando ao menu.\n");
        } while (op != 4);

    }

    static void consultaSaldo(double saldo) {

        System.out.println("\nSeu saldo eh de: " + saldo + "\n");
    }

    static double deposito(double dep, double saldo) {
        double novoSaldo = saldo;
        if (dep < 0.99) {
            System.out.println("Valor invalido! Digite um valor a partir de R$ 1.00!");
        } else {
            novoSaldo += dep;
            System.out.println("Deposito realizado com sucesso!");
        }
        return novoSaldo;
    }

    static double saque(double saque, double saldo) {

        double novoSaldo = saldo;
        if (saque < 0.99) {
            System.out.println("Valor invalido! Digite um valor a partir de R$ 1.00!");
        } else if (saldo < saque) {
            System.out.println("Saldo insuficiente!");
        } else {
            novoSaldo -= saque;
            System.out.println("Saque realizado com sucesso!");
        }
        return novoSaldo;

    }

    private static void sair() {
        System.out.println("Finalizando operacao. Obrigado pela confianca!");
    }
}
