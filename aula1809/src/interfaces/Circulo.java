package interfaces;

public class Circulo implements OperacoesFormas{

	private double raio;
	private static final double PI = 3.14;
	
	@Override
	public double calculaArea() {
//		double area = PI * raio * raio;	
		
		double area = Math.PI * Math.pow(raio,  2);
		return area;
		
	}

}
