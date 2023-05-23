
public class OperadoresRelacionais {

	int valor1, valor2;
	
	public void testlogics() {
		
	/*	
	<- MENOR QUE
	<= - MENOR OU IGUAL A
	>- MAIOR QUE
	>= - MAIOR OU IGUAL A
	== - IGUALDADE
	!= - DIFERENTE DE
	*/
		this.valor1 = 10;
		this.valor2 = 5;
		 boolean resultado;
		 
		System.out.println(" TESTE LÓGICO " + this.valor1 + " < " + this.valor2);
		resultado = valor1 < valor2;
		System.out.println( " resultado: " + resultado);
		
		System.out.println(" TESTE LÓGICO " + this.valor1 + " <= " + this.valor2);
		resultado = valor1 <= valor2;
		System.out.println( " resultado: " + resultado);
		
		System.out.println(" TESTE LÓGICO " + this.valor1 + "  >" + this.valor2);
		resultado = valor1 > valor2;
		System.out.println( " resultado: " + resultado);
	    
		System.out.println(" TESTE LÓGICO " + this.valor1 + " >= " + this.valor2);
		resultado = valor1 >= valor2;
		System.out.println( " resultado: " + resultado);
		
		System.out.println(" TESTE LÓGICO " + this.valor1 + " == " + this.valor2);
		resultado = valor1 == valor2;
		System.out.println( " resultado: " + resultado);
		
		System.out.println(" TESTE LÓGICO " + this.valor1 + " != " + this.valor2);
		resultado = valor1 != valor2;
		System.out.println( " resultado: " + resultado);
		
		
		
	}
	



}
