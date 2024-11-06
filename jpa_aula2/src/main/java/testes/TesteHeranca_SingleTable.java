package testes;
import dao.CursoPosGraducaoDAO;

import java.util.List;

import classes.inheritance.singletable.*;
import dao.CursoGraducaoDAO;

public class TesteHeranca_SingleTable {
	public static void main(String[] args) {
		CursoGraduacao c1 = new CursoGraduacao();
		c1. setTotalAtividadesComplementares(67.44);
		c1.setCargaHorariaTotal(1000.0);
		c1.setNome("Curso XXX");
		CursoGraducaoDAO objDAO = new CursoGraducaoDAO();
		if(objDAO.salvar(c1))
			System.out.println("Curso graducação inserido com sucesso!");
		
		//criar um objeto que representa um curso de especialização
		
		CursoPosGraduacao c2 = new CursoPosGraduacao();
		c2.setArea("Informatica");
		c2.setCargaHorariaTotal(300);
		c2.setClassificacao("pos");
		c2.setNome("curso novo");
	
		//salvar esse curso no banco
		if(new CursoPosGraducaoDAO().salvar(c2));
			System.out.println("Novo Curso salvo com sucesso!");
		
		//listar todos os cursos da tabela curso
		List<CursoGraduacao> cursos = objDAO.buscarTodos();
		for (Curso curso : cursos) {
			System.out.println(curso);
		}
	}
}
