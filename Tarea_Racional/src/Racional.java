/*
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class Racional {
    private int numerador;
    private int denominador;
    
    public Racional(){
        this.numerador = 0;
        this.denominador = 1;
    }
    
    public Racional(int numerador){
        this.numerador = numerador;
        this.denominador = 1;
    }
    
    public Racional(int numerador, int denominador) throws ArithmeticException{
        if(denominador > 0){
            this.numerador = numerador;
            this.denominador = denominador;    
        }else if(denominador == 0){
            throw  new ArithmeticException("Denominador no puede ser 0"); //El string de parámetro sea accde con getMessage();
        }else if(denominador<0 && numerador >=0){
            this.numerador = -numerador;
            this.denominador = -denominador;
        }
        
        int mcd = Racional.getMCD(this);
        this.denominador = this.denominador/mcd;
        this.numerador = this.numerador/mcd;
    }
    
    public double decimal(){
        return ((double)this.numerador / (double)this.denominador);
    }
    
    public void invertir(){
        if(this.numerador !=0){            
            int valorN = this.numerador;
            int valorD = this.denominador;
            this.denominador = valorN;        
            this.numerador = valorD; 
        }else{
            throw new ExceptionReverse("No es posible crear n/0"); 
            //System.out.println("El denominador no peude ser 0");
        }
               
    }
    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
    
    public Racional calcularReciproco(){        
        return new Racional(this.denominador, this.numerador);        
    }
    
    public Racional sumar(Racional otro){
        int nuevoD = this.denominador * otro.denominador;
        int nuevoN = ((nuevoD/this.denominador)*this.numerador) + 
                ((nuevoD/otro.denominador)*otro.numerador);
        Racional nuevo = new Racional(nuevoN, nuevoD);
        nuevo.denominador= nuevo.denominador / Racional.getMCD(nuevo);
        nuevo.numerador = nuevo.numerador / Racional.getMCD(nuevo);
        return nuevo;        
    }
    public Racional restar(Racional otro){
        int nuevoD = this.denominador * otro.denominador;
        int nuevoN = ((nuevoD/this.denominador)*this.numerador) - 
                ((nuevoD/otro.denominador)*otro.numerador);
        Racional nuevo = new Racional(nuevoN, nuevoD);
        
        nuevo.denominador= nuevo.denominador / Racional.getMCD(nuevo);
        nuevo.numerador = nuevo.numerador / Racional.getMCD(nuevo);
        return nuevo;      
    }
    public Racional multiplicar(Racional otro){
        int nuevoN = this.numerador * otro.numerador;
        int nuevoD = this.denominador * otro.denominador;
        Racional nuevo = new Racional(nuevoN, nuevoD);
        nuevo.numerador = nuevo.numerador/Racional.getMCD(nuevo);
        nuevo.denominador = nuevo.denominador / Racional.getMCD(nuevo);
        return nuevo;
    }
    
    public Racional dividir(Racional otro){
        int nuevoN;
        int nuevoD;
        if(otro.numerador != 0){
            nuevoN = this.numerador * otro.denominador;
            nuevoD = this.denominador * otro.numerador;
            Racional nuevo = new Racional(nuevoN, nuevoD);
            nuevo.numerador = nuevo.numerador/Racional.getMCD(nuevo);
            nuevo.denominador = nuevo.denominador / Racional.getMCD(nuevo);
            return nuevo;
        }else{
            System.out.println("No puedes Dividir entre 0");
        }
        return new Racional();
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    
   //Métodos de clase 
    public  static Racional racionalUno(){
        return new Racional(1);
    }
    public static Racional racionalCero(){
        return new Racional();
    }
    public static Racional absoluto(Racional otro){
        if (otro.numerador < 0){
            return new Racional(-otro.numerador, otro.denominador);            
        }else{
            return new Racional(otro.numerador, otro.denominador);
        }        
    }
    public static Racional negativo(Racional otro){
        return new Racional(-otro.numerador, otro.denominador);
    }
    
    public static int getMCD(Racional rac){
        int mcd = 1;
        int num = rac.getNumerador();
        int den = rac.getDenominador();
        if(num >= den || num == 0){
            int residuo = num % den;
            if(residuo == 0){
                return Math.abs(den);                
            }
            while(residuo !=0){
                num = den;
                den = residuo;
                if(num%den==0){
                    mcd = den;
                    residuo = 0;
                }else{
                    residuo = num % den;
                }
                
            }
            return Math.abs(mcd);
        }else{
            num = rac.getDenominador();
            den = rac.getNumerador();
            int residuo = num % den;
            if(residuo == 0){
                return Math.abs(den);                
            }
            while(residuo !=0){
                num = den;
                den = residuo;
                if(num%den==0){
                    mcd = den;
                    residuo = 0;
                }else{
                    residuo = num %den;
                }
                
            }
            return Math.abs(mcd);            
        } 
    }
    
}
