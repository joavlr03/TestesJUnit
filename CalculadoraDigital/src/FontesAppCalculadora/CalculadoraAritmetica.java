package FontesAppCalculadora;

public class CalculadoraAritmetica {

	private int resultado = 0 ;
	
	public int soma (int n1, int n2){
		
		resultado = n1+n2;
		return resultado;
				
	}
	
	public int subtrair (int n1, int n2){
		
		resultado = n1-n2;
		return resultado;
				
	}
	
	public int divide (int n1, int n2){
		
		resultado = (n1/n2);
		return resultado;
				
	}
	
	public int multiplica (int n1, int n2){
		
		resultado = n1*n2;
		return resultado;
				
	}
	
	
	
}
