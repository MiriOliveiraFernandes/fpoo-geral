import java.util.Scanner;
public class Media {
	
	String[] alunos = {"Ana","João", "Maria","Carlos"};
	float[] notas = new float[4];
	Scanner objScanner = new Scanner(System.in);
	
	public void listaralunos() {
		//System.out.println("1º aluno " + alunos[0]);
		//System.out.println("2º aluno " + alunos[1]);
		//System.out.println("3º aluno " + alunos[2]);
		//System.out.println("4º aluno " + alunos[3]);
		
		for(int indice = 0; indice < alunos.length; indice++) {
			
			
			//System.out.println((indice+1) + "º Aluno : " + alunos[indice]);
			System.out.println(" NOTAS DO ALUNO : " + alunos [indice]);
			
			int cont = 0;
			while(cont < 4) {
				
				
				System.out.println(" NOTAS DO ALUNO : " + (cont + 1) + "º NOTA");
				notas[cont]= objScanner.nextFloat();
				cont++;
				
			}
			
		}
		
		System.out.println(" LISTAGEM DE NOATS");
		int cont =0;
		while (cont < notas.length) {
			System.out.println((cont+1) + "º notas" + notas[cont]); 
			cont++;
		}
		
		
		
		
		System.out.println(" TOTAL DE ALUNOS " + alunos.length);
	 
	}
	
	
}
