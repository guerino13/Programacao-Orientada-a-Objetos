package aula2309;

public class LojaDeCarro {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.marca = "Volkswagen";
        c1.modelo = "Gol";
        c1.cor = "Prata";
        c1.velocAtual = 0;
        System.out.println("Informacoes do carro:\n"
                + "Marca: " + c1.marca + "\n"
                + "Modelo: " + c1.modelo + "\n"
                + "Cor: " + c1.cor + "\n");

        c1.ligar();
        c1.acelerar(60);
        c1.frear();
        c1.desligar();

        Carro c2 = new Carro();

        c1.marca = "Ford";
        c1.modelo = "Focus";
        c1.cor = "Azul";
        c1.velocAtual = 0;

        System.out.println("Informacoes do carro:\n"
                + "Marca: " + c2.marca + "\n"
                + "Modelo: " + c2.modelo + "\n"
                + "Cor: " + c2.cor + "\n");
        c2.ligar();
        c2.acelerar(20);
        c2.frear();
    }

}
