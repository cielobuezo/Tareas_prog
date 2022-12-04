import java.util.Scanner;
 
// Declaración de clase
public class menormayor5
{
    // El método main inicia la ejecución de la aplicación
    public static void main( String[] args )
    {
        // Variables
        int num1; // Primer entero
        int num2; // Segundo entero
        int num3; // Tercer entero
        int num4; // Cuarto entero
        int num5; // Quinto entero
// Número entero mayor del grupo
       
        try (// Instanciación (creación) de un objeto de clase 'Scanner'
        Scanner entrada = new Scanner( System.in )) {
            // Solicitud y obtención de los datos (números enteros)
            System.out.printf( "Digite el primer número entero: ");
            num1 = entrada.nextInt();
      
            System.out.print( "Digite el segundo número entero: " );
            num2 = entrada.nextInt();
      
            System.out.print( "Digite el tercer número entero: " );
            num3 = entrada.nextInt();
      
            System.out.print( "Digite el cuarto número entero: " );
            num4 = entrada.nextInt();
      
            System.out.print( "Digite el quinto número entero: " );
            num5 = entrada.nextInt();
        }
       
        if( num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5 )
        {
            System.out.printf("%d Es el numero mayor %d%n", num1);
        }
       
        if( num2 >= num2 && num2 >= num3 && num2 >= num4 && num2 >= num5 )
        {
            System.out.printf("%d Es el numero mayor %d%n", num2);
        }

        if( num3 >= num2 && num3 >= num3 && num3 >= num4 && num3 >= num5 )
        {
            System.out.printf("%d Es el numero mayor %d%n", num3);
        }

        if( num4 >= num2 && num4 >= num3 && num4 >= num4 && num4 >= num5 )
        {
            System.out.printf("%d Es el numero mayor %d%n", num4);
        }

        if( num5 >= num2 && num5 >= num3 && num5 >= num4 && num5 >= num5 )
        {
            System.out.printf("%d El numero es mayor %d%n", num5);
        }
    
       
    } // fin de main
}