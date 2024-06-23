package ProgramcaoDiaria;
public class SistemaAgenda {

    static public class Adicionar{
        public void Add(String nome[], String telefone[], int i){
            nome[i] = nome[i];
            telefone[i] = telefone[i];
            System.out.println("Contato adicionado:");
        }
    }

    static public class Listar{
        public void list(String[] nome, String[] telefone, int i){
            
            System.out.println("Todos os contatos");

            for(int j = 0; j < i; j++){
                if(nome[j] != null){
                    System.out.println(nome[j]);
                    System.out.println(telefone[j]);
                }
            }
        }
    }

    static public class Remover{
        public void remove(String nome[], String telefone[], String nomedel, int i){
            
            boolean found = false;

            for(int j = 0; j < i; j++){
                
                if(nome[j] != null && nome[j].equals(nomedel)){
                    nome[j] = null;

                    telefone[j] = null;

                    found = true;

                    System.out.println("successfully removed");
                    break;
                }
            }
            if(!found){
                System.out.println("contact not found");
            }
        }
    }
}