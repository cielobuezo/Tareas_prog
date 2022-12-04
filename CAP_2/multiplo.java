import java.util.Scanner; // el programa usa la clase Scanner

public class multiplo
{
   
    public static void main( String[] args )
    {
try (// crea objeto Scanner para obtener la entrada de la ventana de comandos
Scanner entrada = new Scanner(System.in)) {
    int numero1; // primer número a sumar
     int numero2; // segundo número a sumar
     int res; // suma de numero1 y numero2
    
     System.out.print("Escriba el primer entero: "); // indicador
     numero1 = entrada.nextInt(); // lee el primer número del usuario
    
     System.out.print("Escriba el segundo entero: "); // indicador
     numero2 = entrada.nextInt(); // lee el segundo número del usuario
    
     res = numero1 % numero2; // suma los números, después almacena el total en suma
    
     if(res == 0){
        System.out.print(numero1 +" es multiplo de " + numero2);
      }

      if(res != 0){
        System.out.print(numero1 +" no es multiplo de " + numero2);
      }
}
 } // fin del método main
} // fin de la clase Sum

