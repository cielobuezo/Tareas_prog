package cap_4y5;


import java.util.Scanner;
 
public class cuadrado_asteriscos{
    public void pintaCuadros()
    {
    int fila;
    int Max;
    int columna;
    
    
    
    try (Scanner entrada = new Scanner(System.in)) {
        System.out.print("Digite el lado del cuadrado [comprendido entre 1-20]: ");
        fila = entrada.nextInt();
    }
    //valida el rango de entrada
    if(fila >= 1 && fila <= 20)
    {
    // se asign fila a max ya que es el valor máximo
    Max = fila;
    
    
    while(fila>=1)
    {
    columna = 1;
    //pinta los renglones
    while(columna <= Max)
    {
    //se pintan el primer y el ultimo renglon del cuadro con puros asterirscos controlados por los saltos de línea
    //por medio de la variable fila
    if(fila == 1 || fila == Max)
    {
    System.out.print("*");
    }
    else // en caso contrario el control pasa a los renglones para pintar los asteriscos y los espacios en blanco
    //por medio de la variable columna
    {
    //dado que el primer renglon ya fue llenado con asteriscos el siguiente renglon debera iniciar y finalizar con un asterisco
    //y los demas espacios seran llenados con espacios en blanco
    if(columna == 1 || columna == Max)
    System.out.print("*");
    else
    System.out.print(" ");
    }
    ++columna;
    }
    --fila;
    
    System.out.println();
    }
    }
    else
    System.out.println("Error se introdujo un valor no válido");
    }



}
 
 