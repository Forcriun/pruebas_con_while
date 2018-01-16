
/**
 * Clase de pruebas con el bucle while perteneciente al 
 * apartado 04.01 - Agrupación de objetos .
 *
 * @author Didac Fernandez Fernandez
 * @version 2018-01-16
 */
public class PruebasConWhile
{
    /**
     * Ejercicio 4.30
     * 
     * Metodo que muestra por pantalla todos los multiplos de 5 
     * comprendidos entre 10 y 95.
     */
    public void multiplosDe5(){
        int indice = 10;
        while(indice <= 95){
            System.out.println(indice);
            indice += 5;
        }
    }

    /**
     * Ejercicio 4.31
     * 
     * Metodo que muestra por pantalla todos los multiplos de 5 
     * comprendidos entre 10 y 95.
     */
    public void sumaEntre1y10(){
        int indice = 1;
        int suma = 0;
        while(indice <= 10){
            suma += indice;
            indice++;
        }
        System.out.println(suma);
    }

    /**
     * Ejercicio 4.32
     * 
     * Metodo que suma todos los numeros comprendidos entre los
     * numeros los numeros que se le indican como parametros.
     * @param a Primer numero.
     * @param b Segundo numero.
     */
    public void sum(int a, int b){
        int suma = 0;
        while(a <= b){
            suma += a;
            a++;
        }
        System.out.println(suma);
    }

    /**
     * Ejercicio 4.33
     * 
     * Metodo que calcula si el numero introducido por parametro es primo.
     * @param n El numero a comprobar si es primo.
     * @return Devuelve true si es primo, False en caso contrario.
     */
    public boolean isPrime(int n){
        boolean nEsPrimo = true;
        int indice = 2;
        while(indice < n && nEsPrimo){
            if(n%indice == 0){
                nEsPrimo = false;
            }
            indice++;
        }
        return nEsPrimo;
    }
}
