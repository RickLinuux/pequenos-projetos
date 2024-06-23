import java.util.ArrayList;
public class UniaoArray {
    
    public class Uniao{
        static public void unir(int[] arrayE, int[] arrayD){
            ArrayList <Integer> arrayExit = new ArrayList<>();

            for(int i = 0; i < arrayE.length; i++){
                arrayExit.add(arrayE[i]);
            }

            for(int k = 0; k  < arrayD.length; k++){
                arrayExit.add(arrayD[k]);
            }

            for(int i = 0; i < arrayExit.size(); i++){
                System.out.println(arrayExit.get(i));                
            }
        }
        
    }

    public static void main(String[] args) {
        int[] arrayE = {1,2,3,4,5};
        int[] arrayD = {1,2,3,4,5};

        Uniao.unir(arrayE, arrayD);
    }
    
}
