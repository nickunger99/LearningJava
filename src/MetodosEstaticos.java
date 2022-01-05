
public class MetodosEstaticos {

	public static void exibirMensagem() {
		System.out.println("Olá rapazes!");
	}
	
	public static int soma(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	
	public static double calculaMedia(double doub1, double doub2) {
		return (doub1 + doub2) / 2;
	
	}
	
	public static boolean logado() {
		boolean condicao = true;
		return condicao;
	}
	
	public static String exibirMensagemArgumento(String mensagem) {
		String resultado = "A mensagem é: " + mensagem;
		return resultado;
	}
	
	//Principal
	public static void main(String[] args) {		
		exibirMensagem();
		System.out.println(soma(3, 4));
		System.out.println(calculaMedia(8, 0));
		System.out.println(logado());
		
		System.out.println(exibirMensagemArgumento("Olá Senai"));
		
	
	}

}
