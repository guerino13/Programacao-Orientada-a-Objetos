package aula0309;

import java.util.Scanner;

public class Aula0309 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        double saldo = 3500.00;
        while(op != 4){
        System.out.println("Bem vindo ao seu banco. Escolha uma das opções a seguir:\n"
                + "1 - Consultar seu saldo.\n"
                + "2 - Deposito\n"
                + "3 - Saque\n"
                + "4 - Encerrar operação\n");
        op = sc.nextInt();
        switch(op){
            case 1: 
                consultaSaldo(saldo);
                break;
            case 2: 
                System.out.println("Digite o valor a ser depositado: ");
                double valorDep = sc.nextDouble();
                deposito(valorDep, saldo);
                break;
            case 3:
                //saque();
                break;
            case 4:
                //sair();
                break;
            default: 
                break;
            }
        }
        
    }

    static void consultaSaldo(double saldo) {
     
        System.out.println("Seu saldo eh de: " + saldo);
    }

    static double deposito(double dep, double saldo) {
    return  dep + saldo;
    }
}