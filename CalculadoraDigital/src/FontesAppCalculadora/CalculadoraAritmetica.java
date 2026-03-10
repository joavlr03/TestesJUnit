package FontesAppCalculadora;

public class CalculadoraAritmetica {

	private double resultado = 0 ;
	
	public double soma (int n1, int n2){
		
		resultado = n1+n2;
		return resultado;
				
	}
	
	public double subtrair (int n1, int n2){
		
		resultado = n1-n2;
		return resultado;
				
	}
	
	public double divide (double n1, double n2){
		
		resultado = (n1/n2);
		return resultado;
				
	}
	
	public double multiplica (int n1, int n2){
		
		resultado = n1*n2;
		return resultado;
				
	}
	
	
	
}
