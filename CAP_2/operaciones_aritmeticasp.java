import java.util.Scanner; // el programa usa la clase Scanner

 public class operaciones_aritmeticasp
 {
 // el método main empieza la ejecución de la aplicación en Java
 public static void main(String[] args)
 {
    int numero1; // primer número a sumar
     int numero2; 
     int numero3;// segundo número a sumar
     int promedio;
     int producto;
     int suma;
try (// crea objeto Scanner para obtener la entrada de la ventana de comandos
Scanner entrada = new Scanner(System.in)) {
     // suma de numero1 y numero2
    
     System.out.print("Escriba el primer entero: "); // indicador
     numero1 = entrada.nextInt(); // lee el primer número del usuario
    
     System.out.print("Escriba el segundo entero: "); // indicador
     numero2 = entrada.nextInt(); // lee el segundo número del usuario
    
     System.out.print("Escriba el segundo entero: "); // indicador
     numero3 = entrada.nextInt(); // lee el segundo número del usuario

     suma = numero1 + numero2 + numero3; // suma los números, después almacena el total en suma
     producto=numero1 * numero2 * numero3;
     promedio=(numero1 + numero2 + numero3)/3;


     System.out.printf("La suma es %d%n", suma); // muestra la suma
     System.out.printf("El producto  es %d%n", producto);
     System.out.printf("El promedio  es %d%n", promedio);

     if(numero1 > numero2 && numero1 > numero3 )
     System.out.printf(numero1 +"Es el mayor");

     if(numero2 > numero1 && numero2 > numero3 )
     System.out.printf(numero2 +"Es el mayor");

     if(numero3 > numero2 && numero3 > numero3 )
     System.out.printf(numero3 +"Es el mayor");

}
}
}// fin de la clase Sum