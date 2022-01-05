
public class TestaClasses {

	public static void main(String[] args) {
		MetodosPublicos metodo = new MetodosPublicos();
		
		metodo.exibirMensagem();

		System.out.println(metodo.soma(23, 21));
		
		System.out.println(metodo.calculaMedia(8, 9.3));
		
		String palavra = "Ola, tudo bem?";
		System.out.println(metodo.exibirMensagemArgumento(palavra));
	}

}
