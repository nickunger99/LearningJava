package outros;

public class Condicionais {

	public static void main(String[] args) {

		double notaA, notaB, media;
		notaA = 9;
		notaB = 8;
		media = (notaA + notaB) /2;
		
		/*
		if(media >= 7) {
			System.out.println(media + " Aprovado");
		}
		else {
			System.out.println(media + " Reprovado");
		}		
	*/
		
		/*
		 * if(media >= 7) { System.out.println(media + " Aprovado"); } else if(media >=
		 * 5 && media < 7) { System.out.println(media + " Em recupera��o"); } else {
		 * System.out.println(media + " Reprovado"); }
		 */
	
		// Operadores logicos: && (e) - || (ou)
		
		int faltas = 2;
		if(media >= 7 && faltas <= 10) {
			System.out.println("Aprovado " + faltas + " faltas e nota " + media);
		}else if(media < 5 || faltas > 10) {
			System.out.println("Reprovado "  + faltas + " faltas e nota " + media );
		}else if(media >= 5 && media < 7 && faltas <=10){
			System.out.println("Recupera��o " + faltas + " faltas e nota " + media  );
		}else {
			System.out.println("Reprovado " + faltas + " faltas e nota " + media );
		}
	
	}
}