package agenda;


public interface OperacoesAgenda<E> {

	public boolean cadastrar(E elemento);
	public String listarTodos();
	public Integer totalizar();
	public boolean pesquisar(E elemento);
	public boolean remover(E elemento);
}
