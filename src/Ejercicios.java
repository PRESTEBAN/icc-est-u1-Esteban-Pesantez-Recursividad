public class Ejercicios {


    public int sumaRecursiva(int numero, int limite){
        if (numero > limite) {
            return 0;
        } else {
            System.out.println(numero + " + ");
            return numero + sumaRecursiva(numero+1, limite);
        }
    }

    public int potenciaRecursiva(int base, int exponente, int aux){
        if (aux >= exponente) { 
            return 1; 
        }else{
            aux++; 
            return base * potenciaRecursiva(base, exponente,aux); 
            
        }
    }

    public int sumaDigitos(int numero) {   //12
        if (numero < 10) { // no cumple
            return numero;
        } else {
          
            int ultimoDigito = numero % 10; //2
            int resto = numero / 10; //2
        
            return ultimoDigito + sumaDigitos(resto); // 2 + 1
        }
    }
}