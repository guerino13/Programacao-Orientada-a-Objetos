package aula2309;


public class Carro {
    String marca;
    String modelo;
    String cor;
    double velocAtual;
    boolean ligado;
    
    void ligar(){
        this.ligado = true;
        System.out.println("O carro agora esta ligado.");
    }
    
    void frear(){
        this.velocAtual = 0;
        System.out.println("O carro freou e agora esta parado.");
    }
    
    void acelerar(int km){
        if(this.ligado){
            this.velocAtual += km;
            System.out.println("A veloc. e de: "+this.velocAtual+" km/h");
        } else{
            System.out.println("Nao e possivel acelerar um carro desligado!");
        }
        
    }
    void desligar(){
        this.ligado = false;
        System.out.println("O carro agora esta desligado.");
    }
}
