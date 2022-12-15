package DAO.Notas;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Component
public class notasImplServicio implements servicioNotas {

	@PersistenceContext
	private EntityManager em;
	public void insertarNota(notas nota) {
			em.persist(nota);
	}

	public List<notas> buscarPorCod(int cod_alumno) {
		return em.createQuery("SELECT notas FROM eva_tch_notas_evaluacion notas WHERE cod_alumno=#{cod_alumno}").getResultList();
	}

	public List<notas> buscarPorEva(String cod_evaluacion) {
		return em.createQuery("SELECT notas FROM eva_tch_notas_evaluacion notas WHERE cod_evaluacion=#{cod_evaluacion}").getResultList();
	}

}
