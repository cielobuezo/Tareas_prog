import java.util.Scanner;

public class comparacion_enteros {
    public static void main(String[] args)
 {
    try (Scanner entrada = new Scanner(System.in)) {
        int numero1; // primer número a comparar
        int numero2; // segundo número a comparar

        System.out.print("Escriba el primer entero: "); // indicador
        numero1 = entrada.nextInt(); // lee el primer número del usuario

        System.out.print("Escriba el segundo entero: "); // indicador
        numero2 = entrada.nextInt(); // lee el segundo número del usuario

        if (numero1 == numero2)
        System.out.printf("%d Estos numeros son iguales %d%n", numero1, numero2);


        if (numero1 > numero2)
        System.out.printf("%d es mas grande que %d%n", numero1, numero2);

        if (numero1 < numero2)
        System.out.printf("%d es mas grande que %d%n", numero2, numero1);

    }
} // fin del método main
} // fin de la clase Comparacio

    

