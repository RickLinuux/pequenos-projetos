import java.util.ArrayList;

public class FuncEntre {
    
    public static class ExitEntre {
        public static void entre(int[] array, int max, int min){
            //Instância do arrayList, que inicia vazio
            // Integer == Inteiro
            ArrayList<Integer> arrayExit = new ArrayList<>();
            
            //Loop controlador
            for(int i = 0; i < array.length; i++){
                //verificação dos intervalos
                if(array[i] >= min && array[i] <= max){
                    //Metodo add para adicionar os itens no 
                    //ArrayList 
                    arrayExit.add(array[i]);
                }
            }
            System.out.println("Os valores que estão no intervalo de " + min + " a " + max + " são:");
            //Método size para retornar a quantidade de elementos 
            // Pertecente ao arrayList
            for(int j = 0; j < arrayExit.size(); j++){
                //Método Get usado para recuperar o índice
                // no caso J
                System.out.println(arrayExit.get(j));
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0,10,23,67,34,923,2212};
        int max = 23;
        int min = 0;

        ExitEntre.entre(array, max, min);
    }
}
