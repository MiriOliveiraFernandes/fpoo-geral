import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
	 
		Scanner scanner = new Scanner(System.in);
		

		String nomeAluno, disciplina;
		double nota1, nota2, nota3, nota4,media;
		
		System.out.println("#####---- BEM VINDO AO PROGRAMA DE M�DIA ----####");
		
		System.out.println("INFORME O NOME DO ALUNO: ");
        nomeAluno = scanner.next();
        
        System.out.println("INFORME O NOME DA DISCIPLINA: ");
        disciplina = scanner.next();
            
        System.out.println("INFORME NOTA 1: ");
        nota1 = scanner.nextDouble();
        
        System.out.println("INFORME NOTA 2: ");
        nota2 = scanner.nextDouble();
        
        System.out.println("INFORME NOTA 3: ");
        nota3 = scanner.nextDouble();
        
        System.out.println("INFORME NOTA 4: ");
        nota4 = scanner.nextDouble();
        media =(nota1 + nota2 + nota3 + nota4) / 4;
        
	System.out.println("NOME: "+ nomeAluno + " M�dia: " + media);
	System.out.println("#####---- OBRIGADO POR USAR O PROGAMA DE M�DIA ----####");
	
	}

}
