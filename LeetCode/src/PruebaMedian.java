/*
 * @author Zady-
 */
public class PruebaMedian {
    public static void main(String[] args) {
        //Median a = new Median();
        int[] x = {1,3,6,4,82,4,5,8,2,5};
        int[] y = {2};       
        for (int i = 0; i<x.length-1; i++){
            for(int j=0; j<x.length-1;j++){
                if(x[j] > x[j+1]){
                    int cambio = x[j];
                    x[j] = x[j+1];
                    x[j+1] = cambio;                              
                    
                }
            }            
                                                            
        }
    }
    
}
