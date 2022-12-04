package cap_4y5;

public class multiplo_10y100 {
    
    static void multiplo(int numberA, int numberB){
        if(numberA % numberB == 0)
            System.out.println(numberA + " es multiplo de " + numberB);
        else
            System.out.println(numberA + " NO es multiplo de " + numberB);
    }
    
    public static void main(String[] args) throws Exception {
       multiplo(5, 10);
       multiplo(10,10);
       multiplo(20, 10);
       multiplo(30,10);
       multiplo(40,10);
       multiplo(60,10);
       multiplo(80, 10);
       multiplo(100,100);
       multiplo(200, 100);
       multiplo(300,100);
       multiplo(400, 100);
       multiplo(500,100);
       multiplo(600, 100);
       multiplo(700,100);
       multiplo(800, 100);
       multiplo(900,100);
    }
}