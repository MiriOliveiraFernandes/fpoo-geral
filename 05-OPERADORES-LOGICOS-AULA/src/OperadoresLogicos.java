
public class OperadoresLogicos {

	public void testeslogicos() {
		/*Operadores L�gicos
		 && -> AND -> E 
		 || -> OR -> OU
		 ! -> NOT -> N�O
		 
		 EXEMPLO DE SINTAXE:
		 &&
		 ||
		 !
		 */
	
	
	int idadeInicio = 18;
	int idadeFim = 90;
	boolean resultado;
	
	/*
	 VERIFICA DE A IDADE DA PESSOA EST� ENTRE 18 E 90 ANOS 
	 */
	
	resultado = (idadeInicio >= 18) && (idadeFim <= 90);
	 System.out.println(resultado);
	
	 
	 idadeInicio = 17;
	 resultado = (idadeInicio >= 18) && (idadeFim <= 90);
	 System.out.println(resultado);
	 
	 
	 /* 
	 VERIFICA SE A IDADE DA  PESSOA EST� ENTRE 18 OU 90
	 */
	 
	 idadeInicio = 18;
	 resultado = (idadeInicio >= 18) || (idadeFim <= 90);
	 System.out.println(resultado);
	 
	 idadeInicio =  17;
	 resultado = (idadeInicio >= 18) || (idadeFim <= 90);
	 System.out.println(resultado);
	}
}
