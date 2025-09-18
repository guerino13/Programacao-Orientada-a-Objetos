package exercicioavaliado;

import java.util.Scanner;

public class ExercicioAvaliado {

    public static void main(String[] args) {
        int op = 0;
        Scanner sc = new Scanner(System.in);
        do {
            exibirMenu();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    kmParaMilhas(sc);

                    break;

                case 2:
                    celsiusParaFarenheit(sc);

                    break;

                case 3:
                    kgParaLibras(sc);

                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opcao nao encontrada! Digite uma opcao valida.\n");
            }
        } while (op != 4);
        System.out.println("Finalizando programa!");
    }

    public static void exibirMenu() {
        System.out.println("Seja bem vindo! Escolha o tipo de conversao.\n"
                + "1- Quilometros para Milhas.\n"
                + "2- Celsius para Farenheit.\n"
                + "3- Quilogramas para Libras.\n"
                + "4- Sair. \n");
    }

    public static double kmParaMilhas(Scanner km) {
        System.out.println("Informe a distancia em quilometros: \n");
        double dist = km.nextDouble();
        double milhas = dist * 0.621371;
        System.out.println("A distancia de " + dist + " km em milhas eh de: " + milhas + "mi.\n");

        return milhas;
    }

    public static double celsiusParaFarenheit(Scanner g) {
        System.out.println("Informe a temperatura em graus celsius: \n");
        double c = g.nextDouble();
        double f = (c * 9.0 / 5.0) + 32.0;
        System.out.println("A temperatura de " + c + " °C em °F eh de: " + f + "°F.\n");

        return f;
    }

    public static double kgParaLibras(Scanner p) {
        System.out.println("Informe o peso em quilogramas: \n");
        double kg = p.nextDouble();
        double l = kg * 2.20462;
        System.out.println("O peso de " + kg + " kg em libras eh de: " + l + "lb.\n");

        return l;
    }
}
