package enumeracao;

public class TesteEnumMarcas {

	public static void main(String[] args) {
		Marcas marca = Marcas.HP;
		System.out.println("Nome da Marca = "+marca.name());
		for (Marcas m : marca.values()) {
		//System.out.println("m="+m);
		System.out.println("m="+m.getDescricao());
		}
	}
}