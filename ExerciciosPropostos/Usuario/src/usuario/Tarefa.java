package usuario;

public class Tarefa {
    private int nivel;
    private String desc;
    private String status;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Tarefa() {
        this.desc = "Sem descricao";
        this.nivel = 3;
        this.status = "Nao concluida.";
    }

    public Tarefa(int nivel, String desc) {
        this.nivel = nivel;
        this.desc = desc;
        this.status = "Nao concluida";
    }
    
    
    
}
