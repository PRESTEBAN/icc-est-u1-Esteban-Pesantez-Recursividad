
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Ejercicios ej = new Ejercicios();

        boolean continuar = true;

        while (continuar) {
            System.out.println("---------MENÚ DE EJERCICIOS--------");
            System.out.println("1. Suma de números consecutivos por recursividad");
            System.out.println("2. Petencia de un número");
            System.out.println("3. Suma de dígitos de un número ");
            System.out.println("4. Fibonacci");
            System.out.println("5. Para salir ");

            byte opcion = scanner.nextByte();

            if(opcion==5){
             System.out.println("Saliendo!!");
             break;
            }

            switch (opcion) {
            case 1:
               /*  System.out.println("Has ingresado la opción 1: ");
                System.out.println("Ingresa hasta que número deseas que se real ice la suma: ");
                int num = scanner.nextInt();
                int resultado = ej.sumaRecursiva(1, num);
                System.out.println("La suma es: " + resultado);*/

                System.out.println("Ingresa hasta que número deseas que se realice la suma: ");
                int num = scanner.nextInt();

                int resultado = ej.sumConsecutivos(num);

                System.out.println(resultado);
                

                break;
            case 2:
                System.out.println("Has ingresado la opción 2: ");
                System.out.println("Ingresa la base: ");
                int base = scanner.nextInt();
                System.out.println("Ingresa el exponente");
                int exponente = scanner.nextInt();
                int resultado2 = ej.potenciaRecursiva(base, exponente,0);
                System.out.println("El resultado es: " + resultado2);
                break;
            case 3:
                System.out.println("Has ingresado la opción 3: ");
                System.out.println("Ingresa el número cuyos dígitos deseas sumar: ");
                int numer = scanner.nextInt();
                int resultadoSuma = ej.sumaDigitos(numer);
                System.out.println("La suma de los dígitos de " + numer + " es: " + resultadoSuma);
                break;
            case  4:
                System.out.println("Has ingresado la opción 4");
                int n = scanner.nextInt();
                int resultado4 = ej.fibonacci(n);
                System.out.println(resultado4);
                break;
            }
            

        }
    }
}
