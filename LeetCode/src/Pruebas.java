
import java.util.Arrays;

/*
 * @author Zady-
 */
public class Pruebas {
    public static void main(String[] args) {
        int[] nums =  new int[52];
        for(int i = 0; i<nums.length;i++){
            nums[i] = (int)((Math.random()*48)+5);
            
        }
        
        System.out.println("Nums" + Arrays.toString(nums));
    }
    
    
}
