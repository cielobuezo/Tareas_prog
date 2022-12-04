package cap_4y5;

import java.util.Scanner;

public class mayorn {
    


    public static void main(String args[]){
    
    try (Scanner entrada = new Scanner(System.in)) {
        int cont = 1;
        int num;
        int mayor1 = 0;
        int mayor2 = 0;
        
        System.out.printf("Escriba el numero %d\n ", cont++);
        mayor1 = entrada.nextInt();
        
        System.out.printf("Escriba el numero %d\n ", cont++);
        mayor2 = entrada.nextInt();
        
        if (mayor2 > mayor1)
        mayor1 = mayor2;
        
        while (cont <= 10){
        
        System.out.printf("Escriba el numero %d\n", cont++);
        num = entrada.nextInt();
        
        if (num > mayor1)
        
        mayor1 = num;
        
        
        } // fin del while
        
        System.out.printf("El numero mayor1 es : %d\nEl numero mayor2 es : %d ",mayor1, mayor2);
    }
    
    }
    
    }
    

