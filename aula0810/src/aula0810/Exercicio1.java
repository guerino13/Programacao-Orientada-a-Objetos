package aula0810;

public class Exercicio1 {

    public static void main(String[] args) {
       Moeda v1 = new Moeda();
       v1.valor = 950.00;
       System.out.println(v1.obterValor());
       
       Moeda v2 = new Moeda(1000.00);
       v2.imprimir();
       
       Moeda v3 = new Moeda();
       v3.definirValor(120.00);
       v3.imprimir();
       
        
        
    }
    
}
