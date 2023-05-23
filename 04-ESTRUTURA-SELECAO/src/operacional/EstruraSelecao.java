package operacional;

public class EstruraSelecao {

	private String genero;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		switch (genero) {
				case("masculino"):
				this.genero = genero;
				break;
				
			case"feminino":
				this.genero = genero;
				break;
				
			case"outros":
				this.genero=genero;
				break;
				
			default:
				System.out.println(" DADO INVÁLIDO");
				System.exit(0);
			
	
		
		}
	
	}

	private String toUpperCase(String string) {
		// TODO Auto-generated method stub
		return null;
	}
		
		
		
	
	
















}
