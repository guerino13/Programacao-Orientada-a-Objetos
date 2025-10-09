
package aula0810;


public class Filme {
    String titulo;
    String genero;
    int duracao;

    public Filme(String titulo, String genero, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public Filme(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = 90;
    }

    public Filme() {
    }
    
    
}
