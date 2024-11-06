package dao;

import util.JPAUtil;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import classes.inheritance.joined.*;

public class ProfessorDAO {

	private EntityManager em;

	public ProfessorDAO() {
	}

	public boolean salvar(Professor entity) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		}
	}

	public boolean atualizar(Professor entity) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(entity);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		} 
	}

	public boolean remover(long id) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			Professor entity = em.find(Professor.class, id);
			em.remove(entity);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		} 
	}

	public Pessoa buscarID(int id) {
		try {
			em = JPAUtil.getEntityManager();
			Professor entity = em.find(Professor.class, id);
			return entity;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return null;
		} 
	}

	public List<Professor> buscarTodos() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Professor> query = em.createQuery("SELECT obj FROM Professor obj", Professor.class);
			List<Professor> professores = query.getResultList();
			return professores;
		} catch (RuntimeException e) {
			//e.printStackTrace();
			return null;
		} 
	}
}
