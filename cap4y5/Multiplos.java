package cap_4y5;
public class Multiplos {



        public static void main(String[] args) {
            
            // Operación básica
            
            int resto;
            int numero1 = 21;
            int numero2 = 3;
    
            resto = numero1%numero2;
    
            if (resto==0)
              System.out.println(numero1 + " es múltiplo de " + numero2);
            else
              System.out.println(numero1 + " NO es múltiplo de " + numero2);
    
            
            // Listar los multiplos de un número
            // Multiplos de 21
            int multiplo = 240;
            System.out.print("Los multiplos de " + multiplo + " son");
            for (int x=1;x<multiplo;x++){
                if (esMultiplo(multiplo,x)){
                    System.out.print(" " + x);
                }
            }
                    
            
            
        }
        
        
        public static boolean esMultiplo(int n1,int n2){
            if (n1%n2==0)
                return true;
            else
                return false;
        }
    
    }
    

