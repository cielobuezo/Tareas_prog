package ejercicios_exposiciones;


import java.util.Random;

public class tiro_dados {
	
	private static Random numAleatorio = new Random();
	
	public static void main(String[] args) {
		
		int[] matrizTiros = new int[36000];
		
		for(int i = 0; i < matrizTiros.length; i++) {
			matrizTiros[i] = tirarDados();
		}
		
		int[] frecuencia = new int[13];
		
		for(int i = 0; i < matrizTiros.length; i++) {
			++frecuencia[ matrizTiros[i] ];
		}
		
		System.out.println("FRECUENCIAS:\n");
		
		for(int i = 2; i < frecuencia.length; i++) {
			System.out.printf("%2d: %,d%n", i, frecuencia[i]);
		}
		
	}
	
	public static int tirarDados() {
		
		int dado1 = 1 + numAleatorio.nextInt(6);
		int dado2 = 1 + numAleatorio.nextInt(6);
		
		return dado1 + dado2;
	}

}