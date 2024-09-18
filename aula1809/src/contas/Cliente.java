package contas;

public class Cliente implements Validacoes {
	private String cpf;
	private String nome;
	
	public Cliente() {}
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	@Override
	public boolean validar() {
		if (cpf.length() != 11) {
	        return false;
	    }
		
		boolean allDigitsEqual = true;
	    char digit = cpf.charAt(0);
	    for (int i = 1; i < cpf.length(); i++) {
	        if (digit != cpf.charAt(i)) {
	            allDigitsEqual = false;
	            break;
	        }
	    }
	    if (allDigitsEqual) {
	        return false;
	    }
	    
		return true;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
