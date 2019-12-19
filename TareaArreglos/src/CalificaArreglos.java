
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 *
 * @author roberto
 */
public class CalificaArreglos {

    public static void main(String[] args) throws ClassNotFoundException {

        int calificacion = 0;

        final String NOMBRE_CLASE = "ArregloEntero";
        final String NOMBRE_GENERICO = NOMBRE_CLASE + ".";

        // Primero prueba que exista la clase
        if (existeClase(NOMBRE_CLASE)) {
            System.out.println("Tu clase está lista para ser evaluada.\n");
            // Mostrar características de la 
            Class<?> claseArreglo = Class.forName(NOMBRE_CLASE);
            System.out.println("Clase:\n  " + claseArreglo.getName());
            // Variables
            Field[] variablesInstancia = claseArreglo.getDeclaredFields();
            System.out.println("\nVariables de instancia: ");
            for (Field variable : variablesInstancia) {
                System.out.println("  " + variable.toString().replace(NOMBRE_GENERICO, ""));
            }
            // Constructores
            Constructor<?>[] constructores = claseArreglo.getConstructors();
            System.out.println("\nConstructores declarados:");
            for (Constructor<?> constructor : constructores) {
                System.out.println("  " + constructor);
            }
            // Métodos
            Method[] metodos = claseArreglo.getDeclaredMethods();
            System.out.println("\nMétodos de instancia:");
            for (Method metodo : metodos) {
                System.out.println("  " + metodo.toString().replace(NOMBRE_GENERICO, "").replace("java.lang.", ""));
            }

            // Evaluar 1.1
            calificacion += evaluar1_1(variablesInstancia);
            calificacion += evaluar1_2(variablesInstancia);
            calificacion += evaluar1_345(constructores);
            calificacion += evaluar1_6(metodos);
            calificacion += evaluar1_7(metodos);
            calificacion += evaluar1_8(claseArreglo);
            calificacion += evaluar1_9(claseArreglo);
            calificacion += evaluar1_10(claseArreglo);
            calificacion += evaluar1_11(claseArreglo);
            calificacion += evaluar1_12(claseArreglo);
            calificacion += evaluar1_13(claseArreglo);
            calificacion += evaluar1_14(claseArreglo);
            calificacion += evaluar1_15(claseArreglo);

        } else {
            System.out.println("No existe la clase '" + NOMBRE_CLASE + "'.");
            System.out.println("Verifica que se encuentre en el proyecto e intenta nuevamente.");
        }

        System.out.println("\nTu calificación final es: " + calificacion);
    }

    static int evaluar1_1(Field[] variables) {
        System.out.println("\nEvaluando 1.1. Una constante MAX_DATOS con el valor de 10");

        for (Field variable : variables) {
            if (variable.toString().contains("MAX_DATOS")) {
                if (variable.toString().contains("final")) {
                    System.out.println("Constante declarada correctamente. +2");
                    return 2;
                } else {
                    System.out.println("No la declaraste constante (final), revisa por favor");
                    return 0;
                }
            }
        }
        System.out.println("No tienes declarada la constante MAX_DATOS");
        return 0;
    }

    static int evaluar1_2(Field[] variables) {
        System.out.println("\nEvaluando 1.2. Un arreglo de números enteros como variable de instancia");

        for (Field variable : variables) {
            if (variable.toString().contains("arrNumeros")) {
                if (variable.toString().contains("int[]")) {
                    if (variable.toString().contains("private")) {
                        System.out.println("Arreglo declarado correctamente. +3");
                        return 3;
                    } else {
                        System.out.println("El modificador de acceso es incorrecto");
                    }
                } else {
                    System.out.println("No declaraste la variable como arreglo de enteros");
                }
                return 0;
            }
        }
        System.out.println("No tienes declarado el arreglo de enteros");
        return 0;
    }

    static int evaluar1_345(Constructor<?>[] metodos) {
        System.out.println("\nEvaluando 1.3, 1.4 y 1.5. Constructores");
        int puntos = 0;

        for (Constructor<?> metodo : metodos) {
            if (metodo.toString().contains("ArregloEntero()")) {
                System.out.println("Constructor por default. +2");
                puntos += 2;
            }
            if (metodo.toString().contains("ArregloEntero(int[])")) {
                System.out.println("Constructor con un arreglo como parámetro. +4");
                puntos += 4;
            }
            if (metodo.toString().contains("ArregloEntero(int)")) {
                System.out.println("Constructor con un entero como parámetro. +4");
                puntos += 4;
            }
        }
        if (puntos < 10) {
            System.out.println("Revisa los constructores te falta alguno");
        }
        return puntos;
    }

