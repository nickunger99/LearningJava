
public class MetodosPrivados {
	private void exibirMensagem() {
		System.out.println("Olá de novo xd!!!.");
	}
	
	private int soma (int num1, int num2) {
		return num1 + num2;
	}
	
	private double calculaMedia (double num1, double num2) {
		return (num1+ + num2) / 2;
	}
	
	private static String exibirMensagemArgumento(String mensagem) {
		String resultado = "A mensagem é: " + mensagem;
		return resultado;
	}
	
	private boolean logado() {
		boolean condicao = true;
		return condicao;
	}
	public static void main(String[] args) {
	
		MetodosPrivados meuMetodo = new MetodosPrivados();
		meuMetodo.exibirMensagem();
		System.out.println(meuMetodo.calculaMedia(10, 9));
	
	}
}
