package aula1609;

import java.util.Scanner;

public class Aula1609 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a figura para o calculo da area: (Quadrado, Triangulo, Retangulo, Circulo)");
        String figura = sc.nextLine();
        
        if(figura.equals("Quadrado")){
            calculaQuadrado(sc);
        } else if (figura.equals("Triangulo")){
            calculaTriangulo(sc);
        } else if (figura.equals("Retangulo")){
            calculaRetangulo(sc);
        } else if (figura.equals("Circulo")){
            calculaCirculo(sc);
        } else {
            System.out.println("Figura nao encotrada!");
        }
        
        System.out.println("Fim do programa.");
    }

    public static double calculaQuadrado(Scanner l) {
        System.out.println("Informe o lado: ");
        double lado = l.nextDouble();
        double area = lado * lado;
        System.out.println(area);
        return area;
    } 
    
    public static double calculaTriangulo(Scanner in){
        System.out.println("Informe a base: ");
        double base = in.nextInt();
        System.out.println("Informe a altura: ");
        double altura = in.nextDouble();
        double area = (base * altura) / 2;
        System.out.println(area);
        return area;
    }
    
    public static double calculaRetangulo(Scanner sc){
        System.out.println("Informe a base: ");
        double base = sc.nextDouble();
        System.out.println("Informe a altura: ");
        double altura = sc.nextDouble();
        double area = (base * altura);
        System.out.println(area);
        return area;
    }
    
    public static double calculaCirculo(Scanner r){
        System.out.println("Informe o raio: ");
        double raio = r.nextDouble();
        double area = 3.14 * raio * raio;
        System.out.println(area);
        return area;
    }
}
