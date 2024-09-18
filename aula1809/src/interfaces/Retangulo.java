package interfaces;

public class Retangulo implements OperacoesFormas {

	private double base;
	private double altura;
	
	@Override
	public double calculaArea() {
		
		return base * altura;
	}
	
	
}