    static int evaluar1_6(Method[] metodos) {
        System.out.println("\nEvaluando 1.6. Método accesor de arrNumeros");
        for (Method metodo : metodos) {
            if (metodo.toString().contains("getArrNumeros()")) {
                if (metodo.toString().contains("int[]")) {
                    System.out.println("Método accesor de arrNumeros encontrado. +2");
                    return 2;
                } else {
                    System.out.println("El tipo de regreso es incorrecto");
                    return 0;
                }
            }
        }
        System.out.println("No existe el método accesor para arrNumeros");
        return 0;
    }

    static int evaluar1_7(Method[] metodos) {
        System.out.println("\nEvaluando 1.7. Método modificador de arrNumeros");
        for (Method metodo : metodos) {
            if (metodo.toString().contains("setArrNumeros")) {
                if (metodo.toString().contains("(int[])")) {
                    if (metodo.toString().contains("void")) {
                        System.out.println("Método accesor de arrNumeros encontrado. +3");
                        return 3;
                    } else {
                        System.out.println("El tipo de regreso es incorrecto");
                        return 0;
                    }
                } else {
                    System.out.println("El parámetro que llega al método es incorrecto");
                    return 0;
                }
            }
        }
        System.out.println("No existe el método modificador para arrNumeros");
        return 0;
    }

    static int evaluar1_8(Class<?> claseArreglo) {
        System.out.println("\nEvaluando 1.8. Método llenarAzar");
        try {
            Constructor<?> constructor = claseArreglo.getConstructor(int.class);
            Object objeto = constructor.newInstance(1000);
            Method llenarAzar = objeto.getClass().getMethod("llenarAzar");
            llenarAzar.invoke(objeto);
            Method get = objeto.getClass().getMethod("getArrNumeros");
            int[] datos = (int[]) get.invoke(objeto);
            Arrays.sort(datos);
            if (datos[datos.length - 1] - datos[0] != 47 || datos[0] != 5 || datos[datos.length - 1] != 52) {
                System.out.println("Revisa el rango de datos, es posible que sea incorrecto");
            }
            System.out.println("Parece que el método llenarAzar funciona correctamente. +10");
            return 10;
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            System.out.println("No es posible evaluar el método llenarAzar, " + e.toString());
        }

        return 0;
    }

    static int evaluar1_9(Class<?> claseArreglo) {
        System.out.println("\nEvaluando 1.9. Método contarImpares");
        try {
            Constructor<?> constructor = claseArreglo.getConstructor(int.class);
            Object objeto = constructor.newInstance(10);
            Method llenarAzar = objeto.getClass().getMethod("llenarAzar");
            llenarAzar.invoke(objeto);
            Method get = objeto.getClass().getMethod("getArrNumeros");
            int[] datos = (int[]) get.invoke(objeto);

            Method contarImpares = objeto.getClass().getMethod("contarImpares");
            int impares = (int) contarImpares.invoke(objeto);
            System.out.println(Arrays.toString(datos));
            System.out.println("Según tu método hay " + impares + " impares");
            int misImpares = 0;
            for (int dato : datos) {
                if (dato % 2 != 0) {
                    misImpares++;
                }
            }
            System.out.println("Según yo, hay " + misImpares + " impares");
            if (impares == misImpares) {
                System.out.println("El método contarImpares es correcto. +10");
                return 10;
            } else {
                System.out.println("Parece que el método contarImpares no es correcto");
            }
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            System.out.println("No es posible evaluar el método contarImpares, " + e.toString());
        }

        return 0;
    }

    static int evaluar1_10(Class<?> claseArreglo) {
        System.out.println("\nEvaluando 1.10. Método intercambiar");
        try {
            Constructor<?> constructor = claseArreglo.getConstructor(int[].class);
            int[] numeros = {1, 2, 3, 4, 5};
            Object objeto = constructor.newInstance((Object) (numeros));

            Method intercambiar = objeto.getClass().getMethod("intercambiar");
            intercambiar.invoke(objeto);

            Method get = objeto.getClass().getMethod("getArrNumeros");
            int[] datos = (int[]) get.invoke(objeto);

            int[] resultado = {5, 2, 3, 4, 1};

            if (Arrays.equals(datos, resultado)) {
                System.out.println("El método intercambiar es correcto. +10");
                return 10;
            } else {
                System.out.println("Parece que el método intercambiar no es correcto");
            }
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            System.out.println("No es posible evaluar el método intercambiar, " + e.toString());
        }

        return 0;
    }

