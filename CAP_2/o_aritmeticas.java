import java.util.Scanner; // el programa usa la clase Scanner

 public class o_aritmeticas
 {
 // el método main empieza la ejecución de la aplicación en Java
 public static void main(String[] args)
 {
try (// crea objeto Scanner para obtener la entrada de la ventana de comandos
Scanner entrada = new Scanner(System.in)) {
    int numero1; // primer número a sumar
     int numero2; // segundo número a sumar
     int r; // suma de numero1 y numero2
    
     System.out.print("Escriba el primer entero: "); // indicador
     numero1 = entrada.nextInt(); // lee el primer número del usuario
    
     System.out.print("Escriba el segundo entero: "); // indicador
     numero2 = entrada.nextInt(); // lee el segundo número del usuario
    
     r = numero1 + numero2; 
    System.out.printf("La suma es %d%n", r); 

     r = numero1 - numero2; 
    System.out.printf("La resta es %d%n", r);

    r = numero1 * numero2; 
    System.out.printf("La multiplicacion es %d%n", r);

    r = numero1 / numero2; 
    System.out.printf("La division es %d%n", r);


}
 } // fin del método main
} // fin de la clase Sum

