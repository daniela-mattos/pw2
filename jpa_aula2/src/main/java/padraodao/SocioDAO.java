package padraodao;

import util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class SocioDAO {

	private EntityManager em;

	public SocioDAO() {
	}

	public boolean salvar(Socio socio) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(socio);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		}
	}

	public boolean atualizar(Socio socio) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(socio);
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
			Socio entity = em.find(Socio.class, id);
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

	public Socio buscarID(int id) {
		try {
			em = JPAUtil.getEntityManager();
			Socio socio = em.find(Socio.class, id);
			return socio;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return null;
		} 
	}

	public List<Socio> buscarTodos() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Socio> query = em.createQuery("SELECT obj FROM Usuario obj", Socio.class);
			List<Socio> socios = query.getResultList();
			return socios;
		} catch (RuntimeException e) {
			//e.printStackTrace();
			return null;
		} 
	}
}
