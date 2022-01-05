package outros;
public class Variaveis {
	public static void main(String[] args)
	{
		System.out.print("Mensagem: ");
		System.out.println("Ola Mundo!");
		
		
		int varInt = 1; // 4 bytes
		System.out.println("Valor: " + varInt);
	
		System.out.println("Menor valor: " + Integer.MIN_VALUE);
		System.out.println("Maior valor: " + Integer.MAX_VALUE);
		
		long	varLong1 = 5000; // 8 bytes
		long	varLong2 = 922555555;
		long	varLong3 = 922555555555L;
		System.out.println(varLong1);
		System.out.println(varLong2);
		System.out.println(varLong3);
		
		System.out.println("Menor valor: " + Long.MIN_VALUE);
		System.out.println("Maior valor: " + Long.MAX_VALUE);
		     
		short varShort; // 2 bytes
		varShort = 32342;
		System.out.println(varShort);
		
		System.out.println("Menor valor: " + Short.MIN_VALUE);
		System.out.println("Maior valor: " + Short.MAX_VALUE);
		
		byte varByte = 127; // 1 byte
		
		System.out.println(varByte);
		
		System.out.println("Menor valor: " + Byte.MIN_VALUE);
		System.out.println("Maior valor: " + Byte.MAX_VALUE);
		
		
		float varFloat = 3.1412345f; // 4 bytes
		System.out.println(varFloat);
		
		System.out.println("Menor valor: " + Float.MIN_VALUE);
		System.out.println("Maior valor: " + Float.MAX_VALUE);
		
		double varDouble = 3.141592653589793; // 8 bytes
		System.out.println(varDouble);
		System.out.println("Menor valor: " + Double.MIN_VALUE);
		System.out.println("Maior valor: " + Double.MAX_VALUE);
		
		boolean varBooleano = true; // 1 bit
		System.out.println(varBooleano);
		varBooleano = false;
		System.out.println(varBooleano);
		
		char simbolo = 'a'; //tabela ascii
		System.out.println(simbolo);
		simbolo = 99;
		System.out.println(simbolo);
		
		String palavra = "Uma palavra ou uma frase...";
		System.out.println(palavra + " ok");
		palavra = palavra + " ok";
		System.out.println(palavra);
		
		
		
		
		
	}
}
