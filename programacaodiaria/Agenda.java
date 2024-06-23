package ProgramcaoDiaria;
import java.util.*;

public class Agenda {
    public static void main(String[] args) {
        // Instância 
        Scanner read = new Scanner(System.in);

        // Variaveis
        String[] telefone = new String[10];
        String[] nome = new String[10];
        String nomedel;
        char follow = 's', menu;
        int i = 0;

        // instância de class
        SistemaAgenda novAgenda = new SistemaAgenda();
        SistemaAgenda.Adicionar  add = new SistemaAgenda.Adicionar();
        SistemaAgenda.Listar lista = new SistemaAgenda.Listar();
        SistemaAgenda.Remover remover = new SistemaAgenda.Remover();


        while(follow == 's'){
            System.out.println("1- Adicionar \n2-Listar \n3-Remover");
            menu = read.next().charAt(0);

            switch (menu) {
                case '1':
                    System.out.println("Informe o nome do contato que deseja adicionar: ");
                    nome[i] = read.next();
                    System.out.println("Informe o telefone do contato que deseja adicionar: ");
                    telefone[i] = read.next();
                    add.Add(nome, telefone, i);    
                    i++;
                    break;
                
                case '2':
                    lista.list(nome, telefone, i);
                    break;

                case '3':
                    System.out.println("Informe o nome do contato que deseja remover: ");
                    nomedel = read.next();
                    remover.remove(nome, telefone, nomedel, i);
                    i--;
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}