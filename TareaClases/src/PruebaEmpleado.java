/*
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class PruebaEmpleado {
    
    public static void main(String[] args) {
        Empleado a =  new Empleado ("Susan Meyers", 47899, "Contabilidad", 
                "Vicepresidente");
        Empleado b = new Empleado ("Mark Jones", 39119, "IT", "Programador");
        Empleado c = new Empleado("Joy Rogers", 81774, "Fabricación", 
                "Ingeniero");
        Empleado d = new Empleado("Margarito Pérez", 1232);
        Empleado e = new Empleado();
        Empleado f = new Empleado();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        
        System.out.println("¿Iguales?: " + e.equals(f));
        System.out.println("¿Iguales?: " + e.equals(a));
        
        }
    }
    
