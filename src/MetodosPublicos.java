
public class MetodosPublicos {

	public void exibirMensagem() {
		System.out.println("Olá de novo xd!!!.");
	}
	
	public int soma (int num1, int num2) {
		return num1 + num2;
	}
	
	public double calculaMedia (double num1, double num2) {
		return (num1+ + num2) / 2;
	}
	
	public static String exibirMensagemArgumento(String mensagem) {
		String resultado = "A mensagem é: " + mensagem;
		return resultado;
	}
	
	public boolean logado() {
		boolean condicao = true;
		return condicao;
	}
	
	public static void main(String[] args) {
	
		MetodosPublicos meuMetodo = new MetodosPublicos();
		meuMetodo.exibirMensagem();
		//exibirMensagem();
		
		System.out.println(meuMetodo.soma(3, 8));
		System.out.println(meuMetodo.calculaMedia(7, 8));
	
	}

}
