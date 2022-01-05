package outros;
import java.lang.Math;


public class Operadores {

	public static void main(String[] args) {
		
		int numA = 5;
		int numB = 2;
		
		// Soma
		int total = numA + numB;
		System.out.println(total);
		
		
		// Subtracao
		
		total = numA - numB;
		System.out.println(total);
		
		// Multiplicacao
		
		total = numA * numB; 
		System.out.println(total);
		
		// Divisao
		
		total = numA / numB;
		System.out.println(total);
		double numC, numD, totalDouble;
		numC = 5;
		numD = 2;
		
		totalDouble = numC / numD;
		System.out.println(totalDouble);
		
		// Resto da divisao (MOD)
		total = numA % numB;
		System.out.println(total);
		
		// Potencializacao
		double numE, numF, potencia;
		numE = 2;
		numF = 3;
		potencia = Math.pow(numE, numF);
		System.out.println(potencia);
		
		// Radiciacao raiz quadrada
		double raiz;
		raiz = Math.sqrt(144);
		System.out.println(raiz);
		
		// raiz cubica
		raiz = Math.cbrt(64*8);
		System.out.println(raiz);
	}
}
