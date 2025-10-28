package telefone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Telefone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contato> lista = new ArrayList<Contato>();
        Contato c1 = new Contato();
        int cad = 0;
        lista.add(c1);
        do {
            System.out.println("Informe o nome do contato: ");
            String nome = sc.nextLine();
            
            System.out.println("Informe o email: ");
            String email = sc.nextLine();
            
            System.out.println("Informe o numero: ");
            String numero = sc.nextLine();
            

            lista.add(new Contato(nome, numero, email));
            cad++;
        } while (cad < 5);

        System.out.println("Escolha o contato para atualizar o email: ");
        String esc = sc.nextLine();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equalsIgnoreCase(esc)) {
                System.out.print("Digite o novo e-mail: ");
                String novoEmail = sc.nextLine();
                lista.get(i).setEmail(novoEmail);
                System.out.println("E-mail atualizado com sucesso!");
                break; 
            }

        }
        
         for (int i = 0; i < lista.size(); i++) {
             System.out.println("Contatos: " + lista.get(i).getNome() + " Numero: "+ lista.get(i).getNumero() + " Email: "+lista.get(i).getEmail());
             System.out.println();
            }
         
          for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equalsIgnoreCase("sem nome")) {
                lista.remove(i);
                System.out.println("Contato removido! ");
                System.out.println();
                break; 
            }
          }
          
           for (int i = 0; i < lista.size(); i++) {
             System.out.println("Contatos: " + lista.get(i).getNome() + " Numero: "+ lista.get(i).getNumero() + " Email: "+lista.get(i).getEmail());
             System.out.println();
            }
          
          int cont = 0;
          
          for (int i = 0; i < lista.size(); i++) {
            cont++;
            }
          System.out.println("Numero de contatos cadastrados: "+cont);

    }
}
