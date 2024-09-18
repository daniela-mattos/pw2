package contas;

public enum ItensMenu {
	CADCE(1, "Cadastrar Conta Especial"),
	PESQCENUM(2, "Pesquisar conta Especial pelo Número"),
	PESQCENUMAG(3, "Pesquisar Conta Especial pelo Número da Agência"),
	PESQCECPF(4, "Pesquisar Conta Especial pelo CPF"),
	SAIR(5, "Sair");

	private int id;
	private String descricao;
	
	private ItensMenu(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public String getItem() {
		return id + " - " + descricao;
	}

	
}
