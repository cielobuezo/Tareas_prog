package ejercicios_exposiciones;

import java.util.Scanner;


public class asteriscos_cudradados {


public static void main( String args[] )
{      // Abre main
System.out.print("\nEste programa recibe un entero e imprime ");
System.out.println("un cuadrado de asteriscos con ese numero de lado.");

int lado;
try (Scanner entrada = new Scanner(System.in)) {
    asteriscos_cudradados miObjeto = new asteriscos_cudradados();
    
    System.out.println("\nPor favor introduzca un entero: ");
    lado = entrada.nextInt();
    
    miObjeto.Cuadrado(lado);
}
  
}      // Cierra main


public void Cuadrado( int n)

{           // Abre metodo Cuadrado
 
for ( int i = 1; i <= n; i++ )
{   // Abre for
for ( int j = 1; j <= n; j++ )
System.out.print("*");
 System.out.println();
}
}
}
