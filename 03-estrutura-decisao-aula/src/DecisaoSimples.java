
public class DecisaoSimples {

	public void testeMenor(int valor1, int valor2) {
		if ( valor1 < valor2) {
			System.out.println(" VALOR 1 :  " + valor1 + " � MENOR QUE O VALOR 2: " + valor2);	
		}
	}

	public void testeMenorIgual(int valor1, int valor2) {
		if ( valor1 <= valor2) {
			System.out.println(" VALOR 1:  " + valor1 + " � MENOR OU IGUAL QUE O VALOR 2: " + valor2);	
		}
	}

	public void testeMaior(int valor1, int valor2) {
		if ( valor1 > valor2) {
			System.out.println(" VALOR 1 :  " + valor1 + " � MAIOR QUE O VALOR 2: " + valor2);	
		}
	}
	
	public void testeMaiorIgual(int valor1, int valor2) {
		if ( valor1 >= valor2) {
			System.out.println(" VALOR 1 :  " + valor1 + " � MAIOR OU IGUAL A  VALOR 2: " + valor2);	
		}
	}

	public void testeIgualdade(int valor1, int valor2) {
		if ( valor1 == valor2) {
			System.out.println(" VALOR 1:  " + valor1 + " � IGUAL A VALOR 2: " + valor2);	
		}
	}
	

	public void testeDiferente(int valor1, int valor2) {
		if ( valor1 != valor2) {
			System.out.println(" VALOR 1 :  " + valor1 + " � DIFERENTE DO VALOR 2: " + valor2);	
		}
	}
	
	
	
}
