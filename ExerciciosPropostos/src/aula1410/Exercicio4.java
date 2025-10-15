package aula1410;


public class Exercicio4 {


    public static void main(String[] args) {
        Produto vet[] = new Produto[5];
        // Usando o primeiro construtor
        Produto p1 = new Produto("Notebook", 3500.00, 5);
        p1.exibirInfo();
        p1.vender(2);
        p1.repor(3);
        System.out.println();

        // Usando o segundo construtor (quantidade padrão = 10)
        Produto p2 = new Produto("Mouse", 80.00);
        p2.exibirInfo();
        p2.vender(12); // tentativa de vender mais do que o estoque
        p2.repor(5);
        p2.exibirInfo();
        
        Produto p3 = new Produto("Teclado", 120.00);
        Produto p4 = new Produto("Placa de Video", 1600.00, 7);
        Produto p5 = new Produto("Headset", 250.00, 30);
        
        vet[0] = p1;
        vet[1] = p2;
        vet[2] = p3;
        vet[3] = p4;
        vet[4] = p5;
        
        double somaTotal = 0;
        for(int i=0; i<5;i++){
            
            somaTotal += vet[i].calcularValorTotal();
            
        }
        
        System.out.println("\nO valor total eh: "+ somaTotal);
    }
    
}
