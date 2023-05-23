
public class Main {

	public static void main(String[] args) {
		
         OperadoresRelacionais objRelacionais = new OperadoresRelacionais ();
		 DecisaoSimples objDecisaoSimples = new DecisaoSimples();
		 DecisaoComposta objDecisaoComposta = new DecisaoComposta();
         Textos objTextos = new Textos();
         EstruturaDesicaoTexto objDesicaoTexto = new EstruturaDesicaoTexto();
		
         //objRelacionais.testlogics();
        // objDecisaoSimples.testeMenor(49, 50);
       //  objDecisaoSimples.testeMenorIgual(49, 50);
     // objDecisaoSimples.testeMaior(100, 50);
    //objDecisaoSimples.testeMaiorIgual(50, 50);
          //objDecisaoSimples.testeIgualdade(50,50);
         //objDecisaoSimples.testeDiferente(10,50);
		 objDecisaoComposta.testeMenor(200,100);
        // objTextos.testesLogicos();
        // objDesicaoTexto.testeVazio("SESI/SENAI DESENVOLVIMENTO DE SISTEMAS");
         //objDesicaoTexto.testeIgual("SESI", "SENAI");
         //objDesicaoTexto.testeIgual("SESI", "sesi");
         //objDesicaoTexto.testeIgual("SENAI", "Senai");
         //objDesicaoTexto.testeIgual("SENAI", "senai");
        // objDesicaoTexto.contador("anaza");
	}

}
