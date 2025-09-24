package aula2309;

public class LojaDeCarro {

    public static void main(String[] args) {
      Carro c1 =  new Carro();
      c1.marca = "Volkswagen";
      c1.modelo = "Gol";
      c1.cor = "Prata";
      c1.velocAtual = 0;
        System.out.println("Informacoes do carro:\n"
                + "Marca: "+ c1.marca + "\n"
                + "Modelo: "+c1.modelo+"\n"
                + "Cor: "+c1.cor+"\n");
        
      c1.ligar();
      c1.acelerar(60);
      c1.frear();
      c1.desligar();
        
        
    }
    
}
