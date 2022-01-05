import java.util.Scanner;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro carroUm = new Carro();
		
		System.out.println("Nome do carro: " + carroUm.nome);
		System.out.println("Modelo: " + carroUm.modelo);
		System.out.println("Ano: " + carroUm.ano);
		
		carroUm.acelerar();
		carroUm.acelerar();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a kilometragem: ");
		int km = entrada.nextInt();
		
		System.out.println(carroUm.calculaConsumo(km));
		
		for(int contador = 0; contador < carroUm.acessorios.length; contador++) {
			System.out.println("Acessórios: " + carroUm.acessorios[contador]);
		}
	}

}
