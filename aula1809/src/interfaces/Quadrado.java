package interfaces;

public class Quadrado implements OperacoesFormas {
	private double lado;
	
	@Override
	public double calculaArea() {
		//double area = this.lado * this.lado; 
		
		return Math.pow(lado,  2);
	}
	
	
	
}
