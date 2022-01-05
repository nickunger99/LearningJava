package outros;
import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		
		// Array de strings
		String[] nomes = {"Nicolas", "João", "Fernando", "Marcelo"};
		
		for(int x = 0; x  < nomes.length; x++) {
			System.out.println(nomes[x]);
		}
		
		// Array de doubles
		double[] numerosDoubles = new double[10];
		for(int x = 0; x < numerosDoubles.length; x++) {
			numerosDoubles[x] = x;  
			System.out.println(numerosDoubles[x]);
		}
		
		// array de inteiros aleatórios
		Random geraNumero = new Random();
		int[] inteirosAleatorios = new int[10];
		for(int i = 0; i < inteirosAleatorios.length; i++) {
			inteirosAleatorios[i] = geraNumero.nextInt(20);
			System.out.println(inteirosAleatorios[i]);
		}
		
		// Array bidimensional tipo matriz
		int[][] matrizDeinteiros = {
				{1,2,3,5,7,6},
				{4,4,7},
				{9,1,6}
		};
		for(int linha = 0; linha < matrizDeinteiros.length; linha++) {
			for(int coluna = 0; coluna < matrizDeinteiros.length; coluna++) {
				System.out.print(matrizDeinteiros[linha][coluna]);
			}
		System.out.println("");
		}
		
		System.out.println("Tamanho da linha 1: " + matrizDeinteiros[0].length);
		System.out.println("Tamanho da linha 2: " + matrizDeinteiros[1].length);
		System.out.println("Tamanho da linha 3: " + matrizDeinteiros[2].length);
	}

}