    static int evaluar1_11(Class<?> claseArreglo) {
        System.out.println("\nEvaluando 1.11. Método toString");
        try {
            Constructor<?> constructor = claseArreglo.getConstructor(int[].class);
            int[] numeros = {1, 2, 3, 4, 5};
            Object objeto = constructor.newInstance((Object) (numeros));

            Method toString = objeto.getClass().getMethod("toString");
            String cadena = (String) toString.invoke(objeto);
            cadena = cadena.replace(" ", "");
            String resultado = Arrays.toString(numeros).replace(" ", "");
            System.out.println("Tu cadena formateada: " + cadena + ", mi cadena: " + resultado);
            if (resultado.equals(cadena)) {
                System.out.println("El método toString es correcto. +10");
                return 10;
            } else {
                System.out.println("Parece que el método toString no es correcto");
            }
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            System.out.println("No es posible evaluar el método toString, " + e.toString());
        }

        return 0;
    }

    static int evaluar1_12(Class<?> claseArreglo) {
        System.out.println("\nEvaluando 1.12. Método equals");
        try {
            Constructor<?> constructor = claseArreglo.getConstructor(int[].class);
            int[] numeros = {1, 2, 3, 4, 5};
            int[] nuevo = {1, 2, 3, 5, 4};
            Object objeto = constructor.newInstance((Object) (numeros));
            Object otro = constructor.newInstance((Object) (numeros));
            Object diferente = constructor.newInstance((Object) (nuevo));

            Method equals = objeto.getClass().getMethod("equals", Object.class);
            boolean iguales = (boolean) equals.invoke(objeto, otro);
            boolean diferentes = (boolean) equals.invoke(objeto, diferente);

            if (iguales && !diferentes) {
                System.out.println("El método equals es correcto. +10");
                return 10;
            } else {
                System.out.println("Parece que el método equals no es correcto");
            }
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            System.out.println("No es posible evaluar el método equals, " + e.toString());
        }

        return 0;
    }

    static int evaluar1_13(Class<?> claseArreglo) {
        System.out.println("\nEvaluando 1.13. Método rotarIzquierda");
        try {
            Constructor<?> constructor = claseArreglo.getConstructor(int[].class);
            int[] numeros = {1, 2, 3, 4, 5};
            Object objeto = constructor.newInstance((Object) (numeros));

            Method rotarIzquierda = objeto.getClass().getMethod("rotarIzquierda");
            rotarIzquierda.invoke(objeto);

            Method get = objeto.getClass().getMethod("getArrNumeros");
            int[] desplazados = (int[]) get.invoke(objeto);
            int[] resultado = {2, 3, 4, 5, 1};

            if (Arrays.equals(desplazados, resultado)) {
                System.out.println("El método rotarIzquierda es correcto. +10");
                return 10;
            } else {
                System.out.println("Parece que el método rotarIzquierda no es correcto");
            }
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            System.out.println("No es posible evaluar el método rotarIzquierda, " + e.toString());
        }

        return 0;
    }
    
    static int evaluar1_14(Class<?> claseArreglo) {
        System.out.println("\nEvaluando 1.14. Método invertir");
        try {
            Constructor<?> constructor = claseArreglo.getConstructor(int[].class);
            int[] numeros = {1, 2, 3, 4, 5};
            Object objeto = constructor.newInstance((Object) (numeros));

            Method invertir = objeto.getClass().getMethod("invertir");
            String invertido = (String)invertir.invoke(objeto);

            invertido = invertido.replace(" ", "");
            
            int[] otros = {5,4,3,2,1};
            String resultado = Arrays.toString(otros);
            resultado = resultado.replace(" ", "");

            if (invertido.equals(resultado)) {
                System.out.println("El método invertir es correcto. +10");
                return 10;
            } else {
                System.out.println("Parece que el método invertir no es correcto");
            }
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            System.out.println("No es posible evaluar el método invertir, " + e.toString());
        }

        return 0;
    }
    
    static int evaluar1_15(Class<?> claseArreglo) {
        System.out.println("\nEvaluando 1.14. Método esPalindromo");
        try {
            Constructor<?> constructor = claseArreglo.getConstructor(int[].class);
            int[] numeros = {1, 2, 3, 4, 5};
            Object objeto = constructor.newInstance((Object) (numeros));

            Method primero = objeto.getClass().getMethod("esPalindromo");
            boolean noEs = (boolean)primero.invoke(objeto);
            
            int[] numerosOtros = {1,2,3,4,5,4,3,2,1};
            Object otro = constructor.newInstance((Object) (numerosOtros));

            Method segundo = objeto.getClass().getMethod("esPalindromo");
            boolean siEs = (boolean)primero.invoke(otro);

            if (siEs && !noEs) {
                System.out.println("El método esPalindromo es correcto. +10");
                return 10;
            } else {
                System.out.println("Parece que el método esPalindromo no es correcto");
            }
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            System.out.println("No es posible evaluar el método esPalindromo, " + e.toString());
        }

        return 0;
    }

    static boolean existeClase(String nombre) {
        try {
            Class.forName("ArregloEntero");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
