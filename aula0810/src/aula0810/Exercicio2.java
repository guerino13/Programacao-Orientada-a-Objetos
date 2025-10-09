package aula0810;


public class Exercicio2 {
    public static void main(String[] args) {
        int maiorDur = 0;
        Filme f1 = new Filme("F1", "Esporte/Acao", 155);
        Filme f2 = new Filme("Minecraft", "Aventura");
        Filme f3 = new Filme("Oppenheimer", "Suspense", 180);
        Filme f4 = new Filme("Carros", "Infantil/Comedia", 117);
        Filme f5 = new Filme("Clube da Luta", "Acao/Crime");
        
        Filme[] cartaz = new Filme[5]; 
        cartaz[0] = f1;
        cartaz[1] = f2;
        cartaz[2] = f3;
        cartaz[3] = f4;
        cartaz[4] = f5;
        
        System.out.println(cartaz[1]);
        
       
    }
    
}
