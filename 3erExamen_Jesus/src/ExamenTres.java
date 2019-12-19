/**
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class ExamenTres {
    
    public static void ampliar(Vector[] vectores){
        for (Vector vector : vectores) {
            if (vector instanceof Estandar){
                Estandar a;
                a = (Estandar) vector;
                a.setX((int)(a.x * 2));
                a.setY((int)(a.y * 2));                
            }else if(vector instanceof Otro){
                Otro b;
                b = (Otro) vector;
                b.setXY(b.x * 2,b.y *2 );
            }
        }
    }
    
    public static int contarEstandar(Vector[] vectores){
        
        int contador =0;
        
        for(Vector vector : vectores){
            if(vector instanceof Estandar){
                contador++;                 
            }          
        }
        
        return contador;
    }
    
    public static void borrarHorizontal(Vector[] vectores){
        for(Vector vector : vectores){
            if (vector instanceof Estandar){
                Estandar a;
                a = (Estandar) vector;
                a.setY(0);
            }else if(vector instanceof Otro){
                Otro b;
                b = (Otro) vector;
                b.setXY(b.x, 0);
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("A01374964\nJesus Zabdiel Sanchez\nISC");
        
        Vector[] arrVectores = new Vector[10];
        
        for (int i = 0; i < arrVectores.length; i++) {
            double tipo = Math.random();
            int valorX = (int)(Math.random()*10);
            int valorY = (int)(Math.random()*10);
            if ((int)(Math.random()*2) == 0){
                valorX = valorX *-1;
            }                
            if ((int)(Math.random()*2) == 0){
            valorY = valorY *-1;
            }
            
            
            if(tipo < 0.5){
                arrVectores[i] = new Estandar(valorX, valorY);
            }else if (tipo >= 0.5){
                arrVectores[i] = new Otro(valorX, valorY);
            }
            
        }
        System.out.println("Vectores en el arreglo");
        for (Vector vector: arrVectores) {
            System.out.println(vector);            
        }
        System.out.println("\n\n\n");
        System.out.println("Hay " + contarEstandar(arrVectores)+" vectores estándar");
        
        ampliar(arrVectores);
        borrarHorizontal(arrVectores);

        System.out.println("Vectores en el arreglo");
        for (Vector vector: arrVectores) {
            System.out.println(vector);            
        }
        
        
        
    }
}
