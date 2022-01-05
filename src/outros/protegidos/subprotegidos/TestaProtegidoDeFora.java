package outros.protegidos.subprotegidos;

import outros.protegidos.MetodosProtegidos;



public class TestaProtegidoDeFora extends MetodosProtegidos {

	public static void main(String[] args) {
		
		//MetodosProtegidos metodo = new MetodosProtegidos(); errado
		
		TestaProtegidoDeFora objetoTestaFora = new TestaProtegidoDeFora();
		System.out.println(objetoTestaFora.calculaMedia(7, 8));
		objetoTestaFora.exibirMensagem();

		System.out.println(objetoTestaFora.logado());
		
		System.out.println(objetoTestaFora.exibirMensagemArgumento("ok"));
	}

}
