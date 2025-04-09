public class Ejercicios {

    public int llamadasRecursiva =1;
    public int sumaRecursiva(int numero, int limite){
        if (numero > limite) {
            return 0;
        } else {
            System.out.println(numero + " + ");
            return numero + sumaRecursiva(numero+1, limite);
        }
    }

    public int sumConsecutivos(int n){

        int idActual = llamadasRecursiva++;

        System.out.println("Llamada a " + idActual +
                            " con numero n = " + n );

        if (n==1) {
            System.out.println("Llamada a" + idActual +
                                " caso base alcanzado ");
            return 1;
        }
        //return n + sumConsecutivos(n);
        System.out.println("Llamada a " + idActual +
                            " Lamando recursivamente con n =" + (n-1));

        int resultadoParcial = sumConsecutivos(n-1);

        int resultado = n + resultadoParcial;
        System.out.println("Llamada a " + idActual +
         " sumando  "+ n + " al resultado de " + resultadoParcial +
        " = " + resultado) ;

        System.out.println("Llamada a " + idActual +
                " Retorno " + resultado);

        return resultado;
    }

    public int potenciaRecursiva(int base, int exponente, int aux){
        if (aux >= exponente) { 
            return 1; 
        }else{
            aux++; 
            return base * potenciaRecursiva(base, exponente,aux); 
            
        }
    }

    public int sumaDigitos(int numero) {   
        if (numero < 10) {
            return numero;
        } else {
          
            int ultimoDigito = numero % 10; 
            int resto = numero / 10; 
        
            return ultimoDigito + sumaDigitos(resto); 
        }
    }

    public int fibonacci(int n){
        // Caso base: los dos primeros números de Fibonacci son 0 y 1
        if (n==0 || n==1) {
            return n;
        }
        // Caso recursivo: sumar los dos números anteriores en la secuencia 
        return fibonacci(n-1) + fibonacci(n-2);
    }
}