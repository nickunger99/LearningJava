package outros.protegidos;

public class MetodosProtegidos {

	protected void exibirMensagem() {
		System.out.println("Olá de novo xd!!!.");
	}
	
	protected int soma (int num1, int num2) {
		return num1 + num2;
	} 
	
	protected double calculaMedia (double num1, double num2) {
		return (num1+ + num2) / 2;
	}
	
	protected static String exibirMensagemArgumento(String mensagem) {
		String resultado = "A mensagem é: " + mensagem;
		return resultado;
	}
	
	protected boolean logado() {
		boolean condicao = true;
		return condicao;
	}
	
	public static void main(String[] args) {
		
		MetodosProtegidos metodo = new MetodosProtegidos();
		metodo.exibirMensagem();
	}


}