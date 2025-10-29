package boletim;

public class Aluno {

    private String nome;
    private int matricula;
    private double nota1, nota2;

    public Aluno(String nome, int matricula, int nota1, int nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        
        if(matricula < 0){
            System.out.println("Matricula invalida");
        }else{
            this.matricula = matricula;
        }
    }

    public double media() {
       double n1, n2;
       n1 = this.nota1;
       n2 = this.nota2;
       
        if(n1 < 0 || n2 < 0 || n1 > 10 || n2 > 10){
            System.out.println("Nota invalida!");
        } 
        

        double media = (n1 + n2) / 2;
        System.out.println(media);
        return media;
    }

    public boolean aprovado(double media) {
        if (media > 6.0) {
            System.out.println("Aluno aprovado!");
            return true;
        } else {
            System.out.println("Aluno reprovado!");
            return false;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
