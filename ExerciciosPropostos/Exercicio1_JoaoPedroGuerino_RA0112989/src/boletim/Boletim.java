package boletim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boletim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Aluno> lista = new ArrayList<>();
        int cont = 0;
        int pesq = 0;

        do {
            System.out.println("""
                               Informe o que deseja fazer: 
                               1. Cadastrar aluno
                               2. Inserir notas
                               3. Mostrar media e situacao de todos
                               4. Buscar aluno por matricula
                               5. Fechar sistema""");

            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe o nome do aluno:\n");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.println("Informe a matricula do aluno:\n");
                    int matricula = sc.nextInt();
                    lista.add(new Aluno(nome, matricula));
                    break;

                case 2:
                    System.out.println("Digite a matricula do aluno para inserir a nota:\n");
                    pesq = sc.nextInt();
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getMatricula() == pesq) {
                            System.out.println("Digite as notas do aluno:\n");
                            int n1 = sc.nextInt();
                            int n2 = sc.nextInt();
                            lista.get(i).setNota1(n1);
                            lista.get(i).setNota2(n2);
                        } else {
                            System.out.println("Aluno nao encontrado.\n");
                        }

                    }
                    break;

                case 3:
                    System.out.println("Digite a matricula do aluno o qual deseja ver a situacao:\n");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("Aluno: " + lista.get(i).getNome());
                        double med = lista.get(i).media();
                        System.out.println("Media: " + med);
                        lista.get(i).aprovado(med);

                    }
                    break;

                case 4:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("Digite a matricula do aluno: ");
                        pesq = sc.nextInt();
                        if (pesq == lista.get(i).getMatricula()) {
                            System.out.println("Aluno: " + lista.get(i).getNome());
                            break;
                        } else {
                            System.out.println("Aluno nao encontrado!");
                        }

                    }

                    break;

                case 5:
                    return;
                default:
                    System.out.println("Opcao invalida!");
                    break;

            }

        } while (cont != 5);

    }
}
