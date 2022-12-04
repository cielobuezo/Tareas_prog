import java.util.Scanner;

public class circulo
{
    public static void main( String[] args )
    {
        
        int radio;
        try (Scanner entrada = new Scanner( System.in )) {
        
        System.out.println("\nPor favor introduzca un radio y le dare el diametro, el perimetro y el area:");
        radio = entrada.nextInt();
        System.out.printf("\nEl diametro del circulo es: %d", 2*radio);
        System.out.printf("\nEl perimetro del circulo es: %f", 2*3.14*radio);
        System.out.printf("\nEl area del circulo es: %f\n",(3.14)*radio*radio);
    }
    }  // Cierra el metodo main
 }


