package classes.inheritance.joined;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "idProfessor", referencedColumnName = "idPessoa")
public class Professor extends Pessoa implements Serializable {
	private long matricula;
	private String area;
	
	public Professor() {}

	public Professor(String nome, long matricula, String area) {
		super(0L, nome);
		this.matricula = matricula;
		this.area = area;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Professor [matricula=" + matricula + ", area=" + area + "]";
	};
	
	

}
