package aula0810;


public class Moeda {

    double valor;
    
    public Moeda() {
    }

    public Moeda(double valor) {
        this.valor = valor;
        if(valor < -1000.00 || valor > 1000.00){
            System.out.println("Valor invalido!");
        }else{
         valor = this.valor;   
        }
    }
    
    public double obterValor(){
        double v = this.valor;
        return v;
    }
    
    public void definirValor(double val){
        if(val < -1000.00 || val > 1000.00){
            System.out.println("Valor invalido!");
        }else{
         this.valor = val;  
        }
        
    }
    
    public void imprimir(){
        if(this.valor < -1000.00 || this.valor > 1000.00){
           
        } else {
            System.out.println("O valor eh de: "+this.valor);
        }
        
    }
}
