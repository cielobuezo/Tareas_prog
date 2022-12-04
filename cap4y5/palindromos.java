package cap_4y5;
import java.util.Scanner;
public class palindromos
{
public static void main(String[]args)
{
int a=0,b=0,c=0,d=0,e=0,uno=0,dos=0,tres=0,cuatro=0,cinco=0,numero=0,numero2=0,verificar=0;
try (Scanner teclado = new Scanner(System.in)) {
    System.out.println("ingrese un numero de 5 cifras: ");
    numero=teclado.nextInt();
}

verificar=numero/10000;

System.out.println(verificar);

if(verificar<=9)
{
if(verificar>=1)
{
numero2=numero;

a=numero/10000;
numero=numero%10000;

b=numero/1000;
numero=numero%1000;

c=numero/100;
numero=numero%100;

d=numero/10;
e=numero%10;

//_________________________

uno=numero2%10;
numero2=numero2/10;

dos=numero2%10;
numero2=numero2/10;

tres=numero2%10;
numero2=numero2/10;

cuatro=numero2%10;
numero2=numero2/10;

cinco=numero2%10;

//____________________________

if (a==uno)
{
if (b==dos)
{
if(c==tres)
{
if(d==cuatro)
{
if(e==cinco)
{
System.out.println("El número es palíndromo");
}
}
}
}
}

else
{System.out.println("No es Palíndromo");}
}
}

else
System.out.println("ERROR, el numero no es de 5 cifras");
}
}