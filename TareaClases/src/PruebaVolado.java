/*

 * @author Jesus Zabdiel Sanchez Chavez
 */
public class PruebaVolado {
    public static void main(String[] args) {
        Volado a =  new Volado();
        System.out.println("Cara Inicial: " + a.getHaciaArriba());
        int counterA = 0;
            int counterS = 0;
        for(int i = 0; i<20; i++){
            a.echarVolado();
            System.out.println("Cara: " + a);
            if(a.getHaciaArriba() == "sol"){
                counterS++;
            }else{
                counterA++;
            }            
        }
        
        System.out.println("N veces Águila: " + counterA);
        System.out.println("N veces Sol: " + counterS);
    }
    
}
