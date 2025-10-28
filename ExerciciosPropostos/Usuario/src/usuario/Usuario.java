package usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Defina sua tarefa.");
        System.out.println("Qual a tarefa a ser realizada?");
        String desc = sc.nextLine();
        System.out.println("Qual a prioridade da tarefa?");
        int pr = sc.nextInt();

        Tarefa t1 = new Tarefa(pr, desc);
        Tarefa t2 = new Tarefa();

        System.out.println("Defina sua tarefa.");
        sc.nextLine();
        System.out.println("Qual a tarefa a ser realizada?");
        String desc2 = sc.nextLine();
        System.out.println("Qual a prioridade da tarefa?");
        int pr2 = sc.nextInt();

        Tarefa t3 = new Tarefa(pr2, desc2);
        int org = 0;

        List<Tarefa> lista = new ArrayList<Tarefa>();

        if (t1.getNivel() >= t2.getNivel() && t1.getNivel() >= t3.getNivel()) {
            lista.add(t1);
            if (t2.getNivel() >= t3.getNivel()) {
                lista.add(t2);
                lista.add(t3);
            } else {
                lista.add(t3);
                lista.add(t2);
            }
        } else if (t2.getNivel() >= t1.getNivel() && t2.getNivel() >= t3.getNivel()) {
            lista.add(t2);
            if (t1.getNivel() >= t3.getNivel()) {
                lista.add(t1);
                lista.add(t3);
            } else {
                lista.add(t3);
                lista.add(t1);
            }
        } else {
            lista.add(t3);
            if (t1.getNivel() >= t2.getNivel()) {
                lista.add(t1);
                lista.add(t2);
            } else {
                lista.add(t2);
                lista.add(t1);
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Tarefa: " + lista.get(i).getDesc() + " \nPrioridade: " + lista.get(i).getNivel());
        }

    }

}
