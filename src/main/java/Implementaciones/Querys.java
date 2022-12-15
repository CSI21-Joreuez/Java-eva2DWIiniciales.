package Implementaciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import DAO.Notas.notas;
import DAO.Notas.notasImplServicio;
import jakarta.transaction.Transactional;

@Component
public class Querys {

	@Autowired
	private notasImplServicio nis;
	
	@Transactional
	public void insertarNota(notas nota) {
		nis.insertarNota(nota);
	}
	@Transactional
	public  List<notas> buscarPorCod(int cod_alumno){
		return nis.buscarPorCod(cod_alumno);
	}
	public List<notas> buscarPorEva(String cod_evaluacion)
	{
		return nis.buscarPorEva(cod_evaluacion);
	}
}
