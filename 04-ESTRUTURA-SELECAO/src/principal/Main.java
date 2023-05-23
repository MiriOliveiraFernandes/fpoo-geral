package principal;
import operacional.EstruraSelecao;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		EstruraSelecao objEstruraSelecao = new EstruraSelecao();
		Scanner objScanner= new Scanner(System.in);
		String genero;
		
		System.out.println(" INFORME UM VALOR PARA GÊNERO");
		genero = objScanner.next();
		objEstruraSelecao.setGenero(genero.toLowerCase());
	}
	

}
